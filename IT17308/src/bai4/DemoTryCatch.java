package bai4;

public class DemoTryCatch {

    public static void main(String[] args) {
        int a;
        //a = 123abc;// error
        try {//chạy khi đúng
            a = Integer.parseInt("123abc");
            System.out.println("a =" + a);
        } catch (Exception e) {// chạy khi sai
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally{
            System.out.println("cuoi cung");
        }
        System.out.println("lenh tiep theo");
        System.out.println("lenh tiep .....");
        System.out.println("lenh 1000");

    }

}
