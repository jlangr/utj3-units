package units;

// START:impl
public record Coordinate(int x, int y) {
   public Coordinate move(int distance, Heading heading) {
      return switch (heading) {
         case North -> new Coordinate(x, y + distance);
         case East -> new Coordinate(x + distance, y);
         case South -> new Coordinate(x, y - distance);
         case West -> new Coordinate(x - distance, y);
      };
   }
}
// END:impl
