
package lap8;


public class Phim {
    private String hoTen;
    private String namSinh;
    private String theLoai;
    private String hinhThucXem;
    private String phim;

    public Phim() {
    }

    public Phim(String hoTen, String namSinh, String theLoai, String hinhThucXem, String phim) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.theLoai = theLoai;
        this.hinhThucXem = hinhThucXem;
        this.phim = phim;
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

    public String getPhim() {
        return phim;
    }

    public void setPhim(String phim) {
        this.phim = phim;
    }
    
}
