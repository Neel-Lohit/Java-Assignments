package Interfaces;

public class NewClass extends ConcreteClass implements NewInterface{
    public void method1(Interface1 interface1)
    {
        interface1.i1M1();
    }
    public void method2(Interface2 interface2)
    {
        interface2.i2M1();
    }
    public void method3(Interface3 interface3)
    {
        interface3.i3M1();
    }
    public void method4(NewInterface newInterface)
    {
        newInterface.newMethod();
    }


    @Override
    public void i1M1() {
        System.out.println("NewClass implementation of i1M1");
    }

    @Override
    public void i1M2() {
        System.out.println("NewClass implementation of i1M2");
    }

    @Override
    public void i2M1() {
        System.out.println("NewClass implementation of i2M1");
    }

    @Override
    public void i2M2() {
        System.out.println("NewClass implementation of i2M2");
    }

    @Override
    public void i3M1() {
        System.out.println("NewClass implementation of i3M1");
    }

    @Override
    public void i3M2() {
        System.out.println("NewClass implementation of i3M2");
    }

    @Override
    public void newMethod() {
        System.out.println("NewClass implementation of newMethod");
    }
}
