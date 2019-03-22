
package utilities;

class Account{
    int a;
    int b;
    public Account(int aa, int bb)
    {
        this.a=aa;
        this.b=bb;
    }
    public void  showData()
    {
        System.out.println("Value of a =" +a);
        System.out.println("Value of b="+b);
    }
   
}
public class ObjectArray {
    public static void main(String[] args) {
        Account obj[] =new Account[20];
        obj[0]=new Account(1, 01);
        obj[0]=new Account(1, 12);
        System.out.println("For array element 0");
        obj[0].showData();
        System.out.println("For Array Element 1");
        obj[1].showData();
    }
}
