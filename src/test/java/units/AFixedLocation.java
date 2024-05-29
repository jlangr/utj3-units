package units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.Heading.*;

// START:test
public class AFixedLocation {
   public static final Coordinate ZERO_ZERO = new Coordinate(0, 0);

   @Test
   void changesCoordinateOnMove() {
      assertEquals(new Coordinate(0, 42),
         new FixedLocation(ZERO_ZERO, North).move(42).coordinate());
   }

   @Test
   void doesNotChangeHeadingOnMove() {
      assertEquals(North,
         new FixedLocation(ZERO_ZERO, North).move(42).heading());
   }
}
// END:test
