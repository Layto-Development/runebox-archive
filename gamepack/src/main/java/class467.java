public class class467 {
   static class298 field3604;
   public final Object field3605;
   public final Object field3606;

   public class467(Object var1, Object var2) {
      this.field3606 = var1;
      this.field3605 = var2;
   }

   public String toString() {
      return this.field3606 + ", " + this.field3605;
   }

   public boolean equals(Object var1) {
      if (null != var1 && var1 instanceof class467) {
         class467 var2 = (class467)var1;
         if (this.field3606 == null) {
            if (null != var2.field3606) {
               return false;
            }
         } else if (!this.field3606.equals(var2.field3606)) {
            return false;
         }

         if (null == this.field3605) {
            if (var2.field3605 != null) {
               return false;
            }
         } else if (!this.field3605.equals(var2.field3605)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 0;
      if (null != this.field3606) {
         var1 += this.field3606.hashCode();
      }

      if (this.field3605 != null) {
         var1 += 31 * this.field3605.hashCode();
      }

      return var1;
   }
}
