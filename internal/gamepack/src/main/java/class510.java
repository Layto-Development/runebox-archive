public class class510 {
   static class509 field4079;
   public final Object field4080;
   public final Object field4081;

   public class510(Object var1, Object var2) {
      this.field4081 = var1;
      this.field4080 = var2;
   }

   public String toString() {
      return this.field4081 + ", " + this.field4080;
   }

   public boolean equals(Object var1) {
      if (null != var1 && var1 instanceof class510) {
         class510 var2 = (class510)var1;
         if (this.field4081 == null) {
            if (null != var2.field4081) {
               return false;
            }
         } else if (!this.field4081.equals(var2.field4081)) {
            return false;
         }

         if (null == this.field4080) {
            if (var2.field4080 != null) {
               return false;
            }
         } else if (!this.field4080.equals(var2.field4080)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 0;
      if (null != this.field4081) {
         var1 += this.field4081.hashCode();
      }

      if (this.field4080 != null) {
         var1 += 31 * this.field4080.hashCode();
      }

      return var1;
   }
}
