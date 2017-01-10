package org.finra.rc.hive2ora.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.finra.rc.hive2ora.annotation.HiveColumnName;


/**
 * User: Han Li Date: 1/9/17
 */
@Entity
@Table(name = "SRC_ERD_FIXED_INCM_MUNI")
public class SrcErdFixedIncmMuniEntity
{
    @Id
    @Column(name="ERD_REC_ID" )
    private Long erdRecId;

    @Column(name="ERD_PRDCT_ID"   , nullable=true , unique=false)
    private Long erdPrdctId;

    @Column(name="BUS_EFCTV_DT"   , nullable=true , unique=false)
    private Date busEfctvDt;

    @Column(name="BUS_XPRTN_DT"   , nullable=true , unique=false)
    private Date busXprtnDt;

    @Column(name="CREAT_TS"   , nullable=true , unique=false)
    private Timestamp creatTs;

    @Column(name="UPDT_TS"   , nullable=true , unique=false)
    private Timestamp updtTs;

    @Column(name="UPDT_USER_ID"  , length=20 , nullable=true , unique=false)
    private String updtUserId;

    @Column(name="TRI_SCRTY_ID"   , nullable=true , unique=false)
    private String triScrtyId;

    @Column(name="TCKR_SYM_ID"  , length=15 , nullable=true , unique=false)
    private String tckrSymId;

    @Column(name="TRI_FULL_BRDG_SYM_ID"  , length=30 , nullable=true , unique=false)
    private String triFullBrdgSymId;

    @Column(name="TRI_BRDG_SYM_ID"  , length=30 , nullable=true , unique=false)
    private String triBrdgSymId;

    @Column(name="CUSIP_ID"  , length=9 , nullable=true , unique=false)
    private String cusipId;

    @Column(name="ISSR_CUSIP_ID"  , length=6 , nullable=true , unique=false)
    private String issrCusipId;

    @Column(name="ISSUE_CUSIP_ID"  , length=2 , nullable=true , unique=false)
    private String issueCusipId;

    @Column(name="ORGNL_CUSIP_TYPE_CD"  , length=2 , nullable=true , unique=false)
    private String orgnlCusipTypeCd;

    @Column(name="ORGNL_CUSIP_TYPE_DS"  , length=60 , nullable=true , unique=false)
    private String orgnlCusipTypeDs;

    @Column(name="ISIN"  , length=20 , nullable=true , unique=false)
    private String isin;

    @Column(name="NSIN_AGNCY_CD"  , length=3 , nullable=true , unique=false)
    private String nsinAgncyCd;

    @Column(name="NSIN_NB"  , length=20 , nullable=true , unique=false)
    private String nsinNb;

    @Column(name="TRI_PRCNG_SRVC_RIC_ID"  , length=30 , nullable=true , unique=false)
    private String triPrcngSrvcRicId;

    @Column(name="ERD_PRDCT_TYPE_LEVEL_1_CD"  , length=10 , nullable=true , unique=false)
    private String erdPrdctTypeLevel1Cd;

    @Column(name="ERD_PRDCT_TYPE_LEVEL_2_CD"  , length=10 , nullable=true , unique=false)
    private String erdPrdctTypeLevel2Cd;

    @Column(name="ERD_PRDCT_TYPE_LEVEL_3_CD"  , length=10 , nullable=true , unique=false)
    private String erdPrdctTypeLevel3Cd;

    @Column(name="ERD_PRDCT_TYPE_LEVEL_4_CD"  , length=10 , nullable=true , unique=false)
    private String erdPrdctTypeLevel4Cd;

    @Column(name="TRI_CLSFN_CD"  , length=4 , nullable=true , unique=false)
    private String triClsfnCd;

    @Column(name="TRI_CLSFN_DS"  , length=255 , nullable=true , unique=false)
    private String triClsfnDs;

    @Column(name="SVRGN_CLASS_CD"  , length=4 , nullable=true , unique=false)
    private String svrgnClassCd;

    @Column(name="ERD_PRDCT_ISSR_ID"   , nullable=true , unique=false)
    private Long erdPrdctIssrId;

    @Column(name="OBLGR_ORG_NM"  , length=128 , nullable=true , unique=false)
    private String oblgrOrgNm;

    @Column(name="LEAD_UNDRW_ID"   , nullable=true , unique=false)
    private Long leadUndrwId;

    @Column(name="PRDCT_DS"  , length=250 , nullable=true , unique=false)
    private String prdctDs;

    @Column(name="PRDCT_DTL_DS"  , length=30 , nullable=true , unique=false)
    private String prdctDtlDs;

    @Column(name="PRDCT_ADTNL_DS"  , length=100 , nullable=true , unique=false)
    private String prdctAdtnlDs;

    @Column(name="PRJCT_NM"  , length=50 , nullable=true , unique=false)
    private String prjctNm;

    @Column(name="PRSPC_SRS"  , length=50 , nullable=true , unique=false)
    private String prspcSrs;

    @Column(name="PRSPC_DT"   , nullable=true , unique=false)
    private Date prspcDt;

    @Column(name="ASSET_TMPLT_CD"  , length=3 , nullable=true , unique=false)
    private String assetTmpltCd;

    @Column(name="ASSET_TMPLT_DS"  , length=40 , nullable=true , unique=false)
    private String assetTmpltDs;

    @Column(name="CRRNT_PRNCL_LEG_NB"   , nullable=true , unique=false)
    private Short crrntPrnclLegNb;

    @Column(name="CRRNT_INTRS_LEG_NB"   , nullable=true , unique=false)
    private Short crrntIntrsLegNb;

    @Column(name="CRRNT_PRNCL_CRNCY_CD"  , length=3 , nullable=true , unique=false)
    private String crrntPrnclCrncyCd;

    @Column(name="PRDCT_STTS_CD"  , length=1 , nullable=true , unique=false)
    private String prdctSttsCd;

    @Column(name="PRDCT_STTS_DTL_CD"  , length=4 , nullable=true , unique=false)
    private String prdctSttsDtlCd;

    @Column(name="PRDCT_STTS_DTL_DS"  , length=40 , nullable=true , unique=false)
    private String prdctSttsDtlDs;

    @Column(name="ANCMT_DT"   , nullable=true , unique=false)
    private Date ancmtDt;

    @Column(name="MTRTY_DT"   , nullable=true , unique=false)
    private Date mtrtyDt;

    @Column(name="AVG_LIFE_DT"   , nullable=true , unique=false)
    private Date avgLifeDt;

    @Column(name="DMSTC_CLNDR_STLMT_DT_CD"  , length=3 , nullable=true , unique=false)
    private String dmstcClndrStlmtDtCd;

    @Column(name="DMSTC_STLMT_VALUE"   , nullable=true , unique=false)
    private Short dmstcStlmtValue;

    @Column(name="OFRNG_DT"   , nullable=true , unique=false)
    private Date ofrngDt;

    @Column(name="SALE_DT"   , nullable=true , unique=false)
    private Date saleDt;

    @Column(name="STLMT_DT"   , nullable=true , unique=false)
    private Date stlmtDt;

    @Column(name="STLMT_DT_CD"  , length=1 , nullable=true , unique=false)
    private String stlmtDtCd;

    @Column(name="STLMT_TRI_HLDY_CNVTN_CD"  , length=4 , nullable=true , unique=false)
    private String stlmtTriHldyCnvtnCd;

    @Column(name="STLMT_TRI_HLDY_CNVTN_DS"  , length=120 , nullable=true , unique=false)
    private String stlmtTriHldyCnvtnDs;

    @Column(name="TERM_TO_MTRTY_DAY_CT"  , length=6 , nullable=true , unique=false)
    private String termToMtrtyDayCt;

    @Column(name="MNDTY_TNDR_DT"   , nullable=true , unique=false)
    private Date mndtyTndrDt;

    @Column(name="NEXT_MNDTY_TNDR_DT"   , nullable=true , unique=false)
    private Date nextMndtyTndrDt;

    @Column(name="ADTNL_CRDT_FL"  , length=1 , nullable=true , unique=false)
    private String adtnlCrdtFl;

    @Column(name="BANK_QLFD_FL"  , length=1 , nullable=true , unique=false)
    private String bankQlfdFl;

    @Column(name="CALL_SCHED_FL"  , length=1 , nullable=true , unique=false)
    private String callSchedFl;

    @Column(name="CALL_TERM_FL"  , length=1 , nullable=true , unique=false)
    private String callTermFl;

    @Column(name="CALL_DFSD_FL"  , length=1 , nullable=true , unique=false)
    private String callDfsdFl;

    @Column(name="CLEAN_UP_CALL_FL"  , length=1 , nullable=true , unique=false)
    private String cleanUpCallFl;

    @Column(name="CNVRB_FL"  , length=1 , nullable=true , unique=false)
    private String cnvrbFl;

    @Column(name="CRDT_SPPRT_SP_FL"  , length=1 , nullable=true , unique=false)
    private String crdtSpprtSpFl;

    @Column(name="CRDT_SPPRT_MOODY_FL"  , length=1 , nullable=true , unique=false)
    private String crdtSpprtMoodyFl;

    @Column(name="CRRNT_INTRS_DFRD_FL"  , length=1 , nullable=true , unique=false)
    private String crrntIntrsDfrdFl;

    @Column(name="DVDND_RCVD_DDCTN_ELGBL_FL"  , length=1 , nullable=true , unique=false)
    private String dvdndRcvdDdctnElgblFl;

    @Column(name="ESG_BOND_FL"  , length=1 , nullable=true , unique=false)
    private String esgBondFl;

    @Column(name="ECB_FL"  , length=1 , nullable=true , unique=false)
    private String ecbFl;

    @Column(name="XTNDL_TERM_FL"  , length=1 , nullable=true , unique=false)
    private String xtndlTermFl;

    @Column(name="FTT_LBL_BOND_FL"  , length=1 , nullable=true , unique=false)
    private String fttLblBondFl;

    @Column(name="FTT_RPTG_ELGBL_BOND_FL"  , length=1 , nullable=true , unique=false)
    private String fttRptgElgblBondFl;

