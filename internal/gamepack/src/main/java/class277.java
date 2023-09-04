import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class277 implements class297 {
   Map field1944;
   final class30 field1943;

   public class277(class30 var1) {
      this.field1943 = var1;
   }

   public int method1372(int var1) {
      if (null != this.field1944) {
         class374 var3 = (class374)this.field1944.get(var1);
         if (var3 != null) {
            return (Integer)var3.field2675;
         }
      }

      return (Integer)this.field1943.method135(var1);
   }

   public void method1371(int var1, Object var2) {
      if (null == this.field1944) {
         this.field1944 = new HashMap();
         this.field1944.put(var1, new class374(var1, var2));
      } else {
         class374 var4 = (class374)this.field1944.get(var1);
         if (null == var4) {
            this.field1944.put(var1, new class374(var1, var2));
         } else {
            var4.field2675 = var2;
         }
      }

   }

   public Iterator iterator() {
      return this.field1944 == null ? Collections.emptyList().iterator() : this.field1944.values().iterator();
   }
}
