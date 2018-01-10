package com.hexin.domain.orderInfo;

import com.hexin.domain.BaseBean;
import java.util.Date;

public class OrderInfo extends BaseBean {


    private int orderCustomerInfoId;


    private String orderCustomerName;


    private String customerIdCode;


    private String orderNumber;


    private String orderContractNumber;

    private String customerMobilePhone;


    private String customerManagerName;


    private String customerManagerMobilePhone;

    private int clueId;

    private int purchaseType;

    private int carBrandId;

    private String carManufacturer;

    private String belongToStore; // 所属门店code

    private String belongToStoreName; // 所属门店名称

    private int carModelId;

    private int carCategoryId;

    private int financeId;

    private int customerManagerId;
    private String stateName;
    private Date submitTime; // 订单提交时间
    private Date firstPaymentAffirmTime;// 首付款到账确认操作时间

    // getter and setter...

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getOrderCustomerInfoId() {
        return this.orderCustomerInfoId;
    }

    public void setOrderCustomerInfoId(int orderCustomerInfoId) {
        this.orderCustomerInfoId = orderCustomerInfoId;
    }

    public int getClueId() {
        return this.clueId;
    }

    public void setClueId(int clueId) {
        this.clueId = clueId;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPurchaseType() {
        return this.purchaseType;
    }

    public void setPurchaseType(int purchaseType) {
        this.purchaseType = purchaseType;
    }

    public int getCarBrandId() {
        return this.carBrandId;
    }

    public void setCarBrandId(int carBrandId) {
        this.carBrandId = carBrandId;
    }

    public String getCarManufacturer() {
        return this.carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getBelongToStore() {
        return this.belongToStore;
    }

    public void setBelongToStore(String belongToStore) {
        this.belongToStore = belongToStore;
    }

    public int getCarModelId() {
        return this.carModelId;
    }

    public void setCarModelId(int carModelId) {
        this.carModelId = carModelId;
    }

    public int getCarCategoryId() {
        return this.carCategoryId;
    }

    public void setCarCategoryId(int carCategoryId) {
        this.carCategoryId = carCategoryId;
    }

    public int getCustomerManagerId() {
        return this.customerManagerId;
    }

    public void setCustomerManagerId(int customerManagerId) {
        this.customerManagerId = customerManagerId;
    }

    public String getCustomerManagerName() {
        return this.customerManagerName;
    }

    public void setCustomerManagerName(String customerManagerName) {
        this.customerManagerName = customerManagerName;
    }

    public String getOrderContractNumber() {
        return this.orderContractNumber;
    }

    public void setOrderContractNumber(String orderContractNumber) {
        this.orderContractNumber = orderContractNumber;
    }

    public String getOrderCustomerName() {
        return this.orderCustomerName;
    }

    public void setOrderCustomerName(String orderCustomerName) {
        this.orderCustomerName = orderCustomerName;
    }

    public Date getCreateDate() {
        return super.getCreateTime();
    }

    public void setCreateDate(Date createDate) {
    }

    public String getCustomerMobilePhone() {
        return this.customerMobilePhone;
    }

    public void setCustomerMobilePhone(String customerMobilePhone) {
        this.customerMobilePhone = customerMobilePhone;
    }

    public String getCustomerManagerMobilePhone() {
        return this.customerManagerMobilePhone;
    }

    public void setCustomerManagerMobilePhone(String customerManagerMobilePhone) {
        this.customerManagerMobilePhone = customerManagerMobilePhone;
    }

    public int getFinanceId() {
        return this.financeId;
    }

    public void setFinanceId(int financeId) {
        this.financeId = financeId;
    }

    public String getCustomerIdCode() {
        return this.customerIdCode;
    }

    public void setCustomerIdCode(String customerIdCode) {
        this.customerIdCode = customerIdCode;
    }


    public String getPurchaseTypeStr() {
        return this.purchaseType == 1 ? "全国" : this.purchaseType == 2 ? "地方" : "";
    }

    public void setPurchaseTypeStr(String purchaseTypeStr) {

    }


    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Date getFirstPaymentAffirmTime() {
        return this.firstPaymentAffirmTime;
    }

    public void setFirstPaymentAffirmTime(Date firstPaymentAffirmTime) {
        this.firstPaymentAffirmTime = firstPaymentAffirmTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                '}';
    }
}