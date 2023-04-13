
package bai4;

public class lap4class {
    private String hoTen;
    private String namSinh;
    private String doUong;
    private String com;

    public lap4class() {
    }

    public lap4class(String hoTen, String namSinh, String doUong, String com) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.doUong = doUong;
        this.com = com;
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

    public String getDoUong() {
        return doUong;
    }

    public void setDoUong(String doUong) {
        this.doUong = doUong;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
    
}
