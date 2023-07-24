package units;

import java.util.ArrayList;
import java.util.List;

public class DestinationList {
   private final List<Location> locations = new ArrayList<>();

   public void add(Location location) {
      locations.add(location);
   }

   public List<Location> getLocations() {
      return locations;
   }
}
