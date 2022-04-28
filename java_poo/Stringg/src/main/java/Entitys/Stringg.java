package Entitys;

public class Stringg {

    String phrase;
    String phrase2;
    String phraseTotal;
    int lenght;
    int lenght2;

    public Stringg() {
    }

    public Stringg(String phrase, String phrase2, String phraseTotal, int lenght, int lenght2) {
        this.phrase = phrase;
        this.phrase2 = phrase2;
        this.phraseTotal = phraseTotal;
        this.lenght = lenght;
        this.lenght2 = lenght2;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase2() {
        return phrase2;
    }

    public void setPhrase2(String phrase2) {
        this.phrase2 = phrase2;
    }

    public String getPhraseTotal() {
        return phraseTotal;
    }

    public void setPhraseTotal(String phraseTotal) {
        this.phraseTotal = phraseTotal;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght2() {
        return lenght2;
    }

    public void setLenght2(int lenght2) {
        this.lenght2 = lenght2;
    }

    @Override
    public String toString() {
        return "Stringg{" + "phrase=" + phrase + ", phrase2=" + phrase2 + ", phraseTotal=" + phraseTotal + ", lenght=" + lenght + ", lenght2=" + lenght2 + '}';
    }

}
