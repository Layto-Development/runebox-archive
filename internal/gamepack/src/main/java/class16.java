import java.util.Comparator;

public class class16 implements Comparator {
   static int field200;
   final boolean field201;

   public class16(boolean var1) {
      this.field201 = var1;
   }

   int method96(class538 var1, class538 var2) {
      return this.field201 ? var1.field4283 - var2.field4283 : var2.field4283 - var1.field4283;
   }

   public int compare(Object var1, Object var2) {
      return this.method96((class538)var1, (class538)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
