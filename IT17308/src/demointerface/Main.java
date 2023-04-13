
package demointerface;


public class Main {

    public static void main(String[] args) {
        System.out.println("thông tin của duck: ");
        Duck d = new Duck();
        d.eating();
        d.runing();
        d.flying();
        d.swiming();
        System.out.println("thông tin của bird: ");
        Bird b = new Bird();
        b.flying();
        b.runing();

    }
    
}