    @Column(name="FLIP_OPTN_FL"  , length=1 , nullable=true , unique=false)
    private String flipOptnFl;

    @Column(name="FUND_TERM_FL"  , length=1 , nullable=true , unique=false)
    private String fundTermFl;

    @Column(name="GREEN_BOND_FL"  , length=1 , nullable=true , unique=false)
    private String greenBondFl;

    @Column(name="GURNT_FL"  , length=1 , nullable=true , unique=false)
    private String gurntFl;

    @Column(name="ISA_ELGBL_FL"  , length=1 , nullable=true , unique=false)
    private String isaElgblFl;

    @Column(name="MAKE_WHOLE_CALL_FL"  , length=1 , nullable=true , unique=false)
    private String makeWholeCallFl;

    @Column(name="MNL_TEST_PRDCT_FL"  , length=1 , nullable=true , unique=false)
    private String mnlTestPrdctFl;

    @Column(name="PRPTL_FL"  , length=1 , nullable=true , unique=false)
    private String prptlFl;

    @Column(name="PRVT_PLCMT_FL"  , length=1 , nullable=true , unique=false)
    private String prvtPlcmtFl;

    @Column(name="PUT_TERM_FL"  , length=1 , nullable=true , unique=false)
    private String putTermFl;

    @Column(name="PTBL_FL"  , length=1 , nullable=true , unique=false)
    private String ptblFl;

    @Column(name="QLFD_DVDND_INCM_ELGBL_FL"  , length=1 , nullable=true , unique=false)
    private String qlfdDvdndIncmElgblFl;

    @Column(name="SINK_DFSD_FL"  , length=1 , nullable=true , unique=false)
    private String sinkDfsdFl;

    @Column(name="STATE_TAX_FL"  , length=1 , nullable=true , unique=false)
    private String stateTaxFl;

    @Column(name="STRHT_BOND_FL"  , length=1 , nullable=true , unique=false)
    private String strhtBondFl;

    @Column(name="SUPER_SNKR_FL"  , length=1 , nullable=true , unique=false)
    private String superSnkrFl;

    @Column(name="SRVVR_OPTN_FL"  , length=1 , nullable=true , unique=false)
    private String srvvrOptnFl;

    @Column(name="TAP_ISSUE_FL"  , length=1 , nullable=true , unique=false)
    private String tapIssueFl;

    @Column(name="TEST_PRDCT_FL"  , length=1 , nullable=true , unique=false)
    private String testPrdctFl;

    @Column(name="TGGL_NT_FL"  , length=1 , nullable=true , unique=false)
    private String tgglNtFl;

    @HiveColumnName("bond_hldr_nsrnc_cltrl_type_cd")
    @Column(name="BOND_HLDR_NSRNC_CLTRL_TP_CD"  , length=5 , nullable=true , unique=false)
    private String bondHldrNsrncCltrlTpCd;

    @HiveColumnName("bond_hldr_nsrnc_cltrl_type_ds")
    @Column(name="BOND_HLDR_NSRNC_CLTRL_TP_DS"  , length=40 , nullable=true , unique=false)
    private String bondHldrNsrncCltrlTpDs;

    @Column(name="ISSR_CNTRY_CD"  , length=3 , nullable=true , unique=false)
    private String issrCntryCd;

    @Column(name="CRNCY_CD"  , length=3 , nullable=true , unique=false)
    private String crncyCd;

    @Column(name="CRRNT_RT_CD"  , length=1 , nullable=true , unique=false)
    private String crrntRtCd;

    @Column(name="CRRNT_RT_DS"  , length=30 , nullable=true , unique=false)
    private String crrntRtDs;

    @Column(name="DATA_CALC_SRVC_TYPE_CD"  , length=2 , nullable=true , unique=false)
    private String dataCalcSrvcTypeCd;

    @Column(name="DATA_CALC_SRVC_TYPE_DS"  , length=40 , nullable=true , unique=false)
    private String dataCalcSrvcTypeDs;

    @Column(name="DEBT_RCRS_CD"  , length=1 , nullable=true , unique=false)
    private String debtRcrsCd;

    @Column(name="DEBT_RCRS_DS"  , length=80 , nullable=true , unique=false)
    private String debtRcrsDs;

    @Column(name="DEBT_SRVC_CD"  , length=1 , nullable=true , unique=false)
    private String debtSrvcCd;

    @Column(name="DEBT_SRVC_DS"  , length=20 , nullable=true , unique=false)
    private String debtSrvcDs;

    @Column(name="FGR_RULE_CD"  , length=1 , nullable=true , unique=false)
    private String fgrRuleCd;

    @Column(name="FGR_RULE_DS"  , length=40 , nullable=true , unique=false)
    private String fgrRuleDs;

    @Column(name="NSTRT_TYPE_CD"  , length=8 , nullable=true , unique=false)
    private String nstrtTypeCd;

    @Column(name="NSTRT_TYPE_DS"  , length=60 , nullable=true , unique=false)
    private String nstrtTypeDs;

    @Column(name="NTV_YLD_TYPE_CD"  , length=2 , nullable=true , unique=false)
    private String ntvYldTypeCd;

    @Column(name="NTV_YLD_TYPE_DS"  , length=40 , nullable=true , unique=false)
    private String ntvYldTypeDs;

    @Column(name="OFRNG_TYPE_CD"   , nullable=true , unique=false)
    private Short ofrngTypeCd;

    @Column(name="OFRNG_TYPE_DS"  , length=40 , nullable=true , unique=false)
    private String ofrngTypeDs;

    @Column(name="PYMNT_FREQ_CD"  , length=30 , nullable=true , unique=false)
    private String pymntFreqCd;

    @Column(name="PYMNT_FREQ_LONG_DS"  , length=40 , nullable=true , unique=false)
    private String pymntFreqLongDs;

    @Column(name="STD_YLD_TYPE_CD"  , length=2 , nullable=true , unique=false)
    private String stdYldTypeCd;

    @Column(name="STD_YLD_TYPE_DS"  , length=40 , nullable=true , unique=false)
    private String stdYldTypeDs;

    @Column(name="TAX_STTS_CD"  , length=1 , nullable=true , unique=false)
    private String taxSttsCd;

    @Column(name="TAX_STTS_DS"  , length=15 , nullable=true , unique=false)
    private String taxSttsDs;

    @Column(name="TTL_ISSD_AM"   , nullable=true , unique=false)
    private BigDecimal ttlIssdAm;

    @Column(name="CAV_MTRTY_AM"   , nullable=true , unique=false)
    private BigDecimal cavMtrtyAm;

    @Column(name="RFFRD_DT"   , nullable=true , unique=false)
    private Date rffrdDt;

    @Column(name="RFFRD_FL"  , length=1 , nullable=true , unique=false)
    private String rffrdFl;

    @Column(name="RPYMT_SRC_CD"  , length=1 , nullable=true , unique=false)
    private String rpymtSrcCd;

    @Column(name="RPYMT_SRC_DS"  , length=40 , nullable=true , unique=false)
    private String rpymtSrcDs;

    @Column(name="ESCRW_PCT"  , length=120 , nullable=true , unique=false)
    private String escrwPct;

    @Column(name="PRSPC_SHELF_TTL_ISSBL_AM"   , nullable=true , unique=false)
    private BigDecimal prspcShelfTtlIssblAm;

    @Column(name="CRRNT_CPN_RT"   , nullable=true , unique=false)
    private BigDecimal crrntCpnRt;

    @Column(name="CPN_RT_TYPE_CD"  , length=6 , nullable=true , unique=false)
    private String cpnRtTypeCd;

    @Column(name="CPN_RT_TYPE_DS"  , length=50 , nullable=true , unique=false)
    private String cpnRtTypeDs;

    @Column(name="CPN_CLASS_CD"  , length=4 , nullable=true , unique=false)
    private String cpnClassCd;

    @Column(name="CPN_CLASS_DS"  , length=40 , nullable=true , unique=false)
    private String cpnClassDs;

    @Column(name="CRRNT_CPN_CLASS_CD"  , length=4 , nullable=true , unique=false)
    private String crrntCpnClassCd;

    @Column(name="CRRNT_CPN_CLASS_DS"  , length=40 , nullable=true , unique=false)
    private String crrntCpnClassDs;

    @Column(name="FIRST_CPN_DT"   , nullable=true , unique=false)
    private Date firstCpnDt;

    @Column(name="LAST_CPN_DT"   , nullable=true , unique=false)
    private Date lastCpnDt;

    @Column(name="CPN_CAP_RT"   , nullable=true , unique=false)
    private BigDecimal cpnCapRt;

    @Column(name="CPN_FLOOR_RT"   , nullable=true , unique=false)
    private BigDecimal cpnFloorRt;

    @Column(name="NEXT_CPN_RT_CHNG_DT"   , nullable=true , unique=false)
    private Date nextCpnRtChngDt;

    @Column(name="PAY_TRI_CLNDR_CD"  , length=3 , nullable=true , unique=false)
    private String payTriClndrCd;

    @Column(name="PAY_TRI_CLNDR_DS"  , length=45 , nullable=true , unique=false)
    private String payTriClndrDs;

    @Column(name="PAY_CLNDR_VALUE"   , nullable=true , unique=false)
    private Short payClndrValue;

    @Column(name="DFRD_INTRS_CNVRN_DT"   , nullable=true , unique=false)
    private Date dfrdIntrsCnvrnDt;

    @Column(name="ORGNL_DTD_DT"   , nullable=true , unique=false)
    private Date orgnlDtdDt;

    @Column(name="ORGNL_ISSUE_AM"   , nullable=true , unique=false)
    private BigDecimal orgnlIssueAm;

    @Column(name="ORGNL_ISSUE_CRNCY_CD"  , length=3 , nullable=true , unique=false)
    private String orgnlIssueCrncyCd;

    @Column(name="ORGNL_ISSUE_DT"   , nullable=true , unique=false)
    private Date orgnlIssueDt;

    @Column(name="ORGNL_ISSUE_DISCT_FL"  , length=1 , nullable=true , unique=false)
    private String orgnlIssueDisctFl;

