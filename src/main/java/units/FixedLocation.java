package units;

// START:fixedLocation
public record FixedLocation(int x, int y, Heading heading) {
   enum Heading {North, East, South, West}

   public FixedLocation move(int distance) {
      return switch (heading) {
         case North -> new FixedLocation(x, y + distance, heading);
         case East -> new FixedLocation(x + distance, y, heading);
         case South -> new FixedLocation(x, y - distance, heading);
         case West -> new FixedLocation(x - distance, y, heading);
      };
   }
}
// END:fixedLocation
