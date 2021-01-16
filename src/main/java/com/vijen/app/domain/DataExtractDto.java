package com.vijen.app.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name = "DTOECEDetails")
public class DataExtractDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreationTimestamp
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)

	@Column(name = "ececreated_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
	private java.util.Date ececreatedDate;

	@UpdateTimestamp
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)

	@Column(name = "ecelast_modified_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
	private java.util.Date ecelastModifiedDate;

	public java.util.Date getEcecreatedDate() {
		return ececreatedDate;
	}

	public void setEcecreatedDate(Timestamp ececreatedDate) {
		this.ececreatedDate = ececreatedDate;
	}

	public java.util.Date getEcelastModifiedDate() {
		return ecelastModifiedDate;
	}

	public void setEcelastModifiedDate(Timestamp ecelastModifiedDate) {
		this.ecelastModifiedDate = ecelastModifiedDate;
	}

	@Column
	private String DIV_CODE;
	@Column
	private String SDO_CODE;
	@Column
	private String ACCT_ID;
	@Column
	private String KNO;
	@Column
	private String MOBILE_NO;
	@Column
	private String LANDLINE_NO;
	@Column
	private String BOOK_NO;
	@Column
	private String SCNO;
	@Column
	private String NAME;
	@Column
	private String ADDRESS;
	@Column
	private String SUPPLY_TYPE;
	@Column
	private String LOAD_;
	@Column
	private String LOAD_UNIT;
	@Column
	private String DOC;
	@Column
	private String SECURITY_AMT;
	@Column
	private String CON_STATUS;
	@Column
	private String SERIAL_NBR;
	@Column
	private String MULTIPLY_FACTOR;
	@Column
	private String METER_STATUS;
	@Column
	private String LAST_BILL_DATE;
	@Column
	private String CLOSE_READING;
	@Column
	private String MDI;
	@Column
	private String BILL_BASIS;
	@Column
	private String BILL_TYP;
	@Column
	private String CONSUMPTION_CURR_MNTH;
	@Column
	private String CONSUMPTION_PREV_MNTH;
	@Column
	private String CONSUMPTION_PREV_TO_PREV_MNTH;
	@Column
	private String ARREAR;
	@Column
	private String LPSC;
	@Column
	private String CURRENT_ASSESSMENT;
	@Column
	private String CURRENT_CYCLE_LPSC;
	@Column
	private String TOTAL_OUTSTANDING;
	@Column
	private String DUE_DATE_REBATE;
	@Column
	private String LAST_OK_READING;
	@Column
	private String LAST_OK_READ_STATUS;
	@Column
	private String METER_READ_FLTY_CNT;
	@Column
	private String LAST_PAY_AMT;
	@Column
	private String LAST_PAY_DATE;
	@Column
	private String SUBSTATION;
	@Column
	private String GIS_SUBSTATION;
	@Column
	private String FEEDER;
	@Column
	private String GIS_FEEDER;
	@Column
	private String DT;
	@Column
	private String GIS_DT;
	@Column
	private String POLE_NO;
	@Column
	private String GIS_POLE_NO;
	@Column
	private String OPR_FLG;
	@Column
	private String BILL_AFTER_DATE;
	@Column
	private String METER_READ_REMARK;
	@Column
	private String INSTALLATION_DATE;
	@Column
	private String SBM_BILL_DATE;
	@Column
	private String SBM_MACHINE_ID;
	@Column
	private String BILL_CYC_CD;
	@Column
	private String TOWN;
	@Column
	private String SERVICE_CYC_CD;
	@Column
	private String CT_RATIO;
	@Column
	private String PT_RATIO;
	@Column
	private String EC;
	@Column
	private String FC;
	@Column
	private String REBATES;
	@Column
	private String MIN_CHARGES;
	@Column
	private String FUEL_SURCHARGE;
	@Column
	private String DEMAND_AMT;
	@Column
	private String LTMETERING_CHARGES;
	@Column
	private String CAP_CHARGES;
	@Column
	private String REG_SURCHARGE;
	@Column
	private String REG_SURCHARGE_2;
	@Column
	private String ELECTRICITY_DUTY;
	@Column
	private String TARIFF_ADJUSTMENTS;
	@Column
	private String PROV_ADJUSTMENTS;
	@Column
	private String CA_ABR;
	@Column
	private String INF_BILL;
	@Column
	private String MR_SOURCE_CD;
	@Column
	private String HEALTHY_CONSUMER_FLAG;
	@Column
	private String METER_BADGE_NO;
	@Column
	private String MTR_MAKE;
	@Column
	private String CONNECTION_TYPE;
	@Column
	private String LOOMS_GRTRTHN_60;
	@Column
	private String LOOMS_LESSTHN_60;
	@Column
	private String SUPPLY_VOLTAGE;
	@Column
	private String METER_VOLTAGE;
	@Column
	private String MTR_TYPE_CD;
	@Column
	private String LATITUDE;
	@Column
	private String LONGTIUDE;
	@Column
	private String INDUSTRIAL_FLAG;
	@Column
	private String ACCT_INFLALTED_FLAG;
	@Column
	private String GOVT_CODE;
	@Column
	private String OPENING_READING_KWH;
	@Column
	private String OPENING_READING_KVAH;
	@Column
	private String OPENING_READING_DATE;
	@Column
	private String CLOSING_READING_KWH;
	@Column
	private String CLOSING_READING_KVAH;
	@Column
	private String CLOSING_READING_DATE;
	@Column
	private String CONSUMPTION_KWH;
	@Column
	private String CONSUMPTION_KVAH;
	@Column
	private String BILLED_AMOUNT;
	@Column
	private String MTR_EXCEP_CD;
	@Column
	private String TOTAL_PAY_AMT;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDIV_CODE() {
		return DIV_CODE;
	}

	public void setDIV_CODE(String dIV_CODE) {
		DIV_CODE = dIV_CODE;
	}

	public String getSDO_CODE() {
		return SDO_CODE;
	}

	public void setSDO_CODE(String sDO_CODE) {
		SDO_CODE = sDO_CODE;
	}

	public String getACCT_ID() {
		return ACCT_ID;
	}

	public void setACCT_ID(String aCCT_ID) {
		ACCT_ID = aCCT_ID;
	}

	public String getKNO() {
		return KNO;
	}

	public void setKNO(String kNO) {
		KNO = kNO;
	}

	public String getMOBILE_NO() {
		return MOBILE_NO;
	}

	public void setMOBILE_NO(String mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}

	public String getLANDLINE_NO() {
		return LANDLINE_NO;
	}

	public void setLANDLINE_NO(String lANDLINE_NO) {
		LANDLINE_NO = lANDLINE_NO;
	}

	public String getBOOK_NO() {
		return BOOK_NO;
	}

	public void setBOOK_NO(String bOOK_NO) {
		BOOK_NO = bOOK_NO;
	}

	public String getSCNO() {
		return SCNO;
	}

	public void setSCNO(String sCNO) {
		SCNO = sCNO;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getSUPPLY_TYPE() {
		return SUPPLY_TYPE;
	}

	public void setSUPPLY_TYPE(String sUPPLY_TYPE) {
		SUPPLY_TYPE = sUPPLY_TYPE;
	}

	public String getLOAD_() {
		return LOAD_;
	}

	public void setLOAD_(String LOAD_) {
		this.LOAD_ = LOAD_;
	}

	public String getLOAD_UNIT() {
		return LOAD_UNIT;
	}

	public void setLOAD_UNIT(String LOAD_UNIT) {
		this.LOAD_UNIT = LOAD_UNIT;
	}

	public String getDOC() {
		return DOC;
	}

	public void setDOC(String dOC) {
		DOC = dOC;
	}

	public String getSECURITY_AMT() {
		return SECURITY_AMT;
	}

	public void setSECURITY_AMT(String sECURITY_AMT) {
		SECURITY_AMT = sECURITY_AMT;
	}

	public String getCON_STATUS() {
		return CON_STATUS;
	}

	public void setCON_STATUS(String cON_STATUS) {
		CON_STATUS = cON_STATUS;
	}

	public String getSERIAL_NBR() {
		return SERIAL_NBR;
	}

	public void setSERIAL_NBR(String sERIAL_NBR) {
		SERIAL_NBR = sERIAL_NBR;
	}

	public String getMULTIPLY_FACTOR() {
		return MULTIPLY_FACTOR;
	}

	public void setMULTIPLY_FACTOR(String mULTIPLY_FACTOR) {
		MULTIPLY_FACTOR = mULTIPLY_FACTOR;
	}

	public String getMETER_STATUS() {
		return METER_STATUS;
	}

	public void setMETER_STATUS(String mETER_STATUS) {
		METER_STATUS = mETER_STATUS;
	}

	public String getLAST_BILL_DATE() {
		return LAST_BILL_DATE;
	}

	public void setLAST_BILL_DATE(String lAST_BILL_DATE) {
		LAST_BILL_DATE = lAST_BILL_DATE;
	}

	public String getCLOSE_READING() {
		return CLOSE_READING;
	}

	public void setCLOSE_READING(String cLOSE_READING) {
		CLOSE_READING = cLOSE_READING;
	}

	public String getMDI() {
		return MDI;
	}

	public void setMDI(String mDI) {
		MDI = mDI;
	}

	public String getBILL_BASIS() {
		return BILL_BASIS;
	}

	public void setBILL_BASIS(String bILL_BASIS) {
		BILL_BASIS = bILL_BASIS;
	}

	public String getBILL_TYP() {
		return BILL_TYP;
	}

	public void setBILL_TYP(String bILL_TYP) {
		BILL_TYP = bILL_TYP;
	}

	public String getCONSUMPTION_CURR_MNTH() {
		return CONSUMPTION_CURR_MNTH;
	}

	public void setCONSUMPTION_CURR_MNTH(String cONSUMPTION_CURR_MNTH) {
		CONSUMPTION_CURR_MNTH = cONSUMPTION_CURR_MNTH;
	}

	public String getCONSUMPTION_PREV_MNTH() {
		return CONSUMPTION_PREV_MNTH;
	}

	public void setCONSUMPTION_PREV_MNTH(String cONSUMPTION_PREV_MNTH) {
		CONSUMPTION_PREV_MNTH = cONSUMPTION_PREV_MNTH;
	}

	public String getCONSUMPTION_PREV_TO_PREV_MNTH() {
		return CONSUMPTION_PREV_TO_PREV_MNTH;
	}

	public void setCONSUMPTION_PREV_TO_PREV_MNTH(String cONSUMPTION_PREV_TO_PREV_MNTH) {
		CONSUMPTION_PREV_TO_PREV_MNTH = cONSUMPTION_PREV_TO_PREV_MNTH;
	}

	public String getARREAR() {
		return ARREAR;
	}

	public void setARREAR(String aRREAR) {
		ARREAR = aRREAR;
	}

	public String getLPSC() {
		return LPSC;
	}

	public void setLPSC(String lPSC) {
		LPSC = lPSC;
	}

	public String getCURRENT_ASSESSMENT() {
		return CURRENT_ASSESSMENT;
	}

	public void setCURRENT_ASSESSMENT(String cURRENT_ASSESSMENT) {
		CURRENT_ASSESSMENT = cURRENT_ASSESSMENT;
	}

	public String getCURRENT_CYCLE_LPSC() {
		return CURRENT_CYCLE_LPSC;
	}

	public void setCURRENT_CYCLE_LPSC(String cURRENT_CYCLE_LPSC) {
		CURRENT_CYCLE_LPSC = cURRENT_CYCLE_LPSC;
	}

	public String getTOTAL_OUTSTANDING() {
		return TOTAL_OUTSTANDING;
	}

	public void setTOTAL_OUTSTANDING(String tOTAL_OUTSTANDING) {
		TOTAL_OUTSTANDING = tOTAL_OUTSTANDING;
	}

	public String getDUE_DATE_REBATE() {
		return DUE_DATE_REBATE;
	}

	public void setDUE_DATE_REBATE(String dUE_DATE_REBATE) {
		DUE_DATE_REBATE = dUE_DATE_REBATE;
	}

	public String getLAST_OK_READING() {
		return LAST_OK_READING;
	}

	public void setLAST_OK_READING(String lAST_OK_READING) {
		LAST_OK_READING = lAST_OK_READING;
	}

	public String getLAST_OK_READ_STATUS() {
		return LAST_OK_READ_STATUS;
	}

	public void setLAST_OK_READ_STATUS(String lAST_OK_READ_STATUS) {
		LAST_OK_READ_STATUS = lAST_OK_READ_STATUS;
	}

	public String getMETER_READ_FLTY_CNT() {
		return METER_READ_FLTY_CNT;
	}

	public void setMETER_READ_FLTY_CNT(String mETER_READ_FLTY_CNT) {
		METER_READ_FLTY_CNT = mETER_READ_FLTY_CNT;
	}

	public String getLAST_PAY_AMT() {
		return LAST_PAY_AMT;
	}

	public void setLAST_PAY_AMT(String lAST_PAY_AMT) {
		LAST_PAY_AMT = lAST_PAY_AMT;
	}

	public String getLAST_PAY_DATE() {
		return LAST_PAY_DATE;
	}

	public void setLAST_PAY_DATE(String lAST_PAY_DATE) {
		LAST_PAY_DATE = lAST_PAY_DATE;
	}

	public String getSUBSTATION() {
		return SUBSTATION;
	}

	public void setSUBSTATION(String sUBSTATION) {
		SUBSTATION = sUBSTATION;
	}

	public String getGIS_SUBSTATION() {
		return GIS_SUBSTATION;
	}

	public void setGIS_SUBSTATION(String gIS_SUBSTATION) {
		GIS_SUBSTATION = gIS_SUBSTATION;
	}

	public String getFEEDER() {
		return FEEDER;
	}

	public void setFEEDER(String fEEDER) {
		FEEDER = fEEDER;
	}

	public String getGIS_FEEDER() {
		return GIS_FEEDER;
	}

	public void setGIS_FEEDER(String gIS_FEEDER) {
		GIS_FEEDER = gIS_FEEDER;
	}

	public String getDT() {
		return DT;
	}

	public void setDT(String dT) {
		DT = dT;
	}

	public String getGIS_DT() {
		return GIS_DT;
	}

	public void setGIS_DT(String gIS_DT) {
		GIS_DT = gIS_DT;
	}

	public String getPOLE_NO() {
		return POLE_NO;
	}

	public void setPOLE_NO(String pOLE_NO) {
		POLE_NO = pOLE_NO;
	}

	public String getGIS_POLE_NO() {
		return GIS_POLE_NO;
	}

	public void setGIS_POLE_NO(String gIS_POLE_NO) {
		GIS_POLE_NO = gIS_POLE_NO;
	}

	public String getOPR_FLG() {
		return OPR_FLG;
	}

	public void setOPR_FLG(String oPR_FLG) {
		OPR_FLG = oPR_FLG;
	}

	public String getBILL_AFTER_DATE() {
		return BILL_AFTER_DATE;
	}

	public void setBILL_AFTER_DATE(String bILL_AFTER_DATE) {
		BILL_AFTER_DATE = bILL_AFTER_DATE;
	}

	public String getMETER_READ_REMARK() {
		return METER_READ_REMARK;
	}

	public void setMETER_READ_REMARK(String mETER_READ_REMARK) {
		METER_READ_REMARK = mETER_READ_REMARK;
	}

	public String getINSTALLATION_DATE() {
		return INSTALLATION_DATE;
	}

	public void setINSTALLATION_DATE(String iNSTALLATION_DATE) {
		INSTALLATION_DATE = iNSTALLATION_DATE;
	}

	public String getSBM_BILL_DATE() {
		return SBM_BILL_DATE;
	}

	public void setSBM_BILL_DATE(String sBM_BILL_DATE) {
		SBM_BILL_DATE = sBM_BILL_DATE;
	}

	public String getSBM_MACHINE_ID() {
		return SBM_MACHINE_ID;
	}

	public void setSBM_MACHINE_ID(String sBM_MACHINE_ID) {
		SBM_MACHINE_ID = sBM_MACHINE_ID;
	}

	public String getBILL_CYC_CD() {
		return BILL_CYC_CD;
	}

	public void setBILL_CYC_CD(String bILL_CYC_CD) {
		BILL_CYC_CD = bILL_CYC_CD;
	}

	public String getTOWN() {
		return TOWN;
	}

	public void setTOWN(String tOWN) {
		TOWN = tOWN;
	}

	public String getSERVICE_CYC_CD() {
		return SERVICE_CYC_CD;
	}

	public void setSERVICE_CYC_CD(String sERVICE_CYC_CD) {
		SERVICE_CYC_CD = sERVICE_CYC_CD;
	}

	public String getCT_RATIO() {
		return CT_RATIO;
	}

	public void setCT_RATIO(String cT_RATIO) {
		CT_RATIO = cT_RATIO;
	}

	public String getPT_RATIO() {
		return PT_RATIO;
	}

	public void setPT_RATIO(String pT_RATIO) {
		PT_RATIO = pT_RATIO;
	}

	public String getEC() {
		return EC;
	}

	public void setEC(String eC) {
		EC = eC;
	}

	public String getFC() {
		return FC;
	}

	public void setFC(String fC) {
		FC = fC;
	}

	public String getREBATES() {
		return REBATES;
	}

	public void setREBATES(String rEBATES) {
		REBATES = rEBATES;
	}

	public String getMIN_CHARGES() {
		return MIN_CHARGES;
	}

	public void setMIN_CHARGES(String mIN_CHARGES) {
		MIN_CHARGES = mIN_CHARGES;
	}

	public String getFUEL_SURCHARGE() {
		return FUEL_SURCHARGE;
	}

	public void setFUEL_SURCHARGE(String fUEL_SURCHARGE) {
		FUEL_SURCHARGE = fUEL_SURCHARGE;
	}

	public String getDEMAND_AMT() {
		return DEMAND_AMT;
	}

	public void setDEMAND_AMT(String dEMAND_AMT) {
		DEMAND_AMT = dEMAND_AMT;
	}

	public String getLTMETERING_CHARGES() {
		return LTMETERING_CHARGES;
	}

	public void setLTMETERING_CHARGES(String lTMETERING_CHARGES) {
		LTMETERING_CHARGES = lTMETERING_CHARGES;
	}

	public String getCAP_CHARGES() {
		return CAP_CHARGES;
	}

	public void setCAP_CHARGES(String cAP_CHARGES) {
		CAP_CHARGES = cAP_CHARGES;
	}

	public String getREG_SURCHARGE() {
		return REG_SURCHARGE;
	}

	public void setREG_SURCHARGE(String rEG_SURCHARGE) {
		REG_SURCHARGE = rEG_SURCHARGE;
	}

	public String getREG_SURCHARGE_2() {
		return REG_SURCHARGE_2;
	}

	public void setREG_SURCHARGE_2(String rEG_SURCHARGE_2) {
		REG_SURCHARGE_2 = rEG_SURCHARGE_2;
	}

	public String getELECTRICITY_DUTY() {
		return ELECTRICITY_DUTY;
	}

	public void setELECTRICITY_DUTY(String eLECTRICITY_DUTY) {
		ELECTRICITY_DUTY = eLECTRICITY_DUTY;
	}

	public String getTARIFF_ADJUSTMENTS() {
		return TARIFF_ADJUSTMENTS;
	}

	public void setTARIFF_ADJUSTMENTS(String tARIFF_ADJUSTMENTS) {
		TARIFF_ADJUSTMENTS = tARIFF_ADJUSTMENTS;
	}

	public String getPROV_ADJUSTMENTS() {
		return PROV_ADJUSTMENTS;
	}

	public void setPROV_ADJUSTMENTS(String pROV_ADJUSTMENTS) {
		PROV_ADJUSTMENTS = pROV_ADJUSTMENTS;
	}

	public String getCA_ABR() {
		return CA_ABR;
	}

	public void setCA_ABR(String cA_ABR) {
		CA_ABR = cA_ABR;
	}

	public String getINF_BILL() {
		return INF_BILL;
	}

	public void setINF_BILL(String iNF_BILL) {
		INF_BILL = iNF_BILL;
	}

	public String getMR_SOURCE_CD() {
		return MR_SOURCE_CD;
	}

	public void setMR_SOURCE_CD(String mR_SOURCE_CD) {
		MR_SOURCE_CD = mR_SOURCE_CD;
	}

	public String getHEALTHY_CONSUMER_FLAG() {
		return HEALTHY_CONSUMER_FLAG;
	}

	public void setHEALTHY_CONSUMER_FLAG(String hEALTHY_CONSUMER_FLAG) {
		HEALTHY_CONSUMER_FLAG = hEALTHY_CONSUMER_FLAG;
	}

	public String getMETER_BADGE_NO() {
		return METER_BADGE_NO;
	}

	public void setMETER_BADGE_NO(String mETER_BADGE_NO) {
		METER_BADGE_NO = mETER_BADGE_NO;
	}

	public String getMTR_MAKE() {
		return MTR_MAKE;
	}

	public void setMTR_MAKE(String mTR_MAKE) {
		MTR_MAKE = mTR_MAKE;
	}

	public String getCONNECTION_TYPE() {
		return CONNECTION_TYPE;
	}

	public void setCONNECTION_TYPE(String cONNECTION_TYPE) {
		CONNECTION_TYPE = cONNECTION_TYPE;
	}

	public String getLOOMS_GRTRTHN_60() {
		return LOOMS_GRTRTHN_60;
	}

	public void setLOOMS_GRTRTHN_60(String lOOMS_GRTRTHN_60) {
		LOOMS_GRTRTHN_60 = lOOMS_GRTRTHN_60;
	}

	public String getLOOMS_LESSTHN_60() {
		return LOOMS_LESSTHN_60;
	}

	public void setLOOMS_LESSTHN_60(String lOOMS_LESSTHN_60) {
		LOOMS_LESSTHN_60 = lOOMS_LESSTHN_60;
	}

	public String getSUPPLY_VOLTAGE() {
		return SUPPLY_VOLTAGE;
	}

	public void setSUPPLY_VOLTAGE(String sUPPLY_VOLTAGE) {
		SUPPLY_VOLTAGE = sUPPLY_VOLTAGE;
	}

	public String getMETER_VOLTAGE() {
		return METER_VOLTAGE;
	}

	public void setMETER_VOLTAGE(String mETER_VOLTAGE) {
		METER_VOLTAGE = mETER_VOLTAGE;
	}

	public String getMTR_TYPE_CD() {
		return MTR_TYPE_CD;
	}

	public void setMTR_TYPE_CD(String mTR_TYPE_CD) {
		MTR_TYPE_CD = mTR_TYPE_CD;
	}

	public String getLATITUDE() {
		return LATITUDE;
	}

	public void setLATITUDE(String lATITUDE) {
		LATITUDE = lATITUDE;
	}

	public String getLONGTIUDE() {
		return LONGTIUDE;
	}

	public void setLONGTIUDE(String lONGTIUDE) {
		LONGTIUDE = lONGTIUDE;
	}

	public String getINDUSTRIAL_FLAG() {
		return INDUSTRIAL_FLAG;
	}

	public void setINDUSTRIAL_FLAG(String iNDUSTRIAL_FLAG) {
		INDUSTRIAL_FLAG = iNDUSTRIAL_FLAG;
	}

	public String getACCT_INFLALTED_FLAG() {
		return ACCT_INFLALTED_FLAG;
	}

	public void setACCT_INFLALTED_FLAG(String aCCT_INFLALTED_FLAG) {
		ACCT_INFLALTED_FLAG = aCCT_INFLALTED_FLAG;
	}

	public String getGOVT_CODE() {
		return GOVT_CODE;
	}

	public void setGOVT_CODE(String gOVT_CODE) {
		GOVT_CODE = gOVT_CODE;
	}

	public String getOPENING_READING_KWH() {
		return OPENING_READING_KWH;
	}

	public void setOPENING_READING_KWH(String oPENING_READING_KWH) {
		OPENING_READING_KWH = oPENING_READING_KWH;
	}

	public String getOPENING_READING_KVAH() {
		return OPENING_READING_KVAH;
	}

	public void setOPENING_READING_KVAH(String oPENING_READING_KVAH) {
		OPENING_READING_KVAH = oPENING_READING_KVAH;
	}

	public String getOPENING_READING_DATE() {
		return OPENING_READING_DATE;
	}

	public void setOPENING_READING_DATE(String oPENING_READING_DATE) {
		OPENING_READING_DATE = oPENING_READING_DATE;
	}

	public String getCLOSING_READING_KWH() {
		return CLOSING_READING_KWH;
	}

	public void setCLOSING_READING_KWH(String cLOSING_READING_KWH) {
		CLOSING_READING_KWH = cLOSING_READING_KWH;
	}

	public String getCLOSING_READING_KVAH() {
		return CLOSING_READING_KVAH;
	}

	public void setCLOSING_READING_KVAH(String cLOSING_READING_KVAH) {
		CLOSING_READING_KVAH = cLOSING_READING_KVAH;
	}

	public String getCLOSING_READING_DATE() {
		return CLOSING_READING_DATE;
	}

	public void setCLOSING_READING_DATE(String cLOSING_READING_DATE) {
		CLOSING_READING_DATE = cLOSING_READING_DATE;
	}

	public String getCONSUMPTION_KWH() {
		return CONSUMPTION_KWH;
	}

	public void setCONSUMPTION_KWH(String cONSUMPTION_KWH) {
		CONSUMPTION_KWH = cONSUMPTION_KWH;
	}

	public String getCONSUMPTION_KVAH() {
		return CONSUMPTION_KVAH;
	}

	public void setCONSUMPTION_KVAH(String cONSUMPTION_KVAH) {
		CONSUMPTION_KVAH = cONSUMPTION_KVAH;
	}

	public String getBILLED_AMOUNT() {
		return BILLED_AMOUNT;
	}

	public void setBILLED_AMOUNT(String bILLED_AMOUNT) {
		BILLED_AMOUNT = bILLED_AMOUNT;
	}

	public String getMTR_EXCEP_CD() {
		return MTR_EXCEP_CD;
	}

	public void setMTR_EXCEP_CD(String mTR_EXCEP_CD) {
		MTR_EXCEP_CD = mTR_EXCEP_CD;
	}

	public String getTOTAL_PAY_AMT() {
		return TOTAL_PAY_AMT;
	}

	public void setTOTAL_PAY_AMT(String tOTAL_PAY_AMT) {
		TOTAL_PAY_AMT = tOTAL_PAY_AMT;
	}

}
