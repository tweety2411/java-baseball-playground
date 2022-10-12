package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BallsTest {

  @Test
  void isStrike() {
    Balls balls = new Balls();
    boolean result = balls.isStrike(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
    assertThat(result).isTrue();
  }

  @Test
  void isNothing() {
    Balls balls = new Balls();
    boolean result = balls.isNothing(Arrays.asList(1,2,3), Arrays.asList(4, 5, 6));
    assertThat(result).isTrue();
  }
}