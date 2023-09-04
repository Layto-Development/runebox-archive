import java.util.Arrays;

public class class17 implements class203 {
   boolean[] field174 = new boolean[112];
   boolean[] field182 = new boolean[112];
   boolean[] field183 = new boolean[112];
   char[] field180 = new char[128];
   int field178 = 0;
   int field179 = 0;
   int field181 = 0;
   int field185 = 0;
   int[] field177 = new int[128];
   int[] field184 = new int[128];
   public char field173;
   public int field176 = 0;
   public int field186;
   public int[] field175 = new int[128];

   public boolean method1246(int var1) {
      this.method173(var1);
      this.field182[var1] = true;
      this.field183[var1] = true;
      this.field174[var1] = false;
      this.field175[++this.field176 - 1] = var1;
      return true;
   }

   public boolean method1244(int var1) {
      this.field182[var1] = false;
      this.field183[var1] = false;
      this.field174[var1] = true;
      this.field177[++this.field178 - 1] = var1;
      return true;
   }

   public boolean method1245(char var1) {
      int var3 = 1 + this.field179 & 127;
      if (this.field185 != var3) {
         this.field184[this.field179] = -1;
         this.field180[this.field179] = var1;
         this.field179 = var3;
      }

      return false;
   }

   void method173(int var1) {
      int var3 = this.field179 + 1 & 127;
      if (this.field185 != var3) {
         this.field184[this.field179] = var1;
         this.field180[this.field179] = 0;
         this.field179 = var3;
      }

   }

   public boolean method1247(boolean var1) {
      return false;
   }

   public void method166() {
      this.field185 = this.field181;
      this.field181 = this.field179;
      this.field176 = 0;
      this.field178 = 0;
      Arrays.fill(this.field183, false);
      Arrays.fill(this.field174, false);
   }

   public final boolean method172() {
      if (this.field185 == this.field181) {
         return false;
      } else {
         this.field186 = this.field184[this.field185];
         this.field173 = this.field180[this.field185];
         this.field185 = 1 + this.field185 & 127;
         return true;
      }
   }

   public boolean method167(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field183[var1] : false;
   }

   public boolean method171(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field182[var1] : false;
   }

   public boolean method164(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field174[var1] : false;
   }

   public int[] method168() {
      int[] var2 = new int[this.field176];

      for(int var3 = 0; var3 < this.field176; ++var3) {
         var2[var3] = this.field175[var3];
      }

      return var2;
   }

   public int[] method169() {
      int[] var2 = new int[this.field178];

      for(int var3 = 0; var3 < this.field178; ++var3) {
         var2[var3] = this.field177[var3];
      }

      return var2;
   }
}
