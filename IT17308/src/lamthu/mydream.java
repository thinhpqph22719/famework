/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lamthu;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class mydream implements Serializable{
    private String hoTen;
    private String email;
    private String hangXeOto;
    private String thunhap;

    public mydream() {
    }

    public mydream(String hoTen, String email, String hangXeOto, String thunhap) {
        this.hoTen = hoTen;
        this.email = email;
        this.hangXeOto = hangXeOto;
        this.thunhap = thunhap;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHangXeOto() {
        return hangXeOto;
    }

    public void setHangXeOto(String hangXeOto) {
        this.hangXeOto = hangXeOto;
    }

    public String getThunhap() {
        return thunhap;
    }

    public void setThunhap(String thunhap) {
        this.thunhap = thunhap;
    }
    
}
