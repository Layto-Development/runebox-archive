import java.util.Collection;
import java.util.Iterator;

public class class457 implements Iterable, Collection {
   class70 field3592 = new class70();
   class70 field3593;

   public class457() {
      this.field3592.field530 = this.field3592;
      this.field3592.field532 = this.field3592;
   }

   public void method2137() {
      while(this.field3592.field530 != this.field3592) {
         this.field3592.field530.method295();
      }

   }

   public void method2138(class70 var1) {
      if (var1.field532 != null) {
         var1.method295();
      }

      var1.field532 = this.field3592.field532;
      var1.field530 = this.field3592;
      var1.field532.field530 = var1;
      var1.field530.field532 = var1;
   }

   public void method2147(class70 var1) {
      if (var1.field532 != null) {
         var1.method295();
      }

      var1.field532 = this.field3592;
      var1.field530 = this.field3592.field530;
      var1.field532.field530 = var1;
      var1.field530.field532 = var1;
   }

   public class70 method2144() {
      return this.method2139((class70)null);
   }

   class70 method2139(class70 var1) {
      class70 var2;
      if (var1 == null) {
         var2 = this.field3592.field530;
      } else {
         var2 = var1;
      }

      if (var2 == this.field3592) {
         this.field3593 = null;
         return null;
      } else {
         this.field3593 = var2.field530;
         return var2;
      }
   }

   public class70 method2140() {
      class70 var1 = this.field3593;
      if (var1 == this.field3592) {
         this.field3593 = null;
         return null;
      } else {
         this.field3593 = var1.field530;
         return var1;
      }
   }

   int method2146() {
      int var1 = 0;

      for(class70 var2 = this.field3592.field530; var2 != this.field3592; var2 = var2.field530) {
         ++var1;
      }

      return var1;
   }

   public boolean method2142() {
      return this.field3592.field530 == this.field3592;
   }

   class70[] method2141() {
      class70[] var1 = new class70[this.method2146()];
      int var2 = 0;

      for(class70 var3 = this.field3592.field530; var3 != this.field3592; var3 = var3.field530) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class22(this);
   }

   public int size() {
      return this.method2146();
   }

   public boolean isEmpty() {
      return this.method2142();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method2141();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class70 var3 = this.field3592.field530; var3 != this.field3592; var3 = var3.field530) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean method2143(class70 var1) {
      this.method2138(var1);
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
      this.method2137();
   }

   public boolean add(Object var1) {
      return this.method2143((class70)var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public static void method2145(class70 var0, class70 var1) {
      if (var0.field532 != null) {
         var0.method295();
      }

      var0.field532 = var1;
      var0.field530 = var1.field530;
      var0.field532.field530 = var0;
      var0.field530.field532 = var0;
   }
}
