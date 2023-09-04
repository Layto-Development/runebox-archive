import java.util.Iterator;
import java.util.LinkedList;

public class class456 {
   static int field3591;
   boolean field3589 = false;
   class113 field3584 = null;
   int field3579 = 0;
   int field3581 = 0;
   int field3583 = -1;
   int field3585 = Integer.MAX_VALUE;
   int field3586 = -1;
   int field3587 = Integer.MAX_VALUE;
   int field3588 = -1;
   String field3580;
   String field3582;
   LinkedList field3590;

   public void method2117(class366 var1, int var2) {
      this.field3588 = var2;
      this.field3580 = var1.method1662();
      this.field3582 = var1.method1662();
      this.field3584 = new class113(var1.method1658());
      this.field3586 = var1.method1658();
      var1.method1654();
      this.field3589 = var1.method1654() == 1;
      this.field3583 = var1.method1654();
      int var4 = var1.method1654();
      this.field3590 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field3590.add(this.method2133(var1));
      }

      this.method2116();
   }

   class51 method2133(class366 var1) {
      int var3 = var1.method1654();
      class376[] var4 = new class376[]{class376.field2681, class376.field2683, class376.field2682, class376.field2688};
      class376 var5 = (class376)class1.method2(var4, var3);
      Object var6 = null;
      switch (var5.field2684) {
         case 0:
            var6 = new class46();
            break;
         case 1:
            var6 = new class190();
            break;
         case 2:
            var6 = new class487();
            break;
         case 3:
            var6 = new class98();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((class51)var6).method220(var1);
      return (class51)var6;
   }

   public boolean method2118(int var1, int var2, int var3) {
      Iterator var5 = this.field3590.iterator();

      class51 var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (class51)var5.next();
      } while(!var6.method218(var1, var2, var3));

      return true;
   }

   public boolean method2121(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field3585 && var4 <= this.field3579) {
         if (var5 >= this.field3587 && var5 <= this.field3581) {
            Iterator var6 = this.field3590.iterator();

            class51 var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (class51)var6.next();
            } while(!var7.method219(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method2131(int var1, int var2, int var3) {
      Iterator var5 = this.field3590.iterator();

      class51 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class51)var5.next();
      } while(!var6.method218(var1, var2, var3));

      return var6.method221(var1, var2, var3);
   }

   public class113 method2119(int var1, int var2) {
      Iterator var4 = this.field3590.iterator();

      class51 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class51)var4.next();
      } while(!var5.method219(var1, var2));

      return var5.method222(var1, var2);
   }

   void method2116() {
      Iterator var2 = this.field3590.iterator();

      while(var2.hasNext()) {
         class51 var3 = (class51)var2.next();
         var3.method223(this);
      }

   }

   public int method2127() {
      return this.field3588;
   }

   public boolean method2120() {
      return this.field3589;
   }

   public String method2126() {
      return this.field3580;
   }

   public String method2122() {
      return this.field3582;
   }

   int method2123() {
      return this.field3586;
   }

   public int method2124() {
      return this.field3583;
   }

   public int method2125() {
      return this.field3585;
   }

   public int method2136() {
      return this.field3579;
   }

   public int method2134() {
      return this.field3587;
   }

   public int method2132() {
      return this.field3581;
   }

   public int method2135() {
      return this.field3584.field726;
   }

   public int method2128() {
      return this.field3584.field727;
   }

   public int method2129() {
      return this.field3584.field728;
   }

   public class113 method2130() {
      return new class113(this.field3584);
   }
}
