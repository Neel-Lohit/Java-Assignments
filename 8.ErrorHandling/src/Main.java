public class Main {
    public static void main(String[] args) {
    ExceptionClass exceptionClass=new ExceptionClass();
    try {
        exceptionClass.exceptionMethod();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    finally {
        System.out.println("Reached finally");
    }
    }
}
