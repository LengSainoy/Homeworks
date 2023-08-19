package codingbats;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class TwoAsOneTest {

  private static Object[] trueValues() {
    return new Object[]{
        new Object[]{3, 1, 2},
        new Object[]{2, 3, 1},
        new Object[]{5, 3, -2},
    };
  }

  @ParameterizedTest
  @MethodSource("trueValues")
  void shouldBeTrue(int a, int b, int c) {
    TwoAsOne l1 = new TwoAsOne();
    boolean result = l1.twoAsOne(a, b, c);
    Assertions.assertThat(result).isTrue();
  }

  private static Object[] falseValues() {
    return new Object[]{
        new Object[]{3, 2, 2},
        new Object[]{5, 3, -3}
    };
  }

  @ParameterizedTest
  @MethodSource("falseValues")
  void shouldBeFalse(int a, int b, int c) {
    TwoAsOne l1 = new TwoAsOne();
    boolean result = l1.twoAsOne(a, b, c);
    Assertions.assertThat(result).isFalse();
  }
}