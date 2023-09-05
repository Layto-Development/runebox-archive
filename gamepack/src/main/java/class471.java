public class class471 {
   int field3620;
   int field3623;
   int field3624;
   int field3625 = 2;
   int field3626;
   int field3627;
   int field3628;
   int field3629;
   int field3630;
   int[] field3621 = new int[2];
   int[] field3622 = new int[2];

   class471() {
      this.field3621[0] = 0;
      this.field3621[1] = 65535;
      this.field3622[0] = 0;
      this.field3622[1] = 65535;
   }

   final void method2278(class184 var1) {
      this.field3624 = var1.readUnsignedByte();
      this.field3623 = var1.readInt();
      this.field3620 = var1.readInt();
      this.method2279(var1);
   }

   final void method2279(class184 var1) {
      this.field3625 = var1.readUnsignedByte();
      this.field3621 = new int[this.field3625];
      this.field3622 = new int[this.field3625];

      for(int var2 = 0; var2 < this.field3625; ++var2) {
         this.field3621[var2] = var1.method1174();
         this.field3622[var2] = var1.method1174();
      }

   }

   final void method2277() {
      this.field3627 = 0;
      this.field3629 = 0;
      this.field3628 = 0;
      this.field3626 = 0;
      this.field3630 = 0;
   }

   final int method2276(int var1) {
      if (this.field3630 >= this.field3627) {
         this.field3626 = this.field3622[this.field3629++] << 15;
         if (this.field3629 >= this.field3625) {
            this.field3629 = this.field3625 - 1;
         }

         this.field3627 = (int)((double)this.field3621[this.field3629] / 65536.0 * (double)var1);
         if (this.field3627 > this.field3630) {
            this.field3628 = ((this.field3622[this.field3629] << 15) - this.field3626) / (this.field3627 - this.field3630);
         }
      }

      this.field3626 += this.field3628;
      ++this.field3630;
      return this.field3626 - this.field3628 >> 15;
   }
}
