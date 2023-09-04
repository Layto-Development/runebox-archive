import java.util.Iterator;

public class class72 implements Iterable {
   class306 field542;
   public class306 field543 = new class306();

   public class72() {
      this.field543.field2067 = this.field543;
      this.field543.field2068 = this.field543;
   }

   public void method303() {
      while(this.field543.field2067 != this.field543) {
         this.field543.field2067.method1406();
      }

   }

   public void method297(class306 var1) {
      if (var1.field2068 != null) {
         var1.method1406();
      }

      var1.field2068 = this.field543.field2068;
      var1.field2067 = this.field543;
      var1.field2068.field2067 = var1;
      var1.field2067.field2068 = var1;
   }

   public class306 method299() {
      class306 var1 = this.field543.field2067;
      if (var1 == this.field543) {
         return null;
      } else {
         var1.method1406();
         return var1;
      }
   }

   public class306 method300() {
      return this.method301((class306)null);
   }

   class306 method301(class306 var1) {
      class306 var2;
      if (var1 == null) {
         var2 = this.field543.field2067;
      } else {
         var2 = var1;
      }

      if (var2 == this.field543) {
         this.field542 = null;
         return null;
      } else {
         this.field542 = var2.field2067;
         return var2;
      }
   }

   public class306 method302() {
      class306 var1 = this.field542;
      if (var1 == this.field543) {
         this.field542 = null;
         return null;
      } else {
         this.field542 = var1.field2067;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class104(this);
   }

   public static void method298(class306 var0, class306 var1) {
      if (var0.field2068 != null) {
         var0.method1406();
      }

      var0.field2068 = var1;
      var0.field2067 = var1.field2067;
      var0.field2068.field2067 = var0;
      var0.field2067.field2068 = var0;
   }
}
