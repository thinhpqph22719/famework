package onjava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QLHH {

    ArrayList<HangHoa> lstHangHoa = new ArrayList<>();// tạo 1 cái list có kiểu là hàng hóa 
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.println("Mời nhập thông tin");
        
        while (true) { 
            HangHoa hh = new HangHoa();       
            hh.nhapDS();
            lstHangHoa.add(hh);
            System.out.printf("Bạn muốn nhập thêm không (y/n): ");
            String traLoi = sc.nextLine();
            if(traLoi.equalsIgnoreCase("N")){
                break;
            
        }
        }
    }
    public void inThongTin(){
        for(HangHoa x : lstHangHoa)
            x.inThongTin();
        System.out.println("==================");
    }
    public void capNhat(){
        String ma;
        int check=0;
        System.out.println("Mời nhập mã cần tìm:");
        ma = sc.nextLine();
        for(HangHoa x : lstHangHoa){
            if(x.getMaHang().equalsIgnoreCase(ma)){
            x.nhapDS();
            check=1;// đánh dấu tìm được
            break; // nếu tìm thấy thì hiện ra ngay
            } 
        }
        if(check==0) System.out.println("không có mã cần tìm");
    }
    public void sapxep(){
        Comparator<HangHoa> com = new Comparator<HangHoa>() {
        @Override
        public int compare(HangHoa o1, HangHoa o2) {
            return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
            //c2: o2,o1 giảm dần (đổi chỗ o1 o2)
        }
    };
    
   Collections.sort(lstHangHoa, com);
   Collections.reverse(lstHangHoa);// đảo ngược
        System.out.println("Sau khi sắp xếp");
        inThongTin();
        System.out.println("==================");
    }
    
}

