
package demointerface;

public class Bird  extends Amimal implements Run,Fly{

    @Override
    public void runing() {
        System.out.println("Run kiểu bird");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void flying() {
                System.out.println("Fly kiểu bird");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // cha: ten , eating
    // thêm fly,run
    
    
}
