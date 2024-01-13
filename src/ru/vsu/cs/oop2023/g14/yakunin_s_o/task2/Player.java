package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

import java.util.ArrayList;

public class Player{
    private Hand playerHand = new Hand();
    public void take6Cards(CardStack generalDeck){
        for (int i = 0; i < 5; i++) {
                playerHand.addInHand(generalDeck.popCard());
        }
    }
    public void takeCard(CardStack generalDeck){
        if (generalDeck.returnCurrentLastPosition()>=0){
            playerHand.addInHand(generalDeck.popCard());}
    }
    public Card attack(HandLimiter h, OpponentsAndGameInfoForAttacker oi, TrumpChecker tc){
        h.checkHand()
        tc.isTrump(h.getCard(0));
        if (playerDeck.size()>0){

        }

    }
    public Card defend(Hand h, Table t, OpponentsAndGameInfoForDefender oi){

        if (playerDeck.size()>0){

        }
    }
    public Card supportAttack(Hand h, Table t, OpponentsAndGameInfoForSupport o){
        if (playerDeck.size()>0){

        }
    }

}
