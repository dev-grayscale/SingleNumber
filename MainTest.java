import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void test() {
    Assertions.assertEquals(1, Main.singleNumber(new int[] { 2,2,1 }));
    Assertions.assertEquals(4, Main.singleNumber(new int[] { 4,1,2,1,2 }));
    Assertions.assertEquals(2, Main.singleNumber(new int[] { 2,3,3 }));
    Assertions.assertEquals(6, Main.singleNumber(new int[] { 7,7,1,1,2,2,3,3,4,4,5,5,6 }));
  }
}
