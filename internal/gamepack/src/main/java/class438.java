public class class438 {
   public Object field3325;
   public final int field3326;

   public class438(int var1) {
      this.field3326 = var1;
   }

   public class438(int var1, Object var2) {
      this.field3326 = var1;
      this.field3325 = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class438)) {
         return false;
      } else {
         class438 var2 = (class438)var1;
         if (null == var2.field3325 && null != this.field3325) {
            return false;
         } else if (null == this.field3325 && var2.field3325 != null) {
            return false;
         } else {
            return var2.field3326 == this.field3326 && var2.field3325.equals(this.field3325);
         }
      }
   }
}
