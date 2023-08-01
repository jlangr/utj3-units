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

   // START:moveLocations
   public void moveLocationsMatchingHeading(FixedLocation.Heading heading, int x, int y) {
      this.locations = locations.stream()
         .map(location ->
            location.heading().equals(heading) ? new FixedLocation(x, y, heading) : location)
         .toList();
   }
   // END:moveLocations

   public List<FixedLocation> getLocations() {
      return locations;
   }
}
