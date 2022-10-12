package study;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatIOException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.in;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] arr = "1,2".split(",");
        assertThat(arr).containsExactly("1","2");

    }

    @Test
    void split2() {
        String[] arr = "1".split(",");
        assertThat(arr).contains("1");
    }

    @Test
    void subString() {
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }


    @Test
    @DisplayName("특정 문자 가져오기")
    void charAt() {
        String str = "abc";
        char a = str.charAt(0);
        assertThat(a).isEqualTo('a');
    }

    @Test
    @DisplayName("예외 발생 테스트")
    void charAtException() {

        String str = "abc";
        int index = 10;

        assertThatThrownBy(()->{
          str.charAt(index);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range: %d", index);

    }
}
