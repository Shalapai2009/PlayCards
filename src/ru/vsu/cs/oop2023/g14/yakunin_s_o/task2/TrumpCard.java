package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

public class TrumpCard {
    Card.Value value;
    Card.Suit suit;
    public TrumpCard(Card.Suit suit, Card.Value value){
        this.value = value;
        this.suit = suit;
    }
    public Card.Value getValue(){
        return value;
    }
    public Card.Suit getSuit(){
        return suit;
    }

}
