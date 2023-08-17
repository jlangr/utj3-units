package craps;

public abstract class BettorState {
   public void throwDice(Bettor bettor) {
      var roll = Dice.get().roll(2);
      bettor.record(roll);
      resolve(bettor, roll);
   }

   abstract void resolve(Bettor bettor, Roll roll);
}
