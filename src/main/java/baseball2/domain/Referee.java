package baseball2.domain;

import java.util.List;

public class Referee {

  public String compare(List<Integer> computers, List<Integer> player) {
    // 몇 개의 숫자가 같은지 알아낸 뒤
    // 스트라이크의 개수를 구해 뺀다.
    // 남은 수는 볼의 개수이다.
    Judgement judgement = new Judgement();
    int correctCount = judgement.correctCount(computers, player);

    int strike = 0;
    for(int placeIndex = 0; placeIndex < player.size(); placeIndex++) {
      if(judgement.hasPlace(computers, placeIndex, player.get(placeIndex))){
        strike++;
      }
    }

    int ball = correctCount - strike;
    return ball + "볼 " + strike + "스트라이크";
  }
}
