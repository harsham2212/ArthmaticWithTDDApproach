import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ArithmaticTest {
    @Test
    public void add() {
        Arithmatic arithmatic = new Arithmatic();
        int sum = arithmatic.add(7, 8);
        assertEquals(15, sum);
    }

    @Test
    public void ProvideTwoNumber_WhenAdded_TestShouldPass() {
        Arithmatic arithmatic = new Arithmatic();
        int sum = arithmatic.add(8, 7);
        assertNotEquals(11, sum);
    }

    @Test
    public void ProvideOption_WhenSelectedSum_ShouldAddTwoValues() {
        Arithmatic arithmatic = new Arithmatic();
        int result = arithmatic.operationSupportProvider(2, 5, 6);
        assertEquals(-1, result);
    }

    @Test
    public void AddBetween_numbers() {
        Arithmatic arithmatic = new Arithmatic();
        double result = arithmatic.addNoBetweenRange(1, 2, 6);
        assertEquals(20, result);

    }

    @Test
    public void AddBetween_numbers1() {
        Arithmatic arithmatic = new Arithmatic();
        double result = arithmatic.addNoBetweenRange(2, 3, 7);
        assertEquals(-25, result);

    }

    @Test
    public void AddBetween_numbers2() {
        Arithmatic arithmatic = new Arithmatic();
        double result = arithmatic.addNoBetweenRange(3, 3, 7);
        assertEquals(2520, result);
    }
    @Test
    public void AddBetween_numbers3() {
        Arithmatic arithmatic = new Arithmatic();
        double result = arithmatic.addNoBetweenRange(4, 3, 7);
        assertEquals(0.016666666666666666, result);
    }
}
