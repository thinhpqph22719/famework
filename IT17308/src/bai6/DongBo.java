
package bai6;

public class DongBo {
    static double taiKhoan  = 10;
    public static void main(String[] args) {
        // thực hiện đồng thời nạp và rút tiền
        DongBo dt = new DongBo();//tạo đối tường
        Thread rutTien = new Thread(){//định nghĩa thread rút 
            @Override
            public void run() {
//                super.run(); 
                dt.rut(13); 
            } 
        }; 
        Thread napTien = new Thread(){
            @Override
            public void run() {
//               super.run(); 
                dt.nap(4);
            }
            
        };
        
        napTien.start();
        rutTien.start();
    }
    static synchronized void rut(double tr){
        System.out.println("Ban dang rut tien: ");
        if(taiKhoan<tr){
            System.out.println("xin chia buôn......");
        }else{
            taiKhoan = tr;
            System.out.println("so du sau khi rut: "+taiKhoan);
        }
    }
    static synchronized void nap(double tn){
        System.out.println("ban dang nap tien... ");
        taiKhoan+=tn;
        System.out.println("so du sau khi nap: "+taiKhoan);
    }
}
