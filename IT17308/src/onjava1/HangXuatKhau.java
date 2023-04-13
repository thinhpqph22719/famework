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
public class HangXuatKhau extends HangHoa{
    private String QuocGia;
    double thue(){
    return this.getDonGia()*0.1;
    }
   
    public HangXuatKhau() {
    }

    public HangXuatKhau(String QuocGia, String MaHang, String TenHang, int SoLuong, double DonGia) {
        super(MaHang, TenHang, SoLuong, DonGia);// gọi contructer có đủ các tham số của cha
        this.QuocGia = QuocGia;
    }

    @Override
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        super.nhapDS(); //gọi phương thức nhập của cha
        System.out.println("Mời nhập quốc gia");
        QuocGia = sc.nextLine();
    }

    @Override
    public String toString() {
        return "HangXuatKhau{" + "QuocGia=" + QuocGia + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("HangXuatKhau{" + "QuocGia=" + QuocGia + '}'+ thue());
    }
    
}