    @Column(name="ORGNL_ISSUE_OFRNG_RGSTT_ID"   , nullable=true , unique=false)
    private String orgnlIssueOfrngRgsttId;

    @Column(name="ORGNL_ISSUE_OFRNG_RGSTT_NM"  , length=100 , nullable=true , unique=false)
    private String orgnlIssueOfrngRgsttNm;

    @Column(name="ORGNL_ISSUE_OFRNG_TYPE_CD"   , nullable=true , unique=false)
    private Short orgnlIssueOfrngTypeCd;

    @Column(name="ORGNL_ISSUE_OFRNG_TYPE_DS"  , length=40 , nullable=true , unique=false)
    private String orgnlIssueOfrngTypeDs;

    @HiveColumnName("orgnl_issue_pr_quote_incld_accrd_intrs_fl")
    @Column(name="OI_PR_QUT_INC_ACCRD_INTRS_FL"  , length=1 , nullable=true , unique=false)
    private String oiPrQutIncAccrdIntrsFl;

    @Column(name="ORGNL_ISSUE_PR_QUOTE_MTHD_CD"  , length=2 , nullable=true , unique=false)
    private String orgnlIssuePrQuoteMthdCd;

    @Column(name="ORGNL_ISSUE_PR_QUOTE_MTHD_DS"  , length=255 , nullable=true , unique=false)
    private String orgnlIssuePrQuoteMthdDs;

    @Column(name="ORGNL_ISSUE_PBLC_PR_PCT"   , nullable=true , unique=false)
    private BigDecimal orgnlIssuePblcPrPct;

    @Column(name="ORGNL_ISSUE_PBLC_TTL_PR"   , nullable=true , unique=false)
    private BigDecimal orgnlIssuePblcTtlPr;

    @Column(name="ORGNL_ISSUE_RMKTG_DT"   , nullable=true , unique=false)
    private Date orgnlIssueRmktgDt;

    @Column(name="ORGNL_ISSUE_RMKTG_FL"  , length=1 , nullable=true , unique=false)
    private String orgnlIssueRmktgFl;

    @Column(name="ORGNL_ISSUE_RFFR_YLD"   , nullable=true , unique=false)
    private BigDecimal orgnlIssueRffrYld;

    @Column(name="ORGNL_ISSUE_STLMT_DT"   , nullable=true , unique=false)
    private Date orgnlIssueStlmtDt;

    @HiveColumnName("orgnl_issue_use_of_prcds_ctgry_cd")
    @Column(name="ORGNL_ISSUE_PRCDS_CTGRY_CD"  , length=6 , nullable=true , unique=false)
    private String orgnlIssuePrcdsCtgryCd;

    @HiveColumnName("orgnl_issue_use_of_prcds_ctgry_ds")
    @Column(name="ORGNL_ISSUE_PRCDS_CTGRY_DS"  , length=60 , nullable=true , unique=false)
    private String orgnlIssuePrcdsCtgryDs;

    @Column(name="ORGNL_ISSUE_USE_OF_PRCDS_CD"  , length=3 , nullable=true , unique=false)
    private String orgnlIssueUseOfPrcdsCd;

    @HiveColumnName("orgnl_issue_use_of_prcds_long_ds")
    @Column(name="ORGNL_ISSUE_PRCDS_LONG_DS"  , length=40 , nullable=true , unique=false)
    private String orgnlIssuePrcdsLongDs;

    @HiveColumnName("orgnl_issue_use_of_prcds_shrt_ds")
    @Column(name="ORGNL_ISSUE_PRCDS_SHRT_DS"  , length=20 , nullable=true , unique=false)
    private String orgnlIssuePrcdsShrtDs;

    @Column(name="ORGNL_ISSUE_YLD_TO_MTRTY_PCT"   , nullable=true , unique=false)
    private BigDecimal orgnlIssueYldToMtrtyPct;

    @Column(name="PRE_RFNDD_DT"   , nullable=true , unique=false)
    private Date preRfnddDt;

    @Column(name="PRE_RFNDD_PR"   , nullable=true , unique=false)
    private BigDecimal preRfnddPr;

    @Column(name="PRE_RFNDD_TYPE_CD"  , length=1 , nullable=true , unique=false)
    private String preRfnddTypeCd;

    @Column(name="PRE_RFNDD_TYPE_DS"  , length=40 , nullable=true , unique=false)
    private String preRfnddTypeDs;

    @Column(name="PRE_RFNDD_FL"  , length=1 , nullable=true , unique=false)
    private String preRfnddFl;

    @Column(name="RDMPN_VALUE_PCG"   , nullable=true , unique=false)
    private BigDecimal rdmpnValuePcg;

    @Column(name="XTRDY_RDMPN_FL"  , length=1 , nullable=true , unique=false)
    private String xtrdyRdmpnFl;

    @Column(name="SPCL_MNDTY_RDMPN_FL"  , length=1 , nullable=true , unique=false)
    private String spclMndtyRdmpnFl;

    @Column(name="SPCL_OPTNL_RDMPN_FL"  , length=1 , nullable=true , unique=false)
    private String spclOptnlRdmpnFl;

    @Column(name="RDMD_AM"   , nullable=true , unique=false)
    private BigDecimal rdmdAm;

    @Column(name="RDMD_RT"   , nullable=true , unique=false)
    private BigDecimal rdmdRt;

    @Column(name="DAY_CT_SHRT_DS"  , length=40 , nullable=true , unique=false)
    private String dayCtShrtDs;

    @Column(name="DAY_CT_LONG_DS"  , length=255 , nullable=true , unique=false)
    private String dayCtLongDs;

    @Column(name="CALL_TYPE_CD"  , length=3 , nullable=true , unique=false)
    private String callTypeCd;

    @Column(name="CALL_TYPE_DS"  , length=40 , nullable=true , unique=false)
    private String callTypeDs;

    @Column(name="NEXT_CALL_DT"   , nullable=true , unique=false)
    private Date nextCallDt;

    @Column(name="NEXT_CALL_PR"   , nullable=true , unique=false)
    private BigDecimal nextCallPr;

    @Column(name="NEXT_PUT_DT"   , nullable=true , unique=false)
    private Date nextPutDt;

    @Column(name="NEXT_PUT_PR"   , nullable=true , unique=false)
    private BigDecimal nextPutPr;

    @Column(name="PSN_PUT_FL"  , length=1 , nullable=true , unique=false)
    private String psnPutFl;

    @Column(name="SPCL_MNDTY_CALL_CD"  , length=2 , nullable=true , unique=false)
    private String spclMndtyCallCd;

    @Column(name="SPCL_MNDTY_CALL_DS"  , length=60 , nullable=true , unique=false)
    private String spclMndtyCallDs;

    @Column(name="SPCL_OPTNL_CALL_CD"  , length=2 , nullable=true , unique=false)
    private String spclOptnlCallCd;

    @Column(name="SPCL_OPTNL_CALL_DS"  , length=60 , nullable=true , unique=false)
    private String spclOptnlCallDs;

    @Column(name="NEXT_PAR_CALL_DT"   , nullable=true , unique=false)
    private Date nextParCallDt;

    @Column(name="NEXT_PAR_CALL_PR"   , nullable=true , unique=false)
    private BigDecimal nextParCallPr;

    @Column(name="DNMTN_INCRT"   , nullable=true , unique=false)
    private BigDecimal dnmtnIncrt;

    @Column(name="DNMTN_TYPE_CD"  , length=3 , nullable=true , unique=false)
    private String dnmtnTypeCd;

    @Column(name="DNMTN_TYPE_DS"  , length=20 , nullable=true , unique=false)
    private String dnmtnTypeDs;

    @Column(name="MIN_DNMTN_AM"   , nullable=true , unique=false)
    private BigDecimal minDnmtnAm;

    @Column(name="REPO_ELGBL_FL"  , length=1 , nullable=true , unique=false)
    private String repoElgblFl;

    @Column(name="SHRA_OPNN_AVLBL_IN_PRSPC"  , length=1 , nullable=true , unique=false)
    private String shraOpnnAvlblInPrspc;

    @Column(name="LTTR_OF_CRDT_FL"  , length=1 , nullable=true , unique=false)
    private String lttrOfCrdtFl;

    @Column(name="LTTR_OF_CRDT_BANK_ID"   , nullable=true , unique=false)
    private Long lttrOfCrdtBankId;

    @Column(name="LTTR_OF_CRDT_XPRTN_DT"   , nullable=true , unique=false)
    private Date lttrOfCrdtXprtnDt;

    @Column(name="LTTR_OF_CRDT_TYPE_CD"  , length=3 , nullable=true , unique=false)
    private String lttrOfCrdtTypeCd;

    @Column(name="LTTR_OF_CRDT_TYPE_DS"  , length=20 , nullable=true , unique=false)
    private String lttrOfCrdtTypeDs;

    @Column(name="MNCPL_ADTNL_NHNCT_TYPE_CD"  , length=5 , nullable=true , unique=false)
    private String mncplAdtnlNhnctTypeCd;

    @Column(name="MNCPL_ADTNL_NHNCT_TYPE_DS"  , length=50 , nullable=true , unique=false)
    private String mncplAdtnlNhnctTypeDs;

    @Column(name="MNCPL_ADTNL_SCRTY_ORG_CD"  , length=5 , nullable=true , unique=false)
    private String mncplAdtnlScrtyOrgCd;

    @Column(name="MNCPL_ADTNL_SCRTY_ORG_DS"  , length=50 , nullable=true , unique=false)
    private String mncplAdtnlScrtyOrgDs;

    @Column(name="MNCPL_CAP_TYPE_DS"  , length=30 , nullable=true , unique=false)
    private String mncplCapTypeDs;

    @Column(name="MNCPL_MRTGG_NSRNC_DS"  , length=45 , nullable=true , unique=false)
    private String mncplMrtggNsrncDs;

    @Column(name="TRADE_DT"   , nullable=true , unique=false)
    private Date tradeDt;

    public Long getErdRecId()
    {
        return erdRecId;
    }

    public void setErdRecId(Long erdRecId)
    {
        this.erdRecId = erdRecId;
    }

    public Long getErdPrdctId()
    {
        return erdPrdctId;
    }

