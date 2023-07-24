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

   static final FixedLocation ORIGIN = new FixedLocation(0, 0, East);
   static final FixedLocation NORTHEAST = new FixedLocation(3, 3, North);

   @Test
   void allowsAddingLocations() {
      list.add(ORIGIN);
      list.add(NORTHEAST);

      var locations = list.getLocations();

      assertEquals(List.of(ORIGIN, NORTHEAST), locations);
   }

   //START:noDuplicates
   @Test
   void doesNotAddLocationWhenAlreadyContained() {
      list.add(ORIGIN);
      list.add(NORTHEAST);
      list.add(ORIGIN);

      var locations = list.getLocations();

      assertEquals(List.of(ORIGIN, NORTHEAST), locations);
   }
   //END:noDuplicates
}
