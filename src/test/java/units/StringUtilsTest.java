package units;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static units.StringUtils.capitalize;

public class StringUtilsTest {
   @Nested
   class Capitalize {
      // START:zero
      @Test
      void returnsEmptyStringWhenEmpty() {
         assertEquals("", capitalize(""));
      }
      // END:zero

      // START:rest
      @Test
      void returnsUppercasedLetterWhenSingleLetter() {
         assertEquals("A", capitalize("a"));
      }

      @Test
      void returnsCamelCasedWord() {
         assertEquals("Alpha", capitalize("alpha"));
      }
      // END:rest
   }
}
