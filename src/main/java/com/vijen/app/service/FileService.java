package com.vijen.app.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import com.vijen.app.domain.CSVFileDTO;
import com.vijen.app.domain.DataExtractDto;
import com.vijen.app.repo.DataExtractRepository;

@Service
public class FileService {
	@Autowired
	DataExtractRepository repo;

	List<CSVFileDTO> listofDto = new ArrayList<CSVFileDTO>();
	public String uploadDir = "C:\\Users\\Public\\uploadcheckthedata\\";
	public String readDir = "C:\\Users\\Public\\checkthedata\\";


	private static String readAllBytesJava7(String filePath) {
		String content = "";

		try {
			content = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
	}

	private CSVFileDTO extracted(File fil, String text) throws FileNotFoundException {
		CSVFileDTO dto = new CSVFileDTO();
		String header = "";
		List<String> rows = new ArrayList<String>();

		List<String> outputs = new ArrayList<String>();
		List<String[]> r;
		try {
			try {

				CSVReader reader = new CSVReader(new StringReader(text));

				r = reader.readAll();
				r.forEach(x -> outputs.add(Arrays.toString(x).substring(1, Arrays.toString(x).length() - 1)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			header = outputs.get(0);
			for (int i = 1; i < outputs.size(); i++) {
				rows.add(outputs.get(i));
			}
		} catch (CsvException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		dto.setHeader(header);
		dto.setListofFiles(rows);
		return dto;
	}

	public List<File> readFiles() throws IOException {

		List<File> filesInFolder = Files.walk(Paths.get(readDir)).filter(Files::isRegularFile).map(Path::toFile)
				.collect(Collectors.toList());
		return filesInFolder;
	}

	public String loadFilesIntoDbs() throws IOException {
		List<File> fils = readFiles();
		for (File fil : fils) {
			String files = new String(Files.readAllBytes(fil.toPath()), StandardCharsets.UTF_8);
			files = files.replace("\r\n", "\r\n\r\n");
			
			files = files.replace("\",", "\\\"|");
			files = files.replace(",\"", "|\\\"");
			
			String[] str= org.apache.commons.lang3.StringUtils.substringsBetween(files, "|", "|");
			String[] strreplace = new String[str.length];
			int i =0;
			for(String strp :str ) {
				System.out.println(strp);
				String strip  = strp.replace("\\,","/");
				 strip  = strp.replace(",","/");
				strip  = strip.replace("\\\"", "");
				strip=strip.trim();
				if(strp.startsWith("\"") && strp.endsWith("\"")) {
					System.out.println("-----");
				}
				strip = "\""+strip+"\"";
				strreplace[i] = strip;
				System.out.println(strip);
				files=	files.replace(strp, strreplace[i]);
				i++;
			}
			files = files.replace( "|\\\"",",\"");
			files = files.replace( "\\\"|","\",");
			files = files.replace( "|\"",",\"");
			files = files.replace( "\"|","\",");
			System.out.println(files);
			listofDto.add(extracted(fil, files));
		}

		return "Read File";
	}

	public String loadFilesIntoDb() throws IOException {
		loadFilesIntoDbs();
		List<DataExtractDto> dtoList = new ArrayList<DataExtractDto>();
		for (CSVFileDTO fil : listofDto) {
			dtoList.addAll(extractMap(fil));
		}
		for (DataExtractDto entity : dtoList) {
			repo.save(entity);
		}
		return "Read File";
	}

	private List<DataExtractDto> extractMap(CSVFileDTO fil) {
		Map<Integer, String> headerMap = new HashMap<Integer, String>();
		String header = fil.getHeader();
		String[] headerString = header.split(",");
		for (int i = 0; i < headerString.length; i++) {
			headerMap.put(i, headerString[i]);
		}
		List<String> listofRecrds = fil.getListofFiles();
		List<DataExtractDto> dtoList = new ArrayList<DataExtractDto>();
		for (String record : listofRecrds) {
			if(!record.trim().isEmpty()) {
				DataExtractDto dtp = new DataExtractDto();
				String[] rowRecord = record.split(",");
				for (int i = 0; i < rowRecord.length; i++) {
					dtp = convertPojoValue(i, headerMap, rowRecord[i], dtp);
				}
				dtoList.add(dtp);
				
			}
		}
		// TODO Auto-generated method stub
		return dtoList;

	}

	private DataExtractDto convertPojoValue(int indexofRecordValue, Map<Integer, String> headerMap, String value,
			DataExtractDto dtp) {
		/*if(null==value.trim()) {
			return dtp;
		}*/
		if(null==headerMap.get(indexofRecordValue)) {
			return dtp;
		}
		String weather = headerMap.get(indexofRecordValue);

		weather = weather.trim();
		value = value.trim();
		switch (weather) {
		// comparing value of variable against each case

		case "DIV_CODE":
			dtp.setDIV_CODE(value);
			break;
		case "SDO_CODE":
			dtp.setSDO_CODE(value);
			break;
		case "ACCT_ID":
			dtp.setACCT_ID(value);
			break;
		case "KNO":
			dtp.setKNO(value);
			break;
		case "MOBILE_NO":
			dtp.setMOBILE_NO(value);
			break;
		case "LANDLINE_NO":
			dtp.setLANDLINE_NO(value);
			break;
		case "BOOK_NO":
			dtp.setBOOK_NO(value);
			break;
		case "SCNO":
			dtp.setSCNO(value);
			break;
		case "NAME":
			dtp.setNAME(value);
			break;
		case "ADDRESS":
			dtp.setADDRESS(value);
			break;
		case "SUPPLY_TYPE":
			dtp.setSUPPLY_TYPE(value);
			break;
		case "LOAD":
			dtp.setLOAD_(value);
			break;
		case "LOAD_UNIT":
			dtp.setLOAD_UNIT(value);
			break;
		case "DOC":
			dtp.setDOC(value);
			break;
		case "SECURITY_AMT":
			dtp.setSECURITY_AMT(value);
			break;
		case "CON_STATUS":
			dtp.setCON_STATUS(value);
			break;
		case "SERIAL_NBR":
			dtp.setSERIAL_NBR(value);
			break;
		case "MULTIPLY_FACTOR":
			dtp.setMULTIPLY_FACTOR(value);
			break;
		case "METER_STATUS":
			dtp.setMETER_STATUS(value);
			break;
		case "LAST_BILL_DATE":
			dtp.setLAST_BILL_DATE(value);
			break;
		case "CLOSE_READING":
			dtp.setCLOSE_READING(value);
			break;
		case "MDI":
			dtp.setMDI(value);
			break;
		case "BILL_BASIS":
			dtp.setBILL_BASIS(value);
			break;
		case "BILL_TYP":
			dtp.setBILL_TYP(value);
			break;
		case "CONSUMPTION_CURR_MNTH":
			dtp.setCONSUMPTION_CURR_MNTH(value);
			break;
		case "CONSUMPTION_PREV_MNTH":
			dtp.setCONSUMPTION_PREV_MNTH(value);
			break;
		case "CONSUMPTION_PREV_TO_PREV_MNTH":
			dtp.setCONSUMPTION_PREV_TO_PREV_MNTH(value);
			break;
		case "ARREAR":
			dtp.setARREAR(value);
			break;
		case "LPSC":
			dtp.setLPSC(value);
			break;
		case "CURRENT_ASSESSMENT":
			dtp.setCURRENT_ASSESSMENT(value);
			break;
		case "CURRENT_CYCLE_LPSC":
			dtp.setCURRENT_CYCLE_LPSC(value);
			break;
		case "TOTAL_OUTSTANDING":
			dtp.setTOTAL_OUTSTANDING(value);
			break;
		case "DUE_DATE_REBATE":
			dtp.setDUE_DATE_REBATE(value);
			break;
		case "LAST_OK_READING":
			dtp.setLAST_OK_READING(value);
			break;
		case "LAST_OK_READ_STATUS":
			dtp.setLAST_OK_READ_STATUS(value);
			break;
		case "METER_READ_FLTY_CNT":
			dtp.setMETER_READ_FLTY_CNT(value);
			break;
		case "LAST_PAY_AMT":
			dtp.setLAST_PAY_AMT(value);
			break;
		case "LAST_PAY_DATE":
			dtp.setLAST_PAY_DATE(value);
			break;
		case "SUBSTATION":
			dtp.setSUBSTATION(value);
			break;
		case "GIS_SUBSTATION":
			dtp.setGIS_SUBSTATION(value);
			break;
		case "FEEDER":
			dtp.setFEEDER(value);
			break;
		case "GIS_FEEDER":
			dtp.setGIS_FEEDER(value);
			break;
		case "DT":
			dtp.setDT(value);
			break;
		case "GIS_DT":
			dtp.setGIS_DT(value);
			break;
		case "POLE_NO":
			dtp.setPOLE_NO(value);
			break;
		case "GIS_POLE_NO":
			dtp.setGIS_POLE_NO(value);
			break;
		case "OPR_FLG":
			dtp.setOPR_FLG(value);
			break;
		case "BILL_AFTER_DATE":
			dtp.setBILL_AFTER_DATE(value);
			break;
		case "METER_READ_REMARK":
			dtp.setMETER_READ_REMARK(value);
			break;
		case "INSTALLATION_DATE":
			dtp.setINSTALLATION_DATE(value);
			break;
		case "SBM_BILL_DATE":
			dtp.setSBM_BILL_DATE(value);
			break;
		case "SBM_MACHINE_ID":
			dtp.setSBM_MACHINE_ID(value);
			break;
		case "BILL_CYC_CD":
			dtp.setBILL_CYC_CD(value);
			break;
		case "TOWN":
			dtp.setTOWN(value);
			break;
		case "SERVICE_CYC_CD":
			dtp.setSERVICE_CYC_CD(value);
			break;
		case "CT_RATIO":
			dtp.setCT_RATIO(value);
			break;
		case "PT_RATIO":
			dtp.setPT_RATIO(value);
			break;
		case "EC":
			dtp.setEC(value);
			break;
		case "FC":
			dtp.setFC(value);
			break;
		case "REBATES":
			dtp.setREBATES(value);
			break;
		case "MIN_CHARGES":
			dtp.setMIN_CHARGES(value);
			break;
		case "FUEL_SURCHARGE":
			dtp.setFUEL_SURCHARGE(value);
			break;
		case "DEMAND_AMT":
			dtp.setDEMAND_AMT(value);
			break;
		case "LTMETERING_CHARGES":
			dtp.setLTMETERING_CHARGES(value);
			break;
		case "CAP_CHARGES":
			dtp.setCAP_CHARGES(value);
			break;
		case "REG_SURCHARGE":
			dtp.setREG_SURCHARGE(value);
			break;
		case "REG_SURCHARGE_2":
			dtp.setREG_SURCHARGE_2(value);
			break;
		case "ELECTRICITY_DUTY":
			dtp.setELECTRICITY_DUTY(value);
			break;
		case "TARIFF_ADJUSTMENTS":
			dtp.setTARIFF_ADJUSTMENTS(value);
			break;
		case "PROV_ADJUSTMENTS":
			dtp.setPROV_ADJUSTMENTS(value);
			break;
		case "CA_ABR":
			dtp.setCA_ABR(value);
			break;
		case "INF_BILL":
			dtp.setINF_BILL(value);
			break;
		case "MR_SOURCE_CD":
			dtp.setMR_SOURCE_CD(value);
			break;
		case "HEALTHY_CONSUMER_FLAG":
			dtp.setHEALTHY_CONSUMER_FLAG(value);
			break;
		case "METER_BADGE_NO":
			dtp.setMETER_BADGE_NO(value);
			break;
		case "MTR_MAKE":
			dtp.setMTR_MAKE(value);
			break;
		case "CONNECTION_TYPE":
			dtp.setCONNECTION_TYPE(value);
			break;
		case "LOOMS_GRTRTHN_60":
			dtp.setLOOMS_GRTRTHN_60(value);
			break;
		case "LOOMS_LESSTHN_60":
			dtp.setLOOMS_LESSTHN_60(value);
			break;
		case "SUPPLY_VOLTAGE":
			dtp.setSUPPLY_VOLTAGE(value);
			break;
		case "METER_VOLTAGE":
			dtp.setMETER_VOLTAGE(value);
			break;
		case "MTR_TYPE_CD":
			dtp.setMTR_TYPE_CD(value);
			break;
		case "LATITUDE":
			dtp.setLATITUDE(value);
			break;
		case "LONGTIUDE":
			dtp.setLONGTIUDE(value);
			break;
		case "INDUSTRIAL_FLAG":
			dtp.setINDUSTRIAL_FLAG(value);
			break;
		case "ACCT_INFLALTED_FLAG":
			dtp.setACCT_INFLALTED_FLAG(value);
			break;
		case "GOVT_CODE":
			dtp.setGOVT_CODE(value);
			break;
		case "OPENING_READING_KWH":
			dtp.setOPENING_READING_KWH(value);
			break;
		case "OPENING_READING_KVAH":
			dtp.setOPENING_READING_KVAH(value);
			break;
		case "OPENING_READING_DATE":
			dtp.setOPENING_READING_DATE(value);
			break;
		case "CLOSING_READING_KWH":
			dtp.setCLOSING_READING_KWH(value);
			break;
		case "CLOSING_READING_KVAH":
			dtp.setCLOSING_READING_KVAH(value);
			break;
		case "CLOSING_READING_DATE":
			dtp.setCLOSING_READING_DATE(value);
			break;
		case "CONSUMPTION_KWH":
			dtp.setCONSUMPTION_KWH(value);
			break;
		case "CONSUMPTION_KVAH":
			dtp.setCONSUMPTION_KVAH(value);
			break;
		case "BILLED_AMOUNT":
			dtp.setBILLED_AMOUNT(value);
			break;
		case "MTR_EXCEP_CD":
			dtp.setMTR_EXCEP_CD(value);
			break;
		case "TOTAL_PAY_AMT":
			dtp.setTOTAL_PAY_AMT(value);
			break;
		// optional
		default:
			System.out.println("Invalid Input!");
		}

		return dtp;
		// TODO Auto-generated method stub

	}

	public void uploadFile(MultipartFile file) {

		try {

			File directory = new File(uploadDir);
			if (!directory.exists()) {
				directory.mkdir();
				// If you require it to make the entire directory path including parents,
				// use directory.mkdirs(); here instead.
			}
			Path copyLocation = Paths
					.get(uploadDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
			Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			e.printStackTrace();
			throw new FileStorageException(
					"Could not store file " + file.getOriginalFilename() + ". Please try again!");
		}
	}

	public ResponseEntity<byte[]> fetchRecordsFormonth(HttpServletRequest request, HttpServletResponse response,
			Integer month, Integer year) {
		// TODO Auto-generated method stub
		String regData = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		byte[] output = regData.getBytes();

		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("charset", "utf-8");
		responseHeaders.setContentType(MediaType.valueOf("text/html"));
		responseHeaders.setContentLength(output.length);
		responseHeaders.set("Content-disposition", "attachment; filename=output.csv");

		return new ResponseEntity<byte[]>(output, responseHeaders, HttpStatus.OK);
	}
}