package IceCream;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC =new IceCream("Chocolate",3);
        IceCream yourIC = new IceCream("Strawberry", 4);
        myIC.addToppings("cherries");
        myIC.addToppings("nuts");

        yourIC.addToppings("sprinkles");
        printIC(myIC);
        printIC(yourIC);
    }

    private static void printIC(IceCream icecream) {
        System.out.println(icecream.getName());
        System.out.println(icecream.getCost());
        System.out.println("Topped with :");
        icecream.printToppings();
    }
}
