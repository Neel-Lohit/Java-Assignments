import java.util.Arrays;
import java.util.HashSet;

public class VampireNumber {

    public static boolean vampireCheck(long original,long factor1,long factor2)
    {
        String originalString=String.valueOf(original);
        String factor1String=String.valueOf(factor1);
        String factor2String=String.valueOf(factor2);

        if(factor1String.charAt(factor1String.length()-1)=='0' && factor2String.charAt(factor2String.length()-1)=='0')
         return false;

        if(factor1String.length()!=originalString.length()/2 || factor2String.length()!=originalString.length()/2)
            return false;

        HashSet<String> origSet=new HashSet<String>(Arrays.asList(originalString.split("")));
        HashSet<String> factor1factor2Set=new HashSet<String>(Arrays.asList((factor1String+factor2String).split("")));
        return origSet.equals(factor1factor2Set);
    }


    public static void generateVampireNumbers() {
        int count =1;
        for(long i = 10; count<=100; i++ ){
            if(String.valueOf(i).length() % 2 != 0)
            {   i = i * 10 - 1;
                continue;
            }
            for(long factor1 = 2; factor1 <= Math.sqrt(i) + 1; factor1++){
                if(i % factor1 == 0){
                    long factor2 = i / factor1;
                    if(vampireCheck(i, factor1, factor2) && factor1 <= factor2){
                        System.out.println((count++)+". "+i);

                    }
                }
            }
        }
    }
}
