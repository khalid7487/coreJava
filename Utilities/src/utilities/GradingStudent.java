/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> list1 = new ArrayList<Integer>();
        int sum=0,nModified1,nModified2,nModified3;
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)>=38){
                if((grades.get(i)%5)!=0){
                    if(5-(grades.get(i)%5)<3){
                        sum=grades.get(i)+5-(grades.get(i)%5);
                         list1.add(sum);
                    }else{
                         nModified3=grades.get(i);
                         list1.add(nModified3);
                    }
                }else{
                     nModified2=grades.get(i);
                     list1.add(nModified2);
                }
            }else{
                nModified1=grades.get(i);
                list1.add(nModified1);
            }

        }
        
         return list1;
        
    }

}

public class GradingStudent {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
