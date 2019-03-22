/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsClassandmethods;

/**
 *
 * @author KHALID
 */
public class GenericClassDemo<T> {
    
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
        GenericClassDemo<Integer> integerBox=new GenericClassDemo();
        GenericClassDemo<String> stringBox=new GenericClassDemo();
        
        integerBox.add(new Integer(50));
        stringBox.add("Hello World");
        
        System.out.printf("Integer Value: %d\n", integerBox.get());
        System.out.printf("String Value: %S\n", stringBox.get());
    }
}
