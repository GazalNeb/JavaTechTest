package com.nology;
import java.util.ArrayList;
import java.util.List;

public class PopulateCardDeck {

    private String[] suit = {Character.toString('\u2660'), Character.toString('\u2665'), Character.toString('\u2666'), Character.toString('\u2663')};
    private String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public List<Card> loadDeck() {

        List<Card> cardDeck = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card tempCard = new Card();
                tempCard.setSuit(suit[i]);
                tempCard.setSymbol(symbol[j]);
                tempCard.setValue(value[j]);
                cardDeck.add(tempCard);
            }
        }
        return cardDeck;
    }

    public static void main(String[] args) {
        PopulateCardDeck populateCardDeck = new PopulateCardDeck();
        System.out.println(populateCardDeck.loadDeck());
    }
}
