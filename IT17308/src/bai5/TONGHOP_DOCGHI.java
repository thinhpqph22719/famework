
package bai5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;


public class TONGHOP_DOCGHI {
    public static void main(String[] args) {
        // doc ghi file : try catch
        try {
            //1. doc ghi file nhi phan
            FileInputStream fi = new FileInputStream("duong dan file");
            FileOutputStream fo = new FileOutputStream("duong dan flie");
            //2. docghi doi object
            ObjectInputStream ifi = new ObjectInputStream(fi);
            ObjectOutputStream ofo = new ObjectOutputStream(fo);
            //3 docghi gia tri nguyen thuy
            DataInputStream dfi = new DataInputStream(fi);
            DataOutputStream dfo = new DataOutputStream(fo);
            //4 doc ghi file van ban
            FileReader dr = new FileReader("duong dan file");
            FileWriter dw = new FileWriter("duong dan file");
        } catch (Exception e) {
            System.out.println("loi docghi file");
        }
    }
}
