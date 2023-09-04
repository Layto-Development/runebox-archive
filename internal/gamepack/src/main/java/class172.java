import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class172 {
   final class351 field1088;
   final class351 field1089;
   final class418 field1091;
   final int field1092;
   final Comparator field1093;
   final Map field1087;
   final long field1090;

   public class172(int var1, class418 var2) {
      this(-1L, var1, var2);
   }

   class172(long var1, int var3, class418 var4) {
      this.field1093 = new class185(this);
      this.field1090 = var1;
      this.field1092 = var3;
      this.field1091 = var4;
      if (this.field1092 == -1) {
         this.field1087 = new HashMap(64);
         this.field1088 = new class351(64, this.field1093);
         this.field1089 = null;
      } else {
         if (this.field1091 == null) {
            throw new IllegalArgumentException("");
         }

         this.field1087 = new HashMap(this.field1092);
         this.field1088 = new class351(this.field1092, this.field1093);
         this.field1089 = new class351(this.field1092);
      }

   }

   boolean method658() {
      return -1 != this.field1092;
   }

   public Object method659(Object var1, byte var2) {
      synchronized(this) {
         if (this.field1090 != -1L) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            this.method661();
         }

         class186 var4 = (class186)this.field1087.get(var1);
         if (var4 == null) {
            if (var2 == -1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            this.method662(var4, false);
            return var4.field1485;
         }
      }
   }

   public Object method660(Object var1, Object var2) {
      synchronized(this) {
         if (this.field1090 != -1L) {
            this.method661();
         }

         class186 var5 = (class186)this.field1087.get(var1);
         if (null != var5) {
            Object var9 = var5.field1485;
            var5.field1485 = var2;
            this.method662(var5, false);
            return var9;
         } else {
            class186 var6;
            if (this.method658() && this.field1087.size() == this.field1092) {
               var6 = (class186)this.field1089.remove();
               this.field1087.remove(var6.field1486);
               this.field1088.remove(var6);
            }

            var6 = new class186(var2, var1);
            this.field1087.put(var1, var6);
            this.method662(var6, true);
            return null;
         }
      }
   }

   void method662(class186 var1, boolean var2) {
      if (!var2) {
         this.field1088.remove(var1);
         if (this.method658() && !this.field1089.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field1487 = System.currentTimeMillis();
      if (this.method658()) {
         switch (this.field1091.field2940) {
            case 0:
               var1.field1488 = var1.field1487;
               break;
            case 1:
               ++var1.field1488;
         }

         this.field1089.add(var1);
      }

      this.field1088.add(var1);
   }

   void method661() {
      if (this.field1090 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var2 = System.currentTimeMillis() - this.field1090;

         while(!this.field1088.isEmpty()) {
            class186 var4 = (class186)this.field1088.peek();
            if (var4.field1487 >= var2) {
               return;
            }

            this.field1087.remove(var4.field1486);
            this.field1088.remove(var4);
            if (this.method658()) {
               this.field1089.remove(var4);
            }
         }

      }
   }

   public void method657() {
      synchronized(this) {
         this.field1087.clear();
         this.field1088.clear();
         if (this.method658()) {
            this.field1089.clear();
         }

      }
   }
}
