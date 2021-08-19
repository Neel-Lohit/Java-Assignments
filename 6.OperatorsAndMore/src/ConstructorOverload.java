public class ConstructorOverload {
    ConstructorOverload(String value)
    {
        this("hello",value);
    }
    ConstructorOverload(String greeting,String value)
    {
        System.out.println(greeting+" "+value+" "+"second constructor called");
    }
}
