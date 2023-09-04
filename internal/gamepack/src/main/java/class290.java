import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class290 extends class55 {
   boolean field2456 = true;
   boolean field2461;
   int[] field2458;
   public byte field2455;
   public byte field2459;
   public String field2460 = null;
   public List field2457;
   public long field2462;

   static {
      new BitSet(65536);
   }

   public class290(class184 var1) {
      this.method1607(var1);
   }

   public int[] method1606() {
      if (null == this.field2458) {
         String[] var2 = new String[this.field2457.size()];
         this.field2458 = new int[this.field2457.size()];

         for(int var3 = 0; var3 < this.field2457.size(); this.field2458[var3] = var3++) {
            var2[var3] = ((class219)this.field2457.get(var3)).field2036.method1456();
         }

         int[] var4 = this.field2458;
         class379.method1886(var2, var4, 0, var2.length - 1);
      }

      return this.field2458;
   }

   void method1602(class219 var1) {
      this.field2457.add(var1);
      this.field2458 = null;
   }

   void method1603(int var1) {
      this.field2457.remove(var1);
      this.field2458 = null;
   }

   public int method1604() {
      return this.field2457.size();
   }

   public int method1605(String var1) {
      if (!this.field2456) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var3 = 0; var3 < this.field2457.size(); ++var3) {
            if (((class219)this.field2457.get(var3)).field2036.method1458().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      }
   }

   void method1607(class184 var1) {
      int var3 = var1.method1125();
      if ((var3 & 1) != 0) {
         this.field2461 = true;
      }

      if ((var3 & 2) != 0) {
         this.field2456 = true;
      }

      int var4 = 2;
      if ((var3 & 4) != 0) {
         var4 = var1.method1125();
      }

      super.field1078 = var1.method1130();
      this.field2462 = var1.method1130();
      this.field2460 = var1.method1133();
      var1.method1132();
      this.field2459 = var1.method1126();
      this.field2455 = var1.method1126();
      int var5 = var1.method1174();
      if (var5 > 0) {
         this.field2457 = new ArrayList(var5);

         for(int var6 = 0; var6 < var5; ++var6) {
            class219 var7 = new class219();
            if (this.field2461) {
               var1.method1130();
            }

            if (this.field2456) {
               var7.field2036 = new class251(var1.method1133());
            }

            var7.field2037 = var1.method1126();
            var7.field2038 = var1.method1174();
            if (var4 >= 3) {
               var1.method1132();
            }

            this.field2457.add(var6, var7);
         }
      }

   }
}