    public void setErdPrdctId(Long erdPrdctId)
    {
        this.erdPrdctId = erdPrdctId;
    }

    public Date getBusEfctvDt()
    {
        return busEfctvDt;
    }

    public void setBusEfctvDt(Date busEfctvDt)
    {
        this.busEfctvDt = busEfctvDt;
    }

    public Date getBusXprtnDt()
    {
        return busXprtnDt;
    }

    public void setBusXprtnDt(Date busXprtnDt)
    {
        this.busXprtnDt = busXprtnDt;
    }

    public Timestamp getCreatTs()
    {
        return creatTs;
    }

    public void setCreatTs(Timestamp creatTs)
    {
        this.creatTs = creatTs;
    }

    public Timestamp getUpdtTs()
    {
        return updtTs;
    }

    public void setUpdtTs(Timestamp updtTs)
    {
        this.updtTs = updtTs;
    }

    public String getUpdtUserId()
    {
        return updtUserId;
    }

    public void setUpdtUserId(String updtUserId)
    {
        this.updtUserId = updtUserId;
    }

    public String getTriScrtyId()
    {
        return triScrtyId;
    }

    public void setTriScrtyId(String triScrtyId)
    {
        this.triScrtyId = triScrtyId;
    }

    public String getTckrSymId()
    {
        return tckrSymId;
    }

    public void setTckrSymId(String tckrSymId)
    {
        this.tckrSymId = tckrSymId;
    }

    public String getTriFullBrdgSymId()
    {
        return triFullBrdgSymId;
    }

    public void setTriFullBrdgSymId(String triFullBrdgSymId)
    {
        this.triFullBrdgSymId = triFullBrdgSymId;
    }

    public String getTriBrdgSymId()
    {
        return triBrdgSymId;
    }

    public void setTriBrdgSymId(String triBrdgSymId)
    {
        this.triBrdgSymId = triBrdgSymId;
    }

    public String getCusipId()
    {
        return cusipId;
    }

    public void setCusipId(String cusipId)
    {
        this.cusipId = cusipId;
    }

    public String getIssrCusipId()
    {
        return issrCusipId;
    }

    public void setIssrCusipId(String issrCusipId)
    {
        this.issrCusipId = issrCusipId;
    }

    public String getIssueCusipId()
    {
        return issueCusipId;
    }

    public void setIssueCusipId(String issueCusipId)
    {
        this.issueCusipId = issueCusipId;
    }

    public String getOrgnlCusipTypeCd()
    {
        return orgnlCusipTypeCd;
    }

    public void setOrgnlCusipTypeCd(String orgnlCusipTypeCd)
    {
        this.orgnlCusipTypeCd = orgnlCusipTypeCd;
    }

    public String getOrgnlCusipTypeDs()
    {
        return orgnlCusipTypeDs;
    }

    public void setOrgnlCusipTypeDs(String orgnlCusipTypeDs)
    {
        this.orgnlCusipTypeDs = orgnlCusipTypeDs;
    }

    public String getIsin()
    {
        return isin;
    }

    public void setIsin(String isin)
    {
        this.isin = isin;
    }

    public String getNsinAgncyCd()
    {
        return nsinAgncyCd;
    }

    public void setNsinAgncyCd(String nsinAgncyCd)
    {
        this.nsinAgncyCd = nsinAgncyCd;
    }

    public String getNsinNb()
    {
        return nsinNb;
    }

    public void setNsinNb(String nsinNb)
    {
        this.nsinNb = nsinNb;
    }

    public String getTriPrcngSrvcRicId()
    {
        return triPrcngSrvcRicId;
    }

    public void setTriPrcngSrvcRicId(String triPrcngSrvcRicId)
    {
        this.triPrcngSrvcRicId = triPrcngSrvcRicId;
    }

    public String getErdPrdctTypeLevel1Cd()
    {
        return erdPrdctTypeLevel1Cd;
    }

    public void setErdPrdctTypeLevel1Cd(String erdPrdctTypeLevel1Cd)
    {
        this.erdPrdctTypeLevel1Cd = erdPrdctTypeLevel1Cd;
    }

    public String getErdPrdctTypeLevel2Cd()
    {
        return erdPrdctTypeLevel2Cd;
    }

    public void setErdPrdctTypeLevel2Cd(String erdPrdctTypeLevel2Cd)
    {
        this.erdPrdctTypeLevel2Cd = erdPrdctTypeLevel2Cd;
    }

    public String getErdPrdctTypeLevel3Cd()
    {
        return erdPrdctTypeLevel3Cd;
    }

    public void setErdPrdctTypeLevel3Cd(String erdPrdctTypeLevel3Cd)
    {
        this.erdPrdctTypeLevel3Cd = erdPrdctTypeLevel3Cd;
    }

    public String getErdPrdctTypeLevel4Cd()
    {
        return erdPrdctTypeLevel4Cd;
    }

    public void setErdPrdctTypeLevel4Cd(String erdPrdctTypeLevel4Cd)
    {
        this.erdPrdctTypeLevel4Cd = erdPrdctTypeLevel4Cd;
    }

    public String getTriClsfnCd()
    {
        return triClsfnCd;
    }

    public void setTriClsfnCd(String triClsfnCd)
    {
        this.triClsfnCd = triClsfnCd;
    }

    public String getTriClsfnDs()
    {
        return triClsfnDs;
    }

    public void setTriClsfnDs(String triClsfnDs)
    {
        this.triClsfnDs = triClsfnDs;
    }

    public String getSvrgnClassCd()
    {
        return svrgnClassCd;
    }

    public void setSvrgnClassCd(String svrgnClassCd)
    {
        this.svrgnClassCd = svrgnClassCd;
    }

    public Long getErdPrdctIssrId()
    {
        return erdPrdctIssrId;
    }

    public void setErdPrdctIssrId(Long erdPrdctIssrId)
    {
        this.erdPrdctIssrId = erdPrdctIssrId;
    }

    public String getOblgrOrgNm()
    {
        return oblgrOrgNm;
    }

    public void setOblgrOrgNm(String oblgrOrgNm)
    {
        this.oblgrOrgNm = oblgrOrgNm;
    }

    public Long getLeadUndrwId()
    {
        return leadUndrwId;
    }

    public void setLeadUndrwId(Long leadUndrwId)
    {
        this.leadUndrwId = leadUndrwId;
    }

    public String getPrdctDs()
    {
        return prdctDs;
    }

    public void setPrdctDs(String prdctDs)
    {
        this.prdctDs = prdctDs;
    }

    public String getPrdctDtlDs()
    {
        return prdctDtlDs;
    }

    public void setPrdctDtlDs(String prdctDtlDs)
    {
        this.prdctDtlDs = prdctDtlDs;
    }

    public String getPrdctAdtnlDs()
    {
        return prdctAdtnlDs;
    }

    public void setPrdctAdtnlDs(String prdctAdtnlDs)
    {
        this.prdctAdtnlDs = prdctAdtnlDs;
    }

    public String getPrjctNm()
    {
        return prjctNm;
    }

    public void setPrjctNm(String prjctNm)
    {
        this.prjctNm = prjctNm;
    }

    public String getPrspcSrs()
    {
        return prspcSrs;
    }

    public void setPrspcSrs(String prspcSrs)
    {
        this.prspcSrs = prspcSrs;
    }

    public Date getPrspcDt()
    {
        return prspcDt;
    }

    public void setPrspcDt(Date prspcDt)
    {
        this.prspcDt = prspcDt;
    }

    public String getAssetTmpltCd()
    {
        return assetTmpltCd;
    }

    public void setAssetTmpltCd(String assetTmpltCd)
    {
        this.assetTmpltCd = assetTmpltCd;
    }

    public String getAssetTmpltDs()
    {
        return assetTmpltDs;
    }

    public void setAssetTmpltDs(String assetTmpltDs)
    {
        this.assetTmpltDs = assetTmpltDs;
    }

    public Short getCrrntPrnclLegNb()
    {
        return crrntPrnclLegNb;
    }

    public void setCrrntPrnclLegNb(Short crrntPrnclLegNb)
    {
        this.crrntPrnclLegNb = crrntPrnclLegNb;
    }

    public Short getCrrntIntrsLegNb()
    {
        return crrntIntrsLegNb;
    }

    public void setCrrntIntrsLegNb(Short crrntIntrsLegNb)
    {
        this.crrntIntrsLegNb = crrntIntrsLegNb;
    }

    public String getCrrntPrnclCrncyCd()
    {
        return crrntPrnclCrncyCd;
    }

    public void setCrrntPrnclCrncyCd(String crrntPrnclCrncyCd)
    {
        this.crrntPrnclCrncyCd = crrntPrnclCrncyCd;
    }

    public String getPrdctSttsCd()
    {
        return prdctSttsCd;
    }

    public void setPrdctSttsCd(String prdctSttsCd)
    {
        this.prdctSttsCd = prdctSttsCd;
    }

    public String getPrdctSttsDtlCd()
    {
        return prdctSttsDtlCd;
    }

    public void setPrdctSttsDtlCd(String prdctSttsDtlCd)
    {
        this.prdctSttsDtlCd = prdctSttsDtlCd;
    }

    public String getPrdctSttsDtlDs()
    {
        return prdctSttsDtlDs;
    }

    public void setPrdctSttsDtlDs(String prdctSttsDtlDs)
    {
        this.prdctSttsDtlDs = prdctSttsDtlDs;
    }

    public Date getAncmtDt()
    {
        return ancmtDt;
    }

    public void setAncmtDt(Date ancmtDt)
    {
        this.ancmtDt = ancmtDt;
    }

    public Date getMtrtyDt()
    {
        return mtrtyDt;
    }

    public void setMtrtyDt(Date mtrtyDt)
    {
        this.mtrtyDt = mtrtyDt;
    }

    public Date getAvgLifeDt()
    {
        return avgLifeDt;
    }

    public void setAvgLifeDt(Date avgLifeDt)
    {
        this.avgLifeDt = avgLifeDt;
    }

    public String getDmstcClndrStlmtDtCd()
    {
        return dmstcClndrStlmtDtCd;
    }

