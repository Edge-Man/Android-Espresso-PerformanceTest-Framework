package com.mmt.travel.app.androidMain.NFR.NetworkDataPojo;

/**
 * Created by MMT6054 on 28-Jul-17.
 */

public class NetworkDataManager{

    //private fields
    private String methodName;
    private String deviceId;
    private String apkVersion;
    private String lobName;
    private String timeStamp;
    private double mobileTxData;
    private double mobileRxData;
    private double mobileTotalData;
    private double wifiTxData;
    private double wifiRxData;
    private double wifiTotalData;
    private String network_Carrier_Name;
    private String networkType;

    //getters and setters
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getApkVersion() {
        return apkVersion;
    }

    public void setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
    }

    public String getLobName() {
        return lobName;
    }

    public void setLobName(String lobName) {
        this.lobName = lobName;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public double getMobileTxData() {
        return mobileTxData;
    }

    public void setMobileTxData(double mobileTxData) {
        this.mobileTxData = mobileTxData;
    }

    public double getMobileRxData() {
        return mobileRxData;
    }

    public void setMobileRxData(double mobileRxData) {
        this.mobileRxData = mobileRxData;
    }

    public double getMobileTotalData() {
        return mobileTotalData;
    }

    public void setMobileTotalData(double mobileTotalData) {
        this.mobileTotalData = mobileTotalData;
    }

    public double getWifiTxData() {
        return wifiTxData;
    }

    public void setWifiTxData(double wifiTxData) {
        this.wifiTxData = wifiTxData;
    }

    public double getWifiRxData() {
        return wifiRxData;
    }

    public void setWifiRxData(double wifiRxData) {
        this.wifiRxData = wifiRxData;
    }

    public double getWifiTotalData() {
        return wifiTotalData;
    }

    public void setWifiTotalData(double wifiTotalData) {
        this.wifiTotalData = wifiTotalData;
    }

    public String getNetwork_Carrier_Name() {
        return network_Carrier_Name;
    }

    public void setNetwork_Carrier_Name(String network_Carrier_Name) {
        this.network_Carrier_Name = network_Carrier_Name;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkDataManager that = (NetworkDataManager) o;

        if (mobileTxData != that.mobileTxData) return false;
        if (mobileRxData != that.mobileRxData) return false;
        if (mobileTotalData != that.mobileTotalData) return false;
        if (wifiTxData != that.wifiTxData) return false;
        if (wifiRxData != that.wifiRxData) return false;
        if (wifiTotalData != that.wifiTotalData) return false;
        if (network_Carrier_Name != null ? !network_Carrier_Name.equals(that.network_Carrier_Name) : that.network_Carrier_Name != null)
            return false;
        return networkType != null ? networkType.equals(that.networkType) : that.networkType == null;
    }

}
