import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class428 {
   class332[] field3238;
   int field3241 = 0;
   Comparator field3243 = null;
   HashMap field3239;
   HashMap field3242;
   final int field3240;

   class428(int var1) {
      this.field3240 = var1;
      this.field3238 = this.method2049(var1);
      this.field3239 = new HashMap(var1 / 8);
      this.field3242 = new HashMap(var1 / 8);
   }

   abstract class332 method2055();

   abstract class332[] method2049(int var1);

   public void method2037() {
      this.field3241 = 0;
      Arrays.fill(this.field3238, (Object)null);
      this.field3239.clear();
      this.field3242.clear();
   }

   public int method2058() {
      return this.field3241;
   }

   public boolean method2038() {
      return this.field3240 == this.field3241;
   }

   public boolean method2053(class251 var1) {
      if (!var1.method1459()) {
         return false;
      } else {
         return this.field3239.containsKey(var1) ? true : this.field3242.containsKey(var1);
      }
   }

   public class332 method2039(class251 var1) {
      class332 var3 = this.method2040(var1);
      return null != var3 ? var3 : this.method2054(var1);
   }

   class332 method2040(class251 var1) {
      return !var1.method1459() ? null : (class332)this.field3239.get(var1);
   }

   class332 method2054(class251 var1) {
      return !var1.method1459() ? null : (class332)this.field3242.get(var1);
   }

   public final boolean method2056(class251 var1) {
      class332 var3 = this.method2040(var1);
      if (null == var3) {
         return false;
      } else {
         this.method2041(var3);
         return true;
      }
   }

   final void method2041(class332 var1) {
      int var3 = this.method2048(var1);
      if (var3 != -1) {
         this.method2051(var3);
         this.method2046(var1);
      }
   }

   class332 method2052(class251 var1) {
      return this.method2042(var1, (class251)null);
   }

   class332 method2042(class251 var1, class251 var2) {
      if (this.method2040(var1) != null) {
         throw new IllegalStateException();
      } else {
         class332 var4 = this.method2055();
         var4.method1768(var1, var2);
         this.method2047(var4);
         this.method2043(var4);
         return var4;
      }
   }

   public final class332 method2045(int var1) {
      if (var1 >= 0 && var1 < this.field3241) {
         return this.field3238[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void method2059() {
      if (this.field3243 == null) {
         Arrays.sort(this.field3238, 0, this.field3241);
      } else {
         Arrays.sort(this.field3238, 0, this.field3241, this.field3243);
      }

   }

   final void method2044(class332 var1, class251 var2, class251 var3) {
      this.method2046(var1);
      var1.method1768(var2, var3);
      this.method2043(var1);
   }

   final int method2048(class332 var1) {
      for(int var3 = 0; var3 < this.field3241; ++var3) {
         if (this.field3238[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void method2046(class332 var1) {
      if (this.field3239.remove(var1.field2676) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field2677 != null) {
            this.field3242.remove(var1.field2677);
         }

      }
   }

   final void method2047(class332 var1) {
      this.field3238[++this.field3241 - 1] = var1;
   }

   final void method2043(class332 var1) {
      this.field3239.put(var1.field2676, var1);
      if (var1.field2677 != null) {
         class332 var3 = (class332)this.field3242.put(var1.field2677, var1);
         if (var3 != null && var3 != var1) {
            var3.field2677 = null;
         }
      }

   }

   final void method2051(int var1) {
      --this.field3241;
      if (var1 < this.field3241) {
         System.arraycopy(this.field3238, var1 + 1, this.field3238, var1, this.field3241 - var1);
      }

   }

   public final void method2057() {
      this.field3243 = null;
   }

   public final void method2050(Comparator var1) {
      if (null == this.field3243) {
         this.field3243 = var1;
      } else if (this.field3243 instanceof class3) {
         ((class3)this.field3243).method5(var1);
      }

   }
}
