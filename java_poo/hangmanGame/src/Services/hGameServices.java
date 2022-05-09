package Services;

import Entitys.hGame;

import java.util.Scanner;


public class hGameServices {
    public hGame newHManGame() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        hGame hg = new hGame();
        System.out.println("^^^^^^^^^^HANGMAN GAME^^^^^^^^^^" + "\n");
        System.out.println("***Insert a Word");//***/
        String word = read.next();
        int count = 0;
        String[] aWord;

        //chars of word
        aWord = new String[word.length()]; //array = new String array[word.lenght] PROPERTy
        for (int i = 0; i < word.length(); i++) {
            count++;
            aWord[i] = word.substring(count - 1, count); //this takes and saves a CHAR in the array
            hg.setaWord(aWord);//fills the array with chars of the word
        }

        System.out.println("***Insert number of TRYS");
        hg.setLimitOfPlays(read.nextInt());
        hg.setCharFound(0);
        hg.setLongg(word.length());

        return hg;
    }

    public void longg(hGame hg) {
        System.out.println("word has " + hg.getLongg() + " chars");
    }

    public void findL(hGame hg) {
        Scanner read = new Scanner(System.in);
        int contador = 0;

        System.out.println("insert letter you re looking for : ");
        String Letter = read.next();
        for (int i = 0; i < hg.getLongg(); i++) {

            if (hg.getaWord()[i].equals(Letter)) {

                contador++;

            }

        }
        if (contador > 0) {
            System.out.println("Letter is in word");

        } else {

            System.out.println("Letter was not in word ");
        }

    }

    public boolean found(hGame hg, String Letter) {


        int contador = 0;

        boolean bandera;

        for (int i = 0; i < hg.getLongg(); i++) {

            if (hg.getaWord()[i].equals(Letter)) {

                contador++;

            }

        }

        bandera = contador > 0;

        return bandera;

    }

    public void intentos(hGame hg) {

        int trys = hg.getLimitOfPlays();

        hg.setLimitOfPlays(trys - 1);

        System.out.println("you have " + hg.getLimitOfPlays() + " opportunities");

    }

    public void mostrarPalabra(hGame hg) {

        for (int i = 0; i < hg.getLongg(); i++) {

            System.out.print(hg.getaWord()[i]);

        }

    }




}


