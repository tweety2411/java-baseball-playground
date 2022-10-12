package baseball.domain;

import java.util.List;

public class Balls {

  // 비교해서 결과 리턴
  public String compare(List<Integer> computers, List<Integer> userBalls) {
    if(isNothing(computers, userBalls)) return "낫싱";
    return findMatchNumber(computers, userBalls);
  }

  private String findMatchNumber(List<Integer> computers, List<Integer> userBalls) {
    int strike = 0;
    int ball = 0;
    for(int i = 0; i < userBalls.size(); i++) {
      if(isStrike(computers.get(i), userBalls.get(i))) {
        strike++;
        continue;
      }
      if(isBall(computers, userBalls.get(i))) ball++;
    }
    return printResult(ball, strike);
  }

  public boolean isStrike(int computer, int user) {
    return computer == user;
  }
  private boolean isBall(List<Integer> computers, int ball) {
    return computers.contains(ball);
  }

  public boolean isNothing(List<Integer> computers, List<Integer> userBalls){
    return userBalls.stream().noneMatch(computers::contains);
  }

  private String printResult(int ball, int strike) {
    StringBuilder sb = new StringBuilder();
    if(ball > 0) sb.append(ball).append("볼 ");
    if(strike > 0) sb.append(strike).append("스트라이크");
    return sb.toString().trim();
  }
}