    public void setDmstcClndrStlmtDtCd(String dmstcClndrStlmtDtCd)
    {
        this.dmstcClndrStlmtDtCd = dmstcClndrStlmtDtCd;
    }

    public Short getDmstcStlmtValue()
    {
        return dmstcStlmtValue;
    }

    public void setDmstcStlmtValue(Short dmstcStlmtValue)
    {
        this.dmstcStlmtValue = dmstcStlmtValue;
    }

    public Date getOfrngDt()
    {
        return ofrngDt;
    }

    public void setOfrngDt(Date ofrngDt)
    {
        this.ofrngDt = ofrngDt;
    }

    public Date getSaleDt()
    {
        return saleDt;
    }

    public void setSaleDt(Date saleDt)
    {
        this.saleDt = saleDt;
    }

    public Date getStlmtDt()
    {
        return stlmtDt;
    }

    public void setStlmtDt(Date stlmtDt)
    {
        this.stlmtDt = stlmtDt;
    }

    public String getStlmtDtCd()
    {
        return stlmtDtCd;
    }

    public void setStlmtDtCd(String stlmtDtCd)
    {
        this.stlmtDtCd = stlmtDtCd;
    }

    public String getStlmtTriHldyCnvtnCd()
    {
        return stlmtTriHldyCnvtnCd;
    }

    public void setStlmtTriHldyCnvtnCd(String stlmtTriHldyCnvtnCd)
    {
        this.stlmtTriHldyCnvtnCd = stlmtTriHldyCnvtnCd;
    }

    public String getStlmtTriHldyCnvtnDs()
    {
        return stlmtTriHldyCnvtnDs;
    }

    public void setStlmtTriHldyCnvtnDs(String stlmtTriHldyCnvtnDs)
    {
        this.stlmtTriHldyCnvtnDs = stlmtTriHldyCnvtnDs;
    }

    public String getTermToMtrtyDayCt()
    {
        return termToMtrtyDayCt;
    }

    public void setTermToMtrtyDayCt(String termToMtrtyDayCt)
    {
        this.termToMtrtyDayCt = termToMtrtyDayCt;
    }

    public Date getMndtyTndrDt()
    {
        return mndtyTndrDt;
    }

    public void setMndtyTndrDt(Date mndtyTndrDt)
    {
        this.mndtyTndrDt = mndtyTndrDt;
    }

    public Date getNextMndtyTndrDt()
    {
        return nextMndtyTndrDt;
    }

    public void setNextMndtyTndrDt(Date nextMndtyTndrDt)
    {
        this.nextMndtyTndrDt = nextMndtyTndrDt;
    }

    public String getAdtnlCrdtFl()
    {
        return adtnlCrdtFl;
    }

    public void setAdtnlCrdtFl(String adtnlCrdtFl)
    {
        this.adtnlCrdtFl = adtnlCrdtFl;
    }

    public String getBankQlfdFl()
    {
        return bankQlfdFl;
    }

    public void setBankQlfdFl(String bankQlfdFl)
    {
        this.bankQlfdFl = bankQlfdFl;
    }

    public String getCallSchedFl()
    {
        return callSchedFl;
    }

    public void setCallSchedFl(String callSchedFl)
    {
        this.callSchedFl = callSchedFl;
    }

    public String getCallTermFl()
    {
        return callTermFl;
    }

    public void setCallTermFl(String callTermFl)
    {
        this.callTermFl = callTermFl;
    }

    public String getCallDfsdFl()
    {
        return callDfsdFl;
    }

    public void setCallDfsdFl(String callDfsdFl)
    {
        this.callDfsdFl = callDfsdFl;
    }

    public String getCleanUpCallFl()
    {
        return cleanUpCallFl;
    }

    public void setCleanUpCallFl(String cleanUpCallFl)
    {
        this.cleanUpCallFl = cleanUpCallFl;
    }

    public String getCnvrbFl()
    {
        return cnvrbFl;
    }

    public void setCnvrbFl(String cnvrbFl)
    {
        this.cnvrbFl = cnvrbFl;
    }

    public String getCrdtSpprtSpFl()
    {
        return crdtSpprtSpFl;
    }

    public void setCrdtSpprtSpFl(String crdtSpprtSpFl)
    {
        this.crdtSpprtSpFl = crdtSpprtSpFl;
    }

    public String getCrdtSpprtMoodyFl()
    {
        return crdtSpprtMoodyFl;
    }

    public void setCrdtSpprtMoodyFl(String crdtSpprtMoodyFl)
    {
        this.crdtSpprtMoodyFl = crdtSpprtMoodyFl;
    }

    public String getCrrntIntrsDfrdFl()
    {
        return crrntIntrsDfrdFl;
    }

    public void setCrrntIntrsDfrdFl(String crrntIntrsDfrdFl)
    {
        this.crrntIntrsDfrdFl = crrntIntrsDfrdFl;
    }

    public String getDvdndRcvdDdctnElgblFl()
    {
        return dvdndRcvdDdctnElgblFl;
    }

    public void setDvdndRcvdDdctnElgblFl(String dvdndRcvdDdctnElgblFl)
    {
        this.dvdndRcvdDdctnElgblFl = dvdndRcvdDdctnElgblFl;
    }

    public String getEsgBondFl()
    {
        return esgBondFl;
    }

    public void setEsgBondFl(String esgBondFl)
    {
        this.esgBondFl = esgBondFl;
    }

    public String getEcbFl()
    {
        return ecbFl;
    }

    public void setEcbFl(String ecbFl)
    {
        this.ecbFl = ecbFl;
    }

    public String getXtndlTermFl()
    {
        return xtndlTermFl;
    }

    public void setXtndlTermFl(String xtndlTermFl)
    {
        this.xtndlTermFl = xtndlTermFl;
    }

    public String getFttLblBondFl()
    {
        return fttLblBondFl;
    }

    public void setFttLblBondFl(String fttLblBondFl)
    {
        this.fttLblBondFl = fttLblBondFl;
    }

    public String getFttRptgElgblBondFl()
    {
        return fttRptgElgblBondFl;
    }

    public void setFttRptgElgblBondFl(String fttRptgElgblBondFl)
    {
        this.fttRptgElgblBondFl = fttRptgElgblBondFl;
    }

    public String getFlipOptnFl()
    {
        return flipOptnFl;
    }

    public void setFlipOptnFl(String flipOptnFl)
    {
        this.flipOptnFl = flipOptnFl;
    }

    public String getFundTermFl()
    {
        return fundTermFl;
    }

    public void setFundTermFl(String fundTermFl)
    {
        this.fundTermFl = fundTermFl;
    }

    public String getGreenBondFl()
    {
        return greenBondFl;
    }

    public void setGreenBondFl(String greenBondFl)
    {
        this.greenBondFl = greenBondFl;
    }

    public String getGurntFl()
    {
        return gurntFl;
    }

    public void setGurntFl(String gurntFl)
    {
        this.gurntFl = gurntFl;
    }

    public String getIsaElgblFl()
    {
        return isaElgblFl;
    }

    public void setIsaElgblFl(String isaElgblFl)
    {
        this.isaElgblFl = isaElgblFl;
    }

    public String getMakeWholeCallFl()
    {
        return makeWholeCallFl;
    }

    public void setMakeWholeCallFl(String makeWholeCallFl)
    {
        this.makeWholeCallFl = makeWholeCallFl;
    }

    public String getMnlTestPrdctFl()
    {
        return mnlTestPrdctFl;
    }

    public void setMnlTestPrdctFl(String mnlTestPrdctFl)
    {
        this.mnlTestPrdctFl = mnlTestPrdctFl;
    }

    public String getPrptlFl()
    {
        return prptlFl;
    }

    public void setPrptlFl(String prptlFl)
    {
        this.prptlFl = prptlFl;
    }

    public String getPrvtPlcmtFl()
    {
        return prvtPlcmtFl;
    }

    public void setPrvtPlcmtFl(String prvtPlcmtFl)
    {
        this.prvtPlcmtFl = prvtPlcmtFl;
    }

    public String getPutTermFl()
    {
        return putTermFl;
    }

    public void setPutTermFl(String putTermFl)
    {
        this.putTermFl = putTermFl;
    }

    public String getPtblFl()
    {
        return ptblFl;
    }

    public void setPtblFl(String ptblFl)
    {
        this.ptblFl = ptblFl;
    }

    public String getQlfdDvdndIncmElgblFl()
    {
        return qlfdDvdndIncmElgblFl;
    }

    public void setQlfdDvdndIncmElgblFl(String qlfdDvdndIncmElgblFl)
    {
        this.qlfdDvdndIncmElgblFl = qlfdDvdndIncmElgblFl;
    }

    public String getSinkDfsdFl()
    {
        return sinkDfsdFl;
    }

    public void setSinkDfsdFl(String sinkDfsdFl)
    {
        this.sinkDfsdFl = sinkDfsdFl;
    }

    public String getStateTaxFl()
    {
        return stateTaxFl;
    }

    public void setStateTaxFl(String stateTaxFl)
    {
        this.stateTaxFl = stateTaxFl;
    }

    public String getStrhtBondFl()
    {
        return strhtBondFl;
    }

    public void setStrhtBondFl(String strhtBondFl)
    {
        this.strhtBondFl = strhtBondFl;
    }

    public String getSuperSnkrFl()
    {
        return superSnkrFl;
    }

    public void setSuperSnkrFl(String superSnkrFl)
    {
        this.superSnkrFl = superSnkrFl;
    }

    public String getSrvvrOptnFl()
    {
        return srvvrOptnFl;
    }

    public void setSrvvrOptnFl(String srvvrOptnFl)
    {
        this.srvvrOptnFl = srvvrOptnFl;
    }

    public String getTapIssueFl()
    {
        return tapIssueFl;
    }

    public void setTapIssueFl(String tapIssueFl)
    {
        this.tapIssueFl = tapIssueFl;
    }

    public String getTestPrdctFl()
    {
        return testPrdctFl;
    }

    public void setTestPrdctFl(String testPrdctFl)
    {
        this.testPrdctFl = testPrdctFl;
    }

    public String getTgglNtFl()
    {
        return tgglNtFl;
    }

