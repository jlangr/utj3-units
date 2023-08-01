package units;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

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

   //START:moveLocations
   @Nested
   class MoveLocations {
      @Test
      void updatesLocationsWithMatchingHeadingToNewCoordinates() {
         list.add(new FixedLocation(0, 0, East));
         list.add(new FixedLocation(1, 1, North));

         list.moveLocationsMatchingHeading(East, 2, 3);

         assertEquals(List.of(
               new FixedLocation(2, 3, East),
               new FixedLocation(1, 1, North)),
            list.getLocations());
      }
   }
   //END:moveLocations
}
