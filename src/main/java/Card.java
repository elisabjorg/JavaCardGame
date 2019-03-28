public class Card {

    public SuitType suit;
    public Rank rank;

    public Card(SuitType suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public Rank getRank() {

        return this.rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue(); // Nested method
    }

}

