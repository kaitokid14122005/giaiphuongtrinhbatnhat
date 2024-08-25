
package giaiphuongtrinhbatnhat;

import java.util.Scanner;

/**
 *
 * @author bao
 */
public class Giaiphuongtrinhbatnhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        float x;
        Scanner SC = new Scanner(System.in);
        System.out.println("nhap a vao : ");
        a = SC.nextInt();
        System.out.println("nhap b vao : ");
        b = SC.nextInt();
        if(a==0){
            if(b==0){
            System.out.println("thi phuong trinh vo so nghiem");
            }else{
                    System.out.println("thi phuong trinh vo nghiem");
                    }
        }else{
            x =(float)-b/a;
            System.out.println("X= " +x);
        }
    }
}
