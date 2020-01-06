package container;

import java.util.ArrayList;
import java.util.List;

interface Interface {
    void methodA();
}
class ConcreteClass implements Interface {

    @Override
    public void methodA() {
        System.out.println("A");
    }

    public void methodB() {
        System.out.println("B");
    }

}
public class InterfaceAndConcreteClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Interface concrete = new ConcreteClass();
        concrete.methodA();//OK
        //concrete.methodB();//无法调用Interface中没有的方法
    }
}
