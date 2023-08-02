package units;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.FixedLocation.Heading.*;

public class AFixedLocation {
   @Test
   void increasesYCoordinateWhenMovingNorth() {
      assertEquals(new FixedLocation(0, 42, North),
         new FixedLocation(0, 0, North).move(42));
   }

   @Test
   void increasesXCoordinateWhenMovingEast() {
      assertEquals(new FixedLocation(3, 0, East),
         new FixedLocation(-2, 0, East).move(5));
   }

   @Test
   void decreasesYCoordinateWhenMovingSouth() {
      assertEquals(new FixedLocation(-2, -4, South),
         new FixedLocation(-2, 5, South).move(9));
   }

   @Test
   void decreasesXCoordinateWhenMovingWest() {
      assertEquals(new FixedLocation(-14, 5, West),
         new FixedLocation(-2, 5, West).move(12));
   }

   // START:moveMethod
   @Nested
   class DistanceBetween {
      @Test
      void is0When() {
      }
   }
   // END:moveMethod
}
