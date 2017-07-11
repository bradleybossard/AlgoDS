import problems.easy.AddDigits;

public class TestAddDigits {

  public static void main(String[] args) {
    AddDigits digits = new AddDigits();
    int newDigit = digits.addDigits(223112);
    System.out.printf("%d\n", newDigit);
  }
}
