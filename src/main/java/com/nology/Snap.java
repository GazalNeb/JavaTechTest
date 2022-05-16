package com.nology;

import java.util.Scanner;

public class Snap extends CardGame {
    Card previousCard;
    Card currentCard;

    Scanner scanner = new Scanner(System.in);

    public Snap(String name) {
        super(name);
    }

   public void play() {
       this.shuffleDeck();
    do {
        if (this.currentDeck.size() == 0) {
            System.out.println("No more cards left in the deck");
            break;
        }
        System.out.println("press enter to draw a card!");
        previousCard = currentCard;
        String readString = scanner.nextLine();
        currentCard = this.dealCard();
        this.currentDeck.remove(currentCard);
        System.out.println(currentCard);
    } while (this.checkWinner() == false);

    if (this.checkWinner()) {
        System.out.println("We have a winner!");
    }

   }

   private boolean checkWinner() {
     if (this.previousCard != null) {
         return this.currentCard.getSymbol().equals(this.previousCard.getSymbol());
     }
     return false;
   }

    public static void main(String[] args) {
        Snap snap = new Snap("First Snap");
        snap.play();
    }
}
