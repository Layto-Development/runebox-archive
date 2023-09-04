import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class504 {
   public static Comparator field3961 = new class88();
   public static Comparator field3963;
   public static Comparator field3964;
   public static Comparator field3965;
   public final List field3962;

   static {
      new class53();
      field3965 = new class110();
      field3963 = new class378();
      field3964 = new class102();
   }

   public class504(class184 var1, boolean var2) {
      int var3 = var1.method1174();
      boolean var4 = var1.method1125() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.method1174();
      this.field3962 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field3962.add(new class82(var1, var5, var3));
      }

   }

   public void method2446(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field3962, var1);
      } else {
         Collections.sort(this.field3962, Collections.reverseOrder(var1));
      }

   }
}
