package baseball2;

import baseball2.domain.NumberGenerator;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    NumberGenerator generator = new NumberGenerator();
    List<Integer> computers = generator.createRandomNumbers();
    System.out.println(computers);
  }
}
