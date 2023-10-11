package java_module.collections.question.PokerCardExercise.test;

import java_module.collections.question.PokerCardExercise.Card;
import java_module.collections.question.PokerCardExercise.impl.OnePairPredicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PredicatesTest {
    OnePairPredicate onePairPredicate = new OnePairPredicate();

    @Test
    public void testOnePair () {
        Card[] cards = new Card[5];
        cards[0] = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        cards[1] = Card.of(Card.Suit.HEART, Card.Rank.KING);
        cards[2] = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        cards[3] = Card.of(Card.Suit.CLUB, Card.Rank.TEN);
        cards[4] = Card.of(Card.Suit.SPADE, Card.Rank.SIX);

        Assertions.assertTrue(onePairPredicate.detect(cards));
    }
}
