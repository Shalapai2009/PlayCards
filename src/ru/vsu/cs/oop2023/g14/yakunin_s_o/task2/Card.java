package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

public class Card {
    Value value;
    Suit suit;
    int priority;
    public Card(Suit suit,Value value){
        this.value = value;
        this.suit = suit;
    }

    public static enum Suit{
        HEARTS,DIAMONDS,SPADES,CLUBS,FORBLACKJOKER,FORREDJOKER
    }
    public static enum Value{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, JOKER
    }
    public void setValue(Value value){
        this.value = value;
    }
    public void setSuit(Suit suit){
        this.suit = suit;
    }
    public Value getValue(){
        return value;
    }
    public Suit getSuit(){
        return suit;
    }


}