    public void setTgglNtFl(String tgglNtFl)
    {
        this.tgglNtFl = tgglNtFl;
    }

    public String getBondHldrNsrncCltrlTpCd()
    {
        return bondHldrNsrncCltrlTpCd;
    }

    public void setBondHldrNsrncCltrlTpCd(String bondHldrNsrncCltrlTpCd)
    {
        this.bondHldrNsrncCltrlTpCd = bondHldrNsrncCltrlTpCd;
    }

    public String getBondHldrNsrncCltrlTpDs()
    {
        return bondHldrNsrncCltrlTpDs;
    }

    public void setBondHldrNsrncCltrlTpDs(String bondHldrNsrncCltrlTpDs)
    {
        this.bondHldrNsrncCltrlTpDs = bondHldrNsrncCltrlTpDs;
    }

    public String getIssrCntryCd()
    {
        return issrCntryCd;
    }

    public void setIssrCntryCd(String issrCntryCd)
    {
        this.issrCntryCd = issrCntryCd;
    }

    public String getCrncyCd()
    {
        return crncyCd;
    }

    public void setCrncyCd(String crncyCd)
    {
        this.crncyCd = crncyCd;
    }

    public String getCrrntRtCd()
    {
        return crrntRtCd;
    }

    public void setCrrntRtCd(String crrntRtCd)
    {
        this.crrntRtCd = crrntRtCd;
    }

    public String getCrrntRtDs()
    {
        return crrntRtDs;
    }

    public void setCrrntRtDs(String crrntRtDs)
    {
        this.crrntRtDs = crrntRtDs;
    }

    public String getDataCalcSrvcTypeCd()
    {
        return dataCalcSrvcTypeCd;
    }

    public void setDataCalcSrvcTypeCd(String dataCalcSrvcTypeCd)
    {
        this.dataCalcSrvcTypeCd = dataCalcSrvcTypeCd;
    }

    public String getDataCalcSrvcTypeDs()
    {
        return dataCalcSrvcTypeDs;
    }

    public void setDataCalcSrvcTypeDs(String dataCalcSrvcTypeDs)
    {
        this.dataCalcSrvcTypeDs = dataCalcSrvcTypeDs;
    }

    public String getDebtRcrsCd()
    {
        return debtRcrsCd;
    }

    public void setDebtRcrsCd(String debtRcrsCd)
    {
        this.debtRcrsCd = debtRcrsCd;
    }

    public String getDebtRcrsDs()
    {
        return debtRcrsDs;
    }

    public void setDebtRcrsDs(String debtRcrsDs)
    {
        this.debtRcrsDs = debtRcrsDs;
    }

    public String getDebtSrvcCd()
    {
        return debtSrvcCd;
    }

    public void setDebtSrvcCd(String debtSrvcCd)
    {
        this.debtSrvcCd = debtSrvcCd;
    }

    public String getDebtSrvcDs()
    {
        return debtSrvcDs;
    }

    public void setDebtSrvcDs(String debtSrvcDs)
    {
        this.debtSrvcDs = debtSrvcDs;
    }

    public String getFgrRuleCd()
    {
        return fgrRuleCd;
    }

    public void setFgrRuleCd(String fgrRuleCd)
    {
        this.fgrRuleCd = fgrRuleCd;
    }

    public String getFgrRuleDs()
    {
        return fgrRuleDs;
    }

    public void setFgrRuleDs(String fgrRuleDs)
    {
        this.fgrRuleDs = fgrRuleDs;
    }

    public String getNstrtTypeCd()
    {
        return nstrtTypeCd;
    }

    public void setNstrtTypeCd(String nstrtTypeCd)
    {
        this.nstrtTypeCd = nstrtTypeCd;
    }

    public String getNstrtTypeDs()
    {
        return nstrtTypeDs;
    }

    public void setNstrtTypeDs(String nstrtTypeDs)
    {
        this.nstrtTypeDs = nstrtTypeDs;
    }

    public String getNtvYldTypeCd()
    {
        return ntvYldTypeCd;
    }

    public void setNtvYldTypeCd(String ntvYldTypeCd)
    {
        this.ntvYldTypeCd = ntvYldTypeCd;
    }

    public String getNtvYldTypeDs()
    {
        return ntvYldTypeDs;
    }

    public void setNtvYldTypeDs(String ntvYldTypeDs)
    {
        this.ntvYldTypeDs = ntvYldTypeDs;
    }

    public Short getOfrngTypeCd()
    {
        return ofrngTypeCd;
    }

    public void setOfrngTypeCd(Short ofrngTypeCd)
    {
        this.ofrngTypeCd = ofrngTypeCd;
    }

    public String getOfrngTypeDs()
    {
        return ofrngTypeDs;
    }

    public void setOfrngTypeDs(String ofrngTypeDs)
    {
        this.ofrngTypeDs = ofrngTypeDs;
    }

    public String getPymntFreqCd()
    {
        return pymntFreqCd;
    }

    public void setPymntFreqCd(String pymntFreqCd)
    {
        this.pymntFreqCd = pymntFreqCd;
    }

    public String getPymntFreqLongDs()
    {
        return pymntFreqLongDs;
    }

    public void setPymntFreqLongDs(String pymntFreqLongDs)
    {
        this.pymntFreqLongDs = pymntFreqLongDs;
    }

    public String getStdYldTypeCd()
    {
        return stdYldTypeCd;
    }

    public void setStdYldTypeCd(String stdYldTypeCd)
    {
        this.stdYldTypeCd = stdYldTypeCd;
    }

    public String getStdYldTypeDs()
    {
        return stdYldTypeDs;
    }

    public void setStdYldTypeDs(String stdYldTypeDs)
    {
        this.stdYldTypeDs = stdYldTypeDs;
    }

    public String getTaxSttsCd()
    {
        return taxSttsCd;
    }

    public void setTaxSttsCd(String taxSttsCd)
    {
        this.taxSttsCd = taxSttsCd;
    }

    public String getTaxSttsDs()
    {
        return taxSttsDs;
    }

    public void setTaxSttsDs(String taxSttsDs)
    {
        this.taxSttsDs = taxSttsDs;
    }

    public BigDecimal getTtlIssdAm()
    {
        return ttlIssdAm;
    }

    public void setTtlIssdAm(BigDecimal ttlIssdAm)
    {
        this.ttlIssdAm = ttlIssdAm;
    }

    public BigDecimal getCavMtrtyAm()
    {
        return cavMtrtyAm;
    }

    public void setCavMtrtyAm(BigDecimal cavMtrtyAm)
    {
        this.cavMtrtyAm = cavMtrtyAm;
    }

    public Date getRffrdDt()
    {
        return rffrdDt;
    }

    public void setRffrdDt(Date rffrdDt)
    {
        this.rffrdDt = rffrdDt;
    }

    public String getRffrdFl()
    {
        return rffrdFl;
    }

    public void setRffrdFl(String rffrdFl)
    {
        this.rffrdFl = rffrdFl;
    }

    public String getRpymtSrcCd()
    {
        return rpymtSrcCd;
    }

    public void setRpymtSrcCd(String rpymtSrcCd)
    {
        this.rpymtSrcCd = rpymtSrcCd;
    }

    public String getRpymtSrcDs()
    {
        return rpymtSrcDs;
    }

    public void setRpymtSrcDs(String rpymtSrcDs)
    {
        this.rpymtSrcDs = rpymtSrcDs;
    }

    public String getEscrwPct()
    {
        return escrwPct;
    }

    public void setEscrwPct(String escrwPct)
    {
        this.escrwPct = escrwPct;
    }

    public BigDecimal getPrspcShelfTtlIssblAm()
    {
        return prspcShelfTtlIssblAm;
    }

    public void setPrspcShelfTtlIssblAm(BigDecimal prspcShelfTtlIssblAm)
    {
        this.prspcShelfTtlIssblAm = prspcShelfTtlIssblAm;
    }

    public BigDecimal getCrrntCpnRt()
    {
        return crrntCpnRt;
    }

    public void setCrrntCpnRt(BigDecimal crrntCpnRt)
    {
        this.crrntCpnRt = crrntCpnRt;
    }

    public String getCpnRtTypeCd()
    {
        return cpnRtTypeCd;
    }

    public void setCpnRtTypeCd(String cpnRtTypeCd)
    {
        this.cpnRtTypeCd = cpnRtTypeCd;
    }

    public String getCpnRtTypeDs()
    {
        return cpnRtTypeDs;
    }

    public void setCpnRtTypeDs(String cpnRtTypeDs)
    {
        this.cpnRtTypeDs = cpnRtTypeDs;
    }

    public String getCpnClassCd()
    {
        return cpnClassCd;
    }

    public void setCpnClassCd(String cpnClassCd)
    {
        this.cpnClassCd = cpnClassCd;
    }

    public String getCpnClassDs()
    {
        return cpnClassDs;
    }

    public void setCpnClassDs(String cpnClassDs)
    {
        this.cpnClassDs = cpnClassDs;
    }

    public String getCrrntCpnClassCd()
    {
        return crrntCpnClassCd;
    }

    public void setCrrntCpnClassCd(String crrntCpnClassCd)
    {
        this.crrntCpnClassCd = crrntCpnClassCd;
    }

    public String getCrrntCpnClassDs()
    {
        return crrntCpnClassDs;
    }

    public void setCrrntCpnClassDs(String crrntCpnClassDs)
    {
        this.crrntCpnClassDs = crrntCpnClassDs;
    }

    public Date getFirstCpnDt()
    {
        return firstCpnDt;
    }

    public void setFirstCpnDt(Date firstCpnDt)
    {
        this.firstCpnDt = firstCpnDt;
    }

    public Date getLastCpnDt()
    {
        return lastCpnDt;
    }

    public void setLastCpnDt(Date lastCpnDt)
    {
        this.lastCpnDt = lastCpnDt;
    }

    public BigDecimal getCpnCapRt()
    {
        return cpnCapRt;
    }

    public void setCpnCapRt(BigDecimal cpnCapRt)
    {
        this.cpnCapRt = cpnCapRt;
    }

    public BigDecimal getCpnFloorRt()
    {
        return cpnFloorRt;
    }

