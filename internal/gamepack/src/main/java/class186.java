public final class class186 implements Comparable {
   Object field1485;
   Object field1486;
   long field1487;
   long field1488;

   class186(Object var1, Object var2) {
      this.field1485 = var1;
      this.field1486 = var2;
   }

   int method982(class186 var1) {
      if (this.field1488 < var1.field1488) {
         return -1;
      } else {
         return this.field1488 > var1.field1488 ? 1 : 0;
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class186) {
         return this.field1486.equals(((class186)var1).field1486);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      return this.field1486.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method982((class186)var1);
   }
}
