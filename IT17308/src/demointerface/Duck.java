
package demointerface;



public class Duck extends Amimal implements Run,Fly,Swin{

    @Override
    public void runing() {
        System.out.println("run kiểu duck");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void flying() {
                System.out.println("fly kiểu duck");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void swiming() {
                System.out.println("swin kiểu duck");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // them: fly,run, swin
}
