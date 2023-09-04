import java.net.URL;

public class class539 {
   public static short[] field4264;
   static int field4260 = -1;
   static int field4261 = -2;
   final URL field4259;
   volatile byte[] field4263;
   volatile int field4262;

   class539(URL var1) {
      this.field4262 = field4260;
      this.field4259 = var1;
   }

   public boolean method2563() {
      return field4260 != this.field4262;
   }

   public byte[] method2565() {
      return this.field4263;
   }

   public String method2564() {
      return this.field4259.toString();
   }
}
