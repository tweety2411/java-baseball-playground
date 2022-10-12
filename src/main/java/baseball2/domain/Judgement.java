package baseball2.domain;

import java.util.List;

public class Judgement {

  public int correctCount(List<Integer> computers, List<Integer> player) {
    int result = 0;
    for (Integer computer : computers) {
      if (player.contains(computer))
        result++;
    }
    return result;
  }

  public boolean hasPlace(List<Integer> computer, int placeIndex, int number) {
    return computer.get(placeIndex) == number;
  }
}
