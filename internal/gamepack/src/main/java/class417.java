import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class417 extends class70 {
   boolean field2932 = true;
   boolean field2937;
   int[] field2934;
   public byte field2931;
   public byte field2935;
   public String field2936 = null;
   public List field2933;
   public long field2938;

   static {
      new BitSet(65536);
   }

   public class417(class366 var1) {
      this.method1910(var1);
   }

   public int[] method1909() {
      if (null == this.field2934) {
         String[] var2 = new String[this.field2933.size()];
         this.field2934 = new int[this.field2933.size()];

         for(int var3 = 0; var3 < this.field2933.size(); this.field2934[var3] = var3++) {
            var2[var3] = ((class367)this.field2933.get(var3)).field2656.method1596();
         }

         int[] var4 = this.field2934;
         class134.method491(var2, var4, 0, var2.length - 1);
      }

      return this.field2934;
   }

   void method1905(class367 var1) {
      this.field2933.add(var1);
      this.field2934 = null;
   }

   void method1906(int var1) {
      this.field2933.remove(var1);
      this.field2934 = null;
   }

   public int method1907() {
      return this.field2933.size();
   }

   public int method1908(String var1) {
      if (!this.field2932) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var3 = 0; var3 < this.field2933.size(); ++var3) {
            if (((class367)this.field2933.get(var3)).field2656.method1598().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      }
   }

   void method1910(class366 var1) {
      int var3 = var1.method1654();
      if (0 != (var3 & 1)) {
         this.field2937 = true;
      }

      if ((var3 & 2) != 0) {
         this.field2932 = true;
      }

      int var4 = 2;
      if ((var3 & 4) != 0) {
         var4 = var1.method1654();
      }

      super.field531 = var1.method1659();
      this.field2938 = var1.method1659();
      this.field2936 = var1.method1662();
      var1.method1661();
      this.field2935 = var1.method1655();
      this.field2931 = var1.method1655();
      int var5 = var1.method1703();
      if (var5 > 0) {
         this.field2933 = new ArrayList(var5);

         for(int var6 = 0; var6 < var5; ++var6) {
            class367 var7 = new class367();
            if (this.field2937) {
               var1.method1659();
            }

            if (this.field2932) {
               var7.field2656 = new class349(var1.method1662());
            }

            var7.field2657 = var1.method1655();
            var7.field2658 = var1.method1703();
            if (var4 >= 3) {
               var1.method1661();
            }

            this.field2933.add(var6, var7);
         }
      }

   }
}
