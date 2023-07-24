package units;

import java.util.ArrayList;
import java.util.List;

public class DestinationList {
   private final List<FixedLocation> locations = new ArrayList<>();

   // START:add
   public void add(FixedLocation location) {
      if (locations.contains(location))
         return;
      locations.add(location);
   }
   // END:add

   public List<FixedLocation> getLocations() {
      return locations;
   }
}
