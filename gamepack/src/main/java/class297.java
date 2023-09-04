import java.util.Arrays;

public class class297 {
   static String field2482;
   int[] field2480 = new int[112];
   int[] field2481 = new int[192];

   public class297() {
      Arrays.fill(this.field2480, 3);
      Arrays.fill(this.field2481, 3);
   }

   public void method1623(int var1, int var2) {
      if (this.method1628(var1) && this.method1625(var2)) {
         this.field2480[var1] = var2;
      }

   }

   public void method1626(char var1, int var2) {
      if (this.method1621(var1) && this.method1625(var2)) {
         this.field2481[var1] = var2;
      }

   }

   public int method1620(int var1) {
      return this.method1628(var1) ? this.field2480[var1] : 0;
   }

   public int method1624(char var1) {
      return this.method1621(var1) ? this.field2481[var1] : 0;
   }

   public boolean method1618(int var1) {
      return this.method1628(var1) && (this.field2480[var1] == 1 || this.field2480[var1] == 3);
   }

   public boolean method1622(char var1) {
      return this.method1621(var1) && (this.field2481[var1] == 1 || this.field2481[var1] == 3);
   }

   public boolean method1627(int var1) {
      return this.method1628(var1) && (this.field2480[var1] == 2 || this.field2480[var1] == 3);
   }

   public boolean method1619(char var1) {
      return this.method1621(var1) && (this.field2481[var1] == 2 || this.field2481[var1] == 3);
   }

   boolean method1628(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean method1621(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   boolean method1625(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }
}
