package InnerClass;

public class ClassOne {
    public class InnerClassNonDefault{
       public InnerClassNonDefault(String arg)
        {
            System.out.println("In InnerClass with non default constructor with argument "+arg);
        }
    }
}
