package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class RandomNumberTest {

  @Test
  void numberGenerator() {
    RandomNumber randomNumber = new RandomNumber();
    List<Integer> numbers = randomNumber.generatorNumbers();
    System.out.println(numbers);

    assertThat(numbers.size()).isEqualTo(3);
  }
}