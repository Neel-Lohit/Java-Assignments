
public class CreatingLambdas {
    interface Greeting
    {
        public String sayHello(String g);
    }
    public void testGreeting(String a, Greeting g)
    {
        String result= g.sayHello(a);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new CreatingLambdas().testGreeting("Harry",(String a)->"hello "+a);
        new CreatingLambdas().testGreeting("",(String s)->(s.isEmpty())?"did you miss anything?":"Hii "+s);
    }
}
