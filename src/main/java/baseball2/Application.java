package baseball2;

import baseball2.domain.Judgement;
import java.util.Arrays;

public class Application {

  public static void main(String[] args) {
    //    NumberGenerator generator = new NumberGenerator();
    //    List<Integer> computers = generator.createRandomNumbers();
    //    System.out.println(computers);

    Judgement judgement = new Judgement();
//    int count = judgement.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
//    System.out.println(count);

    boolean placeResult = judgement.hasPlace(Arrays.asList(1, 2, 3), 0, 1);
    System.out.println(placeResult);
  }
}
