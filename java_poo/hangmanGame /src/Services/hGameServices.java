package Services;

import Entitys.hGame;

import java.util.Scanner;

public class hGameServices {
    public hGame newHManGame() {
        Scanner read = new Scanner(System.in);
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
//            System.out.println("***Insert number of TRYS");


        return null;
    }
}
