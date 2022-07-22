import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    private static final Map<String, Integer> card = new HashMap<>();

    public Blackjack() {
        card.put("ace", 11);
        card.put("two", 2);
        card.put("three", 3);
        card.put("four", 4);
        card.put("five", 5);
        card.put("six", 6);
        card.put("seven", 7);
        card.put("eight", 8);
        card.put("nine", 9);
        card.put("ten", 10);
        card.put("jack", 10);
        card.put("queen", 10);
        card.put("king", 10);
        card.put("others", 0);


    }

    public int parseCard(String cardlist) {
        return card.get(cardlist);
        //throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
    }

    public boolean isBlackjack(String card1, String card2) {
        return (card.get(card1) + card.get(card2)) == 21;
        //throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        if (dealerScore == 11 && !isBlackjack)
            return "P";
        else {
            if(isBlackjack && dealerScore <10)
                return "W";

        }
        return "S";
        //throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17)
            return "S";
        else if (handScore <= 11)
            return "H";
        else {
            if (dealerScore >= 7)
                return "H";
            return "S";
        }
        //throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
