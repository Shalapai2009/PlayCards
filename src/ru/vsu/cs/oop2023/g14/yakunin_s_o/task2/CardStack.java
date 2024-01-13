package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

import java.util.Random;

public class CardStack {
    private int maxStack;
    private Card.Suit[] suits = new Card.Suit[] {Card.Suit.HEARTS,Card.Suit.SPADES,Card.Suit.DIAMONDS,Card.Suit.CLUBS};
    private Card.Value[] value52s = new Card.Value[] {Card.Value.ACE,Card.Value.KING,Card.Value.QUEEN,Card.Value.JACK,Card.Value.TEN,
            Card.Value.NINE,Card.Value.EIGHT,Card.Value.SEVEN,Card.Value.SIX,Card.Value.FIVE,Card.Value.FOUR,Card.Value.THREE,Card.Value.TWO};
    private Card[] stackArray;
    private int currentLastPosition;
    public CardStack(int maxStack){
        this.maxStack = maxStack;
        this.currentLastPosition = maxStack-1;
        stackArray = new Card[maxStack];
        if ((maxStack == 52) | (maxStack == 36)){
            int k = 0;
            for (int i = 0; i < suits.length; i++) {
                for (int j = 0; j < maxStack/suits.length; j++) {
                    stackArray[k] = new Card(suits[i],value52s[j]);
                    k+=1;
                }
            }
        }
        else if (maxStack == 54){
            int k = 0;
            for (int i = 0; i < suits.length; i++) {
                for (int j = 0; j < maxStack/suits.length; j++) {
                    stackArray[k] = new Card(suits[i],value52s[j]);
                    k+=1;
                }
            }
            stackArray[52] = new Card(Card.Suit.FORBLACKJOKER, Card.Value.JOKER);
            stackArray[53] = new Card(Card.Suit.FORREDJOKER, Card.Value.JOKER);
        }
        else throw new UnsupportedOperationException("No 36/52/54 Stack? \uD83E\uDD7A");
    }
    public void SwitchCards(){
        Random rnd = new Random();
        for (int i = stackArray.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card temp = stackArray[index];
            stackArray[index] = stackArray[i];
            stackArray[i] = temp;
    }}
    public void printStack(){
        for (int i = 0; i <= currentLastPosition; i++) {
            System.out.println(stackArray[i].getSuit()+" "+stackArray[i].getValue());
        }
    }

    public Card popCard(){
        Card card;
        card = stackArray[currentLastPosition];
        stackArray[currentLastPosition] = null;
        currentLastPosition-=1;
    return card;
    }
    public Card getCard(int position){
        return stackArray[position];
    }
    public int returnMaxStack(){
        return maxStack;
    }
    public int returnCurrentLastPosition(){
        return currentLastPosition;
    }


}
