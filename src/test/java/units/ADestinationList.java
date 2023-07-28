//START:zero
package units;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
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
      var locationOne = new FixedLocation(1, 2, North);
      var locationTwo = new FixedLocation(1, 3, East);
      list.add(locationOne);
      list.add(locationTwo);

      assertEquals(List.of(locationOne, locationTwo), list.getLocations());
   }
   //END:many
// START:zero
}
// END:zero
