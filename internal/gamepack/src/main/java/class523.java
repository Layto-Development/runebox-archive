import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class class523 extends class62 {
   byte[] field4165;
   int field4164;
   AudioFormat field4162;
   SourceDataLine field4163;

   class523() {
   }

   protected void method277() {
      this.field4162 = new AudioFormat((float)class62.field481, 16, class62.field496 ? 2 : 1, true, false);
      this.field4165 = new byte[256 << (class62.field496 ? 2 : 1)];
   }

   protected void method271(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var3 = new DataLine.Info(SourceDataLine.class, this.field4162, var1 << (class62.field496 ? 2 : 1));
         this.field4163 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field4163.open();
         this.field4163.start();
         this.field4164 = var1;
      } catch (LineUnavailableException var4) {
         if (class53.method225(var1) != 1) {
            this.method271(class32.method143(var1));
         } else {
            this.field4163 = null;
            throw var4;
         }
      }
   }

   protected int method272() {
      return this.field4164 - (this.field4163.available() >> (class62.field496 ? 2 : 1));
   }

   protected void method265() {
      int var1 = 256;
      if (class62.field496) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field486[var2];
         if (0 != (var3 + 8388608 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field4165[var2 * 2] = (byte)(var3 >> 8);
         this.field4165[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field4163.write(this.field4165, 0, var1 << 1);
   }

   protected void method273() {
      if (null != this.field4163) {
         this.field4163.close();
         this.field4163 = null;
      }

   }

   protected void method274() {
      this.field4163.flush();
   }
}
