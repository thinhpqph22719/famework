/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lan2;

import java.io.Serializable;

public class myjob implements Serializable{
    private String tenCV;
    private String tenDN;
    private String hocTienSy;
    private double thunhap;

    public myjob() {
    }

    public myjob(String tenCV, String tenDN, String hocTienSy, double thunhap) {
        this.tenCV = tenCV;
        this.tenDN = tenDN;
        this.hocTienSy = hocTienSy;
        this.thunhap = thunhap;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getHocTienSy() {
        return hocTienSy;
    }

    public void setHocTienSy(String hocTienSy) {
        this.hocTienSy = hocTienSy;
    }

    public double getThunhap() {
        return thunhap;
    }

    public void setThunhap(double thunhap) {
        this.thunhap = thunhap;
    }
        public String getKetLuan(){
        if(this.thunhap > 5000){
            return "Tot";
            
        }
        return "Xau";
    }
}
