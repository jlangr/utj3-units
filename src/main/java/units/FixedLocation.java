package units;

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

   // START:moveMethod
   double distanceBetween(int x, int y) {
      return Math.sqrt(Math.pow(x - x(), 2) + Math.pow(y - y(), 2));
   }
   // END:moveMethod
}
