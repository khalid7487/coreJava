package utilities;

public class ValueofDemo {

    public static void main(String[] args) {
        Integer intwrapper = Integer.valueOf("123456");
        //converting from binary to decimal
        Integer intWrapper2 = Integer.valueOf("100", 2);
        //Converting form hexadecimal to decimal
        Integer intWrapper3 = Integer.valueOf("D", 16);
        System.out.println("value of intWrappar object: "+intwrapper);
        System.out.println("Value of intWrappar2 object:  "+ intWrapper2);
        System.out.println("Value of intWrappar3 object: "+intWrapper3);
        
        System.out.println("Hex value of intWrapper: "+ Integer.toHexString(intwrapper));
        System.out.println("Binary Value of intWrapper2: "+Integer.toBinaryString(intWrapper2));
    }   

}
