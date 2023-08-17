package craps;

public class Game {
   public static void main(String[] args) {
      var bettor = new Bettor();
      while (true) {
         bettor.throwDice();
         if (bettor.isTurnOver())
            break;
      }
      System.out.println("please pass the dice");
   }
}
