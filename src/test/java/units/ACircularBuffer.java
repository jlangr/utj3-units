package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ACircularBuffer {
   CircularBuffer buffer = new CircularBuffer();

   @Test
   void isEmptyWhenCreated() {
      assertTrue(buffer.isEmpty());
   }

   @Test
   void hasSize0WhenCreated() {
      assertEquals(0, buffer.size());
   }

   @Test
   void isNotEmptyAfterWrite() {
      buffer.write('A');
      assertFalse(buffer.isEmpty());
   }

   @Test
   void isEmptyAfterReadLastElement() {
      buffer.write('A');
      buffer.read();
      assertTrue(buffer.isEmpty());
   }

   @Test
   void hasSize1AfterWrite() {
      buffer.write('A');
      assertEquals(1, buffer.size());
   }

   @Test
   void sizeIncrementsOnWrite() {
      buffer.write('A');
      buffer.write('B');
      assertEquals(2, buffer.size());
   }

   @Test
   void canBeRead() {
      buffer.write('A');
      assertEquals('A', buffer.read());
   }

   @Test
   void throwsOnReadEmptyBuffer() {
      buffer.write('C');
      buffer.read();
      assertThrows(EmptyBufferException.class, ()-> buffer.read());

   }

   @Test
   void reducesSizeOnRead() {
      buffer.write('A');
      buffer.read();
      assertEquals(0, buffer.size());
   }

   @Test
   void demonstratesFIFO() {
      buffer.write('A');
      buffer.write('B');
      var oldest = buffer.read();
      assertEquals('A', oldest);
   }

   @Test
   void worksWith3() {
      buffer.write('A');
      buffer.write('B');
      buffer.write('C');
      assertEquals('A', buffer.read());
      assertEquals('B', buffer.read());
      assertEquals('C', buffer.read());
   }

   @Test
   void handlesOverrun() {
      buffer.write('A');
      buffer.write('B');
      buffer.write('C');
      buffer.write('D');
      assertEquals('A', buffer.read());
      assertEquals('B', buffer.read());
      assertEquals('C', buffer.read());
      assertEquals('D', buffer.read());
   }
}
