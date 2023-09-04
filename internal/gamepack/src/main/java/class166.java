import java.util.Arrays;

public class class166 {
   static String field1061;
   int[] field1059 = new int[112];
   int[] field1060 = new int[192];

   public class166() {
      Arrays.fill(this.field1059, 3);
      Arrays.fill(this.field1060, 3);
   }

   public void method638(int var1, int var2) {
      if (this.method643(var1) && this.method640(var2)) {
         this.field1059[var1] = var2;
      }

   }

   public void method641(char var1, int var2) {
      if (this.method636(var1) && this.method640(var2)) {
         this.field1060[var1] = var2;
      }

   }

   public int method635(int var1) {
      return this.method643(var1) ? this.field1059[var1] : 0;
   }

   public int method639(char var1) {
      return this.method636(var1) ? this.field1060[var1] : 0;
   }

   public boolean method633(int var1) {
      return this.method643(var1) && (1 == this.field1059[var1] || 3 == this.field1059[var1]);
   }

   public boolean method637(char var1) {
      return this.method636(var1) && (1 == this.field1060[var1] || 3 == this.field1060[var1]);
   }

   public boolean method642(int var1) {
      return this.method643(var1) && (2 == this.field1059[var1] || 3 == this.field1059[var1]);
   }

   public boolean method634(char var1) {
      return this.method636(var1) && (this.field1060[var1] == 2 || 3 == this.field1060[var1]);
   }

   boolean method643(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean method636(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   boolean method640(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }
}
