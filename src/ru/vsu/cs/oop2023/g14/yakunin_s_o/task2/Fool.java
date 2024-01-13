package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

public class Fool implements TrumpChecker {

    private CardStack deck = new CardStack(36);

    private Card[] trash;
    private Card[] table;
    public void play(){
        deck.SwitchCards();

        int howManyPlayers = 4;
        Player[] players = createPlayers(howManyPlayers);
        for (int i = 0; i < howManyPlayers; i++){
            players[i].take6Cards(deck);
        }
        Card trump = getTrumpCard();
        TrumpCard trumpCard = new TrumpCard(trump.getSuit(),trump.getValue());



    }
    public Player[] createPlayers(int i){
        Player[] players = new Player[i];
        for (int j = 0; j < i; j++) {
            players[j] = new Player();
        }
        return players;
    }

    public Card getTrumpCard() {
        //if (getCardPriority(deck.getCard(0)) > getCardPriority(deck.getCard(1)))
        //if (compare(deck.getCard(0), deck.getCard(1)) > 0)
        return deck.getCard(0);
        /* if ((deck.getCard(0).getSuit() != (Card.Suit.FORREDJOKER)) & (deck.getCard(0).getSuit() != (Card.Suit.FORBLACKJOKER))){
        return deck.getCard(0).getSuit();}
        else if (deck.getCard(0).getSuit() == Card.Suit.FORREDJOKER){

        }*/
    }
    private int getCardPriority(Card card){
        int priority = 0;
        Card.Suit suit = card.getSuit();
        Card.Value value = card.getValue();

             if (value == Card.Value.TWO){
                priority = 2;
            }
            else if (value == Card.Value.THREE){
                priority = 3;
            }
            else if (value == Card.Value.FOUR){
                priority = 4;
            }
            else if (value == Card.Value.FIVE){
                priority = 5;
            }
            else if (value == Card.Value.SIX){
                priority = 6;
            } else if (value == Card.Value.SEVEN){
                priority = 7;
            }
            else if (value == Card.Value.EIGHT){
                priority = 8;
            } else if (value == Card.Value.NINE){
                priority = 9;
            } else if (value == Card.Value.TEN){
                priority = 10;
            } else if (value == Card.Value.JACK){
                priority = 11;
            } else if (value == Card.Value.QUEEN){
                priority = 12;
            } else if (value == Card.Value.KING){
                priority = 13;
            }
            else if (value == Card.Value.ACE){
                priority = 14;
            }
            else if (value == Card.Value.JOKER){
                priority = 666;
            }
        if (card.getSuit() == getTrumpCard()){
            priority+=100;
        }
        return priority;
    }


    @Override
    public boolean isTrump(Card card) {
        return false;
    }
}
