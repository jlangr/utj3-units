package units;

import java.util.ArrayList;
import java.util.List;

public class DestinationList {
   private List<FixedLocation> locations = new ArrayList<>();

   // START:add
   public void add(FixedLocation location) {
      if (locations.contains(location))
         return;
      locations.add(location);
   }
   // END:add

   public void moveObjectsWithHeading(FixedLocation.Heading heading, int x, int y) {
      this.locations = locations.stream()
         .filter(location -> location.heading().equals(heading))
         .map(location -> new FixedLocation(x, y, heading))
         .toList();
   }

   public List<FixedLocation> getLocations() {
      return locations;
   }
}
