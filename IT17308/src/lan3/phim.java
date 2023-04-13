
package lan3;

import java.io.Serializable;

public class phim implements Serializable{
    private String hoTen;
    private String namSinh;
    private String theLoai;
    private String hinhThucXem;
    private String phimKinhDien;

    public phim() {
    }

    public phim(String hoTen, String namSinh, String theLoai, String hinhThucXem, String phimKinhDien) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.theLoai = theLoai;
        this.hinhThucXem = hinhThucXem;
        this.phimKinhDien = phimKinhDien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getHinhThucXem() {
        return hinhThucXem;
    }

    public void setHinhThucXem(String hinhThucXem) {
        this.hinhThucXem = hinhThucXem;
    }

    public String getPhimKinhDien() {
        return phimKinhDien;
    }

    public void setPhimKinhDien(String phimKinhDien) {
        this.phimKinhDien = phimKinhDien;
    }
    
    
}
