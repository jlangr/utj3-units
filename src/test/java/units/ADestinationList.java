package units;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static units.FixedLocation.Heading.East;
import static units.FixedLocation.Heading.North;

class ADestinationList {
   static final FixedLocation ORIGIN = new FixedLocation(0, 0, East);
   static final FixedLocation NORTHEAST = new FixedLocation(3, 3, North);
   private DestinationList list;

   @BeforeEach
   void create() {
      list = new DestinationList();
   }

   @Test
   void isEmptyWhenCreated() {
      assertTrue(list.getLocations().isEmpty());
   }

   // START:add
   @Test
   void allowsAddingLocations() {
      list.add(ORIGIN);
      list.add(NORTHEAST);

      assertEquals(List.of(ORIGIN, NORTHEAST), list.getLocations());
   }
   // END:add

   //START:noDuplicates
   @Test
   void doesNotAddLocationWhenAlreadyContained() {
      list.add(ORIGIN);
      list.add(NORTHEAST);

      list.add(ORIGIN);

      assertEquals(List.of(ORIGIN, NORTHEAST), list.getLocations());
   }
   //END:noDuplicates
}
