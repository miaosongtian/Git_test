package test;

/**
 * 3.仿照手机淘宝，设计订单的实体类。
 * 编写人：缪松添
 * 编写时间:2020.3.5.12:00
 */
public class Order {
    private String orderState;//订单状态
    private String orderNumber;//订单号码
    private String logisticsInformation;//物流信息
    private String logisticsTime;//物流时间
    private String recipientsName;//收件人名字
    private String recipientsPhoneNumber;//收件人电话号码
    private String recipientAddress;//收件人地址
    private String shopName;//商户名称
    private String shopNumber;//商户编号
    private String commodityName;//名称
    private String commodityInformation;//商品信息
    private String commodityState;//商品状态
    private int commodityPrice;//商品价格
    private int logisticsPrice;//商品物流价格
    private int ActualPay;//商品实际付款

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getLogisticsInformation() {
        return logisticsInformation;
    }

    public void setLogisticsInformation(String logisticsInformation) {
        this.logisticsInformation = logisticsInformation;
    }

    public String getLogisticsTime() {
        return logisticsTime;
    }

    public void setLogisticsTime(String logisticsTime) {
        this.logisticsTime = logisticsTime;
    }

    public String getRecipientsName() {
        return recipientsName;
    }

    public void setRecipientsName(String recipientsName) {
        this.recipientsName = recipientsName;
    }

    public String getRecipientsPhoneNumber() {
        return recipientsPhoneNumber;
    }

    public void setRecipientsPhoneNumber(String recipientsPhoneNumber) {
        this.recipientsPhoneNumber = recipientsPhoneNumber;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityInformation() {
        return commodityInformation;
    }

    public void setCommodityInformation(String commodityInformation) {
        this.commodityInformation = commodityInformation;
    }

    public String getCommodityState() {
        return commodityState;
    }

    public void setCommodityState(String commodityState) {
        this.commodityState = commodityState;
    }

    public int getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(int commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public int getLogisticsPrice() {
        return logisticsPrice;
    }

    public void setLogisticsPrice(int logisticsPrice) {
        this.logisticsPrice = logisticsPrice;
    }

    public int getActualPay() {
        return ActualPay;
    }

    public void setActualPay(int actualPay) {
        ActualPay = actualPay;
    }
}
