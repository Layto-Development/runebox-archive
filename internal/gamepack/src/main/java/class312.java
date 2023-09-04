public final class class312 implements Comparable {
   Object field2558;
   Object field2559;
   long field2560;
   long field2561;

   class312(Object var1, Object var2) {
      this.field2558 = var1;
      this.field2559 = var2;
   }

   int method1683(class312 var1) {
      if (this.field2561 < var1.field2561) {
         return -1;
      } else {
         return this.field2561 > var1.field2561 ? 1 : 0;
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class312) {
         return this.field2559.equals(((class312)var1).field2559);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      return this.field2559.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method1683((class312)var1);
   }
}
