package Entitys;

import java.util.Arrays;

public class hGame {
    String[] aWord;
    int longg;
    int charFound;
    int limitOfPlays;

    public hGame() {
    }

    public hGame(String[] aWord, int longg, int charFound, int limitOfPlays) {
        this.aWord = aWord;
        this.longg = longg;
        this.charFound = charFound;
        this.limitOfPlays = limitOfPlays;
    }

    public String[] getaWord() {
        return aWord;
    }

    public void setaWord(String[] aWord) {
        this.aWord = aWord;
    }

    public int getLongg() {
        return longg;
    }

    public void setLongg(int longg) {
        this.longg = longg;
    }

    public int getCharFound() {
        return charFound;
    }

    public void setCharFound(int charFound) {
        this.charFound = charFound;
    }

    public int getLimitOfPlays() {
        return limitOfPlays;
    }

    public void setLimitOfPlays(int limitOfPlays) {
        this.limitOfPlays = limitOfPlays;
    }

    @Override
    public String toString() {
        return "hGame{" + "aWord=" + Arrays.toString(aWord) + ", longg=" + longg + ", charFound=" + charFound + ", limitOfPlays=" + limitOfPlays + '}';
    }
}