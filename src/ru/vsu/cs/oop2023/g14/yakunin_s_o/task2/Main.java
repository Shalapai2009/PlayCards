package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

public class Main {
    public static void main(String[] args) {
        //ru.vsu.cs.oop2023.g14.yakunin_s_o.Card card = new ru.vsu.cs.oop2023.g14.yakunin_s_o.Card(ru.vsu.cs.oop2023.g14.yakunin_s_o.Card.Suit.CLUBS,ru.vsu.cs.oop2023.g14.yakunin_s_o.Card.Value.ACE);
        CardStack cardStack = new CardStack(36);
        Fool fool = new Fool();
        fool.play();
        //cardStack.SwitchCards();
        //System.out.println(deletedCard.getSuit()+" "+deletedCard.getValue());

      //cardStack.printStack();
    }


}