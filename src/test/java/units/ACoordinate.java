package units;

// START:test
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static units.Heading.*;

class ACoordinate {
   @Test
   void increasesYWhenMovingNorth() {
      assertEquals(new Coordinate(0, 42),
         new Coordinate(0, 0).move(42, North));
   }

   @Test
   void increasesXWhenMovingEast() {
      assertEquals(new Coordinate(3, 0),
         new Coordinate(-2, 0).move(5, East));
   }

   @Test
   void decreasesYWhenMovingSouth() {
      assertEquals(new Coordinate(-2, -4),
         new Coordinate(-2, 5).move(9, South));
   }

   @Test
   void decreasesXWhenMovingWest() {
      assertEquals(new Coordinate(-14, 5),
         new Coordinate(-2, 5).move(12, West));
   }
}
// END:test
