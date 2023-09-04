import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class397 {
   class57[] field2765;
   int field2768 = 0;
   Comparator field2770 = null;
   HashMap field2766;
   HashMap field2769;
   final int field2767;

   class397(int var1) {
      this.field2767 = var1;
      this.field2765 = this.method1805(var1);
      this.field2766 = new HashMap(var1 / 8);
      this.field2769 = new HashMap(var1 / 8);
   }

   abstract class57 method1811();

   abstract class57[] method1805(int var1);

   public void method1793() {
      this.field2768 = 0;
      Arrays.fill(this.field2765, (Object)null);
      this.field2766.clear();
      this.field2769.clear();
   }

   public int method1814() {
      return this.field2768;
   }

   public boolean method1794() {
      return this.field2767 == this.field2768;
   }

   public boolean method1809(class349 var1) {
      if (!var1.method1599()) {
         return false;
      } else {
         return this.field2766.containsKey(var1) ? true : this.field2769.containsKey(var1);
      }
   }

   public class57 method1795(class349 var1) {
      class57 var3 = this.method1796(var1);
      return null != var3 ? var3 : this.method1810(var1);
   }

   class57 method1796(class349 var1) {
      return !var1.method1599() ? null : (class57)this.field2766.get(var1);
   }

   class57 method1810(class349 var1) {
      return !var1.method1599() ? null : (class57)this.field2769.get(var1);
   }

   public final boolean method1812(class349 var1) {
      class57 var3 = this.method1796(var1);
      if (null == var3) {
         return false;
      } else {
         this.method1797(var3);
         return true;
      }
   }

   final void method1797(class57 var1) {
      int var3 = this.method1804(var1);
      if (var3 != -1) {
         this.method1807(var3);
         this.method1802(var1);
      }
   }

   class57 method1808(class349 var1) {
      return this.method1798(var1, (class349)null);
   }

   class57 method1798(class349 var1, class349 var2) {
      if (this.method1796(var1) != null) {
         throw new IllegalStateException();
      } else {
         class57 var4 = this.method1811();
         var4.method245(var1, var2);
         this.method1803(var4);
         this.method1799(var4);
         return var4;
      }
   }

   public final class57 method1801(int var1) {
      if (var1 >= 0 && var1 < this.field2768) {
         return this.field2765[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void method1815() {
      if (this.field2770 == null) {
         Arrays.sort(this.field2765, 0, this.field2768);
      } else {
         Arrays.sort(this.field2765, 0, this.field2768, this.field2770);
      }

   }

   final void method1800(class57 var1, class349 var2, class349 var3) {
      this.method1802(var1);
      var1.method245(var2, var3);
      this.method1799(var1);
   }

   final int method1804(class57 var1) {
      for(int var3 = 0; var3 < this.field2768; ++var3) {
         if (this.field2765[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void method1802(class57 var1) {
      if (this.field2766.remove(var1.field460) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field461 != null) {
            this.field2769.remove(var1.field461);
         }

      }
   }

   final void method1803(class57 var1) {
      this.field2765[++this.field2768 - 1] = var1;
   }

   final void method1799(class57 var1) {
      this.field2766.put(var1.field460, var1);
      if (var1.field461 != null) {
         class57 var3 = (class57)this.field2769.put(var1.field461, var1);
         if (var3 != null && var3 != var1) {
            var3.field461 = null;
         }
      }

   }

   final void method1807(int var1) {
      --this.field2768;
      if (var1 < this.field2768) {
         System.arraycopy(this.field2765, var1 + 1, this.field2765, var1, this.field2768 - var1);
      }

   }

   public final void method1813() {
      this.field2770 = null;
   }

   public final void method1806(Comparator var1) {
      if (null == this.field2770) {
         this.field2770 = var1;
      } else if (this.field2770 instanceof class434) {
         ((class434)this.field2770).method2027(var1);
      }

   }
}
