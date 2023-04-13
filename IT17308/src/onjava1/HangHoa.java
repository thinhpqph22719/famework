/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onjava1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HangHoa {
    
    private String MaHang;
    private String TenHang;
    private int SoLuong;
    private double DonGia; //giá trị nguyên thủy (DonGian là 1  biến)
    //private Double DonGia1; lớp (DonGia1 là 1 đối tượng)
    public HangHoa() {
        // dấu hiệu :
        // 1: tên = tên class
        //2: không có giá trị trả về
        //3: pubic
    }

    public HangHoa(String MaHang, String TenHang, int SoLuong, double DonGia) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        // công dụng : khởi tạo giá trị cho thuộc tính
    }

    public String getMaHang() {
        return MaHang;
        // trả lại giá trị của thuộc tính
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
        // thiết lập giá trị cho thuộc tính     
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mời nhập mã hàng: ");
        MaHang = sc.nextLine();
        System.out.printf("Mời nhập tên hàng: ");
        TenHang= sc.nextLine();
        System.out.printf("Mời nhập số lượng: ");
        SoLuong = Integer.parseInt(sc.nextLine());//C1
        //sc.nextLine();chống trôi lệnh (c2)
        System.out.printf("Mời nhập đơn giá: ");
        DonGia = Double.parseDouble(sc.nextLine());
    }

    public void inThongTin() {
        System.out.println(MaHang +"\t" + TenHang + "\t" + SoLuong + "\t" + DonGia  );

    }

    @Override
    public String toString() {
        return "HangHoa{" + "MaHang=" + MaHang + ", TenHang=" + TenHang + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }

    
    
}
