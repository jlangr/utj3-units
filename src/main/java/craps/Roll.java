package craps;

import java.util.Arrays;

public record Roll(int... diePip) {
   public int total() {
      return Arrays.stream(diePip).sum();
   }
}
