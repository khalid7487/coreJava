
package utilities;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListtoList1 {
    public static void main(String[] args) {
        
        String sArray[]=creatArray();
        List lList=Arrays.asList(sArray);
        System.out.println("\n------Iterator loop----\n");
        long Stime=new Date().getTime();
        System.out.println("Start: "+Stime);
        
        //iterator loop
        Iterator<String> iter=lList.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            
        }
        long  etime=new Date().getTime();
        System.out.println("End:"+etime);
        
        long difftime=etime-Stime;
        System.out.println("Iterator needs time in miliseconds:"+difftime);
        
        System.out.println("\n------End----\n");
        
        System.out.println("\n------for loop----\n");
        long Sfortime=new Date().getTime();
        System.out.println("Start: "+Sfortime);
        
        //for loop
        for(int i=0; i<lList.size();i++){
            String stemp= (String)lList.get(i);
        }
        long  efortime=new Date().getTime();
        System.out.println("End:"+efortime);
        
        long diffortime=efortime-Sfortime;
        System.out.println("For loop needs time in miliseconds:"+diffortime);
        
        System.out.println("\n------End----\n");
        
        System.out.println("\n------While loop----\n");
        long Swhiletime=new Date().getTime();
        System.out.println("Start: "+Swhiletime);
        
        //while loop
        int j=0;
        while(j<lList.size()){
            String stemp= (String)lList.get(j);
            j++;
        }
        long  ewhiletime=new Date().getTime();
        System.out.println("End:"+ewhiletime);
        
        long difwhiletime=ewhiletime-Swhiletime;
        System.out.println("While loop needs time in miliseconds:"+difwhiletime);
        
        System.out.println("\n------End----\n");
        
        
        
        
        
    }

    private static String[] creatArray() {
      String sArray[]=new String[550000];
      for(int i=0; i<550000;i++){
          sArray[i]="Array"+i;
      }
      return sArray;
    }
}
