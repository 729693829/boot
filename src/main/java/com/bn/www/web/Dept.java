package com.bn.www.web;

public class Dept {
    private String province;
    private String city;
    private String ditrict;
    private String className;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDitrict() {
        return ditrict;
    }

    public void setDitrict(String ditrict) {
        this.ditrict = ditrict;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", ditrict='" + ditrict + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
