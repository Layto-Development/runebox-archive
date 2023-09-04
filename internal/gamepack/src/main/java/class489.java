import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class489 extends AbstractQueue {
   static class504 field3859;
   class318[] field3856;
   int field3854;
   int field3858;
   Map field3855;
   final Comparator field3857;

   public class489(int var1) {
      this(var1, (Comparator)null);
   }

   public class489(int var1, Comparator var2) {
      this.field3854 = 0;
      this.field3856 = new class318[var1];
      this.field3855 = new HashMap();
      this.field3857 = var2;
   }

   void method2383() {
      int var2 = (this.field3856.length << 1) + 1;
      this.field3856 = (class318[])((class318[])Arrays.copyOf(this.field3856, var2));
   }

   public int size() {
      return this.field3858;
   }

   public boolean offer(Object var1) {
      if (this.field3855.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field3854;
         int var2 = this.field3858;
         if (var2 >= this.field3856.length) {
            this.method2383();
         }

         ++this.field3858;
         if (var2 == 0) {
            this.field3856[0] = new class318(var1, 0);
            this.field3855.put(var1, this.field3856[0]);
         } else {
            this.field3856[var2] = new class318(var1, var2);
            this.field3855.put(var1, this.field3856[var2]);
            this.method2384(var2);
         }

         return true;
      }
   }

   public Object peek() {
      return this.field3858 == 0 ? null : this.field3856[0].field2586;
   }

   public Object poll() {
      if (this.field3858 == 0) {
         return null;
      } else {
         ++this.field3854;
         Object var1 = this.field3856[0].field2586;
         this.field3855.remove(var1);
         --this.field3858;
         if (this.field3858 == 0) {
            this.field3856[this.field3858] = null;
         } else {
            this.field3856[0] = this.field3856[this.field3858];
            this.field3856[0].field2585 = 0;
            this.field3856[this.field3858] = null;
            this.method2385(0);
         }

         return var1;
      }
   }

   public boolean remove(Object var1) {
      class318 var2 = (class318)this.field3855.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field3854;
         --this.field3858;
         if (this.field3858 == var2.field2585) {
            this.field3856[this.field3858] = null;
            return true;
         } else {
            class318 var3 = this.field3856[this.field3858];
            this.field3856[this.field3858] = null;
            this.field3856[var2.field2585] = var3;
            this.field3856[var2.field2585].field2585 = var2.field2585;
            this.method2385(var2.field2585);
            if (this.field3856[var2.field2585] == var3) {
               this.method2384(var2.field2585);
            }

            return true;
         }
      }
   }

   void method2384(int var1) {
      class318 var3;
      int var4;
      for(var3 = this.field3856[var1]; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >>> 1;
         class318 var5 = this.field3856[var4];
         if (null != this.field3857) {
            if (this.field3857.compare(var3.field2586, var5.field2586) >= 0) {
               break;
            }
         } else if (((Comparable)var3.field2586).compareTo(var5.field2586) >= 0) {
            break;
         }

         this.field3856[var1] = var5;
         this.field3856[var1].field2585 = var1;
      }

      this.field3856[var1] = var3;
      this.field3856[var1].field2585 = var1;
   }

   void method2385(int var1) {
      class318 var3 = this.field3856[var1];

      int var9;
      for(int var4 = this.field3858 >>> 1; var1 < var4; var1 = var9) {
         int var5 = 1 + (var1 << 1);
         class318 var6 = this.field3856[var5];
         int var7 = (var1 << 1) + 2;
         class318 var8 = this.field3856[var7];
         if (this.field3857 != null) {
            if (var7 < this.field3858 && this.field3857.compare(var6.field2586, var8.field2586) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }
         } else if (var7 < this.field3858 && ((Comparable)var6.field2586).compareTo(var8.field2586) > 0) {
            var9 = var7;
         } else {
            var9 = var5;
         }

         if (this.field3857 != null) {
            if (this.field3857.compare(var3.field2586, this.field3856[var9].field2586) <= 0) {
               break;
            }
         } else if (((Comparable)var3.field2586).compareTo(this.field3856[var9].field2586) <= 0) {
            break;
         }

         this.field3856[var1] = this.field3856[var9];
         this.field3856[var1].field2585 = var1;
      }

      this.field3856[var1] = var3;
      this.field3856[var1].field2585 = var1;
   }

   public boolean contains(Object var1) {
      return this.field3855.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (null != this.field3857) {
         Arrays.sort(var1, this.field3857);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class431(this);
   }
}
