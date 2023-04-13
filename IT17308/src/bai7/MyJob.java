
package bai7;


public class MyJob {
    private String tenCV;
    private String tenDN;
    private String hocTienSy;
    private double thuNhap;

    public MyJob() {
    }

    public MyJob(String tenCV, String tenDN, String hocTienSy, double thuNhap) {
        this.tenCV = tenCV;
        this.tenDN = tenDN;
        this.hocTienSy = hocTienSy;
        this.thuNhap = thuNhap;
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

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }
    public String getKetLuan(){
        if(this.thuNhap > 5000){
            return "Tot";
        }
        return "Xau";
    }
}
