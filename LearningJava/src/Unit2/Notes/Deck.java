package Unit2.Notes;

enum Suit {Hearts, Spades, Clubs, Diamonds}

enum Rank {Ace, num2, num3, num4, num5, num6, num7, num8, num9, num10, Jack, Queen, King}

class Card {
    protected boolean placeholder = false;
    final Suit suit;
    final Rank rank;

    Card() {
        this.suit = null;
        this.rank = null;
    }

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    static Card placeholder() {
        Card placeholderCard = new Card();
        placeholderCard.placeholder = true;
        return placeholderCard;
    }

    public String stringValue() {
        String output;
        if (!placeholder) {
            output = rank + " - " + suit;
            switch (this.rank) {
                case Ace:
                case Jack:
                case Queen:
                case King:
                    break;
                default:
                    output = output.substring(3);

            }
        } else {
            output = "#";
        }
        return output;
    }
}

public class Deck {
    private final Card[] cards;
    private int frontPointer = 0;
    private int rearPointer = 0;
    private int size = 0;
    private final int MAXSIZE = 52;

    Deck() {
        cards = new Card[MAXSIZE];
        populate();
        shuffle();
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.toString());
        Card card = deck.dealCard();
        System.out.println(card.stringValue());
        System.out.println(deck.toString());
        deck.returnCard(card);
        System.out.println(deck.toString());
    }

    public void populate() {
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }
        size = Suit.values().length * Rank.values().length;
        rearPointer = size;
    }

    public void shuffle() {
        // Knuth shuffle
        int j;
        Card buffer;
        for (int i = MAXSIZE - 1; i >= 0; i--) {
            j = (int) (Math.random() * i);
            buffer = cards[i];
            cards[i] = cards[j];
            cards[j] = buffer;
        }
    }

    public void returnCard(Card value) {
        if (size < MAXSIZE) {
            rearPointer %= MAXSIZE;
            cards[rearPointer] = value;
            rearPointer++;
            size++;
        } else {
            System.err.println("Error: Deck full, cannot put");
        }
    }

    public Card dealCard() {
        Card card = null;
        if (size != 0) {
            frontPointer %= MAXSIZE;
            card = cards[frontPointer];
            cards[frontPointer] = Card.placeholder();
            frontPointer++;
            size--;
        } else {
            System.err.println("Error: Deck empty, cannot pop");
        }
        return card;
    }

    public Card peek() {
        Card result = null;
        if (size != 0) {
            result = cards[frontPointer];
        } else {
            System.err.println("Error: Deck empty, cannot peek");
        }
        return result;
    }

    public boolean isFull() {
        return size == MAXSIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String output = "[";
        for (Card card : cards) {
            output += card.stringValue() + ", ";
        }
        output = output.substring(0, output.length() - 2);
        output += "]\nCards: " + size;
        output += "\nFrontPointer: " + frontPointer;
        output += "\nRearPointer: " + rearPointer;
        output += "\n";
        return output;
    }
}
