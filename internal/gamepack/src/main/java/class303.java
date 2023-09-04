import java.util.Arrays;

public class class303 implements class44 {
   boolean[] field2053 = new boolean[112];
   boolean[] field2061 = new boolean[112];
   boolean[] field2062 = new boolean[112];
   char[] field2059 = new char[128];
   int field2057 = 0;
   int field2058 = 0;
   int field2060 = 0;
   int field2064 = 0;
   int[] field2056 = new int[128];
   int[] field2063 = new int[128];
   public char field2052;
   public int field2055 = 0;
   public int field2065;
   public int[] field2054 = new int[128];

   public boolean method183(int var1) {
      this.method1387(var1);
      this.field2061[var1] = true;
      this.field2062[var1] = true;
      this.field2053[var1] = false;
      this.field2054[++this.field2055 - 1] = var1;
      return true;
   }

   public boolean method181(int var1) {
      this.field2061[var1] = false;
      this.field2062[var1] = false;
      this.field2053[var1] = true;
      this.field2056[++this.field2057 - 1] = var1;
      return true;
   }

   public boolean method182(char var1) {
      int var3 = 1 + this.field2058 & 127;
      if (this.field2064 != var3) {
         this.field2063[this.field2058] = -1;
         this.field2059[this.field2058] = var1;
         this.field2058 = var3;
      }

      return false;
   }

   void method1387(int var1) {
      int var3 = this.field2058 + 1 & 127;
      if (this.field2064 != var3) {
         this.field2063[this.field2058] = var1;
         this.field2059[this.field2058] = 0;
         this.field2058 = var3;
      }

   }

   public boolean method184(boolean var1) {
      return false;
   }

   public void method1381() {
      this.field2064 = this.field2060;
      this.field2060 = this.field2058;
      this.field2055 = 0;
      this.field2057 = 0;
      Arrays.fill(this.field2062, false);
      Arrays.fill(this.field2053, false);
   }

   public final boolean method1386() {
      if (this.field2064 == this.field2060) {
         return false;
      } else {
         this.field2065 = this.field2063[this.field2064];
         this.field2052 = this.field2059[this.field2064];
         this.field2064 = 1 + this.field2064 & 127;
         return true;
      }
   }

   public boolean method1382(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2062[var1] : false;
   }

   public boolean method1385(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2061[var1] : false;
   }

   public boolean method1380(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2053[var1] : false;
   }

   public int[] method1383() {
      int[] var2 = new int[this.field2055];

      for(int var3 = 0; var3 < this.field2055; ++var3) {
         var2[var3] = this.field2054[var3];
      }

      return var2;
   }

   public int[] method1384() {
      int[] var2 = new int[this.field2057];

      for(int var3 = 0; var3 < this.field2057; ++var3) {
         var2[var3] = this.field2056[var3];
      }

      return var2;
   }
}