    public void setCpnFloorRt(BigDecimal cpnFloorRt)
    {
        this.cpnFloorRt = cpnFloorRt;
    }

    public Date getNextCpnRtChngDt()
    {
        return nextCpnRtChngDt;
    }

    public void setNextCpnRtChngDt(Date nextCpnRtChngDt)
    {
        this.nextCpnRtChngDt = nextCpnRtChngDt;
    }

    public String getPayTriClndrCd()
    {
        return payTriClndrCd;
    }

    public void setPayTriClndrCd(String payTriClndrCd)
    {
        this.payTriClndrCd = payTriClndrCd;
    }

    public String getPayTriClndrDs()
    {
        return payTriClndrDs;
    }

    public void setPayTriClndrDs(String payTriClndrDs)
    {
        this.payTriClndrDs = payTriClndrDs;
    }

    public Short getPayClndrValue()
    {
        return payClndrValue;
    }

    public void setPayClndrValue(Short payClndrValue)
    {
        this.payClndrValue = payClndrValue;
    }

    public Date getDfrdIntrsCnvrnDt()
    {
        return dfrdIntrsCnvrnDt;
    }

    public void setDfrdIntrsCnvrnDt(Date dfrdIntrsCnvrnDt)
    {
        this.dfrdIntrsCnvrnDt = dfrdIntrsCnvrnDt;
    }

    public Date getOrgnlDtdDt()
    {
        return orgnlDtdDt;
    }

    public void setOrgnlDtdDt(Date orgnlDtdDt)
    {
        this.orgnlDtdDt = orgnlDtdDt;
    }

    public BigDecimal getOrgnlIssueAm()
    {
        return orgnlIssueAm;
    }

    public void setOrgnlIssueAm(BigDecimal orgnlIssueAm)
    {
        this.orgnlIssueAm = orgnlIssueAm;
    }

    public String getOrgnlIssueCrncyCd()
    {
        return orgnlIssueCrncyCd;
    }

    public void setOrgnlIssueCrncyCd(String orgnlIssueCrncyCd)
    {
        this.orgnlIssueCrncyCd = orgnlIssueCrncyCd;
    }

    public Date getOrgnlIssueDt()
    {
        return orgnlIssueDt;
    }

    public void setOrgnlIssueDt(Date orgnlIssueDt)
    {
        this.orgnlIssueDt = orgnlIssueDt;
    }

    public String getOrgnlIssueDisctFl()
    {
        return orgnlIssueDisctFl;
    }

    public void setOrgnlIssueDisctFl(String orgnlIssueDisctFl)
    {
        this.orgnlIssueDisctFl = orgnlIssueDisctFl;
    }

    public String getOrgnlIssueOfrngRgsttId()
    {
        return orgnlIssueOfrngRgsttId;
    }

    public void setOrgnlIssueOfrngRgsttId(String orgnlIssueOfrngRgsttId)
    {
        this.orgnlIssueOfrngRgsttId = orgnlIssueOfrngRgsttId;
    }

    public String getOrgnlIssueOfrngRgsttNm()
    {
        return orgnlIssueOfrngRgsttNm;
    }

    public void setOrgnlIssueOfrngRgsttNm(String orgnlIssueOfrngRgsttNm)
    {
        this.orgnlIssueOfrngRgsttNm = orgnlIssueOfrngRgsttNm;
    }

    public Short getOrgnlIssueOfrngTypeCd()
    {
        return orgnlIssueOfrngTypeCd;
    }

    public void setOrgnlIssueOfrngTypeCd(Short orgnlIssueOfrngTypeCd)
    {
        this.orgnlIssueOfrngTypeCd = orgnlIssueOfrngTypeCd;
    }

    public String getOrgnlIssueOfrngTypeDs()
    {
        return orgnlIssueOfrngTypeDs;
    }

    public void setOrgnlIssueOfrngTypeDs(String orgnlIssueOfrngTypeDs)
    {
        this.orgnlIssueOfrngTypeDs = orgnlIssueOfrngTypeDs;
    }

    public String getOiPrQutIncAccrdIntrsFl()
    {
        return oiPrQutIncAccrdIntrsFl;
    }

    public void setOiPrQutIncAccrdIntrsFl(String oiPrQutIncAccrdIntrsFl)
    {
        this.oiPrQutIncAccrdIntrsFl = oiPrQutIncAccrdIntrsFl;
    }

    public String getOrgnlIssuePrQuoteMthdCd()
    {
        return orgnlIssuePrQuoteMthdCd;
    }

    public void setOrgnlIssuePrQuoteMthdCd(String orgnlIssuePrQuoteMthdCd)
    {
        this.orgnlIssuePrQuoteMthdCd = orgnlIssuePrQuoteMthdCd;
    }

    public String getOrgnlIssuePrQuoteMthdDs()
    {
        return orgnlIssuePrQuoteMthdDs;
    }

    public void setOrgnlIssuePrQuoteMthdDs(String orgnlIssuePrQuoteMthdDs)
    {
        this.orgnlIssuePrQuoteMthdDs = orgnlIssuePrQuoteMthdDs;
    }

    public BigDecimal getOrgnlIssuePblcPrPct()
    {
        return orgnlIssuePblcPrPct;
    }

    public void setOrgnlIssuePblcPrPct(BigDecimal orgnlIssuePblcPrPct)
    {
        this.orgnlIssuePblcPrPct = orgnlIssuePblcPrPct;
    }

    public BigDecimal getOrgnlIssuePblcTtlPr()
    {
        return orgnlIssuePblcTtlPr;
    }

    public void setOrgnlIssuePblcTtlPr(BigDecimal orgnlIssuePblcTtlPr)
    {
        this.orgnlIssuePblcTtlPr = orgnlIssuePblcTtlPr;
    }

    public Date getOrgnlIssueRmktgDt()
    {
        return orgnlIssueRmktgDt;
    }

    public void setOrgnlIssueRmktgDt(Date orgnlIssueRmktgDt)
    {
        this.orgnlIssueRmktgDt = orgnlIssueRmktgDt;
    }

    public String getOrgnlIssueRmktgFl()
    {
        return orgnlIssueRmktgFl;
    }

    public void setOrgnlIssueRmktgFl(String orgnlIssueRmktgFl)
    {
        this.orgnlIssueRmktgFl = orgnlIssueRmktgFl;
    }

    public BigDecimal getOrgnlIssueRffrYld()
    {
        return orgnlIssueRffrYld;
    }

    public void setOrgnlIssueRffrYld(BigDecimal orgnlIssueRffrYld)
    {
        this.orgnlIssueRffrYld = orgnlIssueRffrYld;
    }

    public Date getOrgnlIssueStlmtDt()
    {
        return orgnlIssueStlmtDt;
    }

    public void setOrgnlIssueStlmtDt(Date orgnlIssueStlmtDt)
    {
        this.orgnlIssueStlmtDt = orgnlIssueStlmtDt;
    }

    public String getOrgnlIssuePrcdsCtgryCd()
    {
        return orgnlIssuePrcdsCtgryCd;
    }

    public void setOrgnlIssuePrcdsCtgryCd(String orgnlIssuePrcdsCtgryCd)
    {
        this.orgnlIssuePrcdsCtgryCd = orgnlIssuePrcdsCtgryCd;
    }

    public String getOrgnlIssuePrcdsCtgryDs()
    {
        return orgnlIssuePrcdsCtgryDs;
    }

    public void setOrgnlIssuePrcdsCtgryDs(String orgnlIssuePrcdsCtgryDs)
    {
        this.orgnlIssuePrcdsCtgryDs = orgnlIssuePrcdsCtgryDs;
    }

    public String getOrgnlIssueUseOfPrcdsCd()
    {
        return orgnlIssueUseOfPrcdsCd;
    }

    public void setOrgnlIssueUseOfPrcdsCd(String orgnlIssueUseOfPrcdsCd)
    {
        this.orgnlIssueUseOfPrcdsCd = orgnlIssueUseOfPrcdsCd;
    }

    public String getOrgnlIssuePrcdsLongDs()
    {
        return orgnlIssuePrcdsLongDs;
    }

    public void setOrgnlIssuePrcdsLongDs(String orgnlIssuePrcdsLongDs)
    {
        this.orgnlIssuePrcdsLongDs = orgnlIssuePrcdsLongDs;
    }

    public String getOrgnlIssuePrcdsShrtDs()
    {
        return orgnlIssuePrcdsShrtDs;
    }

    public void setOrgnlIssuePrcdsShrtDs(String orgnlIssuePrcdsShrtDs)
    {
        this.orgnlIssuePrcdsShrtDs = orgnlIssuePrcdsShrtDs;
    }

    public BigDecimal getOrgnlIssueYldToMtrtyPct()
    {
        return orgnlIssueYldToMtrtyPct;
    }

    public void setOrgnlIssueYldToMtrtyPct(BigDecimal orgnlIssueYldToMtrtyPct)
    {
        this.orgnlIssueYldToMtrtyPct = orgnlIssueYldToMtrtyPct;
    }

    public Date getPreRfnddDt()
    {
        return preRfnddDt;
    }

    public void setPreRfnddDt(Date preRfnddDt)
    {
        this.preRfnddDt = preRfnddDt;
    }

    public BigDecimal getPreRfnddPr()
    {
        return preRfnddPr;
    }

    public void setPreRfnddPr(BigDecimal preRfnddPr)
    {
        this.preRfnddPr = preRfnddPr;
    }

    public String getPreRfnddTypeCd()
    {
        return preRfnddTypeCd;
    }

    public void setPreRfnddTypeCd(String preRfnddTypeCd)
    {
        this.preRfnddTypeCd = preRfnddTypeCd;
    }

    public String getPreRfnddTypeDs()
    {
        return preRfnddTypeDs;
    }

    public void setPreRfnddTypeDs(String preRfnddTypeDs)
    {
        this.preRfnddTypeDs = preRfnddTypeDs;
    }

    public String getPreRfnddFl()
    {
        return preRfnddFl;
    }

    public void setPreRfnddFl(String preRfnddFl)
    {
        this.preRfnddFl = preRfnddFl;
    }

