package units;

public class StringUtils {
   // START:capitalize
   static String capitalize(String word) {
      var head = word.substring(0, 1);
      var tail = word.substring(1);
      return head.toUpperCase() + tail.toLowerCase();
   }
   // END:capitalize
}
