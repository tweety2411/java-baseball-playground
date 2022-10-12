package baseball2.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RefereeTest {
  private Referee referee;
  private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

  @ParameterizedTest
  @CsvSource({"1,2,3, 0볼 3스트라이크", "7,8,9,낫싱", "2,3,1, 3볼 0스트라이크", "1,3,2,2볼 1스트라이크"})
  void compare(int number1, int number2, int number3, String result) {
    String actual = referee.compare(ANSWER, Arrays.asList(number1, number2, number3));
    assertThat(actual).isEqualTo(result);
  }

  @BeforeEach
  void setUp() {
    referee = new Referee();
  }
  @Test
  void strike3() {
    String result = referee.compare(ANSWER, Arrays.asList(1, 2, 3));
    assertThat(result).isEqualTo("0볼 3스트라이크");
  }

  @Test
  void nothing() {
    String result = referee.compare(ANSWER, Arrays.asList(4, 5, 6));
    assertThat(result).isEqualTo("낫싱");
  }

  @Test
  void ball3() {
    String result = referee.compare(ANSWER, Arrays.asList(3, 1, 2));
    assertThat(result).isEqualTo("3볼 0스트라이크");
  }

  @Test
  void ball2_strike1() {
    String result = referee.compare(ANSWER, Arrays.asList(1, 3, 2));
    assertThat(result).isEqualTo("2볼 1스트라이크");
  }
}