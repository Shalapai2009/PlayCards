package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

import java.util.ArrayList;
import java.util.List;

public class Hand implements HandLimiter{

    private List<Card> hand = new ArrayList<>();
    public void addInHand(Card card) {
        hand.add(card);
    }

    @Override
    public Card getCard(int index) {
        return hand.get(index);
    }
    @Override
    public int getSize() {
        return hand.size();
    }





    /*public Card throwCard(Card card){
        hand.remove(card);
        return card;
    }*/

    /*@Override
    public boolean isTrump(Card card,TrumpCard trumpCard) {
        if (card.getSuit() == trumpCard.getSuit()){
            return true;
        }
        if (card.getSuit() == Card.Suit.FORREDJOKER){
            if ((trumpCard.getSuit() == Card.Suit.DIAMONDS) | (trumpCard.getSuit() == Card.Suit.HEARTS)){
                return true;
            }
            else return false;
        }
        if (card.getSuit() == Card.Suit.FORBLACKJOKER){
            if ((trumpCard.getSuit() == Card.Suit.SPADES) | (trumpCard.getSuit() == Card.Suit.CLUBS)){
                return true;
            }
            else return false;
        }
        if (trumpCard.getSuit() == Card.Suit.FORREDJOKER){
            if ((card.getSuit() == Card.Suit.DIAMONDS) | (card.getSuit() == Card.Suit.HEARTS)){
                return true;
            }
            else return false;
        }
        if (trumpCard.getSuit() == Card.Suit.FORBLACKJOKER){
            if ((card.getSuit() == Card.Suit.SPADES) | (card.getSuit() == Card.Suit.CLUBS)){
                return true;
            }
            else return false;
        }

    }*/


}
