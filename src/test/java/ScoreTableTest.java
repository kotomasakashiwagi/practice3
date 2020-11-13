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
        assertEquals("\"たいへんよくできました。\"", ScoreTable.groupScore2(80));
        assertEquals("\"よくできました\"", ScoreTable.groupScore2(60));
        assertEquals("\"ざんねんでした。\"", ScoreTable.groupScore2(59));
    }

    @Test
    public void groupScore3Test() {
        assertEquals("\"優\"", ScoreTable.groupScore3(80));
        assertEquals("\"良\"", ScoreTable.groupScore3(70));
        assertEquals("\"可\"", ScoreTable.groupScore3(60));
        assertEquals("\"不可\"", ScoreTable.groupScore3(59));
    }

    @Test
    public void groupScoreFrom2TestsTest() {
        assertEquals("\"合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(60, 60)));
        assertEquals("\"合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(85, 45)));
        assertEquals("\"合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(100, 45)));
        assertEquals("\"不合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(50, 50)));
        assertEquals("\"不合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(0, 90)));
        assertEquals("\"不合格\"", ScoreTable.groupScoreFrom2Tests(new IntPair(70, 59)));
    }

}