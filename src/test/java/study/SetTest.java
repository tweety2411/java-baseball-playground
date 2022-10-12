package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
  private Set<Integer> numbers;

  @BeforeEach
  void setUp() {
    numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  // Test Case 구현

  @Test
  @DisplayName("Set Size 구하기")
  void size() {
    int size = numbers.size();
    assertThat(size).isEqualTo(3);
  }

  @ParameterizedTest
  @ValueSource(ints = {1,2,3})
  @DisplayName("중복 코드 제거 - 내부값 존재하는지 확인")
  void contains(int nums) {
    assertThat(numbers).contains(nums);
  }


  @ParameterizedTest
  @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
  @DisplayName("메소드 결과값이 다른 경우 테스트")
  void csvSourceTest(int input, boolean excepted) {
    boolean result = numbers.contains(input);
    assertThat(result).isEqualTo(excepted);
  }

}