    public BigDecimal getRdmpnValuePcg()
    {
        return rdmpnValuePcg;
    }

    public void setRdmpnValuePcg(BigDecimal rdmpnValuePcg)
    {
        this.rdmpnValuePcg = rdmpnValuePcg;
    }

    public String getXtrdyRdmpnFl()
    {
        return xtrdyRdmpnFl;
    }

    public void setXtrdyRdmpnFl(String xtrdyRdmpnFl)
    {
        this.xtrdyRdmpnFl = xtrdyRdmpnFl;
    }

    public String getSpclMndtyRdmpnFl()
    {
        return spclMndtyRdmpnFl;
    }

    public void setSpclMndtyRdmpnFl(String spclMndtyRdmpnFl)
    {
        this.spclMndtyRdmpnFl = spclMndtyRdmpnFl;
    }

    public String getSpclOptnlRdmpnFl()
    {
        return spclOptnlRdmpnFl;
    }

    public void setSpclOptnlRdmpnFl(String spclOptnlRdmpnFl)
    {
        this.spclOptnlRdmpnFl = spclOptnlRdmpnFl;
    }

    public BigDecimal getRdmdAm()
    {
        return rdmdAm;
    }

    public void setRdmdAm(BigDecimal rdmdAm)
    {
        this.rdmdAm = rdmdAm;
    }

    public BigDecimal getRdmdRt()
    {
        return rdmdRt;
    }

    public void setRdmdRt(BigDecimal rdmdRt)
    {
        this.rdmdRt = rdmdRt;
    }

    public String getDayCtShrtDs()
    {
        return dayCtShrtDs;
    }

    public void setDayCtShrtDs(String dayCtShrtDs)
    {
        this.dayCtShrtDs = dayCtShrtDs;
    }

    public String getDayCtLongDs()
    {
        return dayCtLongDs;
    }

    public void setDayCtLongDs(String dayCtLongDs)
    {
        this.dayCtLongDs = dayCtLongDs;
    }

    public String getCallTypeCd()
    {
        return callTypeCd;
    }

    public void setCallTypeCd(String callTypeCd)
    {
        this.callTypeCd = callTypeCd;
    }

    public String getCallTypeDs()
    {
        return callTypeDs;
    }

    public void setCallTypeDs(String callTypeDs)
    {
        this.callTypeDs = callTypeDs;
    }

    public Date getNextCallDt()
    {
        return nextCallDt;
    }

    public void setNextCallDt(Date nextCallDt)
    {
        this.nextCallDt = nextCallDt;
    }

    public BigDecimal getNextCallPr()
    {
        return nextCallPr;
    }

    public void setNextCallPr(BigDecimal nextCallPr)
    {
        this.nextCallPr = nextCallPr;
    }

    public Date getNextPutDt()
    {
        return nextPutDt;
    }

    public void setNextPutDt(Date nextPutDt)
    {
        this.nextPutDt = nextPutDt;
    }

    public BigDecimal getNextPutPr()
    {
        return nextPutPr;
    }

    public void setNextPutPr(BigDecimal nextPutPr)
    {
        this.nextPutPr = nextPutPr;
    }

    public String getPsnPutFl()
    {
        return psnPutFl;
    }

    public void setPsnPutFl(String psnPutFl)
    {
        this.psnPutFl = psnPutFl;
    }

    public String getSpclMndtyCallCd()
    {
        return spclMndtyCallCd;
    }

    public void setSpclMndtyCallCd(String spclMndtyCallCd)
    {
        this.spclMndtyCallCd = spclMndtyCallCd;
    }

    public String getSpclMndtyCallDs()
    {
        return spclMndtyCallDs;
    }

    public void setSpclMndtyCallDs(String spclMndtyCallDs)
    {
        this.spclMndtyCallDs = spclMndtyCallDs;
    }

    public String getSpclOptnlCallCd()
    {
        return spclOptnlCallCd;
    }

    public void setSpclOptnlCallCd(String spclOptnlCallCd)
    {
        this.spclOptnlCallCd = spclOptnlCallCd;
    }

    public String getSpclOptnlCallDs()
    {
        return spclOptnlCallDs;
    }

    public void setSpclOptnlCallDs(String spclOptnlCallDs)
    {
        this.spclOptnlCallDs = spclOptnlCallDs;
    }

    public Date getNextParCallDt()
    {
        return nextParCallDt;
    }

    public void setNextParCallDt(Date nextParCallDt)
    {
        this.nextParCallDt = nextParCallDt;
    }

    public BigDecimal getNextParCallPr()
    {
        return nextParCallPr;
    }

    public void setNextParCallPr(BigDecimal nextParCallPr)
    {
        this.nextParCallPr = nextParCallPr;
    }

    public BigDecimal getDnmtnIncrt()
    {
        return dnmtnIncrt;
    }

    public void setDnmtnIncrt(BigDecimal dnmtnIncrt)
    {
        this.dnmtnIncrt = dnmtnIncrt;
    }

    public String getDnmtnTypeCd()
    {
        return dnmtnTypeCd;
    }

    public void setDnmtnTypeCd(String dnmtnTypeCd)
    {
        this.dnmtnTypeCd = dnmtnTypeCd;
    }

    public String getDnmtnTypeDs()
    {
        return dnmtnTypeDs;
    }

    public void setDnmtnTypeDs(String dnmtnTypeDs)
    {
        this.dnmtnTypeDs = dnmtnTypeDs;
    }

    public BigDecimal getMinDnmtnAm()
    {
        return minDnmtnAm;
    }

    public void setMinDnmtnAm(BigDecimal minDnmtnAm)
    {
        this.minDnmtnAm = minDnmtnAm;
    }

    public String getRepoElgblFl()
    {
        return repoElgblFl;
    }

    public void setRepoElgblFl(String repoElgblFl)
    {
        this.repoElgblFl = repoElgblFl;
    }

    public String getShraOpnnAvlblInPrspc()
    {
        return shraOpnnAvlblInPrspc;
    }

    public void setShraOpnnAvlblInPrspc(String shraOpnnAvlblInPrspc)
    {
        this.shraOpnnAvlblInPrspc = shraOpnnAvlblInPrspc;
    }

    public String getLttrOfCrdtFl()
    {
        return lttrOfCrdtFl;
    }

    public void setLttrOfCrdtFl(String lttrOfCrdtFl)
    {
        this.lttrOfCrdtFl = lttrOfCrdtFl;
    }

    public Long getLttrOfCrdtBankId()
    {
        return lttrOfCrdtBankId;
    }

    public void setLttrOfCrdtBankId(Long lttrOfCrdtBankId)
    {
        this.lttrOfCrdtBankId = lttrOfCrdtBankId;
    }

    public Date getLttrOfCrdtXprtnDt()
    {
        return lttrOfCrdtXprtnDt;
    }

    public void setLttrOfCrdtXprtnDt(Date lttrOfCrdtXprtnDt)
    {
        this.lttrOfCrdtXprtnDt = lttrOfCrdtXprtnDt;
    }

    public String getLttrOfCrdtTypeCd()
    {
        return lttrOfCrdtTypeCd;
    }

    public void setLttrOfCrdtTypeCd(String lttrOfCrdtTypeCd)
    {
        this.lttrOfCrdtTypeCd = lttrOfCrdtTypeCd;
    }

    public String getLttrOfCrdtTypeDs()
    {
        return lttrOfCrdtTypeDs;
    }

    public void setLttrOfCrdtTypeDs(String lttrOfCrdtTypeDs)
    {
        this.lttrOfCrdtTypeDs = lttrOfCrdtTypeDs;
    }

    public String getMncplAdtnlNhnctTypeCd()
    {
        return mncplAdtnlNhnctTypeCd;
    }

    public void setMncplAdtnlNhnctTypeCd(String mncplAdtnlNhnctTypeCd)
    {
        this.mncplAdtnlNhnctTypeCd = mncplAdtnlNhnctTypeCd;
    }

    public String getMncplAdtnlNhnctTypeDs()
    {
        return mncplAdtnlNhnctTypeDs;
    }

    public void setMncplAdtnlNhnctTypeDs(String mncplAdtnlNhnctTypeDs)
    {
        this.mncplAdtnlNhnctTypeDs = mncplAdtnlNhnctTypeDs;
    }

    public String getMncplAdtnlScrtyOrgCd()
    {
        return mncplAdtnlScrtyOrgCd;
    }

    public void setMncplAdtnlScrtyOrgCd(String mncplAdtnlScrtyOrgCd)
    {
        this.mncplAdtnlScrtyOrgCd = mncplAdtnlScrtyOrgCd;
    }

    public String getMncplAdtnlScrtyOrgDs()
    {
        return mncplAdtnlScrtyOrgDs;
    }

    public void setMncplAdtnlScrtyOrgDs(String mncplAdtnlScrtyOrgDs)
    {
        this.mncplAdtnlScrtyOrgDs = mncplAdtnlScrtyOrgDs;
    }

    public String getMncplCapTypeDs()
    {
        return mncplCapTypeDs;
    }

    public void setMncplCapTypeDs(String mncplCapTypeDs)
    {
        this.mncplCapTypeDs = mncplCapTypeDs;
    }

    public String getMncplMrtggNsrncDs()
    {
        return mncplMrtggNsrncDs;
    }

    public void setMncplMrtggNsrncDs(String mncplMrtggNsrncDs)
    {
        this.mncplMrtggNsrncDs = mncplMrtggNsrncDs;
    }

    public Date getTradeDt()
    {
        return tradeDt;
    }

    public void setTradeDt(Date tradeDt)
    {
        this.tradeDt = tradeDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SrcErdFixedIncmMuniEntity that = (SrcErdFixedIncmMuniEntity) o;

        return erdRecId.equals(that.erdRecId);
    }

    @Override
    public int hashCode() {
        return erdRecId.hashCode() * 31;
    }

    @Override
    public String toString()
    {
        return "SrcErdFixedIncmMuniEntity{" +
            "minDnmtnAm=" + minDnmtnAm +
            ", erdRecId=" + erdRecId +
            ", cusipId='" + cusipId + '\'' +
            '}';
    }
}
