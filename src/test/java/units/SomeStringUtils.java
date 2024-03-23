package units;

// START:zero
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.StringUtils.capitalize;

public class SomeStringUtils {
   @Nested
   class Capitalize {
      @Test
      void returnsEmptyStringWhenEmpty() {
         assertEquals("", capitalize(""));
      }
      // END:zero

      // START:one
      @Test
      void uppercasesSingleLetter() {
         assertEquals("A", capitalize("a"));
      }
      // END:one

      // START:many
      @Test
      void uppercasesFirstLetterOfLowercaseWord() {
         assertEquals("Alpha", capitalize("alpha"));
      }
      // END:many

      // START:variant
      @Test
      void lowercasesRemainderOfLetters() {
         assertEquals("Omega", capitalize("OMEGA"));
      }
      // END:variant
      // START:zero
   }
}
// END:zero
