
/**
 * GetTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

package org.tempuri;

/**
 * GetTransaction bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class GetTransaction implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://tempuri.org/",
            "GetTransaction", "ns1");

    /**
     * field for Acquirer_id_DE32
     */

    protected java.lang.String localAcquirer_id_DE32;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAcquirer_id_DE32Tracker = false;

    public boolean isAcquirer_id_DE32Specified() {
        return localAcquirer_id_DE32Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAcquirer_id_DE32() {
        return localAcquirer_id_DE32;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Acquirer_id_DE32
     */
    public void setAcquirer_id_DE32(java.lang.String param) {
        localAcquirer_id_DE32Tracker = param != null;

        this.localAcquirer_id_DE32 = param;

    }

    /**
     * field for ActBal
     */

    protected double localActBal;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getActBal() {
        return localActBal;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ActBal
     */
    public void setActBal(double param) {

        this.localActBal = param;

    }

    /**
     * field for Additional_Amt_DE54
     */

    protected java.lang.String localAdditional_Amt_DE54;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAdditional_Amt_DE54Tracker = false;

    public boolean isAdditional_Amt_DE54Specified() {
        return localAdditional_Amt_DE54Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAdditional_Amt_DE54() {
        return localAdditional_Amt_DE54;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Additional_Amt_DE54
     */
    public void setAdditional_Amt_DE54(java.lang.String param) {
        localAdditional_Amt_DE54Tracker = param != null;

        this.localAdditional_Amt_DE54 = param;

    }

    /**
     * field for Amt_Tran_Fee_DE28
     */

    protected java.lang.String localAmt_Tran_Fee_DE28;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAmt_Tran_Fee_DE28Tracker = false;

    public boolean isAmt_Tran_Fee_DE28Specified() {
        return localAmt_Tran_Fee_DE28Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAmt_Tran_Fee_DE28() {
        return localAmt_Tran_Fee_DE28;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Amt_Tran_Fee_DE28
     */
    public void setAmt_Tran_Fee_DE28(java.lang.String param) {
        localAmt_Tran_Fee_DE28Tracker = param != null;

        this.localAmt_Tran_Fee_DE28 = param;

    }

    /**
     * field for Auth_Code_DE38
     */

    protected java.lang.String localAuth_Code_DE38;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAuth_Code_DE38Tracker = false;

    public boolean isAuth_Code_DE38Specified() {
        return localAuth_Code_DE38Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAuth_Code_DE38() {
        return localAuth_Code_DE38;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Auth_Code_DE38
     */
    public void setAuth_Code_DE38(java.lang.String param) {
        localAuth_Code_DE38Tracker = param != null;

        this.localAuth_Code_DE38 = param;

    }

    /**
     * field for Avl_Bal
     */

    protected double localAvl_Bal;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getAvl_Bal() {
        return localAvl_Bal;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Avl_Bal
     */
    public void setAvl_Bal(double param) {

        this.localAvl_Bal = param;

    }

    /**
     * field for Bill_Amt
     */

    protected double localBill_Amt;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getBill_Amt() {
        return localBill_Amt;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Bill_Amt
     */
    public void setBill_Amt(double param) {

        this.localBill_Amt = param;

    }

    /**
     * field for Bill_Ccy
     */

    protected java.lang.String localBill_Ccy;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localBill_CcyTracker = false;

    public boolean isBill_CcySpecified() {
        return localBill_CcyTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getBill_Ccy() {
        return localBill_Ccy;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Bill_Ccy
     */
    public void setBill_Ccy(java.lang.String param) {
        localBill_CcyTracker = param != null;

        this.localBill_Ccy = param;

    }

    /**
     * field for BlkAmt
     */

    protected double localBlkAmt;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getBlkAmt() {
        return localBlkAmt;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            BlkAmt
     */
    public void setBlkAmt(double param) {

        this.localBlkAmt = param;

    }

    /**
     * field for Cust_Ref
     */

    protected java.lang.String localCust_Ref;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCust_RefTracker = false;

    public boolean isCust_RefSpecified() {
        return localCust_RefTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCust_Ref() {
        return localCust_Ref;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Cust_Ref
     */
    public void setCust_Ref(java.lang.String param) {
        localCust_RefTracker = param != null;

        this.localCust_Ref = param;

    }

    /**
     * field for CVV2
     */

    protected java.lang.String localCVV2;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCVV2Tracker = false;

    public boolean isCVV2Specified() {
        return localCVV2Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCVV2() {
        return localCVV2;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CVV2
     */
    public void setCVV2(java.lang.String param) {
        localCVV2Tracker = param != null;

        this.localCVV2 = param;

    }

    /**
     * field for Expiry_Date
     */

    protected java.lang.String localExpiry_Date;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localExpiry_DateTracker = false;

    public boolean isExpiry_DateSpecified() {
        return localExpiry_DateTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getExpiry_Date() {
        return localExpiry_Date;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Expiry_Date
     */
    public void setExpiry_Date(java.lang.String param) {
        localExpiry_DateTracker = param != null;

        this.localExpiry_Date = param;

    }

    /**
     * field for FX_Pad
     */

    protected double localFX_Pad;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getFX_Pad() {
        return localFX_Pad;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            FX_Pad
     */
    public void setFX_Pad(double param) {

        this.localFX_Pad = param;

    }

    /**
     * field for Fee_Fixed
     */

    protected double localFee_Fixed;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getFee_Fixed() {
        return localFee_Fixed;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Fee_Fixed
     */
    public void setFee_Fixed(double param) {

        this.localFee_Fixed = param;

    }

    /**
     * field for Fee_Rate
     */

    protected double localFee_Rate;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getFee_Rate() {
        return localFee_Rate;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Fee_Rate
     */
    public void setFee_Rate(double param) {

        this.localFee_Rate = param;

    }

    /**
     * field for LoadSRC
     */

    protected java.lang.String localLoadSRC;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localLoadSRCTracker = false;

    public boolean isLoadSRCSpecified() {
        return localLoadSRCTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getLoadSRC() {
        return localLoadSRC;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            LoadSRC
     */
    public void setLoadSRC(java.lang.String param) {
        localLoadSRCTracker = param != null;

        this.localLoadSRC = param;

    }

    /**
     * field for LoadType
     */

    protected java.lang.String localLoadType;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localLoadTypeTracker = false;

    public boolean isLoadTypeSpecified() {
        return localLoadTypeTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getLoadType() {
        return localLoadType;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            LoadType
     */
    public void setLoadType(java.lang.String param) {
        localLoadTypeTracker = param != null;

        this.localLoadType = param;

    }

    /**
     * field for MCC_Code
     */

    protected java.lang.String localMCC_Code;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMCC_CodeTracker = false;

    public boolean isMCC_CodeSpecified() {
        return localMCC_CodeTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getMCC_Code() {
        return localMCC_Code;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            MCC_Code
     */
    public void setMCC_Code(java.lang.String param) {
        localMCC_CodeTracker = param != null;

        this.localMCC_Code = param;

    }

    /**
     * field for MCC_Desc
     */

    protected java.lang.String localMCC_Desc;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMCC_DescTracker = false;

    public boolean isMCC_DescSpecified() {
        return localMCC_DescTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getMCC_Desc() {
        return localMCC_Desc;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            MCC_Desc
     */
    public void setMCC_Desc(java.lang.String param) {
        localMCC_DescTracker = param != null;

        this.localMCC_Desc = param;

    }

    /**
     * field for MCC_Pad
     */

    protected double localMCC_Pad;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getMCC_Pad() {
        return localMCC_Pad;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            MCC_Pad
     */
    public void setMCC_Pad(double param) {

        this.localMCC_Pad = param;

    }

    /**
     * field for Merch_ID_DE42
     */

    protected java.lang.String localMerch_ID_DE42;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMerch_ID_DE42Tracker = false;

    public boolean isMerch_ID_DE42Specified() {
        return localMerch_ID_DE42Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getMerch_ID_DE42() {
        return localMerch_ID_DE42;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Merch_ID_DE42
     */
    public void setMerch_ID_DE42(java.lang.String param) {
        localMerch_ID_DE42Tracker = param != null;

        this.localMerch_ID_DE42 = param;

    }

    /**
     * field for Merch_Name_DE43
     */

    protected java.lang.String localMerch_Name_DE43;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMerch_Name_DE43Tracker = false;

    public boolean isMerch_Name_DE43Specified() {
        return localMerch_Name_DE43Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getMerch_Name_DE43() {
        return localMerch_Name_DE43;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Merch_Name_DE43
     */
    public void setMerch_Name_DE43(java.lang.String param) {
        localMerch_Name_DE43Tracker = param != null;

        this.localMerch_Name_DE43 = param;

    }

    /**
     * field for Note
     */

    protected java.lang.String localNote;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNoteTracker = false;

    public boolean isNoteSpecified() {
        return localNoteTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getNote() {
        return localNote;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Note
     */
    public void setNote(java.lang.String param) {
        localNoteTracker = param != null;

        this.localNote = param;

    }

    /**
     * field for PAN_Sequence_Number
     */

    protected java.lang.String localPAN_Sequence_Number;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPAN_Sequence_NumberTracker = false;

    public boolean isPAN_Sequence_NumberSpecified() {
        return localPAN_Sequence_NumberTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPAN_Sequence_Number() {
        return localPAN_Sequence_Number;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PAN_Sequence_Number
     */
    public void setPAN_Sequence_Number(java.lang.String param) {
        localPAN_Sequence_NumberTracker = param != null;

        this.localPAN_Sequence_Number = param;

    }

    /**
     * field for PIN
     */

    protected java.lang.String localPIN;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPINTracker = false;

    public boolean isPINSpecified() {
        return localPINTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPIN() {
        return localPIN;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PIN
     */
    public void setPIN(java.lang.String param) {
        localPINTracker = param != null;

        this.localPIN = param;

    }

    /**
     * field for PIN_Enc_Algorithm
     */

    protected java.lang.String localPIN_Enc_Algorithm;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPIN_Enc_AlgorithmTracker = false;

    public boolean isPIN_Enc_AlgorithmSpecified() {
        return localPIN_Enc_AlgorithmTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPIN_Enc_Algorithm() {
        return localPIN_Enc_Algorithm;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PIN_Enc_Algorithm
     */
    public void setPIN_Enc_Algorithm(java.lang.String param) {
        localPIN_Enc_AlgorithmTracker = param != null;

        this.localPIN_Enc_Algorithm = param;

    }

    /**
     * field for PIN_Format
     */

    protected java.lang.String localPIN_Format;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPIN_FormatTracker = false;

    public boolean isPIN_FormatSpecified() {
        return localPIN_FormatTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPIN_Format() {
        return localPIN_Format;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PIN_Format
     */
    public void setPIN_Format(java.lang.String param) {
        localPIN_FormatTracker = param != null;

        this.localPIN_Format = param;

    }

    /**
     * field for PIN_Key_Index
     */

    protected java.lang.String localPIN_Key_Index;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPIN_Key_IndexTracker = false;

    public boolean isPIN_Key_IndexSpecified() {
        return localPIN_Key_IndexTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPIN_Key_Index() {
        return localPIN_Key_Index;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PIN_Key_Index
     */
    public void setPIN_Key_Index(java.lang.String param) {
        localPIN_Key_IndexTracker = param != null;

        this.localPIN_Key_Index = param;

    }

    /**
     * field for POS_Data_DE22
     */

    protected java.lang.String localPOS_Data_DE22;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPOS_Data_DE22Tracker = false;

    public boolean isPOS_Data_DE22Specified() {
        return localPOS_Data_DE22Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPOS_Data_DE22() {
        return localPOS_Data_DE22;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            POS_Data_DE22
     */
    public void setPOS_Data_DE22(java.lang.String param) {
        localPOS_Data_DE22Tracker = param != null;

        this.localPOS_Data_DE22 = param;

    }

    /**
     * field for POS_Data_DE61
     */

    protected java.lang.String localPOS_Data_DE61;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPOS_Data_DE61Tracker = false;

    public boolean isPOS_Data_DE61Specified() {
        return localPOS_Data_DE61Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPOS_Data_DE61() {
        return localPOS_Data_DE61;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            POS_Data_DE61
     */
    public void setPOS_Data_DE61(java.lang.String param) {
        localPOS_Data_DE61Tracker = param != null;

        this.localPOS_Data_DE61 = param;

    }

    /**
     * field for POS_Termnl_DE41
     */

    protected java.lang.String localPOS_Termnl_DE41;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPOS_Termnl_DE41Tracker = false;

    public boolean isPOS_Termnl_DE41Specified() {
        return localPOS_Termnl_DE41Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPOS_Termnl_DE41() {
        return localPOS_Termnl_DE41;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            POS_Termnl_DE41
     */
    public void setPOS_Termnl_DE41(java.lang.String param) {
        localPOS_Termnl_DE41Tracker = param != null;

        this.localPOS_Termnl_DE41 = param;

    }

    /**
     * field for POS_Time_DE12
     */

    protected java.lang.String localPOS_Time_DE12;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPOS_Time_DE12Tracker = false;

    public boolean isPOS_Time_DE12Specified() {
        return localPOS_Time_DE12Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPOS_Time_DE12() {
        return localPOS_Time_DE12;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            POS_Time_DE12
     */
    public void setPOS_Time_DE12(java.lang.String param) {
        localPOS_Time_DE12Tracker = param != null;

        this.localPOS_Time_DE12 = param;

    }

    /**
     * field for Proc_Code
     */

    protected java.lang.String localProc_Code;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localProc_CodeTracker = false;

    public boolean isProc_CodeSpecified() {
        return localProc_CodeTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getProc_Code() {
        return localProc_Code;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Proc_Code
     */
    public void setProc_Code(java.lang.String param) {
        localProc_CodeTracker = param != null;

        this.localProc_Code = param;

    }

    /**
     * field for Resp_Code_DE39
     */

    protected java.lang.String localResp_Code_DE39;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localResp_Code_DE39Tracker = false;

    public boolean isResp_Code_DE39Specified() {
        return localResp_Code_DE39Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getResp_Code_DE39() {
        return localResp_Code_DE39;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Resp_Code_DE39
     */
    public void setResp_Code_DE39(java.lang.String param) {
        localResp_Code_DE39Tracker = param != null;

        this.localResp_Code_DE39 = param;

    }

    /**
     * field for Ret_Ref_No_DE37
     */

    protected java.lang.String localRet_Ref_No_DE37;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRet_Ref_No_DE37Tracker = false;

    public boolean isRet_Ref_No_DE37Specified() {
        return localRet_Ref_No_DE37Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getRet_Ref_No_DE37() {
        return localRet_Ref_No_DE37;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Ret_Ref_No_DE37
     */
    public void setRet_Ref_No_DE37(java.lang.String param) {
        localRet_Ref_No_DE37Tracker = param != null;

        this.localRet_Ref_No_DE37 = param;

    }

    /**
     * field for Settle_Amt
     */

    protected double localSettle_Amt;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getSettle_Amt() {
        return localSettle_Amt;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Settle_Amt
     */
    public void setSettle_Amt(double param) {

        this.localSettle_Amt = param;

    }

    /**
     * field for Settle_Ccy
     */

    protected java.lang.String localSettle_Ccy;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSettle_CcyTracker = false;

    public boolean isSettle_CcySpecified() {
        return localSettle_CcyTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getSettle_Ccy() {
        return localSettle_Ccy;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Settle_Ccy
     */
    public void setSettle_Ccy(java.lang.String param) {
        localSettle_CcyTracker = param != null;

        this.localSettle_Ccy = param;

    }

    /**
     * field for Status_Code
     */

    protected java.lang.String localStatus_Code;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localStatus_CodeTracker = false;

    public boolean isStatus_CodeSpecified() {
        return localStatus_CodeTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getStatus_Code() {
        return localStatus_Code;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Status_Code
     */
    public void setStatus_Code(java.lang.String param) {
        localStatus_CodeTracker = param != null;

        this.localStatus_Code = param;

    }

    /**
     * field for Token
     */

    protected java.lang.String localToken;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTokenTracker = false;

    public boolean isTokenSpecified() {
        return localTokenTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getToken() {
        return localToken;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Token
     */
    public void setToken(java.lang.String param) {
        localTokenTracker = param != null;

        this.localToken = param;

    }

    /**
     * field for Trans_link
     */

    protected java.lang.String localTrans_link;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTrans_linkTracker = false;

    public boolean isTrans_linkSpecified() {
        return localTrans_linkTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTrans_link() {
        return localTrans_link;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Trans_link
     */
    public void setTrans_link(java.lang.String param) {
        localTrans_linkTracker = param != null;

        this.localTrans_link = param;

    }

    /**
     * field for Txn_Amt
     */

    protected double localTxn_Amt;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getTxn_Amt() {
        return localTxn_Amt;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Txn_Amt
     */
    public void setTxn_Amt(double param) {

        this.localTxn_Amt = param;

    }

    /**
     * field for Txn_CCy
     */

    protected java.lang.String localTxn_CCy;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTxn_CCyTracker = false;

    public boolean isTxn_CCySpecified() {
        return localTxn_CCyTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTxn_CCy() {
        return localTxn_CCy;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Txn_CCy
     */
    public void setTxn_CCy(java.lang.String param) {
        localTxn_CCyTracker = param != null;

        this.localTxn_CCy = param;

    }

    /**
     * field for Txn_Ctry
     */

    protected java.lang.String localTxn_Ctry;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTxn_CtryTracker = false;

    public boolean isTxn_CtrySpecified() {
        return localTxn_CtryTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTxn_Ctry() {
        return localTxn_Ctry;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Txn_Ctry
     */
    public void setTxn_Ctry(java.lang.String param) {
        localTxn_CtryTracker = param != null;

        this.localTxn_Ctry = param;

    }

    /**
     * field for Txn_Desc
     */

    protected java.lang.String localTxn_Desc;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTxn_DescTracker = false;

    public boolean isTxn_DescSpecified() {
        return localTxn_DescTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTxn_Desc() {
        return localTxn_Desc;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Txn_Desc
     */
    public void setTxn_Desc(java.lang.String param) {
        localTxn_DescTracker = param != null;

        this.localTxn_Desc = param;

    }

    /**
     * field for Txn_GPS_Date
     */

    protected java.lang.String localTxn_GPS_Date;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTxn_GPS_DateTracker = false;

    public boolean isTxn_GPS_DateSpecified() {
        return localTxn_GPS_DateTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTxn_GPS_Date() {
        return localTxn_GPS_Date;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Txn_GPS_Date
     */
    public void setTxn_GPS_Date(java.lang.String param) {
        localTxn_GPS_DateTracker = param != null;

        this.localTxn_GPS_Date = param;

    }

    /**
     * field for TXn_ID
     */

    protected java.lang.String localTXn_ID;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTXn_ID() {
        return localTXn_ID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TXn_ID
     */
    public void setTXn_ID(java.lang.String param) {

        this.localTXn_ID = param;

    }

    /**
     * field for Txn_Stat_Code
     */

    protected java.lang.String localTxn_Stat_Code;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTxn_Stat_CodeTracker = false;

    public boolean isTxn_Stat_CodeSpecified() {
        return localTxn_Stat_CodeTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTxn_Stat_Code() {
        return localTxn_Stat_Code;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Txn_Stat_Code
     */
    public void setTxn_Stat_Code(java.lang.String param) {
        localTxn_Stat_CodeTracker = param != null;

        this.localTxn_Stat_Code = param;

    }

    /**
     * field for TXN_Time_DE07
     */

    protected java.lang.String localTXN_Time_DE07;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTXN_Time_DE07Tracker = false;

    public boolean isTXN_Time_DE07Specified() {
        return localTXN_Time_DE07Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTXN_Time_DE07() {
        return localTXN_Time_DE07;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TXN_Time_DE07
     */
    public void setTXN_Time_DE07(java.lang.String param) {
        localTXN_Time_DE07Tracker = param != null;

        this.localTXN_Time_DE07 = param;

    }

    /**
     * field for Txn_Type
     */

    protected java.lang.String localTxn_Type;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTxn_TypeTracker = false;

    public boolean isTxn_TypeSpecified() {
        return localTxn_TypeTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTxn_Type() {
        return localTxn_Type;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Txn_Type
     */
    public void setTxn_Type(java.lang.String param) {
        localTxn_TypeTracker = param != null;

        this.localTxn_Type = param;

    }

    /**
     * field for Additional_Data_DE48
     */

    protected java.lang.String localAdditional_Data_DE48;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAdditional_Data_DE48Tracker = false;

    public boolean isAdditional_Data_DE48Specified() {
        return localAdditional_Data_DE48Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAdditional_Data_DE48() {
        return localAdditional_Data_DE48;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Additional_Data_DE48
     */
    public void setAdditional_Data_DE48(java.lang.String param) {
        localAdditional_Data_DE48Tracker = param != null;

        this.localAdditional_Data_DE48 = param;

    }

    /**
     * field for Authorised_by_GPS
     */

    protected java.lang.String localAuthorised_by_GPS;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAuthorised_by_GPSTracker = false;

    public boolean isAuthorised_by_GPSSpecified() {
        return localAuthorised_by_GPSTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAuthorised_by_GPS() {
        return localAuthorised_by_GPS;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Authorised_by_GPS
     */
    public void setAuthorised_by_GPS(java.lang.String param) {
        localAuthorised_by_GPSTracker = param != null;

        this.localAuthorised_by_GPS = param;

    }

    /**
     * field for AVS_Result
     */

    protected java.lang.String localAVS_Result;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAVS_ResultTracker = false;

    public boolean isAVS_ResultSpecified() {
        return localAVS_ResultTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAVS_Result() {
        return localAVS_Result;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AVS_Result
     */
    public void setAVS_Result(java.lang.String param) {
        localAVS_ResultTracker = param != null;

        this.localAVS_Result = param;

    }

    /**
     * field for CU_Group
     */

    protected java.lang.String localCU_Group;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCU_GroupTracker = false;

    public boolean isCU_GroupSpecified() {
        return localCU_GroupTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCU_Group() {
        return localCU_Group;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CU_Group
     */
    public void setCU_Group(java.lang.String param) {
        localCU_GroupTracker = param != null;

        this.localCU_Group = param;

    }

    /**
     * field for InstCode
     */

    protected java.lang.String localInstCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localInstCodeTracker = false;

    public boolean isInstCodeSpecified() {
        return localInstCodeTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getInstCode() {
        return localInstCode;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            InstCode
     */
    public void setInstCode(java.lang.String param) {
        localInstCodeTracker = param != null;

        this.localInstCode = param;

    }

    /**
     * field for MTID
     */

    protected java.lang.String localMTID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMTIDTracker = false;

    public boolean isMTIDSpecified() {
        return localMTIDTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getMTID() {
        return localMTID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            MTID
     */
    public void setMTID(java.lang.String param) {
        localMTIDTracker = param != null;

        this.localMTID = param;

    }

    /**
     * field for ProductID
     */

    protected int localProductID;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getProductID() {
        return localProductID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ProductID
     */
    public void setProductID(int param) {

        this.localProductID = param;

    }

    /**
     * field for Record_Data_DE120
     */

    protected java.lang.String localRecord_Data_DE120;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRecord_Data_DE120Tracker = false;

    public boolean isRecord_Data_DE120Specified() {
        return localRecord_Data_DE120Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getRecord_Data_DE120() {
        return localRecord_Data_DE120;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Record_Data_DE120
     */
    public void setRecord_Data_DE120(java.lang.String param) {
        localRecord_Data_DE120Tracker = param != null;

        this.localRecord_Data_DE120 = param;

    }

    /**
     * field for SubBIN
     */

    protected int localSubBIN;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getSubBIN() {
        return localSubBIN;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            SubBIN
     */
    public void setSubBIN(int param) {

        this.localSubBIN = param;

    }

    /**
     * field for TLogIDOrg
     */

    protected java.lang.String localTLogIDOrg;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTLogIDOrgTracker = false;

    public boolean isTLogIDOrgSpecified() {
        return localTLogIDOrgTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTLogIDOrg() {
        return localTLogIDOrg;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TLogIDOrg
     */
    public void setTLogIDOrg(java.lang.String param) {
        localTLogIDOrgTracker = param != null;

        this.localTLogIDOrg = param;

    }

    /**
     * field for VL_Group
     */

    protected java.lang.String localVL_Group;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localVL_GroupTracker = false;

    public boolean isVL_GroupSpecified() {
        return localVL_GroupTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getVL_Group() {
        return localVL_Group;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            VL_Group
     */
    public void setVL_Group(java.lang.String param) {
        localVL_GroupTracker = param != null;

        this.localVL_Group = param;

    }

    /**
     * field for Dom_Fee_Fixed
     */

    protected java.lang.String localDom_Fee_Fixed;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDom_Fee_FixedTracker = false;

    public boolean isDom_Fee_FixedSpecified() {
        return localDom_Fee_FixedTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getDom_Fee_Fixed() {
        return localDom_Fee_Fixed;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Dom_Fee_Fixed
     */
    public void setDom_Fee_Fixed(java.lang.String param) {
        localDom_Fee_FixedTracker = param != null;

        this.localDom_Fee_Fixed = param;

    }

    /**
     * field for Non_Dom_Fee_Fixed
     */

    protected java.lang.String localNon_Dom_Fee_Fixed;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNon_Dom_Fee_FixedTracker = false;

    public boolean isNon_Dom_Fee_FixedSpecified() {
        return localNon_Dom_Fee_FixedTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getNon_Dom_Fee_Fixed() {
        return localNon_Dom_Fee_Fixed;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Non_Dom_Fee_Fixed
     */
    public void setNon_Dom_Fee_Fixed(java.lang.String param) {
        localNon_Dom_Fee_FixedTracker = param != null;

        this.localNon_Dom_Fee_Fixed = param;

    }

    /**
     * field for Fx_Fee_Fixed
     */

    protected java.lang.String localFx_Fee_Fixed;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localFx_Fee_FixedTracker = false;

    public boolean isFx_Fee_FixedSpecified() {
        return localFx_Fee_FixedTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getFx_Fee_Fixed() {
        return localFx_Fee_Fixed;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Fx_Fee_Fixed
     */
    public void setFx_Fee_Fixed(java.lang.String param) {
        localFx_Fee_FixedTracker = param != null;

        this.localFx_Fee_Fixed = param;

    }

    /**
     * field for Other_Fee_Amt
     */

    protected java.lang.String localOther_Fee_Amt;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localOther_Fee_AmtTracker = false;

    public boolean isOther_Fee_AmtSpecified() {
        return localOther_Fee_AmtTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getOther_Fee_Amt() {
        return localOther_Fee_Amt;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Other_Fee_Amt
     */
    public void setOther_Fee_Amt(java.lang.String param) {
        localOther_Fee_AmtTracker = param != null;

        this.localOther_Fee_Amt = param;

    }

    /**
     * field for Fx_Fee_Rate
     */

    protected java.lang.String localFx_Fee_Rate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localFx_Fee_RateTracker = false;

    public boolean isFx_Fee_RateSpecified() {
        return localFx_Fee_RateTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getFx_Fee_Rate() {
        return localFx_Fee_Rate;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Fx_Fee_Rate
     */
    public void setFx_Fee_Rate(java.lang.String param) {
        localFx_Fee_RateTracker = param != null;

        this.localFx_Fee_Rate = param;

    }

    /**
     * field for Dom_Fee_Rate
     */

    protected java.lang.String localDom_Fee_Rate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDom_Fee_RateTracker = false;

    public boolean isDom_Fee_RateSpecified() {
        return localDom_Fee_RateTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getDom_Fee_Rate() {
        return localDom_Fee_Rate;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Dom_Fee_Rate
     */
    public void setDom_Fee_Rate(java.lang.String param) {
        localDom_Fee_RateTracker = param != null;

        this.localDom_Fee_Rate = param;

    }

    /**
     * field for Non_Dom_Fee_Rate
     */

    protected java.lang.String localNon_Dom_Fee_Rate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNon_Dom_Fee_RateTracker = false;

    public boolean isNon_Dom_Fee_RateSpecified() {
        return localNon_Dom_Fee_RateTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getNon_Dom_Fee_Rate() {
        return localNon_Dom_Fee_Rate;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Non_Dom_Fee_Rate
     */
    public void setNon_Dom_Fee_Rate(java.lang.String param) {
        localNon_Dom_Fee_RateTracker = param != null;

        this.localNon_Dom_Fee_Rate = param;

    }

    /**
     * field for Additional_Data_DE124
     */

    protected java.lang.String localAdditional_Data_DE124;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAdditional_Data_DE124Tracker = false;

    public boolean isAdditional_Data_DE124Specified() {
        return localAdditional_Data_DE124Tracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAdditional_Data_DE124() {
        return localAdditional_Data_DE124;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Additional_Data_DE124
     */
    public void setAdditional_Data_DE124(java.lang.String param) {
        localAdditional_Data_DE124Tracker = param != null;

        this.localAdditional_Data_DE124 = param;

    }

    /**
     * field for SendingAttemptCount
     */

    protected java.lang.String localSendingAttemptCount;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getSendingAttemptCount() {
        return localSendingAttemptCount;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            SendingAttemptCount
     */
    public void setSendingAttemptCount(java.lang.String param) {

        this.localSendingAttemptCount = param;

    }

    /**
     * field for Source_Bank_Ctry
     */

    protected java.lang.String localSource_Bank_Ctry;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSource_Bank_CtryTracker = false;

    public boolean isSource_Bank_CtrySpecified() {
        return localSource_Bank_CtryTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getSource_Bank_Ctry() {
        return localSource_Bank_Ctry;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Source_Bank_Ctry
     */
    public void setSource_Bank_Ctry(java.lang.String param) {
        localSource_Bank_CtryTracker = param != null;

        this.localSource_Bank_Ctry = param;

    }

    /**
     * field for Source_Bank_Account_Format
     */

    protected java.lang.String localSource_Bank_Account_Format;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSource_Bank_Account_FormatTracker = false;

    public boolean isSource_Bank_Account_FormatSpecified() {
        return localSource_Bank_Account_FormatTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getSource_Bank_Account_Format() {
        return localSource_Bank_Account_Format;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Source_Bank_Account_Format
     */
    public void setSource_Bank_Account_Format(java.lang.String param) {
        localSource_Bank_Account_FormatTracker = param != null;

        this.localSource_Bank_Account_Format = param;

    }

    /**
     * field for Source_Bank_Account
     */

    protected java.lang.String localSource_Bank_Account;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSource_Bank_AccountTracker = false;

    public boolean isSource_Bank_AccountSpecified() {
        return localSource_Bank_AccountTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getSource_Bank_Account() {
        return localSource_Bank_Account;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Source_Bank_Account
     */
    public void setSource_Bank_Account(java.lang.String param) {
        localSource_Bank_AccountTracker = param != null;

        this.localSource_Bank_Account = param;

    }

    /**
     * field for Dest_Bank_Account_Format
     */

    protected java.lang.String localDest_Bank_Account_Format;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDest_Bank_Account_FormatTracker = false;

    public boolean isDest_Bank_Account_FormatSpecified() {
        return localDest_Bank_Account_FormatTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getDest_Bank_Account_Format() {
        return localDest_Bank_Account_Format;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Dest_Bank_Account_Format
     */
    public void setDest_Bank_Account_Format(java.lang.String param) {
        localDest_Bank_Account_FormatTracker = param != null;

        this.localDest_Bank_Account_Format = param;

    }

    /**
     * field for Dest_Bank_Account
     */

    protected java.lang.String localDest_Bank_Account;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDest_Bank_AccountTracker = false;

    public boolean isDest_Bank_AccountSpecified() {
        return localDest_Bank_AccountTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getDest_Bank_Account() {
        return localDest_Bank_Account;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Dest_Bank_Account
     */
    public void setDest_Bank_Account(java.lang.String param) {
        localDest_Bank_AccountTracker = param != null;

        this.localDest_Bank_Account = param;

    }

    /**
     * field for Dest_Bank_Ctry
     */

    protected java.lang.String localDest_Bank_Ctry;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDest_Bank_CtryTracker = false;

    public boolean isDest_Bank_CtrySpecified() {
        return localDest_Bank_CtryTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getDest_Bank_Ctry() {
        return localDest_Bank_Ctry;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Dest_Bank_Ctry
     */
    public void setDest_Bank_Ctry(java.lang.String param) {
        localDest_Bank_CtryTracker = param != null;

        this.localDest_Bank_Ctry = param;

    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));

    }

    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://tempuri.org/");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":GetTransaction", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GetTransaction", xmlWriter);
            }

        }
        if (localAcquirer_id_DE32Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Acquirer_id_DE32", xmlWriter);

            if (localAcquirer_id_DE32 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Acquirer_id_DE32 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAcquirer_id_DE32);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "ActBal", xmlWriter);

        if (java.lang.Double.isNaN(localActBal)) {

            throw new org.apache.axis2.databinding.ADBException("ActBal cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActBal));
        }

        xmlWriter.writeEndElement();
        if (localAdditional_Amt_DE54Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Additional_Amt_DE54", xmlWriter);

            if (localAdditional_Amt_DE54 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Additional_Amt_DE54 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAdditional_Amt_DE54);

            }

            xmlWriter.writeEndElement();
        }
        if (localAmt_Tran_Fee_DE28Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Amt_Tran_Fee_DE28", xmlWriter);

            if (localAmt_Tran_Fee_DE28 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Amt_Tran_Fee_DE28 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAmt_Tran_Fee_DE28);

            }

            xmlWriter.writeEndElement();
        }
        if (localAuth_Code_DE38Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Auth_Code_DE38", xmlWriter);

            if (localAuth_Code_DE38 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Auth_Code_DE38 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAuth_Code_DE38);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Avl_Bal", xmlWriter);

        if (java.lang.Double.isNaN(localAvl_Bal)) {

            throw new org.apache.axis2.databinding.ADBException("Avl_Bal cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvl_Bal));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Bill_Amt", xmlWriter);

        if (java.lang.Double.isNaN(localBill_Amt)) {

            throw new org.apache.axis2.databinding.ADBException("Bill_Amt cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBill_Amt));
        }

        xmlWriter.writeEndElement();
        if (localBill_CcyTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Bill_Ccy", xmlWriter);

            if (localBill_Ccy == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Bill_Ccy cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localBill_Ccy);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "BlkAmt", xmlWriter);

        if (java.lang.Double.isNaN(localBlkAmt)) {

            throw new org.apache.axis2.databinding.ADBException("BlkAmt cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlkAmt));
        }

        xmlWriter.writeEndElement();
        if (localCust_RefTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Cust_Ref", xmlWriter);

            if (localCust_Ref == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Cust_Ref cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCust_Ref);

            }

            xmlWriter.writeEndElement();
        }
        if (localCVV2Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "CVV2", xmlWriter);

            if (localCVV2 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CVV2 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCVV2);

            }

            xmlWriter.writeEndElement();
        }
        if (localExpiry_DateTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Expiry_Date", xmlWriter);

            if (localExpiry_Date == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Expiry_Date cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localExpiry_Date);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "FX_Pad", xmlWriter);

        if (java.lang.Double.isNaN(localFX_Pad)) {

            throw new org.apache.axis2.databinding.ADBException("FX_Pad cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFX_Pad));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Fee_Fixed", xmlWriter);

        if (java.lang.Double.isNaN(localFee_Fixed)) {

            throw new org.apache.axis2.databinding.ADBException("Fee_Fixed cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFee_Fixed));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Fee_Rate", xmlWriter);

        if (java.lang.Double.isNaN(localFee_Rate)) {

            throw new org.apache.axis2.databinding.ADBException("Fee_Rate cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFee_Rate));
        }

        xmlWriter.writeEndElement();
        if (localLoadSRCTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "LoadSRC", xmlWriter);

            if (localLoadSRC == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("LoadSRC cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localLoadSRC);

            }

            xmlWriter.writeEndElement();
        }
        if (localLoadTypeTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "LoadType", xmlWriter);

            if (localLoadType == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("LoadType cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localLoadType);

            }

            xmlWriter.writeEndElement();
        }
        if (localMCC_CodeTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "MCC_Code", xmlWriter);

            if (localMCC_Code == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("MCC_Code cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localMCC_Code);

            }

            xmlWriter.writeEndElement();
        }
        if (localMCC_DescTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "MCC_Desc", xmlWriter);

            if (localMCC_Desc == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("MCC_Desc cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localMCC_Desc);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "MCC_Pad", xmlWriter);

        if (java.lang.Double.isNaN(localMCC_Pad)) {

            throw new org.apache.axis2.databinding.ADBException("MCC_Pad cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMCC_Pad));
        }

        xmlWriter.writeEndElement();
        if (localMerch_ID_DE42Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Merch_ID_DE42", xmlWriter);

            if (localMerch_ID_DE42 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Merch_ID_DE42 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localMerch_ID_DE42);

            }

            xmlWriter.writeEndElement();
        }
        if (localMerch_Name_DE43Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Merch_Name_DE43", xmlWriter);

            if (localMerch_Name_DE43 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Merch_Name_DE43 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localMerch_Name_DE43);

            }

            xmlWriter.writeEndElement();
        }
        if (localNoteTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Note", xmlWriter);

            if (localNote == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Note cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNote);

            }

            xmlWriter.writeEndElement();
        }
        if (localPAN_Sequence_NumberTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "PAN_Sequence_Number", xmlWriter);

            if (localPAN_Sequence_Number == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PAN_Sequence_Number cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPAN_Sequence_Number);

            }

            xmlWriter.writeEndElement();
        }
        if (localPINTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "PIN", xmlWriter);

            if (localPIN == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PIN cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPIN);

            }

            xmlWriter.writeEndElement();
        }
        if (localPIN_Enc_AlgorithmTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "PIN_Enc_Algorithm", xmlWriter);

            if (localPIN_Enc_Algorithm == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PIN_Enc_Algorithm cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPIN_Enc_Algorithm);

            }

            xmlWriter.writeEndElement();
        }
        if (localPIN_FormatTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "PIN_Format", xmlWriter);

            if (localPIN_Format == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PIN_Format cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPIN_Format);

            }

            xmlWriter.writeEndElement();
        }
        if (localPIN_Key_IndexTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "PIN_Key_Index", xmlWriter);

            if (localPIN_Key_Index == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PIN_Key_Index cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPIN_Key_Index);

            }

            xmlWriter.writeEndElement();
        }
        if (localPOS_Data_DE22Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "POS_Data_DE22", xmlWriter);

            if (localPOS_Data_DE22 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("POS_Data_DE22 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPOS_Data_DE22);

            }

            xmlWriter.writeEndElement();
        }
        if (localPOS_Data_DE61Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "POS_Data_DE61", xmlWriter);

            if (localPOS_Data_DE61 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("POS_Data_DE61 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPOS_Data_DE61);

            }

            xmlWriter.writeEndElement();
        }
        if (localPOS_Termnl_DE41Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "POS_Termnl_DE41", xmlWriter);

            if (localPOS_Termnl_DE41 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("POS_Termnl_DE41 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPOS_Termnl_DE41);

            }

            xmlWriter.writeEndElement();
        }
        if (localPOS_Time_DE12Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "POS_Time_DE12", xmlWriter);

            if (localPOS_Time_DE12 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("POS_Time_DE12 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPOS_Time_DE12);

            }

            xmlWriter.writeEndElement();
        }
        if (localProc_CodeTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Proc_Code", xmlWriter);

            if (localProc_Code == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Proc_Code cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localProc_Code);

            }

            xmlWriter.writeEndElement();
        }
        if (localResp_Code_DE39Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Resp_Code_DE39", xmlWriter);

            if (localResp_Code_DE39 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Resp_Code_DE39 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localResp_Code_DE39);

            }

            xmlWriter.writeEndElement();
        }
        if (localRet_Ref_No_DE37Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Ret_Ref_No_DE37", xmlWriter);

            if (localRet_Ref_No_DE37 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Ret_Ref_No_DE37 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localRet_Ref_No_DE37);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Settle_Amt", xmlWriter);

        if (java.lang.Double.isNaN(localSettle_Amt)) {

            throw new org.apache.axis2.databinding.ADBException("Settle_Amt cannot be null!!");

        } else {
            xmlWriter
                    .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSettle_Amt));
        }

        xmlWriter.writeEndElement();
        if (localSettle_CcyTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Settle_Ccy", xmlWriter);

            if (localSettle_Ccy == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Settle_Ccy cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localSettle_Ccy);

            }

            xmlWriter.writeEndElement();
        }
        if (localStatus_CodeTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Status_Code", xmlWriter);

            if (localStatus_Code == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Status_Code cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localStatus_Code);

            }

            xmlWriter.writeEndElement();
        }
        if (localTokenTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Token", xmlWriter);

            if (localToken == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Token cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localToken);

            }

            xmlWriter.writeEndElement();
        }
        if (localTrans_linkTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Trans_link", xmlWriter);

            if (localTrans_link == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Trans_link cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTrans_link);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Txn_Amt", xmlWriter);

        if (java.lang.Double.isNaN(localTxn_Amt)) {

            throw new org.apache.axis2.databinding.ADBException("Txn_Amt cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_Amt));
        }

        xmlWriter.writeEndElement();
        if (localTxn_CCyTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Txn_CCy", xmlWriter);

            if (localTxn_CCy == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Txn_CCy cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTxn_CCy);

            }

            xmlWriter.writeEndElement();
        }
        if (localTxn_CtryTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Txn_Ctry", xmlWriter);

            if (localTxn_Ctry == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Txn_Ctry cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTxn_Ctry);

            }

            xmlWriter.writeEndElement();
        }
        if (localTxn_DescTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Txn_Desc", xmlWriter);

            if (localTxn_Desc == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Txn_Desc cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTxn_Desc);

            }

            xmlWriter.writeEndElement();
        }
        if (localTxn_GPS_DateTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Txn_GPS_Date", xmlWriter);

            if (localTxn_GPS_Date == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Txn_GPS_Date cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTxn_GPS_Date);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "TXn_ID", xmlWriter);

        if (localTXn_ID == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("TXn_ID cannot be null!!");

        } else {

            xmlWriter.writeCharacters(localTXn_ID);

        }

        xmlWriter.writeEndElement();
        if (localTxn_Stat_CodeTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Txn_Stat_Code", xmlWriter);

            if (localTxn_Stat_Code == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Txn_Stat_Code cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTxn_Stat_Code);

            }

            xmlWriter.writeEndElement();
        }
        if (localTXN_Time_DE07Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "TXN_Time_DE07", xmlWriter);

            if (localTXN_Time_DE07 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TXN_Time_DE07 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTXN_Time_DE07);

            }

            xmlWriter.writeEndElement();
        }
        if (localTxn_TypeTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Txn_Type", xmlWriter);

            if (localTxn_Type == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Txn_Type cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTxn_Type);

            }

            xmlWriter.writeEndElement();
        }
        if (localAdditional_Data_DE48Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Additional_Data_DE48", xmlWriter);

            if (localAdditional_Data_DE48 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Additional_Data_DE48 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAdditional_Data_DE48);

            }

            xmlWriter.writeEndElement();
        }
        if (localAuthorised_by_GPSTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Authorised_by_GPS", xmlWriter);

            if (localAuthorised_by_GPS == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Authorised_by_GPS cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAuthorised_by_GPS);

            }

            xmlWriter.writeEndElement();
        }
        if (localAVS_ResultTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "AVS_Result", xmlWriter);

            if (localAVS_Result == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("AVS_Result cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAVS_Result);

            }

            xmlWriter.writeEndElement();
        }
        if (localCU_GroupTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "CU_Group", xmlWriter);

            if (localCU_Group == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CU_Group cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCU_Group);

            }

            xmlWriter.writeEndElement();
        }
        if (localInstCodeTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "InstCode", xmlWriter);

            if (localInstCode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("InstCode cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localInstCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localMTIDTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "MTID", xmlWriter);

            if (localMTID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("MTID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localMTID);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "ProductID", xmlWriter);

        if (localProductID == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("ProductID cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductID));
        }

        xmlWriter.writeEndElement();
        if (localRecord_Data_DE120Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Record_Data_DE120", xmlWriter);

            if (localRecord_Data_DE120 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Record_Data_DE120 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localRecord_Data_DE120);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "SubBIN", xmlWriter);

        if (localSubBIN == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("SubBIN cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubBIN));
        }

        xmlWriter.writeEndElement();
        if (localTLogIDOrgTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "TLogIDOrg", xmlWriter);

            if (localTLogIDOrg == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TLogIDOrg cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTLogIDOrg);

            }

            xmlWriter.writeEndElement();
        }
        if (localVL_GroupTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "VL_Group", xmlWriter);

            if (localVL_Group == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("VL_Group cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localVL_Group);

            }

            xmlWriter.writeEndElement();
        }
        if (localDom_Fee_FixedTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Dom_Fee_Fixed", xmlWriter);

            if (localDom_Fee_Fixed == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Dom_Fee_Fixed cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDom_Fee_Fixed);

            }

            xmlWriter.writeEndElement();
        }
        if (localNon_Dom_Fee_FixedTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Non_Dom_Fee_Fixed", xmlWriter);

            if (localNon_Dom_Fee_Fixed == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Non_Dom_Fee_Fixed cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNon_Dom_Fee_Fixed);

            }

            xmlWriter.writeEndElement();
        }
        if (localFx_Fee_FixedTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Fx_Fee_Fixed", xmlWriter);

            if (localFx_Fee_Fixed == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Fx_Fee_Fixed cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localFx_Fee_Fixed);

            }

            xmlWriter.writeEndElement();
        }
        if (localOther_Fee_AmtTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Other_Fee_Amt", xmlWriter);

            if (localOther_Fee_Amt == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Other_Fee_Amt cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localOther_Fee_Amt);

            }

            xmlWriter.writeEndElement();
        }
        if (localFx_Fee_RateTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Fx_Fee_Rate", xmlWriter);

            if (localFx_Fee_Rate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Fx_Fee_Rate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localFx_Fee_Rate);

            }

            xmlWriter.writeEndElement();
        }
        if (localDom_Fee_RateTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Dom_Fee_Rate", xmlWriter);

            if (localDom_Fee_Rate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Dom_Fee_Rate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDom_Fee_Rate);

            }

            xmlWriter.writeEndElement();
        }
        if (localNon_Dom_Fee_RateTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Non_Dom_Fee_Rate", xmlWriter);

            if (localNon_Dom_Fee_Rate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Non_Dom_Fee_Rate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNon_Dom_Fee_Rate);

            }

            xmlWriter.writeEndElement();
        }
        if (localAdditional_Data_DE124Tracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Additional_Data_DE124", xmlWriter);

            if (localAdditional_Data_DE124 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Additional_Data_DE124 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAdditional_Data_DE124);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "SendingAttemptCount", xmlWriter);

        if (localSendingAttemptCount == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("SendingAttemptCount cannot be null!!");

        } else {

            xmlWriter.writeCharacters(localSendingAttemptCount);

        }

        xmlWriter.writeEndElement();
        if (localSource_Bank_CtryTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Source_Bank_Ctry", xmlWriter);

            if (localSource_Bank_Ctry == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Source_Bank_Ctry cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localSource_Bank_Ctry);

            }

            xmlWriter.writeEndElement();
        }
        if (localSource_Bank_Account_FormatTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Source_Bank_Account_Format", xmlWriter);

            if (localSource_Bank_Account_Format == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Source_Bank_Account_Format cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localSource_Bank_Account_Format);

            }

            xmlWriter.writeEndElement();
        }
        if (localSource_Bank_AccountTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Source_Bank_Account", xmlWriter);

            if (localSource_Bank_Account == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Source_Bank_Account cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localSource_Bank_Account);

            }

            xmlWriter.writeEndElement();
        }
        if (localDest_Bank_Account_FormatTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Dest_Bank_Account_Format", xmlWriter);

            if (localDest_Bank_Account_Format == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Dest_Bank_Account_Format cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDest_Bank_Account_Format);

            }

            xmlWriter.writeEndElement();
        }
        if (localDest_Bank_AccountTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Dest_Bank_Account", xmlWriter);

            if (localDest_Bank_Account == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Dest_Bank_Account cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDest_Bank_Account);

            }

            xmlWriter.writeEndElement();
        }
        if (localDest_Bank_CtryTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "Dest_Bank_Ctry", xmlWriter);

            if (localDest_Bank_Ctry == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Dest_Bank_Ctry cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDest_Bank_Ctry);

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://tempuri.org/")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(
                        prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }

    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localAcquirer_id_DE32Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Acquirer_id_DE32"));

            if (localAcquirer_id_DE32 != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAcquirer_id_DE32));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Acquirer_id_DE32 cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "ActBal"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActBal));
        if (localAdditional_Amt_DE54Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Additional_Amt_DE54"));

            if (localAdditional_Amt_DE54 != null) {
                elementList.add(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdditional_Amt_DE54));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Additional_Amt_DE54 cannot be null!!");
            }
        }
        if (localAmt_Tran_Fee_DE28Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Amt_Tran_Fee_DE28"));

            if (localAmt_Tran_Fee_DE28 != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmt_Tran_Fee_DE28));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Amt_Tran_Fee_DE28 cannot be null!!");
            }
        }
        if (localAuth_Code_DE38Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Auth_Code_DE38"));

            if (localAuth_Code_DE38 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuth_Code_DE38));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Auth_Code_DE38 cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Avl_Bal"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvl_Bal));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Bill_Amt"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBill_Amt));
        if (localBill_CcyTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Bill_Ccy"));

            if (localBill_Ccy != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBill_Ccy));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Bill_Ccy cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "BlkAmt"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlkAmt));
        if (localCust_RefTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Cust_Ref"));

            if (localCust_Ref != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCust_Ref));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Cust_Ref cannot be null!!");
            }
        }
        if (localCVV2Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "CVV2"));

            if (localCVV2 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCVV2));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CVV2 cannot be null!!");
            }
        }
        if (localExpiry_DateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Expiry_Date"));

            if (localExpiry_Date != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiry_Date));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Expiry_Date cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "FX_Pad"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFX_Pad));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Fee_Fixed"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFee_Fixed));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Fee_Rate"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFee_Rate));
        if (localLoadSRCTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "LoadSRC"));

            if (localLoadSRC != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoadSRC));
            } else {
                throw new org.apache.axis2.databinding.ADBException("LoadSRC cannot be null!!");
            }
        }
        if (localLoadTypeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "LoadType"));

            if (localLoadType != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoadType));
            } else {
                throw new org.apache.axis2.databinding.ADBException("LoadType cannot be null!!");
            }
        }
        if (localMCC_CodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "MCC_Code"));

            if (localMCC_Code != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMCC_Code));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MCC_Code cannot be null!!");
            }
        }
        if (localMCC_DescTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "MCC_Desc"));

            if (localMCC_Desc != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMCC_Desc));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MCC_Desc cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "MCC_Pad"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMCC_Pad));
        if (localMerch_ID_DE42Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Merch_ID_DE42"));

            if (localMerch_ID_DE42 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMerch_ID_DE42));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Merch_ID_DE42 cannot be null!!");
            }
        }
        if (localMerch_Name_DE43Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Merch_Name_DE43"));

            if (localMerch_Name_DE43 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMerch_Name_DE43));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Merch_Name_DE43 cannot be null!!");
            }
        }
        if (localNoteTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Note"));

            if (localNote != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNote));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Note cannot be null!!");
            }
        }
        if (localPAN_Sequence_NumberTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "PAN_Sequence_Number"));

            if (localPAN_Sequence_Number != null) {
                elementList.add(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPAN_Sequence_Number));
            } else {
                throw new org.apache.axis2.databinding.ADBException("PAN_Sequence_Number cannot be null!!");
            }
        }
        if (localPINTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "PIN"));

            if (localPIN != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIN));
            } else {
                throw new org.apache.axis2.databinding.ADBException("PIN cannot be null!!");
            }
        }
        if (localPIN_Enc_AlgorithmTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "PIN_Enc_Algorithm"));

            if (localPIN_Enc_Algorithm != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIN_Enc_Algorithm));
            } else {
                throw new org.apache.axis2.databinding.ADBException("PIN_Enc_Algorithm cannot be null!!");
            }
        }
        if (localPIN_FormatTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "PIN_Format"));

            if (localPIN_Format != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIN_Format));
            } else {
                throw new org.apache.axis2.databinding.ADBException("PIN_Format cannot be null!!");
            }
        }
        if (localPIN_Key_IndexTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "PIN_Key_Index"));

            if (localPIN_Key_Index != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIN_Key_Index));
            } else {
                throw new org.apache.axis2.databinding.ADBException("PIN_Key_Index cannot be null!!");
            }
        }
        if (localPOS_Data_DE22Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "POS_Data_DE22"));

            if (localPOS_Data_DE22 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPOS_Data_DE22));
            } else {
                throw new org.apache.axis2.databinding.ADBException("POS_Data_DE22 cannot be null!!");
            }
        }
        if (localPOS_Data_DE61Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "POS_Data_DE61"));

            if (localPOS_Data_DE61 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPOS_Data_DE61));
            } else {
                throw new org.apache.axis2.databinding.ADBException("POS_Data_DE61 cannot be null!!");
            }
        }
        if (localPOS_Termnl_DE41Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "POS_Termnl_DE41"));

            if (localPOS_Termnl_DE41 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPOS_Termnl_DE41));
            } else {
                throw new org.apache.axis2.databinding.ADBException("POS_Termnl_DE41 cannot be null!!");
            }
        }
        if (localPOS_Time_DE12Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "POS_Time_DE12"));

            if (localPOS_Time_DE12 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPOS_Time_DE12));
            } else {
                throw new org.apache.axis2.databinding.ADBException("POS_Time_DE12 cannot be null!!");
            }
        }
        if (localProc_CodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Proc_Code"));

            if (localProc_Code != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProc_Code));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Proc_Code cannot be null!!");
            }
        }
        if (localResp_Code_DE39Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Resp_Code_DE39"));

            if (localResp_Code_DE39 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResp_Code_DE39));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Resp_Code_DE39 cannot be null!!");
            }
        }
        if (localRet_Ref_No_DE37Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Ret_Ref_No_DE37"));

            if (localRet_Ref_No_DE37 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRet_Ref_No_DE37));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Ret_Ref_No_DE37 cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Settle_Amt"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSettle_Amt));
        if (localSettle_CcyTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Settle_Ccy"));

            if (localSettle_Ccy != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSettle_Ccy));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Settle_Ccy cannot be null!!");
            }
        }
        if (localStatus_CodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Status_Code"));

            if (localStatus_Code != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus_Code));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Status_Code cannot be null!!");
            }
        }
        if (localTokenTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Token"));

            if (localToken != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToken));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Token cannot be null!!");
            }
        }
        if (localTrans_linkTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Trans_link"));

            if (localTrans_link != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrans_link));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Trans_link cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Amt"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_Amt));
        if (localTxn_CCyTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Txn_CCy"));

            if (localTxn_CCy != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_CCy));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Txn_CCy cannot be null!!");
            }
        }
        if (localTxn_CtryTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Ctry"));

            if (localTxn_Ctry != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_Ctry));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Txn_Ctry cannot be null!!");
            }
        }
        if (localTxn_DescTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Desc"));

            if (localTxn_Desc != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_Desc));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Txn_Desc cannot be null!!");
            }
        }
        if (localTxn_GPS_DateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Txn_GPS_Date"));

            if (localTxn_GPS_Date != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_GPS_Date));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Txn_GPS_Date cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "TXn_ID"));

        if (localTXn_ID != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTXn_ID));
        } else {
            throw new org.apache.axis2.databinding.ADBException("TXn_ID cannot be null!!");
        }
        if (localTxn_Stat_CodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Stat_Code"));

            if (localTxn_Stat_Code != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_Stat_Code));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Txn_Stat_Code cannot be null!!");
            }
        }
        if (localTXN_Time_DE07Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "TXN_Time_DE07"));

            if (localTXN_Time_DE07 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTXN_Time_DE07));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TXN_Time_DE07 cannot be null!!");
            }
        }
        if (localTxn_TypeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Type"));

            if (localTxn_Type != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxn_Type));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Txn_Type cannot be null!!");
            }
        }
        if (localAdditional_Data_DE48Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Additional_Data_DE48"));

            if (localAdditional_Data_DE48 != null) {
                elementList.add(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdditional_Data_DE48));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Additional_Data_DE48 cannot be null!!");
            }
        }
        if (localAuthorised_by_GPSTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Authorised_by_GPS"));

            if (localAuthorised_by_GPS != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthorised_by_GPS));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Authorised_by_GPS cannot be null!!");
            }
        }
        if (localAVS_ResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "AVS_Result"));

            if (localAVS_Result != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAVS_Result));
            } else {
                throw new org.apache.axis2.databinding.ADBException("AVS_Result cannot be null!!");
            }
        }
        if (localCU_GroupTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "CU_Group"));

            if (localCU_Group != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCU_Group));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CU_Group cannot be null!!");
            }
        }
        if (localInstCodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "InstCode"));

            if (localInstCode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInstCode));
            } else {
                throw new org.apache.axis2.databinding.ADBException("InstCode cannot be null!!");
            }
        }
        if (localMTIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "MTID"));

            if (localMTID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMTID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MTID cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "ProductID"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductID));
        if (localRecord_Data_DE120Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Record_Data_DE120"));

            if (localRecord_Data_DE120 != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecord_Data_DE120));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Record_Data_DE120 cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "SubBIN"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubBIN));
        if (localTLogIDOrgTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "TLogIDOrg"));

            if (localTLogIDOrg != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTLogIDOrg));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TLogIDOrg cannot be null!!");
            }
        }
        if (localVL_GroupTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "VL_Group"));

            if (localVL_Group != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVL_Group));
            } else {
                throw new org.apache.axis2.databinding.ADBException("VL_Group cannot be null!!");
            }
        }
        if (localDom_Fee_FixedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Dom_Fee_Fixed"));

            if (localDom_Fee_Fixed != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDom_Fee_Fixed));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Dom_Fee_Fixed cannot be null!!");
            }
        }
        if (localNon_Dom_Fee_FixedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Non_Dom_Fee_Fixed"));

            if (localNon_Dom_Fee_Fixed != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNon_Dom_Fee_Fixed));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Non_Dom_Fee_Fixed cannot be null!!");
            }
        }
        if (localFx_Fee_FixedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Fx_Fee_Fixed"));

            if (localFx_Fee_Fixed != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFx_Fee_Fixed));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Fx_Fee_Fixed cannot be null!!");
            }
        }
        if (localOther_Fee_AmtTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Other_Fee_Amt"));

            if (localOther_Fee_Amt != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOther_Fee_Amt));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Other_Fee_Amt cannot be null!!");
            }
        }
        if (localFx_Fee_RateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Fx_Fee_Rate"));

            if (localFx_Fee_Rate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFx_Fee_Rate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Fx_Fee_Rate cannot be null!!");
            }
        }
        if (localDom_Fee_RateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Dom_Fee_Rate"));

            if (localDom_Fee_Rate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDom_Fee_Rate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Dom_Fee_Rate cannot be null!!");
            }
        }
        if (localNon_Dom_Fee_RateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Non_Dom_Fee_Rate"));

            if (localNon_Dom_Fee_Rate != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNon_Dom_Fee_Rate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Non_Dom_Fee_Rate cannot be null!!");
            }
        }
        if (localAdditional_Data_DE124Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Additional_Data_DE124"));

            if (localAdditional_Data_DE124 != null) {
                elementList.add(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdditional_Data_DE124));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Additional_Data_DE124 cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "SendingAttemptCount"));

        if (localSendingAttemptCount != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendingAttemptCount));
        } else {
            throw new org.apache.axis2.databinding.ADBException("SendingAttemptCount cannot be null!!");
        }
        if (localSource_Bank_CtryTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Source_Bank_Ctry"));

            if (localSource_Bank_Ctry != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource_Bank_Ctry));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Source_Bank_Ctry cannot be null!!");
            }
        }
        if (localSource_Bank_Account_FormatTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Source_Bank_Account_Format"));

            if (localSource_Bank_Account_Format != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localSource_Bank_Account_Format));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Source_Bank_Account_Format cannot be null!!");
            }
        }
        if (localSource_Bank_AccountTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Source_Bank_Account"));

            if (localSource_Bank_Account != null) {
                elementList.add(
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource_Bank_Account));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Source_Bank_Account cannot be null!!");
            }
        }
        if (localDest_Bank_Account_FormatTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Dest_Bank_Account_Format"));

            if (localDest_Bank_Account_Format != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localDest_Bank_Account_Format));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Dest_Bank_Account_Format cannot be null!!");
            }
        }
        if (localDest_Bank_AccountTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Dest_Bank_Account"));

            if (localDest_Bank_Account != null) {
                elementList
                        .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDest_Bank_Account));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Dest_Bank_Account cannot be null!!");
            }
        }
        if (localDest_Bank_CtryTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Dest_Bank_Ctry"));

            if (localDest_Bank_Ctry != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDest_Bank_Ctry));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Dest_Bank_Ctry cannot be null!!");
            }
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object Precondition: If this object is an
         * element, the current or next start element starts this object and any
         * intervening reader events are ignorable If this object is not an
         * element, it is a complex type and the reader is at the event just
         * after the outer start element Postcondition: If this object is an
         * element, the reader is positioned at its end element If this object
         * is a complex type, the reader is positioned at the end element of its
         * outer element
         */
        public static GetTransaction parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GetTransaction object = new GetTransaction();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader
                            .getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"GetTransaction".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (GetTransaction) org.tempuri.ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Acquirer_id_DE32")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Acquirer_id_DE32").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Acquirer_id_DE32" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAcquirer_id_DE32(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "ActBal").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "ActBal").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ActBal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setActBal(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Additional_Amt_DE54")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Additional_Amt_DE54").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Additional_Amt_DE54" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAdditional_Amt_DE54(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Amt_Tran_Fee_DE28")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Amt_Tran_Fee_DE28").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Amt_Tran_Fee_DE28" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAmt_Tran_Fee_DE28(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Auth_Code_DE38")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Auth_Code_DE38").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Auth_Code_DE38" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuth_Code_DE38(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Avl_Bal").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Avl_Bal").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Avl_Bal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAvl_Bal(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Bill_Amt").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Bill_Amt").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Bill_Amt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBill_Amt(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Bill_Ccy").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Bill_Ccy").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Bill_Ccy" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBill_Ccy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "BlkAmt").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "BlkAmt").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BlkAmt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBlkAmt(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Cust_Ref").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Cust_Ref").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Cust_Ref" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCust_Ref(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "CVV2").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "CVV2").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CVV2" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCVV2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Expiry_Date").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Expiry_Date").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Expiry_Date" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExpiry_Date(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "FX_Pad").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "FX_Pad").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FX_Pad" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFX_Pad(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Fee_Fixed").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Fee_Fixed").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Fee_Fixed" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFee_Fixed(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Fee_Rate").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Fee_Rate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Fee_Rate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFee_Rate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "LoadSRC").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "LoadSRC").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "LoadSRC" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLoadSRC(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "LoadType").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "LoadType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "LoadType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLoadType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "MCC_Code").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "MCC_Code").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "MCC_Code" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMCC_Code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "MCC_Desc").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "MCC_Desc").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "MCC_Desc" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMCC_Desc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "MCC_Pad").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "MCC_Pad").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "MCC_Pad" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMCC_Pad(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Merch_ID_DE42")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Merch_ID_DE42").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Merch_ID_DE42" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMerch_ID_DE42(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Merch_Name_DE43")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Merch_Name_DE43").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Merch_Name_DE43" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMerch_Name_DE43(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Note").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Note").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Note" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNote(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "PAN_Sequence_Number")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "PAN_Sequence_Number").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "PAN_Sequence_Number" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPAN_Sequence_Number(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "PIN").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "PIN").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "PIN" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPIN(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "PIN_Enc_Algorithm")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "PIN_Enc_Algorithm").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "PIN_Enc_Algorithm" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPIN_Enc_Algorithm(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "PIN_Format").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "PIN_Format").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "PIN_Format" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPIN_Format(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "PIN_Key_Index")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "PIN_Key_Index").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "PIN_Key_Index" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPIN_Key_Index(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "POS_Data_DE22")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "POS_Data_DE22").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "POS_Data_DE22" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPOS_Data_DE22(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "POS_Data_DE61")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "POS_Data_DE61").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "POS_Data_DE61" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPOS_Data_DE61(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "POS_Termnl_DE41")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "POS_Termnl_DE41").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "POS_Termnl_DE41" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPOS_Termnl_DE41(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "POS_Time_DE12")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "POS_Time_DE12").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "POS_Time_DE12" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPOS_Time_DE12(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Proc_Code").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Proc_Code").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Proc_Code" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setProc_Code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Resp_Code_DE39")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Resp_Code_DE39").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Resp_Code_DE39" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setResp_Code_DE39(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Ret_Ref_No_DE37")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Ret_Ref_No_DE37").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Ret_Ref_No_DE37" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRet_Ref_No_DE37(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Settle_Amt").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Settle_Amt").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Settle_Amt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSettle_Amt(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Settle_Ccy").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Settle_Ccy").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Settle_Ccy" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSettle_Ccy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Status_Code").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Status_Code").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Status_Code" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStatus_Code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Token").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Token").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Token" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setToken(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Trans_link").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Trans_link").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Trans_link" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTrans_link(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Amt").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Txn_Amt").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Txn_Amt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTxn_Amt(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Txn_CCy").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Txn_CCy").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Txn_CCy" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTxn_CCy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Ctry").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Txn_Ctry").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Txn_Ctry" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTxn_Ctry(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Desc").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Txn_Desc").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Txn_Desc" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTxn_Desc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Txn_GPS_Date").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Txn_GPS_Date").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Txn_GPS_Date" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTxn_GPS_Date(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "TXn_ID").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "TXn_ID").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "TXn_ID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTXn_ID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Stat_Code")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Txn_Stat_Code").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Txn_Stat_Code" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTxn_Stat_Code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "TXN_Time_DE07")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "TXN_Time_DE07").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "TXN_Time_DE07" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTXN_Time_DE07(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Txn_Type").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Txn_Type").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Txn_Type" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTxn_Type(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Additional_Data_DE48")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Additional_Data_DE48").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Additional_Data_DE48" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAdditional_Data_DE48(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Authorised_by_GPS")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Authorised_by_GPS").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Authorised_by_GPS" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuthorised_by_GPS(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "AVS_Result").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "AVS_Result").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "AVS_Result" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAVS_Result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "CU_Group").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "CU_Group").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CU_Group" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCU_Group(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "InstCode").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "InstCode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "InstCode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInstCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "MTID").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "MTID").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "MTID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMTID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "ProductID").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "ProductID").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ProductID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setProductID(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Record_Data_DE120")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Record_Data_DE120").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Record_Data_DE120" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRecord_Data_DE120(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "SubBIN").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "SubBIN").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "SubBIN" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSubBIN(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "TLogIDOrg").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "TLogIDOrg").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "TLogIDOrg" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTLogIDOrg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "VL_Group").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "VL_Group").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "VL_Group" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVL_Group(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Dom_Fee_Fixed")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Dom_Fee_Fixed").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Dom_Fee_Fixed" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDom_Fee_Fixed(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Non_Dom_Fee_Fixed")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Non_Dom_Fee_Fixed").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Non_Dom_Fee_Fixed" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNon_Dom_Fee_Fixed(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Fx_Fee_Fixed").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Fx_Fee_Fixed").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Fx_Fee_Fixed" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFx_Fee_Fixed(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Other_Fee_Amt")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Other_Fee_Amt").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Other_Fee_Amt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOther_Fee_Amt(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Fx_Fee_Rate").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Fx_Fee_Rate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Fx_Fee_Rate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFx_Fee_Rate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Dom_Fee_Rate").equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Dom_Fee_Rate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Dom_Fee_Rate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDom_Fee_Rate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Non_Dom_Fee_Rate")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Non_Dom_Fee_Rate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Non_Dom_Fee_Rate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNon_Dom_Fee_Rate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Additional_Data_DE124")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Additional_Data_DE124").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Additional_Data_DE124" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAdditional_Data_DE124(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "SendingAttemptCount")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "SendingAttemptCount").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "SendingAttemptCount" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSendingAttemptCount(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Source_Bank_Ctry")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Source_Bank_Ctry").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Source_Bank_Ctry" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSource_Bank_Ctry(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Source_Bank_Account_Format")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Source_Bank_Account_Format").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Source_Bank_Account_Format" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSource_Bank_Account_Format(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Source_Bank_Account")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Source_Bank_Account").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Source_Bank_Account" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSource_Bank_Account(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Dest_Bank_Account_Format")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Dest_Bank_Account_Format").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Dest_Bank_Account_Format" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDest_Bank_Account_Format(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Dest_Bank_Account")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Dest_Bank_Account").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Dest_Bank_Account" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDest_Bank_Account(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Dest_Bank_Ctry")
                                .equals(reader.getName())
                        || new javax.xml.namespace.QName("", "Dest_Bank_Ctry").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Dest_Bank_Ctry" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDest_Bank_Ctry(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // 2 - A start element we are not expecting indicates a trailing invalid property

                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }//end of factory class

}
