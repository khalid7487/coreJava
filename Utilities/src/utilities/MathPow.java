/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author KHALID
 */
import java.util.*;
import java.io.*;

class MathPow{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res=a;
            for(int j=0;j<n;j++){
                res+=Math.pow(2,j)*b;
                System.out.print(res +" "); 
            }
           System.out.print("\n");  
        }
        
        in.close();
    }
}
