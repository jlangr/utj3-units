package craps;

import java.util.Random;
import java.util.stream.IntStream;

public class Dice {
   public static final int DIE_SIDES = 6;

   private static final Dice instance = new Dice();
   public static final Dice get() {
      return instance;
   }

   private Random random = new Random();

   // START_HIGHLIGHT
   public Roll roll(int numberOfDice) {
   // END_HIGHLIGHT
      var dieRolls = IntStream.range(0, numberOfDice)
         .map(n -> random.nextInt(DIE_SIDES) + 1)
         .toArray();
      return new Roll(dieRolls);
   }
}
