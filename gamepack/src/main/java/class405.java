import java.lang.management.GarbageCollectorMXBean;

public class class405 {
   static GarbageCollectorMXBean field3126;
   public int field3124 = -1;
   public int field3125 = -1;
   public int field3127 = -1;
   public int field3128 = -1;
   public int field3129 = -1;
   public int field3130 = -1;
   public int field3131 = -1;
   public int field3132 = -1;
   public int field3133 = -1;
   public int field3134 = -1;
   public int field3135 = -1;

   public void method1977(class298 var1) {
      byte[] var3 = var1.method1636(class505.field3967.field3966);
      class184 var4 = new class184(var3);

      while(true) {
         int var5 = var4.readUnsignedByte();
         if (var5 == 0) {
            return;
         }

         switch (var5) {
            case 1:
               var4.method1181();
               break;
            case 2:
               this.field3135 = var4.method1173();
               this.field3125 = var4.method1173();
               this.field3128 = var4.method1173();
               this.field3127 = var4.method1173();
               this.field3133 = var4.method1173();
               this.field3124 = var4.method1173();
               this.field3130 = var4.method1173();
               this.field3131 = var4.method1173();
               this.field3132 = var4.method1173();
               this.field3129 = var4.method1173();
               this.field3134 = var4.method1173();
         }
      }
   }
}
