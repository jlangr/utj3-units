package units;

import java.util.ArrayList;
import java.util.List;

import static units.FixedLocation.*;

public class DestinationList {
   private List<FixedLocation> locations = new ArrayList<>();

   public void add(FixedLocation location) {
      if (locations.contains(location))
         return;
      locations.add(location);
   }

   public void moveLocationsWithHeading(Heading heading, int x, int y) {
      this.locations = locations.stream()
         .map(location -> location.heading().equals(heading)
            ? new FixedLocation(x, y, heading)
            : location)
         .toList();
   }

   // START:moveMethod
   public void removeLocationsFurtherThan(int x, int y, int distance) {
      this.locations = locations.stream()
         // START_HIGHLIGHT
         .filter(location -> location.distanceBetween(x, y) < distance)
         // END_HIGHLIGHT
         .toList();
   }
   // END:moveMethod

   public List<FixedLocation> getLocations() {
      return locations;
   }
}
