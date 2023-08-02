package units;

import java.util.ArrayList;
import java.util.List;

import static units.FixedLocation.*;

public class DestinationList {
   private List<FixedLocation> locations = new ArrayList<>();

   // START:add
   public void add(FixedLocation location) {
      if (locations.contains(location))
         return;
      locations.add(location);
   }
   // END:add

   // START:moveLocations
   public void moveLocationsWithHeading(Heading heading, int x, int y) {
      this.locations = locations.stream()
         .map(location -> location.heading().equals(heading)
            ? new FixedLocation(x, y, heading)
            : location)
         .toList();
   }
   // END:moveLocations

   // START:removeLocations
   public void removeLocationsFurtherThan(int x, int y, int distance) {
      this.locations = locations.stream()
         .filter(location -> distanceBetween(location, x, y) < distance)
         .toList();
   }

   private double distanceBetween(FixedLocation point, int x, int y) {
      return Math.sqrt(
         Math.pow(x - point.x(), 2) + Math.pow(y - point.y(), 2));
   }
   // END:removeLocations

   public List<FixedLocation> getLocations() {
      return locations;
   }
}
