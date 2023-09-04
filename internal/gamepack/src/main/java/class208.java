import java.net.URL;

public class class208 {
   public static short[] field1605;
   static int field1601 = -1;
   static int field1602 = -2;
   final URL field1600;
   volatile byte[] field1604;
   volatile int field1603;

   class208(URL var1) {
      this.field1603 = field1601;
      this.field1600 = var1;
   }

   public boolean method1086() {
      return field1601 != this.field1603;
   }

   public byte[] method1088() {
      return this.field1604;
   }

   public String method1087() {
      return this.field1600.toString();
   }
}
