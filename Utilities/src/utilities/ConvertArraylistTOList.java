
package utilities;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertArraylistTOList {
    public static void main(String[] args) {
        String sArray[]=new String[]{"Array 1","Array 2","Array 2"};
        
        //convert array to list
        List<String> lList=Arrays.asList(sArray);
        
        //iterator loop
        System.out.println("#1 iterator");
        Iterator<String> iter=lList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        //for loop
        System.out.println("#2 for loop");
        for(int i=0;i<lList.size();i++){
            System.out.println(lList.get(i));
        }
        
        //advance for loop
        System.out.println("#3 advance fro loop");
        for(String temp : lList){
            System.out.println(temp);
        }
        
        //while loop
        System.out.println("#while loop");
        int j=0;
        while(j<lList.size()){
            System.out.println(lList.get(j));
            j++;
        }
    }
}
