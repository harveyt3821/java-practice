package java_module.collections.question.PokerCardExercise.impl;

import java_module.collections.question.PokerCardExercise.Card;
import java_module.collections.question.PokerCardExercise.PatternPredicate;

import java.util.HashMap;
import java.util.Map;

public class OnePairPredicate implements PatternPredicate {
    Map<Card.Rank, Integer> rankCount = new HashMap<>(5);

    @Override
    public boolean detect(Card[] cards) {
        for (Card c : cards) {
            Card.Rank rank = c.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        for (Integer occurrence : rankCount.values()){
            if ( occurrence >= 2) {
                return true;
            }
        }

        return false;
    }
}
