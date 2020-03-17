package test;
/**
 * 3.仿照手机淘宝，设计商品的实体类。
 * 编写人：缪松添
 * 编写时间:2020.3.5.12:00
 */
public class Goods {
    private String shopName;//商户名称
    private String shopNumber;//商户编号
    private String commodityNumber;//商品编号
    private String commodityName;//名称
    private String commodityInformation;//商品信息
    private int commodityPrice;//商品价格
    private int logisticsPrice;//商品物流价格
    private String mouthNumber;// 月销量
    private String sentGoodsAddress;//发货地址
    private String discountInfomation;//优惠信息
    private String createTime;//创建时间
    private String createPerson;//创建人
    private String updateTime;//更新时间
    private String getUpdatePerson;//更新人
    private String rank;//等级
    private String parentCode;//父级编码

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

    public String getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(String commodityNumber) {
        this.commodityNumber = commodityNumber;
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

    public String getMouthNumber() {
        return mouthNumber;
    }

    public void setMouthNumber(String mouthNumber) {
        this.mouthNumber = mouthNumber;
    }

    public String getSentGoodsAddress() {
        return sentGoodsAddress;
    }

    public void setSentGoodsAddress(String sentGoodsAddress) {
        this.sentGoodsAddress = sentGoodsAddress;
    }

    public String getDiscountInfomation() {
        return discountInfomation;
    }

    public void setDiscountInfomation(String discountInfomation) {
        this.discountInfomation = discountInfomation;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getGetUpdatePerson() {
        return getUpdatePerson;
    }

    public void setGetUpdatePerson(String getUpdatePerson) {
        this.getUpdatePerson = getUpdatePerson;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
