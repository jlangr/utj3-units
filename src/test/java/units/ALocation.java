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
      assertEquals(new Location(0, 42, North), location);
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

      assertEquals(new Location(3, 0, East), location);
   }

   @Test
      // START_HIGHLIGHT
   void decreasesYCoordinateWhenMovingSouth() {
      // END_HIGHLIGHT
      var location = new Location(-2, 5, South);

      location.move(9);

      assertEquals(new Location(-2, -4, South), location);
   }

   @Test
   // START_HIGHLIGHT
   void decreasesXCoordinateWhenMovingWest() {
   // END_HIGHLIGHT
      var location = new Location(-2, 5, West);

      location.move(12);

      assertEquals(new Location(-14, 5, West), location);
   }
// END:newtests
}
