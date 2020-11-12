import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreTableTest {
    @Test
    public void groupScore1Test() {
        assertEquals("\"合格\"", ScoreTable.groupScore1(60));
        assertEquals("\"不合格\"", ScoreTable.groupScore1(59));
    }

    @Test
    public void groupScore2Test() {
        assertEquals("\"よくできました\"", ScoreTable.groupScore2(60));
        assertEquals("\"ざんねんでした。\"", ScoreTable.groupScore2(59));
    }

    @Test
    public void groupScore3Test() {
        assertEquals("\"可\"", ScoreTable.groupScore3(60));
        assertEquals("\"不可\"", ScoreTable.groupScore3(59));
    }

    @Test
    public void groupScoreFrom2TestsTest() {
        assertEquals("\"合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(85, 45)));
        assertEquals("\"不合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(15, 35)));
    }

}