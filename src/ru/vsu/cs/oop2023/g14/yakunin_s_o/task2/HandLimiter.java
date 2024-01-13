package ru.vsu.cs.oop2023.g14.yakunin_s_o.task2;

import java.util.ArrayList;
import java.util.List;

public interface HandLimiter {
    Card getCard(int index);
    int getSize();

    default List<Card> checkHand() {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < getSize(); i++)
            cards.add(getCard(i));
        return cards;
    }
}
