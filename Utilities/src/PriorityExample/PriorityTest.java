
package PriorityExample;

import java.util.PriorityQueue;


public class PriorityTest {

    public static void main(String[] args) {
        String[] alphabet = {"Banana", "a", "d", "s", "j", "apple", "c", "A", "i",
             "B", "E", "D", "H", "J", "A", "C", "F", "s", "I", "K"};
        PriorityQueue<String> pq = new PriorityQueue();
        for(int i=0;i<20;i++){
            pq.add(alphabet[i]);
        }
        System.out.println(pq);
        for(int i=0;i<20;i++){
            System.out.println(pq.poll());
        }
    }

}
