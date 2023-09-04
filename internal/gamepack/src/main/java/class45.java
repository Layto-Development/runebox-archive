import java.util.Collection;
import java.util.Iterator;

public class class45 implements Iterable, Collection {
   class55 field929 = new class55();
   class55 field930;

   public class45() {
      this.field929.field1077 = this.field929;
      this.field929.field1079 = this.field929;
   }

   public void method576() {
      while(this.field929.field1077 != this.field929) {
         this.field929.field1077.method605();
      }

   }

   public void method577(class55 var1) {
      if (var1.field1079 != null) {
         var1.method605();
      }

      var1.field1079 = this.field929.field1079;
      var1.field1077 = this.field929;
      var1.field1079.field1077 = var1;
      var1.field1077.field1079 = var1;
   }

   public void method586(class55 var1) {
      if (var1.field1079 != null) {
         var1.method605();
      }

      var1.field1079 = this.field929;
      var1.field1077 = this.field929.field1077;
      var1.field1079.field1077 = var1;
      var1.field1077.field1079 = var1;
   }

   public class55 method583() {
      return this.method578((class55)null);
   }

   class55 method578(class55 var1) {
      class55 var2;
      if (var1 == null) {
         var2 = this.field929.field1077;
      } else {
         var2 = var1;
      }

      if (var2 == this.field929) {
         this.field930 = null;
         return null;
      } else {
         this.field930 = var2.field1077;
         return var2;
      }
   }

   public class55 method579() {
      class55 var1 = this.field930;
      if (var1 == this.field929) {
         this.field930 = null;
         return null;
      } else {
         this.field930 = var1.field1077;
         return var1;
      }
   }

   int method585() {
      int var1 = 0;

      for(class55 var2 = this.field929.field1077; var2 != this.field929; var2 = var2.field1077) {
         ++var1;
      }

      return var1;
   }

   public boolean method581() {
      return this.field929.field1077 == this.field929;
   }

   class55[] method580() {
      class55[] var1 = new class55[this.method585()];
      int var2 = 0;

      for(class55 var3 = this.field929.field1077; var3 != this.field929; var3 = var3.field1077) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class142(this);
   }

   public int size() {
      return this.method585();
   }

   public boolean isEmpty() {
      return this.method581();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method580();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class55 var3 = this.field929.field1077; var3 != this.field929; var3 = var3.field1077) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean method582(class55 var1) {
      this.method577(var1);
      return true;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method576();
   }

   public boolean add(Object var1) {
      return this.method582((class55)var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public static void method584(class55 var0, class55 var1) {
      if (var0.field1079 != null) {
         var0.method605();
      }

      var0.field1079 = var1;
      var0.field1077 = var1.field1077;
      var0.field1079.field1077 = var0;
      var0.field1077.field1079 = var0;
   }
}
