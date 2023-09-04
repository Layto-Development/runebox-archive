import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class445 implements class265 {
   Map field3389;
   final class473 field3388;

   public class445(class473 var1) {
      this.field3388 = var1;
   }

   public int method1509(int var1) {
      if (null != this.field3389) {
         class438 var3 = (class438)this.field3389.get(var1);
         if (var3 != null) {
            return (Integer)var3.field3325;
         }
      }

      return (Integer)this.field3388.method2286(var1);
   }

   public void method1508(int var1, Object var2) {
      if (null == this.field3389) {
         this.field3389 = new HashMap();
         this.field3389.put(var1, new class438(var1, var2));
      } else {
         class438 var4 = (class438)this.field3389.get(var1);
         if (null == var4) {
            this.field3389.put(var1, new class438(var1, var2));
         } else {
            var4.field3325 = var2;
         }
      }

   }

   public Iterator iterator() {
      return this.field3389 == null ? Collections.emptyList().iterator() : this.field3389.values().iterator();
   }
}
