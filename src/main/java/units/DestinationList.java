package units;

// START:class
import java.util.ArrayList;
import java.util.List;

public class DestinationList {
   private List<FixedLocation> locations = new ArrayList<>();

   public void add(FixedLocation location) {
      // START:add
      locations.add(location);
      // END:add
   }

   public List<FixedLocation> getLocations() {
      return locations;
   }
}
// END:class
