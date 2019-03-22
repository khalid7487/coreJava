/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.Arrays;

/**
 *
 * @author 88019
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int num[]= {82,25,63};
        
        System.out.println("Given Number :");
        int i=0;
        for( ; i != num.length; i++ )
        {
            System.out.print(" "+ num[i]);
        }
        System.out.println("\n");
        System.out.println("Accending order Number:");
        Arrays.sort(num);
        for(i=0; i<num.length; i++)
        {
            System.out.print(" " +num[i]);
        }
          System.out.println("\n");
    }
    
}
