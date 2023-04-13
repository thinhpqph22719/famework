
package thithu;

import java.io.Serializable;

public class lilich implements Serializable{
    private String name;
    private String ngaySinh;
    private String queQuan;
    private String nhomMau;

    public lilich() {
    }

    public lilich(String name, String ngaySinh, String queQuan, String nhomMau) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.nhomMau = nhomMau;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }

    
    
}
