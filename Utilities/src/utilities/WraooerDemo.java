package utilities;

public class WraooerDemo {

    public static void main(String[] args) {
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("25");
        Integer intObj3 = new Integer(35);

        // CompareTo demo
        System.out.println("comparing using compareTo obj1 and obj2: "+intObj1.compareTo(intObj2));
        System.out.println("Comparing using compareTO obj1 and obj3: "+intObj1.compareTo(intObj3));

        //equals demo
        System.out.println("Comparing using equals obj1 and obj2: "+intObj1.equals(intObj2));
        System.out.println("Comparing using obj1 and obj3: "+intObj1.equals(intObj3));

        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float(2.25f);
        System.out.println("Comparing using compare f1 and f2: " +Float.compare(f1, f2));
        System.out.println("Comparing using compare f1 and f3: " +Float.compare(f1, f3));
        
        //Addition of Integer with Float
        Float f=intObj1.floatValue() +f1;
        System.out.println("Addition of intObj1 and f1: "+intObj1+ " +" + f1+ "="+f );
    }

}
