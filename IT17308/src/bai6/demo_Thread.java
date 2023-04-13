
package bai6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class demo_Thread implements Runnable{// de? chay Thread
    public static void main(String[] args) {
        demo_Thread dt = new demo_Thread();// tao doi tuong cua class
        Thread th1= new Thread(dt);//tao thread chay tren form
        th1.setName("th1");//dat ten cho thread
        Thread th2 = new Thread(dt);
        th2.setName("th2");
        th1.start();//chay thread
        th2.start();
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();// lay ra cai Thread dang chay
        for(int i =1 ; i <= 10; i++){
            System.out.println(th.getName() + ": "+i);
            try {
                th.sleep(1000);// dung Thread 1giay
            } catch (InterruptedException ex) {
                Logger.getLogger(demo_Thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
