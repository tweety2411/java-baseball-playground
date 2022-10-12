package study;

import org.junit.platform.commons.util.StringUtils;

public class StringCalculator {

  public int calcultate(String value) {
    // 공백이나 null이 들어오면 계산할 수 없다.
    if(StringUtils.isBlank(value))
      throw new RuntimeException();
    return calculateWithOperation(splitValues(value));
  }

  // 문자열이 들어오면 공백을 기준으로 쪼갠다.
  String[] splitValues(String value) {
    return value.split(" ");
  }
  private int calculateWithOperation(String[] values) {
    int result = toInt(values[0]);
    for(int i = 1; i < values.length; i = i+2) {
      // 숫자와 연산자를 이용해서 계산함수를 호출
        result = cal(result, toInt(values[i + 1]), values[i]);
    }
    return result;
  }

  // 문자열을 숫자로 변환해주는 함수
  int toInt(String str) {
    return Integer.parseInt(str);
  }

  // 계산함수
  int cal(int x, int y, String oper) {
    switch (oper) {
      case "+":
        return add(x, y);
      case "-":
        return subtract(x, y);
      case "*":
        return multiply(x, y);
      case "/":
        return divide(x, y);
    }
    throw new RuntimeException();
  }

  int add(int a, int b) {
    return a + b;
  }

  int subtract(int a, int b) {
    return a - b;
  }

  int divide(int a, int b) {
    try {
      return a / b;
    } catch (Exception e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    return 0;
  }

  int multiply(int a, int b) {
    return a * b;
  }
}
