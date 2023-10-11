package java_module.collections.question.PokerCardExercise;

import java.util.*;


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

    private static final Comparator<Card> DEFAULT_CARD_ORDER = new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            // from SPADE to DIAMOND, that why compare(o2, o1), to reverse the result of this Comparator
            int result = Integer.compare(o2.getValueOfSuit(), o1.getValueOfSuit());
            if (result != 0) {
                return result;
            }
            if (o1.getRank() == Card.Rank.ACE){
                return -1;
            }
            if (o2.getRank() == Card.Rank.ACE){
                return 1;
            }
            return Integer.compare(o1.getValueOfRank(),o2.getValueOfRank());
        }
    };


    public static Deck create() {
        // TODO: implement this static factory method to return a new deck in default order
        List<Card> cards = new ArrayList<>(DEFAULT_DECK_SIZE);

        for (Card.Suit s : Card.Suit.values()){
            for (Card.Rank r : Card.Rank.values()) {
                cards.add(Card.of(s, r));
            }
        }

        cards.sort(DEFAULT_CARD_ORDER);

        return new Deck(cards);
    }

    /*
        Do not modify the constructor
     */
    private Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void reset() {
        // TODO: implement this method to reset the deck to default order
        cards.sort(DEFAULT_CARD_ORDER);
    }

    public void shuffle() {
        // TODO: implement this method to shuffle the deck
        Collections.shuffle(cards);
    }

    public Card deal() {
        // TODO: implement this method to deal a card from the deck
        // Throw EmptyDeckException if the deck is empty
        if (isEmpty()) throw new EmptyDeckException("Deck is Empty");

        return cards.remove(0);
    }

    public boolean isEmpty() {
        // TODO: implement this method to check whether the deck is empty
        return cards.isEmpty();
    }

    public int size() {
        // TODO: implement this method to return the number of cards in the deck
        return cards.size();
    }

    public boolean contains(Card card) {
        // TODO: implement this method to check whether the deck contains a card
        return cards.contains(card);
    }

    // Do not modify - for unit testing only
    protected List<Card> getCards() {
        return cards;
    }

    // Do not modify - for unit testing only
    protected void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return cards.equals(deck.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }
}
