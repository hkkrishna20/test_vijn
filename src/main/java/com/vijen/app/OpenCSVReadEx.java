package com.vijen.app;

import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import com.opencsv.exceptions.CsvValidationException;

public class OpenCSVReadEx {

	public static void main(String[] args) throws IOException, CsvValidationException {

		/*
		 * String fileName =
		 * "C:\\Users\\Public\\checkthedata\\MASTER_PVVNL_DIV110741_DEC_2020.csv";
		 * String s =
		 * "Sachin,,M,\"Maths,Science,English\",Need to improve in these subjects.";
		 * String[] splitted = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		 * System.out.println(Arrays.toString(splitted)); try (FileReader fr = new
		 * FileReader(fileName); CSVReader reader = new CSVReader(fr)) { List<String[]>
		 * r; try { r = reader.readAll(); r.forEach(x ->
		 * System.out.println(Arrays.toString(x))); } catch (CsvException e1) {
		 */
		// TODO Auto-generated catch block
		/*
		 * e1.printStackTrace(); }
		 */

		/*
		 * String[] nextLine;
		 * 
		 * while ((nextLine = reader.readNext()) != null) {
		 * 
		 * for (String e : nextLine) { System.out.println(e); System.out.println(); } }
		 */
		/* } */

		String files = "DIV_CODE,SDO_CODE,ACCT_ID,KNO,MOBILE_NO,LANDLINE_NO,BOOK_NO,SCNO,NAME,ADDRESS,SUPPLY_TYPE,LOAD,LOAD_UNIT,DOC,SECURITY_AMT,CON_STATUS,SERIAL_NBR,MULTIPLY_FACTOR,METER_STATUS,LAST_BILL_DATE,CLOSE_READING,MDI,BILL_BASIS,BILL_TYP,CONSUMPTION_CURR_MNTH,CONSUMPTION_PREV_MNTH,CONSUMPTION_PREV_TO_PREV_MNTH,ARREAR,LPSC,CURRENT_ASSESSMENT,CURRENT_CYCLE_LPSC,TOTAL_OUTSTANDING,DUE_DATE_REBATE,LAST_OK_READING,LAST_OK_READ_STATUS,METER_READ_FLTY_CNT,LAST_PAY_AMT,LAST_PAY_DATE,SUBSTATION,GIS_SUBSTATION,FEEDER,GIS_FEEDER,DT,GIS_DT,POLE_NO,GIS_POLE_NO,OPR_FLG,BILL_AFTER_DATE,METER_READ_REMARK,INSTALLATION_DATE,SBM_BILL_DATE,SBM_MACHINE_ID,BILL_CYC_CD,TOWN,SERVICE_CYC_CD,CT_RATIO,PT_RATIO,EC,FC,REBATES,MIN_CHARGES,FUEL_SURCHARGE,DEMAND_AMT,LTMETERING_CHARGES,CAP_CHARGES,REG_SURCHARGE,REG_SURCHARGE_2,ELECTRICITY_DUTY,TARIFF_ADJUSTMENTS,PROV_ADJUSTMENTS,CA_ABR,INF_BILL,MR_SOURCE_CD,HEALTHY_CONSUMER_FLAG,METER_BADGE_NO,MTR_MAKE,CONNECTION_TYPE,LOOMS_GRTRTHN_60,LOOMS_LESSTHN_60,SUPPLY_VOLTAGE,METER_VOLTAGE,MTR_TYPE_CD,LATITUDE,LONGTIUDE,INDUSTRIAL_FLAG,ACCT_INFLALTED_FLAG,GOVT_CODE,OPENING_READING_KWH,OPENING_READING_KVAH,OPENING_READING_DATE,CLOSING_READING_KWH,CLOSING_READING_KVAH,CLOSING_READING_DATE,CONSUMPTION_KWH,CONSUMPTION_KVAH,BILLED_AMOUNT ,MTR_EXCEP_CD ,TOTAL_PAY_AMT\r\n" + 
				"DIV110741,SDO1107411,121212431,,9997271910,,' 110741162954,PV_6690,ISHAQKHAN,MOH ATORAROAD V PO MAWANA MAWANA UP IND,20,1,KW,01-Apr-76,300,In Service,'10542870,1,A,07-Dec-20,2101,1,MIN,SBM,0.68,27.32,45,1599.16,6.09,518.52,18.39,-0.23,,2101,07-Dec-20,,2124,30-Dec-20,MAWANA TOWN,11072310146,11074110146TO2,11072310146TO2,MAWTO2DT010,1014605A905, MAWTO2DT010A006 ,1014608562,Y,,OK,09-Mar-17,07-Dec-20,9758966945,SBM,MAWANA,PVMS,,,5.1,330,0,139.9,0,0,0,0,0,0,25.13,,0,500.13,,MOBILEBILL  ,N,MTL600010542870,\"Secure Meters Limited,Udaipur\",POSTPAID,0,0,0.230kV,,1-PH-EM ,29.09919333,\"77.91724167\r\n" + 
				"\",,N,,2100.32,,07-Nov-20,2101,,07-Dec-20,0.68,,2123.77,null,2124\r\n" + 
				"DIV110741,SDO1107411,2323422422,145979,9997417065,,' 110741112935,,SHLENDRA,S/O KISHANPAL NEAR GOPAL KALI WALI GALI TIHAI MAWANA MEERUT Mobno 9997417065 UP-250401 IND,10,1,KW,19-Sep-17,300,In Service,'8395873,1,A,06-Dec-20,1410.9,0.12,MU,SBM,19.9,38,49,1047.73,29.62,117.17,15.11,-0.48,,1410.9,06-Dec-20,,1195,09-Dec-20,MAWANA THASHIL,,11074191033MAH,,MAWTO3DT006,,101451519,  ,Y,,OK,22-Sep-17,06-Dec-20,9568961437,SBM,MAWANA,PVMS,,,59.7,37.5,0,0,0,0,0,0,0,0,4.86,,0,102.06,,\"MOBMRI	    \",N,MTL165758395873,Genus Power,POSTPAID,0,0,0.230kV, ,1-PH-ST ,29.10114984,\"77.92408957\r\n" + 
				"\",,N,,1391,,06-Nov-20,1410.9,,06-Dec-20,19.9,,1194.52,null,1195\r\n" + 
				"DIV_CODE,SDO_CODE,ACCT_ID,KNO,MOBILE_NO,LANDLINE_NO,BOOK_NO,SCNO,NAME,ADDRESS,SUPPLY_TYPE,LOAD,LOAD_UNIT,DOC,SECURITY_AMT,CON_STATUS,SERIAL_NBR,MULTIPLY_FACTOR,METER_STATUS,LAST_BILL_DATE,CLOSE_READING,MDI,BILL_BASIS,BILL_TYP,CONSUMPTION_CURR_MNTH,CONSUMPTION_PREV_MNTH,CONSUMPTION_PREV_TO_PREV_MNTH,ARREAR,LPSC,CURRENT_ASSESSMENT,CURRENT_CYCLE_LPSC,TOTAL_OUTSTANDING,DUE_DATE_REBATE,LAST_OK_READING,LAST_OK_READ_STATUS,METER_READ_FLTY_CNT,LAST_PAY_AMT,LAST_PAY_DATE,SUBSTATION,GIS_SUBSTATION,FEEDER,GIS_FEEDER,DT,GIS_DT,POLE_NO,GIS_POLE_NO,OPR_FLG,BILL_AFTER_DATE,METER_READ_REMARK,INSTALLATION_DATE,SBM_BILL_DATE,SBM_MACHINE_ID,BILL_CYC_CD,TOWN,SERVICE_CYC_CD,CT_RATIO,PT_RATIO,EC,FC,REBATES,MIN_CHARGES,FUEL_SURCHARGE,DEMAND_AMT,LTMETERING_CHARGES,CAP_CHARGES,REG_SURCHARGE,REG_SURCHARGE_2,ELECTRICITY_DUTY,TARIFF_ADJUSTMENTS,PROV_ADJUSTMENTS,CA_ABR,INF_BILL,MR_SOURCE_CD,HEALTHY_CONSUMER_FLAG,METER_BADGE_NO,MTR_MAKE,CONNECTION_TYPE,LOOMS_GRTRTHN_60,LOOMS_LESSTHN_60,SUPPLY_VOLTAGE,METER_VOLTAGE,MTR_TYPE_CD,LATITUDE,LONGTIUDE,INDUSTRIAL_FLAG,ACCT_INFLALTED_FLAG,GOVT_CODE,OPENING_READING_KWH,OPENING_READING_KVAH,OPENING_READING_DATE,CLOSING_READING_KWH,CLOSING_READING_KVAH,CLOSING_READING_DATE,CONSUMPTION_KWH,CONSUMPTION_KVAH,BILLED_AMOUNT ,MTR_EXCEP_CD ,TOTAL_PAY_AMT\r\n" + 
				"DIV234232,SDO3434353,3223132321,,1234567891,, 111111111111,PV_322223,\"HARI	S/O  XYZ\",MOH- KILA KHAWAN rewerwerwr MEERUT ramhhshsf UP-213234 IND,10,2,KW,01-Dec-17,600,In Service,'3121451,1,A,18-Dec-20,2875,1.18,MU,SBM,51,75,144,6.02,0,467.78,0,-1.98,,2875,18-Dec-20,,470,26-Dec-20,11074210384,,11074210384KIL,,DT9,, NAA ,  ,Y,,OK,13-Jan-18,18-Dec-20,I2988N01,SBM,SARDHANA,PVMS,,,280.5,165,0,0,0,0,0,0,0,0,22.28,,0,467.78,,\"SBM 	\",N,TLII226793121451,L and G,POSTPAID,0,0,0.230kV, ,1-PH-ST ,,,,N,,2824,,18-Nov-20,2875,,18-Dec-20,51,,468.02,null,470\r\n" + 
				"DIV223424,SDO3434363,1234567892,,1234422313,, 22222222222,PV_534343,XYZ S/O KAPIL,MOH-TOWN HALL ROAD rewerwerwr MEERUT ramhhshsf UP-231342 IND,10,1,KW,02-Aug-19,300,In Service,'652555,1,A,14-Dec-20,649.2,0.02,MU,SBM,5.2,3,13,0.52,0,56.04,0.28,0.56,-0.54,649.2,14-Dec-20,,56,19-Dec-20,11074210144,,11074210144KOT,,1,,  ,  ,Y,,OK,12-Aug-19,14-Dec-20,I3081N01,SBM,SARDHANA,PVMS,,,15.6,37.5,0,0,0,0,0,0,0,0,2.66,,0,55.76,,\"SBM	 \",Y,TLII1108652555,Genus Power,POSTPAID,0,0,0.230kV, ,1-PH-ST ,,,,N,,644,,17-Nov-20,649.2,,14-Dec-20,5.2,,56.56,null,56\r\n" + 
				"";
		
		System.out.println(files);
	}
}