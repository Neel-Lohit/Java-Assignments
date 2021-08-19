package Neel.assignment.data;

public class Data {
    int variable;
    char character;
    public void printGlobal()
    {
        //global variables are initialized to their default values
        System.out.println(variable);
        System.out.println(character);
    }
    public void printLocal(){
        int var;
        char alpha;
        /*
        local variables must be initialized by the user
        System.out.println(var);
        System.out.println(alpha);
        */

    }
}
