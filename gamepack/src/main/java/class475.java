import java.util.Iterator;
import java.util.LinkedList;

public class class475 {
   static int field3649;
   boolean field3647 = false;
   class89 field3642 = null;
   int field3637 = 0;
   int field3639 = 0;
   int field3641 = -1;
   int field3643 = Integer.MAX_VALUE;
   int field3644 = -1;
   int field3645 = Integer.MAX_VALUE;
   int field3646 = -1;
   String field3638;
   String field3640;
   LinkedList field3648;

   public void method2292(class184 var1, int var2) {
      this.field3646 = var2;
      this.field3638 = var1.readString();
      this.field3640 = var1.readString();
      this.field3642 = new class89(var1.readInt());
      this.field3644 = var1.readInt();
      var1.readUnsignedByte();
      this.field3647 = var1.readUnsignedByte() == 1;
      this.field3641 = var1.readUnsignedByte();
      int var4 = var1.readUnsignedByte();
      this.field3648 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field3648.add(this.method2308(var1));
      }

      this.method2291();
   }

   class39 method2308(class184 var1) {
      int var3 = var1.readUnsignedByte();
      class521[] var4 = new class521[]{class521.field4087, class521.field4089, class521.field4088, class521.field4094};
      class521 var5 = (class521)class341.method1788(var4, var3);
      Object var6 = null;
      switch (var5.field4090) {
         case 0:
            var6 = new class114();
            break;
         case 1:
            var6 = new class276();
            break;
         case 2:
            var6 = new class366();
            break;
         case 3:
            var6 = new class92();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((class39)var6).method568(var1);
      return (class39)var6;
   }

   public boolean method2293(int var1, int var2, int var3) {
      Iterator var5 = this.field3648.iterator();

      class39 var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (class39)var5.next();
      } while(!var6.method566(var1, var2, var3));

      return true;
   }

   public boolean method2296(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field3643 && var4 <= this.field3637) {
         if (var5 >= this.field3645 && var5 <= this.field3639) {
            Iterator var6 = this.field3648.iterator();

            class39 var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (class39)var6.next();
            } while(!var7.method567(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method2306(int var1, int var2, int var3) {
      Iterator var5 = this.field3648.iterator();

      class39 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class39)var5.next();
      } while(!var6.method566(var1, var2, var3));

      return var6.method569(var1, var2, var3);
   }

   public class89 method2294(int var1, int var2) {
      Iterator var4 = this.field3648.iterator();

      class39 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class39)var4.next();
      } while(!var5.method567(var1, var2));

      return var5.method570(var1, var2);
   }

   void method2291() {
      Iterator var2 = this.field3648.iterator();

      while(var2.hasNext()) {
         class39 var3 = (class39)var2.next();
         var3.method571(this);
      }

   }

   public int method2302() {
      return this.field3646;
   }

   public boolean method2295() {
      return this.field3647;
   }

   public String method2301() {
      return this.field3638;
   }

   public String method2297() {
      return this.field3640;
   }

   int method2298() {
      return this.field3644;
   }

   public int method2299() {
      return this.field3641;
   }

   public int method2300() {
      return this.field3643;
   }

   public int method2311() {
      return this.field3637;
   }

   public int method2309() {
      return this.field3645;
   }

   public int method2307() {
      return this.field3639;
   }

   public int method2310() {
      return this.field3642.field1273;
   }

   public int method2303() {
      return this.field3642.field1274;
   }

   public int method2304() {
      return this.field3642.field1275;
   }

   public class89 method2305() {
      return new class89(this.field3642);
   }
}
