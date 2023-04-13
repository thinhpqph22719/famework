package onjava1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLHH ql = new QLHH();

        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            //sc.nextLine();// chống trôi

            switch (chon) {
                case 1:
                    ql.nhap();
                    break;
                case 2:
                    ql.inThongTin();
                    break;
                case 3:
                    ql.capNhat();
                    break;
                case 4:
                    break;
                case 5:
                    ql.sapxep();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:

                    HangXuatKhau xk = new HangXuatKhau("Mỹ", "hang9", "rau", 23, 234234);
                    ql.inThongTin();
                    break;
                case 0:
                    System.exit(0);// dừng chương trình
                    break;
                default:
                    System.out.println("không tồn tại chức năng. Nhập lại");                    
            }
            if(chon==10) break; // thoát khỏi while
        }
    }

    public static void menu() {
        System.out.println("===================MENU===================");
        System.out.println("1:Nhập danh sách hàng");
        System.out.println("2:Xuất danh sách hàng");
        System.out.println("3:Cập nhật lại danh sách hàng theo ");
        System.out.println("4:Tìm hàng theo tên hàng nhập vào");
        System.out.println("5:Sắp xếp hàng theo tên giảm dần");
        System.out.println("6:Xóa hàng theo mã nhập vào");
        System.out.println("7:Tìm hàng có đơn giá cao nhất");
        System.out.println("8:Tìm hàng theo khoảng số lượng nhập vào");
        System.out.println("9: Kế thừa");
        System.out.println("0:Thoát");
        System.out.println("=========================================");
        System.out.printf("Mời chọn chức năng: ");

    }
}
