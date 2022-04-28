package Main;

import Entitys.Stringg;
import Services.StringgServices;

public class StringgMain {
    
    public static void main(String[] args) {
        StringgServices ss = new StringgServices();
        Stringg s1 = ss.askString();
        System.out.println("\n");
        ss.showVowels(s1);
        System.out.println("\n");
        ss.invertPhrase(s1);
        System.out.println("\n");
        ss.times(s1);
        System.out.println("\n");
        ss.compareString(s1);
        System.out.println("\n");
        ss.connectPhrase(s1);
        System.out.println("\n");
        ss.replaceA(s1);
        System.out.println("\n");
        ss.contains(s1);
        
    }
}
