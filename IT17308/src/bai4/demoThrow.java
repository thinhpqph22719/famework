
package bai4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class demoThrow {
//throw được sử dụng để phát sinh một ngoại lệ
//throw new RuntimeException(“Lỗi”);
//throws được sử dụng để quăng ngoại lệ ra ngoài
//phương thức. Ngoại lệ sẽ được xử lý khi gọi
//phương thức
     static Scanner scan = new Scanner(System.in);
    static  void choDauMoi() throws Exception{ //throws Exception: đẩy trách nhiệm ra bên ngoài
        
    int phanLoai;
    // nếu phân loại < 3 : loại tốt
    // phân loại > 3 :có thuốc , nguy hiểm k ăn
        System.out.println("Moi nhap phan loai: ");
        phanLoai = scan.nextInt();
//        if(phanLoai>3){
//            System.out.println("Co thuoc, nguy hiem k an");
//        }
         if(phanLoai>3) throw  new Exception("Co thuoc, nguy hiem k an");  
    }
    static void cuaHang() throws Exception{
//         try {
//             // đến choDauMoi lấy hàng về bán
//             // cuaHang là người có trách nhiệm
//             choDauMoi();
//         } catch (Exception ex) {
//             System.out.println(ex.toString());
//         }
         // cuaHang vô trách nhiệm  k xử lí
         choDauMoi();
    }
    public static void main(String[] args) throws Exception {
        // main k xử lí
//         try {
//             //khách hàng thông minh tự xử lí
//             cuaHang();//khách đến cửa hàng mua hàng    
//         } catch (Exception ex) {
//             System.out.println(ex.toString());
//         }
// khách cũng vô trách nhiệm k xử lí
        cuaHang();
        System.out.println("song tiep");
        System.out.println("song den gia");
    }
}
