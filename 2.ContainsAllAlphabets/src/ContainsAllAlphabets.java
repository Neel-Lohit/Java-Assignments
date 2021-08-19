import java.util.HashSet;

public class ContainsAllAlphabets {
    String contains(HashSet hashSet)
    {
        for(int i=97;i<=122;i++)
        {
            if(!hashSet.contains(String.valueOf((char)i))) {
                return "Does not contain "+(char)i;
            }
        }
        return "Contains all the alphabets";
    }
}
