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

      assertEquals(new Coordinate(0, 42), location.getCoordinate());
   }

   @Test
   // START_HIGHLIGHT
   void increasesXCoordinateWhenMovingEast() {
   // END_HIGHLIGHT
      var location = new Location(-2, 0, East);

      location.move(5);

      assertEquals(new Coordinate(3, 0), location.getCoordinate());
   }

   @Test
      // START_HIGHLIGHT
   void decreasesYCoordinateWhenMovingSouth() {
      // END_HIGHLIGHT
      var location = new Location(-2, 5, South);

      location.move(9);

      assertEquals(new Coordinate(-2, -4), location.getCoordinate());
   }

   @Test
   // START_HIGHLIGHT
   void decreasesXCoordinateWhenMovingWest() {
   // END_HIGHLIGHT
      var location = new Location(-2, 5, West);

      location.move(12);

      assertEquals(new Coordinate(-14, 5), location.getCoordinate());
   }
}
// END:newtests
