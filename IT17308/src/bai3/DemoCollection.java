package bai3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCollection {

    static void demo_List() {
//        -list : là 1 danh sách, truy cập theo chỉ số
//        - các giá trị trong list có thể giống nhau;
//        -list có 2 loại: có định kiểu và không có định kiểu
//  loại 1: không định kiểu
            List list_k = new ArrayList();
            list_k.add("hom nay troi mua ");//string
            list_k.add(10);                   // int
            list_k.add(true);                 // boolean
            System.out.println("list: "+ list_k.toString());
//  loại 2: có định kiểu
            List<String> list_c = new ArrayList<>();
//            list_c.add(10);//sai kieu
            list_c.add(10+"");//ko chính quy
            list_c.add(String.valueOf(10));// kiểu nghiêm túc
         // đưa ra phần tử thứ 2 trong list
         System.out.println("lay ra ptu thu 2: "+ list_c.get(1));// bắt đầu đếm từ 0
         // thêm vào list tại vị trí 1 ptu tên SV
         list_c.add(0, "PHAM QUANG THINH");// thêm
         list_c.set(1, "aaaaaaa");// đè lên giá trị tại vị trí 1
         System.out.println("list :"+list_c.toString());
    }
static void demoSet(){
//        -set là 1 tập hợp, không có giá trị giống nhau,
//          không truy cập theo index;
//        -list: Student(masv,hoten,ngsinh,gioitinh....)
//        set(masv),set(hoten)
//        - set có 2 loại: có định kiểu và không có định kiểu
//        -set : trong tìm kiếm
        Set set = new HashSet();
        set.add("java 2");
        set.add("java 2");
        set.add("java 2");
        set.add("java 3");
        System.out.println("set: "+set.toString());
    
}
static void demoMap(){
//      Map là tập hơp enntry
//      Mối entry gôm key và value
//      Sừ dung key để truy xuất giá trị của mỗi ptu
//      ap dung tìm kiếm
//      student(masv, hoten),Student(masv,monhoc)...
//      key:masv; values: hoten,monhoc
//      int;//giá trị nguyên thủy
//      //Interger; là đối tượng
      Map<Integer ,String> map = new HashMap<>();
      map.put(1, "java1");
      map.put(1, "java2");
      map.put(2, "java3");
      map.put(3, "java4");
      System.out.println("map: "+map.toString());
}
    public static void main(String[] args) {
        // thuoc tinh, phuong thuc tron java  phai? gan vao  1 doi tuong

// c1: tao 1 doi tuong   
        //DemoCollection dt = new DemoCollection();
        //dt.demo_List();
//c2: static(tĩnh) : nó gắn với lớp class mà không gắn với đối tượng
        demo_List();
        demoSet();
        demoMap();
    }
}
