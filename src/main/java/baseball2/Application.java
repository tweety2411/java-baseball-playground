package baseball2;

import baseball2.domain.Judgement;
import baseball2.domain.Referee;
import java.util.Arrays;

public class Application {

  public static void main(String[] args) {
    Referee referee = new Referee();
    String result = referee.compare(Arrays.asList(7, 8, 9), Arrays.asList(1, 2, 3));
    System.out.println(result);
  }
}
