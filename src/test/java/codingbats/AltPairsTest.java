package codingbats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {

  private static Object[] testCases() {
    return new Object[]{
        new Object[]{"kitten", "kien"},
        new Object[]{"Chocolate", "Chole"},
        new Object[]{"CodingHorror", "Congrr"},
        new Object[]{"",""},
        new Object[]{"yak","ya"},
        new Object[]{"y","y"}
    };
  }

  @ParameterizedTest
  @MethodSource("testCases")
  void altPairsTest(String input, String expected) {
    AltPairs ap = new AltPairs();
    assertEquals(expected, ap.altPairs(input));
  }
}