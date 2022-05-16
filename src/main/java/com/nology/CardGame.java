package com.nology;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardGame {
    PopulateCardDeck populateCardDeck;
    List<Card> currentDeck;

    public CardGame(String name) {
        this.populateCardDeck = new PopulateCardDeck();
        this.currentDeck = populateCardDeck.loadDeck();
    }

    public List<Card> getDeck() {
        return currentDeck;
    }

    public Card dealCard() {
       return currentDeck.get(0);
    }

    public void cardGame(){

    }

    public void sortDeckInNumberOrder() {
        currentDeck.sort(Comparator.comparing(a -> a.getValue()));
    }

    public void sortDeckIntoSuits() {
        currentDeck.sort(Comparator.comparing(a -> a.getSuit()));
    }

    public void shuffleDeck() {
        Collections.shuffle(currentDeck);
    }

    public static void main(String[] args) {
        CardGame cardGame = new CardGame("First Game");
        System.out.println(cardGame.getDeck());
        System.out.println(cardGame.dealCard());
        cardGame.sortDeckInNumberOrder();
        System.out.println(cardGame.getDeck());
        cardGame.sortDeckIntoSuits();
        System.out.println(cardGame.getDeck());
        cardGame.shuffleDeck();
        System.out.println(cardGame.getDeck());
    }
}
