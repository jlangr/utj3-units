package units;

// START:impl
public record FixedLocation(Coordinate coordinate, Heading heading) {
   public FixedLocation(int x, int y, Heading heading) {
      this(new Coordinate(x, y), heading);
   }

   public FixedLocation move(int distance) {
      return new FixedLocation(coordinate.move(distance, heading), heading);
   }
}
// END:impl
