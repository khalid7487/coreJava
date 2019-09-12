/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author KHALID
 */
public class BetweentwoSet {
    
   public static void main(String[] args) {
       int cnt=0;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int[] a=new int[100];
       int[] b=new int[100];
       for (int i = 0; i < n; i++) {
          a[i]=sc.nextInt();
           
       }
       for (int i = 0; i < m; i++) {
          b[i]=sc.nextInt();     
       }
       
       for (int k = 1; k <=100; k++) {
           int flag=1;
           for (int i = 0; i < n; i++) {
               if(k%a[i]!=0)
                   flag=0;  
             
           }
           for (int i = 0; i < m; i++) {
               if(b[i]%k!=0)
                   flag=0;              
           }
           if(flag==1){
               cnt++;
           }
       }
       System.out.println(cnt);
 
   }
            
}
