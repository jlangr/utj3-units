package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.Location.Heading.*;

// START:newtests
public class ALocation {
   @Test
   void increasesYCoordinateWhenMovingNorth() {
      var location = new Location(0, 0, North);

      location.move(42);

      assertEquals(0, location.getX());
      assertEquals(42, location.getY());
   }

   @Test
   // START_HIGHLIGHT
   void increasesXCoordinateWhenMovingEast() {
   // END_HIGHLIGHT
      var location = new Location(-2, 0, East);

      location.move(5);

      assertEquals(3, location.getX());
      assertEquals(0, location.getY());
   }

   @Test
      // START_HIGHLIGHT
   void decreasesYCoordinateWhenMovingSouth() {
      // END_HIGHLIGHT
      var location = new Location(-2, 5, South);

      location.move(9);

      assertEquals(-2, location.getX());
      assertEquals(-4, location.getY());
   }

   @Test
   // START_HIGHLIGHT
   void decreasesXCoordinateWhenMovingWest() {
   // END_HIGHLIGHT
      var location = new Location(-2, 5, West);

      location.move(12);

      assertEquals(-14, location.getX());
      assertEquals(5, location.getY());
   }
}
// END:newtests
