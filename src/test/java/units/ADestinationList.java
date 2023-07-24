package units;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.Location.Heading.East;
import static units.Location.Heading.North;

class ADestinationList {
   private DestinationList list;

   @BeforeEach
   void create() {
      list = new DestinationList();
   }

   @Test
   void allowsAddingLocation() {
      list.add(new Location(1, 2, North));
      list.add(new Location(1, 3, East));

      var locations = list.getLocations();

      assertEquals(List.of(
            new Location(1, 2, North),
            new Location(1, 3, East)),
         locations);
   }
}
