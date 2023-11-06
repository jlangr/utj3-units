package units;

import java.util.Arrays;

class CircularBuffer {
   public static final int CAPACITY = 5;
   private int start = 2;
   private int end = 2;
   private char[] buffer = new char[CAPACITY];

   public boolean isEmpty() {
      return size() == 0;
   }

   public void write(char newC) {
      buffer[end] = newC;
      end = next(end);
   }

   private int next(int index) {
      return (index + 1) % CAPACITY;
   }

   public int size() {
      return end - start;
   }

   public String toString() {
      return Arrays.toString(buffer) + " start: " + start + " end: " + end;
   }

   public char read() {
      if (size() == 0)
         throw new EmptyBufferException();

      var result = buffer[start];
      start = next(start);
      return result;
   }
}