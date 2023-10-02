import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void winnerOfGameTest1(){
        String colors = "AAABABB";
        boolean actual = new Solution().winnerOfGame(colors);

        Assert.assertTrue(actual);
    }

    @Test
    public void winnerOfGameTest2(){
        String colors = "AA";
        boolean actual = new Solution().winnerOfGame(colors);

        Assert.assertFalse(actual);
    }

    @Test
    public void winnerOfGameTest3(){
        String colors = "ABBBBBBBAAA";
        boolean actual = new Solution().winnerOfGame(colors);

        Assert.assertFalse(actual);
    }
}
