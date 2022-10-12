package study;

import java.util.Arrays;
import java.util.Scanner;

public class NumerBaseballGame {


  public static String[] resultArr = new String[3];

  public static String[] answerArr = new String[3];

  public static void createRandom() {

    for(int i = 0; i < 3; i++){
      int randomVal = (int)(Math.random() * 9 ) + 1;
      while(Arrays.asList(resultArr).contains(String.valueOf(randomVal)))
        randomVal = (int)(Math.random() * 9 ) + 1;
      resultArr[i] = String.valueOf(randomVal);
    }

    Arrays.stream(resultArr).forEach(System.out::println);
  }

  public static String checkNumber(String num) {
    answerArr = num.split("");

    int strikeCnt = checkStrike(answerArr);
    int ballCnt = checkBall(answerArr);

    return printResult(strikeCnt, ballCnt);
  }

  private static String printResult(int strikeCnt, int ballCnt) {
    if(strikeCnt == 3) {
      return "OK";
    }
    if(strikeCnt > 0 && ballCnt > 0) {
      return ballCnt + "볼 " + strikeCnt + "스트라이크";
    }
    if(strikeCnt == 0 && ballCnt > 0) {
      return ballCnt + "볼";
    }
    if(strikeCnt > 0 && ballCnt == 0) {
      return strikeCnt + "스트라이크";
    }
    return "nothing";
  }

  private static int checkBall(String[] answerArr) {
    int cnt = 0;
    if(!answerArr[0].equals(resultArr[0]) && Arrays.asList(resultArr).contains(answerArr[0])) cnt++;
    if(!answerArr[1].equals(resultArr[1]) && Arrays.asList(resultArr).contains(answerArr[1])) cnt++;
    if(!answerArr[2].equals(resultArr[2]) && Arrays.asList(resultArr).contains(answerArr[2])) cnt++;
    return cnt;
  }

  private static int checkStrike(String[] answerArr) {
    int cnt = 0;
    if(answerArr[0].equals(resultArr[0]))cnt++;
    if(answerArr[1].equals(resultArr[1]))cnt++;
    if(answerArr[2].equals(resultArr[2]))cnt++;
    return cnt;
  }


  public static void main(String[] args) {

    createRandom();

    System.out.println("숫자를 입력해주세요.:");
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    String result = checkNumber(num);

    while(!result.equals("OK")) {
      System.out.println(result);
      System.out.println("숫자를 입력해주세요.:");
      num = sc.nextLine();
      result = checkNumber(num);
    }
    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
  }
}
