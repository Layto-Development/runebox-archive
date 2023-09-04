import java.util.Iterator;

public final class class197 implements Iterable {
   class55 field1922;
   class55 field1923;
   class55[] field1921;
   int field1920;
   int field1924 = 0;

   public class197(int var1) {
      this.field1920 = var1;
      this.field1921 = new class55[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class55 var3 = this.field1921[var2] = new class55();
         var3.field1077 = var3;
         var3.field1079 = var3;
      }

   }

   public class55 method1222(long var1) {
      class55 var3 = this.field1921[(int)(var1 & (long)(this.field1920 - 1))];

      for(this.field1922 = var3.field1077; this.field1922 != var3; this.field1922 = this.field1922.field1077) {
         if (this.field1922.field1078 == var1) {
            class55 var4 = this.field1922;
            this.field1922 = this.field1922.field1077;
            return var4;
         }
      }

      this.field1922 = null;
      return null;
   }

   public void method1226(class55 var1, long var2) {
      if (var1.field1079 != null) {
         var1.method605();
      }

      class55 var4 = this.field1921[(int)(var2 & (long)(this.field1920 - 1))];
      var1.field1079 = var4.field1079;
      var1.field1077 = var4;
      var1.field1079.field1077 = var1;
      var1.field1077.field1079 = var1;
      var1.field1078 = var2;
   }

   public void method1223() {
      for(int var1 = 0; var1 < this.field1920; ++var1) {
         class55 var2 = this.field1921[var1];

         while(true) {
            class55 var3 = var2.field1077;
            if (var3 == var2) {
               break;
            }

            var3.method605();
         }
      }

      this.field1922 = null;
      this.field1923 = null;
   }

   public class55 method1224() {
      this.field1924 = 0;
      return this.method1225();
   }

   public class55 method1225() {
      class55 var1;
      if (this.field1924 > 0 && this.field1923 != this.field1921[this.field1924 - 1]) {
         var1 = this.field1923;
         this.field1923 = var1.field1077;
         return var1;
      } else {
         do {
            if (this.field1924 >= this.field1920) {
               return null;
            }

            var1 = this.field1921[this.field1924++].field1077;
         } while(var1 == this.field1921[this.field1924 - 1]);

         this.field1923 = var1.field1077;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class356(this);
   }
}
