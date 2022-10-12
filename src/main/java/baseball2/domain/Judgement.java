package baseball2.domain;

import java.util.List;

public class Judgement {

  public int correctCount(List<Integer> computers, List<Integer> player) {
    int result = 0;
    for(int i = 0; i < computers.size(); i++) {
      if(player.contains(computers.get(i))) result++;
    }
    return result;
  }

  public boolean hasPlace(List<Integer> computer, int placeNumber, int number) {
    return false;
  }
}
