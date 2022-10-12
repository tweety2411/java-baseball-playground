package baseball.domain;

import java.util.List;

public class Balls {

  // 비교해서 결과 리턴
  public String compare(List<Integer> computers, List<Integer> userBalls) {
    return "";
  }

  public boolean isStrike(List<Integer> computers, List<Integer> userBalls) {
    return computers.equals(userBalls);
  }

  public int ball(List<Integer> computers, List<Integer> userBalls) {
  return 0;
  }

  // 아무숫자도 맞는 게 없으면 nothing
  public boolean isNothing(List<Integer> computers, List<Integer> userBalls){
    return userBalls.stream().noneMatch(computers::contains);
  }
}
