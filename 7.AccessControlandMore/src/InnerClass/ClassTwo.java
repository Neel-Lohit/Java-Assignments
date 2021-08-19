package InnerClass;

public class ClassTwo extends ClassOne{
    public class InnerClassInherit extends ClassOne.InnerClassNonDefault {

       public InnerClassInherit(String arg) {
            super(arg);
            System.out.println("Second inner class with argument "+arg);
        }
    }
}
