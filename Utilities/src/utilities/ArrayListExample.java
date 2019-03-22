package utilities;


import java.util.*;

class Bank {

    String n;
    String add;
    int an;
    int bal;
    int dep;

    public Bank(String n, String add, int an, int bal) {
        this.n = n;
        this.add = add;
        this.an = an;
        this.bal = bal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name of the cumstomer: ");
        sb.append(this.n);
        sb.append(", ");
        sb.append("Address of the customer:");
        sb.append(this.add);
        sb.append(", ");
        sb.append("A/C No:");
        sb.append(this.an);
        sb.append(", ");
        sb.append("Balance in A/C:");
        sb.append(this.bal);

        return sb.toString();
    }

}

public class ArrayListExample {
    public static void main(String[] args) {
        
        List<Bank> l= new LinkedList<>();
        
        Bank b1= new Bank("Khalid", "Faridpur,Dhaka", 101, 10000);
        Bank b2= new Bank("Sabab", "Faridpur,Dhaka", 102, 1500);
        Bank b3= new Bank("Rakib", "Chadpur,Chitagong", 103, 1600);
        Bank b4= new Bank("Helal", "Faridpur,Dhaka", 104, 18000);
        Bank b5= new Bank("Riaz", "Faridpur,Dhaka", 105, 19000);
       l.add(b1);
       l.add(b2);
       l.add(b3);
       l.add(b3);
       l.add(b4);
       l.add(b5);
       
       Iterator<Bank> i=l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
    }

}
