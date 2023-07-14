package units;

import java.util.Objects;

public class Location {
   enum Heading {North, East, South, West}

   private int x, y;
   private Heading heading;

   public Location(int x, int y, Heading heading) {
      this.x = x;
      this.y = y;
      this.heading = heading;
   }

   // START_HIGHLIGHT
   public void move(int distance) {
      switch (heading) {
         case North -> y = y + distance;
         case East -> x = x + distance;
         case South -> y = y - distance;
         case West -> x = x - distance;
      }
   }
   // END_HIGHLIGHT

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Location location = (Location) o;
      return x == location.x && y == location.y && heading == location.heading;
   }

   @Override
   public int hashCode() {
      return Objects.hash(x, y, heading);
   }

   @Override
   public String toString() {
      return "(" + x + ", " + y + ", => " + heading + ')';
   }
}
