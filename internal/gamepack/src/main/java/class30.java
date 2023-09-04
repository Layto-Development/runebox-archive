import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class class30 extends class331 {
   byte[] field570;
   int field569;
   AudioFormat field567;
   SourceDataLine field568;

   class30() {
   }

   protected void method1760() {
      this.field567 = new AudioFormat((float)class331.field2655, 16, class331.field2670 ? 2 : 1, true, false);
      this.field570 = new byte[256 << (class331.field2670 ? 2 : 1)];
   }

   protected void method1754(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var3 = new DataLine.Info(SourceDataLine.class, this.field567, var1 << (class331.field2670 ? 2 : 1));
         this.field568 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field568.open();
         this.field568.start();
         this.field569 = var1;
      } catch (LineUnavailableException var4) {
         if (class335.method1772(var1) != 1) {
            this.method1754(class349.method1808(var1));
         } else {
            this.field568 = null;
            throw var4;
         }
      }
   }

   protected int method1755() {
      return this.field569 - (this.field568.available() >> (class331.field2670 ? 2 : 1));
   }

   protected void method1748() {
      int var1 = 256;
      if (class331.field2670) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field2660[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field570[var2 * 2] = (byte)(var3 >> 8);
         this.field570[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field568.write(this.field570, 0, var1 << 1);
   }

   protected void method1756() {
      if (null != this.field568) {
         this.field568.close();
         this.field568 = null;
      }

   }

   protected void method1757() {
      this.field568.flush();
   }
}
