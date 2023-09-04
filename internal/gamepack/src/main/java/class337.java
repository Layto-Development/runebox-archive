import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class337 {
   public static Comparator field2516 = new class355();
   public static Comparator field2518;
   public static Comparator field2519;
   public static Comparator field2520;
   public final List field2517;

   static {
      new class261();
      field2520 = new class144();
      field2518 = new class117();
      field2519 = new class444();
   }

   public class337(class366 var1, boolean var2) {
      int var3 = var1.method1703();
      boolean var4 = var1.method1654() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.method1703();
      this.field2517 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field2517.add(new class199(var1, var5, var3));
      }

   }

   public void method1571(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field2517, var1);
      } else {
         Collections.sort(this.field2517, Collections.reverseOrder(var1));
      }

   }
}
