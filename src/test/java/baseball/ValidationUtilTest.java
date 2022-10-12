package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilTest {

  @Test
  @DisplayName("야구_숫자_1_9_검증")
  void invalid_baseball_num_1_9() {
    assertThat(ValidationUtils.validNo(9)).isTrue();
    assertThat(ValidationUtils.validNo(1)).isTrue();
    assertThat(ValidationUtils.validNo(0)).isFalse();
    assertThat(ValidationUtils.validNo(10)).isFalse();
  }
}
