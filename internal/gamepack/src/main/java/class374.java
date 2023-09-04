public class class374 {
   public Object field2675;
   public final int field2676;

   public class374(int var1) {
      this.field2676 = var1;
   }

   public class374(int var1, Object var2) {
      this.field2676 = var1;
      this.field2675 = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class374)) {
         return false;
      } else {
         class374 var2 = (class374)var1;
         if (null == var2.field2675 && null != this.field2675) {
            return false;
         } else if (null == this.field2675 && var2.field2675 != null) {
            return false;
         } else {
            return var2.field2676 == this.field2676 && var2.field2675.equals(this.field2675);
         }
      }
   }
}
