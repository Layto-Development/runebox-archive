import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class354 {
   final class260 field2782;
   final class489 field2779;
   final class489 field2780;
   final int field2783;
   final Comparator field2784;
   final Map field2778;
   final long field2781;

   public class354(int var1, class260 var2) {
      this(-1L, var1, var2);
   }

   class354(long var1, int var3, class260 var4) {
      this.field2784 = new class490(this);
      this.field2781 = var1;
      this.field2783 = var3;
      this.field2782 = var4;
      if (this.field2783 == -1) {
         this.field2778 = new HashMap(64);
         this.field2779 = new class489(64, this.field2784);
         this.field2780 = null;
      } else {
         if (this.field2782 == null) {
            throw new IllegalArgumentException("");
         }

         this.field2778 = new HashMap(this.field2783);
         this.field2779 = new class489(this.field2783, this.field2784);
         this.field2780 = new class489(this.field2783);
      }

   }

   boolean method1818() {
      return this.field2783 != -1;
   }

   public Object method1819(Object var1, byte var2) {
      synchronized(this) {
         if (this.field2781 != -1L) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            this.method1821();
         }

         class312 var4 = (class312)this.field2778.get(var1);
         if (var4 == null) {
            if (var2 == -1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            this.method1822(var4, false);
            return var4.field2558;
         }
      }
   }

   public Object method1820(Object var1, Object var2) {
      synchronized(this) {
         if (this.field2781 != -1L) {
            this.method1821();
         }

         class312 var5 = (class312)this.field2778.get(var1);
         if (null != var5) {
            Object var9 = var5.field2558;
            var5.field2558 = var2;
            this.method1822(var5, false);
            return var9;
         } else {
            class312 var6;
            if (this.method1818() && this.field2778.size() == this.field2783) {
               var6 = (class312)this.field2780.remove();
               this.field2778.remove(var6.field2559);
               this.field2779.remove(var6);
            }

            var6 = new class312(var2, var1);
            this.field2778.put(var1, var6);
            this.method1822(var6, true);
            return null;
         }
      }
   }

   void method1822(class312 var1, boolean var2) {
      if (!var2) {
         this.field2779.remove(var1);
         if (this.method1818() && !this.field2780.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field2560 = System.currentTimeMillis();
      if (this.method1818()) {
         switch (this.field2782.field2283) {
            case 0:
               var1.field2561 = var1.field2560;
               break;
            case 1:
               ++var1.field2561;
         }

         this.field2780.add(var1);
      }

      this.field2779.add(var1);
   }

   void method1821() {
      if (this.field2781 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var2 = System.currentTimeMillis() - this.field2781;

         while(!this.field2779.isEmpty()) {
            class312 var4 = (class312)this.field2779.peek();
            if (var4.field2560 >= var2) {
               return;
            }

            this.field2778.remove(var4.field2559);
            this.field2779.remove(var4);
            if (this.method1818()) {
               this.field2780.remove(var4);
            }
         }

      }
   }

   public void method1817() {
      synchronized(this) {
         this.field2778.clear();
         this.field2779.clear();
         if (this.method1818()) {
            this.field2780.clear();
         }

      }
   }
}
