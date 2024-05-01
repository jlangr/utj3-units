package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.Location.Heading.*;

public class ALocation {
   // START:point
   @Test
   void increasesYCoordinateWhenMovingNorth() {
      var location = new Location(0, 0, North);

      location.move(42);

      // START_HIGHLIGHT
      assertEquals(new Point(0, 42), location.getPoint());
      // END_HIGHLIGHT
   }
   // END:point

   // START:newtests
   @Test
   // START_HIGHLIGHT
   void increasesXCoordinateWhenMovingEast() {
   // END_HIGHLIGHT
      var location = new Location(-2, 0, East);

      location.move(5);

      assertEquals(new Point(3, 0), location.getPoint());
   }

   @Test
      // START_HIGHLIGHT
   void decreasesYCoordinateWhenMovingSouth() {
      // END_HIGHLIGHT
      var location = new Location(-2, 5, South);

      location.move(9);

      assertEquals(new Point(-2, -4), location.getPoint());
   }

   @Test
   // START_HIGHLIGHT
   void decreasesXCoordinateWhenMovingWest() {
   // END_HIGHLIGHT
      var location = new Location(-2, 5, West);

      location.move(12);

      assertEquals(new Point(-14, 5), location.getPoint());
   }
// END:newtests
}
