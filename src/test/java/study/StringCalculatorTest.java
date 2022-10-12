package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

  StringCalculator stringCalculator;

  @BeforeEach
  public void setUp() {
    stringCalculator = new StringCalculator();
  }


  @Test
  void test(){
    int result = stringCalculator.calcultate("2 + 3 * 4 / 2");
    assertThat(result).isEqualTo(10);
  }

  @Test
  void testBlank() {
    assertThatThrownBy(()-> {
      stringCalculator.calcultate(" ");
    }).isInstanceOf(RuntimeException.class);
  }
}
