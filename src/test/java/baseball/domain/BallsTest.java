package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BallsTest {
  private Balls balls;
  private final List<Integer> computers = Arrays.asList(1, 2, 3);
  @BeforeEach
  void setUp(){
    balls = new Balls();
//    RandomNumber randomNumber = new RandomNumber();
//    computers = randomNumber.generatorNumbers();
  }

  @ParameterizedTest
  @CsvSource({"3,2,1,2볼 1스트라이크", "1,2,3,3스트라이크", "3,1,2,3볼"})
  void compare(int num1, int num2, int num3, String result) {
    String actual = balls.compare(computers, Arrays.asList(num1, num2, num3));
    assertThat(actual).isEqualTo(result);
  }

  @Test
  void isNothing() {
    boolean result = balls.isNothing(Arrays.asList(1,2,3), Arrays.asList(4, 5, 6));
    assertThat(result).isTrue();
  }
}