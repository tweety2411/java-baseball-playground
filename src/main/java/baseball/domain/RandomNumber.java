package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {

  // 랜덤 숫자 3개를 생성해서 리턴
  public List<Integer> generatorNumbers() {
    int number;
    List<Integer> computers = new ArrayList<>();
    while(computers.size() < 3) {
      number = new Random().nextInt(9) + 1;
      if(!computers.contains(number)) computers.add(number);
    }
    return computers;
  }
}
