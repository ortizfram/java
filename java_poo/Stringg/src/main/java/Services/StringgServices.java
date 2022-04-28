package Services;

import Entitys.Stringg;
import java.util.Scanner;

public class StringgServices {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Stringg askString() {
        Stringg st = new Stringg();
        System.out.println("Insert a String");
        st.setPhrase(read.next());
        //using a variable to aplly lenght on phrase
        //.replaceAll(object, replacement)
        String ph = st.getPhrase().replaceAll(" ", "");
        st.setLenght(ph.length());

        //show phrase lenght
        System.out.println("Letter = " + st.getLenght());

        return st;
    }
//************************************************************

    public void showVowels(Stringg st) {
        String p = st.getPhrase();
        int count = 0;

        for (int i = 0; i < st.getPhrase().length(); i++) {
            //check if charAt(i) is vowel
            if (p.charAt(i) == 'a' || p.charAt(i) == 'e'
                    || p.charAt(i) == 'i'
                    || p.charAt(i) == 'o'
                    || p.charAt(i) == 'u') {
                //increment if there is a vowel in char[i]
                count++;
            }
        }
        if (count >= 1) {
            System.out.println("vowels = " + count);
        }
    }
//**************************************************************

    public void invertPhrase(Stringg st) {
        String p = st.getPhrase();

        //i = phrase.lenght -1,  till   i >= 0   (original position) 
        //letter per letter
        for (int i = p.length() - 1; i >= 0; i--) {
            System.out.print(p.charAt(i));
        }
    }
//**************************************************************

    public void times(Stringg st) {
        int count = 0;
        String p = st.getPhrase();
        String letter = "";
        System.out.println("**whitch letter are you looking for ?");
        letter = read.next();
        String aux = "";

        for (int i = 0; i < st.getLenght(); i++) {
            //aux takes letter and saves it 
            aux = st.getPhrase().substring(i, i + 1);
            if (aux.equals(letter)) { //equals takes all letters , == takes a char
                count++;
            }
        }
        System.out.println("selected letter " + letter + " is repeated " + count + " times");
    }

    //*************************************************************
    public void compareString(Stringg st) {
        int p = st.getLenght();//original lenght phrase
        String newString = "";
        System.out.println("*********Insert new String ");
        newString = read.next();
        st.setPhrase2(newString);//setting phrase 2

        String ns = newString.replaceAll(" ", ""); //ommit spaces
        st.setLenght2(ns.length());//setting ne phrase lenght
        int np = st.getLenght2(); //alias for lenght new phrase

        //comparing
        boolean bool = (p == np);
        if (bool) {
            System.out.println("ph1 && ph2 are = lenght " + p);
        } else {
            System.out.println("ph1 && ph2 are != lenght ");
        }
    }
//**************************************************************8

    public void connectPhrase(Stringg st) {
        String p = st.getPhrase();
        String pn = st.getPhrase2();
        st.setPhraseTotal(p + " " + pn);

        System.out.println(p + " " + pn);
    }
//**************************************************************

    public void replaceA(Stringg st) {
        String pt = st.getPhraseTotal();
        String aux = "";

        String pr = pt.replace('a', '@');
        System.out.println("replaced = " + pr);
    }
//**************************************************************

    public void contains(Stringg st) {
        String pt = st.getPhraseTotal();
        String aux = "";
        System.out.println("**whitch letter are you looking for ?");
        String letter = read.next();
        boolean bool = false;

        for (int i = 0; i < pt.length(); i++) {
            //aux takes letter and saves it 
            aux = pt.substring(i, i + 1);
            if (aux.equals(letter)) { //equals takes all letters , == takes a char
                bool = true;
            }
        }
        System.out.println("Char is in phrase ? = " + bool);
    }
}
