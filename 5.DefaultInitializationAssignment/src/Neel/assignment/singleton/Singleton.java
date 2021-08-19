package Neel.assignment.singleton;

public class Singleton {
    String member;
    public static Singleton staticMethod(String member)
    {
        member="Dfdf";
        //Non-static variables cannot be accessed from a static context
        //member="Neel";
        //current class instance cannot be obtained from a static context
       // return this;
        return null;
    }
    public void printString()
    {
        System.out.println(member);
    }
}

