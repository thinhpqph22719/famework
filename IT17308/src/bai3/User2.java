/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class User2 implements Serializable{
    private String name;
    private double diem;
    private String nganh;
    private String hocLuc;
    
    public User2() {
    }

    public User2(String name, double diem, String nganh, String hocLuc) {
        this.name = name;
        this.diem = diem;
        this.nganh = nganh;
        this.hocLuc = hocLuc;
    }

    User2(String ten, String diem, String hocluc) {
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }
    
    
}
