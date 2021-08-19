import CycleInterface.BicycleFactory;
import CycleInterface.CycleFactory;
import CycleInterface.TricycleFactory;
import CycleInterface.UnicycleFactory;
import InnerClass.ClassOne;
import InnerClass.ClassTwo;
import Rodents.*;
import Cycle.*;
import Interfaces.*;
public class Main {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[4];
      //  rodents[0]=new Rodent();
        rodents[1]=new Rat();
        System.out.println("-----------------------------");
        rodents[2]=new Gerbil();
        System.out.println("-----------------------------");
        rodents[3]=new Hamster();
        System.out.println("-----------------------------");
        for(int i=1;i<4;i++){
            rodents[i].eat();
            rodents[i].canPet();
            rodents[i].occurs();
            System.out.println("-----------------------------");
        }
        Cycle[] cycle=new Cycle[3];
        cycle[0]=new Unicycle();
        //cycle[0].balance(); gives error method balance not present in cycle
        cycle[1]=new Bicycle();
       // cycle[1].balance(); gives error method balance not present in cycle
        cycle[2]=new Tricycle();
        //cycle[2].balance(); gives error method balance not present in cycle
        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
        //((Tricycle)cycle[2]).balance(); gives error method balance not declared in tricycle

        System.out.println("-----------------------------");
        NewClass newClass=new NewClass();
        newClass.method1(newClass);
        newClass.method2(newClass);
        newClass.method3(newClass);
        newClass.method4(newClass);
        System.out.println("-----------------------------");
        CycleFactory cycleFactory=new UnicycleFactory();
        cycleFactory.getCycle().rideCycle();
        cycleFactory=new BicycleFactory();
        cycleFactory.getCycle().rideCycle();
        cycleFactory=new TricycleFactory();
        cycleFactory.getCycle().rideCycle();
        System.out.println("-----------------------------");
        ClassOne.InnerClassNonDefault classOne = new ClassTwo().new InnerClassInherit("sample argument");



    }
}
