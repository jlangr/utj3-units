package craps;

import java.util.List;

public class InitialState extends BettorState {
   private static final List<Integer> craps = List.of(2, 3, 12);
   private static final List<Integer> winningRolls = List.of(7, 11);

   @Override
   public void resolve(Bettor bettor, Roll roll) {
      if (craps.contains(roll.total()))
         bettor.crapsOut();
      else if (winningRolls.contains(roll.total()))
         bettor.wins();
      else
         bettor.establishPoint(roll.total());
   }
}
