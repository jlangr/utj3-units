//START:zero
package units;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static units.FixedLocation.Heading.East;
import static units.FixedLocation.Heading.North;

class ADestinationList {
   private DestinationList list;

   @BeforeEach
   void create() {
      list = new DestinationList();
   }

   @Test
   void isEmptyWhenCreated() {
      assertTrue(list.getLocations().isEmpty());
   }
//END:zero

   //START:many
   @Test
   void allowsAddingLocations() {
      list.add(new FixedLocation(1, 2, North));
      list.add(new FixedLocation(1, 3, East));

      assertEquals(
         List.of(
            new FixedLocation(1, 2, North),
            new FixedLocation(1, 3, East)),
         list.getLocations());
   }
   //END:many
// START:zero
}
// END:zero
