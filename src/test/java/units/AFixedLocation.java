package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.FixedLocation.Heading.*;

// START:fixedLocation
public class AFixedLocation {
   @Test
   void increasesYCoordinateWhenMovingNorth() {
      var location = new FixedLocation(0, 0, North);

      var newLocation = location.move(42);

      assertEquals(new FixedLocation(0, 42, North), newLocation);
   }

   @Test
   void increasesXCoordinateWhenMovingEast() {
      var location = new FixedLocation(-2, 0, East);

      var newLocation = location.move(5);

      assertEquals(new FixedLocation(3, 0, East), newLocation);
   }

   @Test
   void decreasesYCoordinateWhenMovingSouth() {
      var location = new FixedLocation(-2, 5, South);

      var newLocation = location.move(9);

      assertEquals(new FixedLocation(-2, -4, South), newLocation);
   }

   @Test
   void decreasesXCoordinateWhenMovingWest() {
      var location = new FixedLocation(-2, 5, West);

      var newLocation = location.move(12);

      assertEquals(new FixedLocation(-14, 5, West),newLocation);
   }
}
// END:fixedLocation
