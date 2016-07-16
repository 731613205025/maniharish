/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Reverse {

  
    public static void main(String[] args) {
        String original,reverse="";
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string to reverse");
        original=in.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
            
        }
        System.out.println("reverse of entered string is:"+reverse);
    }
}
