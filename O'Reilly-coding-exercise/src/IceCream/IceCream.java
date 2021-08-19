package IceCream;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private ArrayList<String> toppings;
    public IceCream(String name,int cost)
    {
        this.name = name;
        this.cost= cost;
        this.toppings= new ArrayList<>();
    }
    public void addToppings(String topping)
    {
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
    public void  printToppings()
    {
        for(String topping : toppings)
            System.out.println("\t"+ topping);
    }
}
