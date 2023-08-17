package craps;

public class PointEstablishedState extends BettorState {
   @Override
   public void resolve(Bettor bettor, Roll roll) {
      if (roll.total() == 7)
         bettor.crapsOut();
      if (roll.total() == bettor.point())
         bettor.wins();
   }
}
