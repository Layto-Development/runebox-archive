import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class351 extends AbstractQueue {
   static class337 field2581;
   class294[] field2578;
   int field2576;
   int field2580;
   Map field2577;
   final Comparator field2579;

   public class351(int var1) {
      this(var1, (Comparator)null);
   }

   public class351(int var1, Comparator var2) {
      this.field2576 = 0;
      this.field2578 = new class294[var1];
      this.field2577 = new HashMap();
      this.field2579 = var2;
   }

   void method1600() {
      int var2 = (this.field2578.length << 1) + 1;
      this.field2578 = (class294[])((class294[])Arrays.copyOf(this.field2578, var2));
   }

   public int size() {
      return this.field2580;
   }

   public boolean offer(Object var1) {
      if (this.field2577.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field2576;
         int var2 = this.field2580;
         if (var2 >= this.field2578.length) {
            this.method1600();
         }

         ++this.field2580;
         if (var2 == 0) {
            this.field2578[0] = new class294(var1, 0);
            this.field2577.put(var1, this.field2578[0]);
         } else {
            this.field2578[var2] = new class294(var1, var2);
            this.field2577.put(var1, this.field2578[var2]);
            this.method1601(var2);
         }

         return true;
      }
   }

   public Object peek() {
      return this.field2580 == 0 ? null : this.field2578[0].field2019;
   }

   public Object poll() {
      if (0 == this.field2580) {
         return null;
      } else {
         ++this.field2576;
         Object var1 = this.field2578[0].field2019;
         this.field2577.remove(var1);
         --this.field2580;
         if (this.field2580 == 0) {
            this.field2578[this.field2580] = null;
         } else {
            this.field2578[0] = this.field2578[this.field2580];
            this.field2578[0].field2018 = 0;
            this.field2578[this.field2580] = null;
            this.method1602(0);
         }

         return var1;
      }
   }

   public boolean remove(Object var1) {
      class294 var2 = (class294)this.field2577.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field2576;
         --this.field2580;
         if (this.field2580 == var2.field2018) {
            this.field2578[this.field2580] = null;
            return true;
         } else {
            class294 var3 = this.field2578[this.field2580];
            this.field2578[this.field2580] = null;
            this.field2578[var2.field2018] = var3;
            this.field2578[var2.field2018].field2018 = var2.field2018;
            this.method1602(var2.field2018);
            if (this.field2578[var2.field2018] == var3) {
               this.method1601(var2.field2018);
            }

            return true;
         }
      }
   }

   void method1601(int var1) {
      class294 var3;
      int var4;
      for(var3 = this.field2578[var1]; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >>> 1;
         class294 var5 = this.field2578[var4];
         if (null != this.field2579) {
            if (this.field2579.compare(var3.field2019, var5.field2019) >= 0) {
               break;
            }
         } else if (((Comparable)var3.field2019).compareTo(var5.field2019) >= 0) {
            break;
         }

         this.field2578[var1] = var5;
         this.field2578[var1].field2018 = var1;
      }

      this.field2578[var1] = var3;
      this.field2578[var1].field2018 = var1;
   }

   void method1602(int var1) {
      class294 var3 = this.field2578[var1];

      int var9;
      for(int var4 = this.field2580 >>> 1; var1 < var4; var1 = var9) {
         int var5 = 1 + (var1 << 1);
         class294 var6 = this.field2578[var5];
         int var7 = (var1 << 1) + 2;
         class294 var8 = this.field2578[var7];
         if (this.field2579 != null) {
            if (var7 < this.field2580 && this.field2579.compare(var6.field2019, var8.field2019) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }
         } else if (var7 < this.field2580 && ((Comparable)var6.field2019).compareTo(var8.field2019) > 0) {
            var9 = var7;
         } else {
            var9 = var5;
         }

         if (this.field2579 != null) {
            if (this.field2579.compare(var3.field2019, this.field2578[var9].field2019) <= 0) {
               break;
            }
         } else if (((Comparable)var3.field2019).compareTo(this.field2578[var9].field2019) <= 0) {
            break;
         }

         this.field2578[var1] = this.field2578[var9];
         this.field2578[var1].field2018 = var1;
      }

      this.field2578[var1] = var3;
      this.field2578[var1].field2018 = var1;
   }

   public boolean contains(Object var1) {
      return this.field2577.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (null != this.field2579) {
         Arrays.sort(var1, this.field2579);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class329(this);
   }
}
