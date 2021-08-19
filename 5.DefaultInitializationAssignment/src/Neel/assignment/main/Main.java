package Neel.assignment.main;

import Neel.assignment.data.Data;
import Neel.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data=new Data();
        data.printGlobal();
        data.printLocal();
        Singleton singleton=Singleton.staticMethod("Neel");
        //cannot return object through static method
        singleton.printString();

    }
}
