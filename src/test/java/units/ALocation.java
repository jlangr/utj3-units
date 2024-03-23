package units;

// START:class
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.Location.Heading.North;

public class ALocation {
   @Test
   void increasesYCoordinateWhenMovingNorth() {
      var location = new Location(0, 0, North);

      location.move(42);

      assertEquals(0, location.getX());
      assertEquals(42, location.getY());
   }
}
// END:class
