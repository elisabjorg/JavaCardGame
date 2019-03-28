import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Player player;

    @Before
    public void before() {
        deck = new Deck();
        player = new Player();
    }


    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.countDeck());
    }

    @Test
    public void canShuffleDeck() {
        deck.populateDeck();
        Card sampleCardOne = deck.getCard(0);
        deck.shuffleDeck();
        Card sampleCardTwo = deck.getCard(0);
        assertNotEquals(sampleCardOne, sampleCardTwo);
    }

    @Test
    public void canDealCard() {
        deck.populateDeck();
        deck.dealCard(player);
        assertEquals(1, player.countCards());
    }

}