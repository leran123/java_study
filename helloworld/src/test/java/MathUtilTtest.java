import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilTtest {
    @Test
    public void testAdd() {
        int sum = 3;
        assertEquals(sum, MathUtil.add(1, 2));
    }
    @Test
    public void testmulti() {
        int value = 10;
        assertEquals(value, MathUtil.multi(2, 5));
    }
}
