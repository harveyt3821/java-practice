package java_module.collections.question.PokerCardExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/*

    TODO: update this class to pass all the test cases in DeckTest.java

        1. Implement the `Comparator` that defines the default card order of the deck
        2. Update various methods to complete the functionalities of a typical card deck.

 */
public class Deck {
    // Do not modify the default deck size
    public static final int DEFAULT_DECK_SIZE = 52;
    // Do not modify the cards attribute
    private List<Card> cards;
    
    private List<Card> defaultDeck;

    private static final Comparator<Card> DEFAULT_CARD_ORDER =
            Comparator.comparingInt(Card::getValueOfRank).
                    thenComparing(Card::getValueOfSuit);


    public static Deck create() {
        // TODO: implement this static factory method to return a new deck in default order
        List<Card> deck = new ArrayList<>();

        for (int i = 1; i <= 4; i++){
            for (int j = 2; j <= 14; j++){
                deck.add(Card.of(Card.Suit.valueOf(String.valueOf(i)), Card.Rank.valueOf(String.valueOf(j))));
            }
        }

        return new Deck(deck);
    }

    /*
        Do not modify the constructor
     */
    private Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void reset() {
        // TODO: implement this method to reset the deck to default order
    }

    public void shuffle() {
        // TODO: implement this method to shuffle the deck
    }

    public Card deal() {
        // TODO: implement this method to deal a card from the deck
        // Throw EmptyDeckException if the deck is empty
        return null;
    }

    public boolean isEmpty() {
        // TODO: implement this method to check whether the deck is empty
        return false;
    }

    public int size() {
        // TODO: implement this method to return the number of cards in the deck
        return 0;
    }

    public boolean contains(Card card) {
        // TODO: implement this method to check whether the deck contains a card
        return false;
    }

    // Do not modify - for unit testing only
    protected List<Card> getCards() {
        return cards;
    }

    // Do not modify - for unit testing only
    protected void setCards(List<Card> cards) {
        this.cards = cards;
    }
}