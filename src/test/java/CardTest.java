import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, Rank.KING); // Syntax to call an Enum
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.KING, card.getRank());
    }

    @Test
    public void queenHasValueTen() {
        card = new Card(SuitType.SPADES, Rank.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

    }