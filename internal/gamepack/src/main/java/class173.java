import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class173 {
   boolean field1098 = true;
   boolean field1100 = false;
   boolean field1109 = false;
   class139 field1108;
   class139 field1113;
   class499 field1094 = new class499();
   class499 field1097 = new class499();
   int field1095 = 0;
   int field1096 = Integer.MAX_VALUE;
   int field1099 = 0;
   int field1101 = 0;
   int field1102 = 0;
   int field1103 = 0;
   int field1104 = 0;
   int field1105 = 0;
   int field1106 = 0;
   int field1107 = 0;
   int field1110 = 0;
   int field1111 = 0;
   int field1112 = Integer.MAX_VALUE;
   int field1114 = 0;

   class173() {
      this.field1097.method2381(1);
      this.field1094.method2381(1);
   }

   void method663() {
      this.field1095 = (this.field1095 + 1) % 60;
      if (this.field1107 > 0) {
         --this.field1107;
      }

   }

   public boolean method664(boolean var1) {
      var1 = var1 && this.field1098;
      boolean var3 = this.field1109 != var1;
      this.field1109 = var1;
      if (!this.field1109) {
         this.method683(this.field1105, this.field1105);
      }

      return var3;
   }

   public void method694(boolean var1) {
      this.field1098 = var1;
      this.field1109 = var1 && this.field1109;
   }

   boolean method733(String var1) {
      String var3 = this.field1097.method2350();
      if (!var3.equals(var1)) {
         var1 = this.method708(var1);
         this.field1097.method2382(var1);
         this.method672(this.field1111, this.field1099);
         this.method715();
         this.method720();
         return true;
      } else {
         return false;
      }
   }

   boolean method666(String var1) {
      this.field1094.method2382(var1);
      return true;
   }

   boolean method667(class419 var1) {
      boolean var3 = !this.field1100;
      this.field1097.method2352(var1);
      this.field1094.method2352(var1);
      this.field1100 = true;
      var3 |= this.method672(this.field1111, this.field1099);
      var3 |= this.method683(this.field1104, this.field1105);
      if (this.method715()) {
         this.method720();
         var3 = true;
      }

      return var3;
   }

   public boolean method668(int var1, int var2) {
      boolean var4 = this.field1102 != var1 || this.field1110 != var2;
      this.field1102 = var1;
      this.field1110 = var2;
      var4 |= this.method672(this.field1111, this.field1099);
      return var4;
   }

   public boolean method669(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var3 = var1 == this.field1097.method2386();
      this.field1097.method2377(var1);
      this.field1094.method2377(var1);
      if (this.method715()) {
         this.method720();
         var3 = true;
      }

      return var3;
   }

   public boolean method670(int var1) {
      this.field1097.method2348(var1);
      if (this.method715()) {
         this.method720();
         return true;
      } else {
         return false;
      }
   }

   public boolean method737(int var1) {
      this.field1112 = var1;
      if (this.method715()) {
         this.method720();
         return true;
      } else {
         return false;
      }
   }

   public boolean method672(int var1, int var2) {
      if (!this.method706()) {
         this.field1111 = var1;
         this.field1099 = var2;
         return false;
      } else {
         int var4 = this.field1111;
         int var5 = this.field1099;
         int var6 = Math.max(0, this.field1097.method2361() - this.field1102 + 2);
         int var7 = Math.max(0, this.field1097.method2362() - this.field1110 + 1);
         this.field1111 = Math.max(0, Math.min(var6, var1));
         this.field1099 = Math.max(0, Math.min(var7, var2));
         return var4 != this.field1111 || this.field1099 != var5;
      }
   }

   public boolean method729(int var1, int var2) {
      boolean var4 = true;
      if (var1 < 0 || var1 > 2) {
         var4 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var4 = false;
      }

      return var4 ? this.field1097.method2353(var1, var2) : false;
   }

   public void method673(int var1) {
      this.field1097.method2354(var1);
   }

   public void method674(int var1) {
      this.field1101 = var1;
   }

   public void method743(int var1) {
      this.field1097.method2381(var1);
   }

   public void method742(int var1) {
      this.field1097.method2351(var1);
   }

   public boolean method724(int var1) {
      this.field1103 = var1;
      String var3 = this.field1097.method2350();
      int var4 = var3.length();
      var3 = this.method708(var3);
      if (var3.length() != var4) {
         this.field1097.method2382(var3);
         this.method672(this.field1111, this.field1099);
         this.method715();
         this.method720();
         return true;
      } else {
         return false;
      }
   }

   public void method676() {
      this.field1100 = false;
   }

   public boolean method723(int var1) {
      if (this.method710(var1)) {
         this.method682();
         class511 var3 = this.field1097.method2380((char)var1, this.field1105, this.field1096);
         this.method683(var3.method2451(), var3.method2451());
         this.method715();
         this.method720();
      }

      return true;
   }

   public void method678() {
      if (!this.method682() && this.field1105 > 0) {
         int var2 = this.field1097.method2358(this.field1105 - 1);
         this.method720();
         this.method683(var2, var2);
      }

   }

   public void method679() {
      if (!this.method682() && this.field1105 < this.field1097.method2349()) {
         int var2 = this.field1097.method2358(this.field1105);
         this.method720();
         this.method683(var2, var2);
      }

   }

   public void method680() {
      if (!this.method682() && this.field1105 > 0) {
         class510 var2 = this.method713(this.field1105 - 1);
         int var3 = this.field1097.method2359((Integer)var2.field4081, this.field1105);
         this.method720();
         this.method683(var3, var3);
      }

   }

   public void method701() {
      if (!this.method682() && this.field1105 < this.field1097.method2349()) {
         class510 var2 = this.method713(this.field1105);
         int var3 = this.field1097.method2359(this.field1105, (Integer)var2.field4080);
         this.method720();
         this.method683(var3, var3);
      }

   }

   boolean method682() {
      if (!this.method711()) {
         return false;
      } else {
         int var2 = this.field1097.method2359(this.field1104, this.field1105);
         this.method720();
         this.method683(var2, var2);
         return true;
      }
   }

   public void method741() {
      this.method683(0, this.field1097.method2349());
   }

   public boolean method683(int var1, int var2) {
      if (!this.method706()) {
         this.field1104 = var1;
         this.field1105 = var2;
         return false;
      } else {
         if (var1 > this.field1097.method2349()) {
            var1 = this.field1097.method2349();
         }

         if (var2 > this.field1097.method2349()) {
            var2 = this.field1097.method2349();
         }

         boolean var4 = this.field1104 != var1 || var2 != this.field1105;
         this.field1104 = var1;
         if (var2 != this.field1105) {
            this.field1105 = var2;
            this.field1095 = 0;
            this.method718();
         }

         if (var4 && null != this.field1108) {
            this.field1108.method502();
         }

         return var4;
      }
   }

   public void method684(boolean var1) {
      class510 var3 = this.method714(this.field1105);
      this.method716((Integer)var3.field4081, var1);
   }

   public void method685(boolean var1) {
      class510 var3 = this.method714(this.field1105);
      this.method716((Integer)var3.field4080, var1);
   }

   public void method686(boolean var1) {
      this.method716(0, var1);
   }

   public void method687(boolean var1) {
      this.method716(this.field1097.method2349(), var1);
   }

   public void method735(boolean var1) {
      if (this.method711() && !var1) {
         this.method716(Math.min(this.field1104, this.field1105), var1);
      } else if (this.field1105 > 0) {
         this.method716(this.field1105 - 1, var1);
      }

   }

   public void method688(boolean var1) {
      if (this.method711() && !var1) {
         this.method716(Math.max(this.field1104, this.field1105), var1);
      } else if (this.field1105 < this.field1097.method2349()) {
         this.method716(1 + this.field1105, var1);
      }

   }

   public void method689(boolean var1) {
      if (this.field1105 > 0) {
         class510 var3 = this.method713(this.field1105 - 1);
         this.method716((Integer)var3.field4081, var1);
      }

   }

   public void method690(boolean var1) {
      if (this.field1105 < this.field1097.method2349()) {
         class510 var3 = this.method713(1 + this.field1105);
         this.method716((Integer)var3.field4080, var1);
      }

   }

   public void method691(boolean var1) {
      if (this.field1105 > 0) {
         this.method716(this.field1097.method2360(this.field1105, -1), var1);
      }

   }

   public void method692(boolean var1) {
      if (this.field1105 < this.field1097.method2349()) {
         this.method716(this.field1097.method2360(this.field1105, 1), var1);
      }

   }

   public void method693(boolean var1) {
      if (this.field1105 > 0) {
         int var3 = this.method717();
         this.method716(this.field1097.method2360(this.field1105, -var3), var1);
      }

   }

   public void method681(boolean var1) {
      if (this.field1105 < this.field1097.method2349()) {
         int var3 = this.method717();
         this.method716(this.field1097.method2360(this.field1105, var3), var1);
      }

   }

   public void method731(boolean var1) {
      class61 var3 = this.field1097.method2355(0, this.field1105);
      class510 var4 = var3.method262();
      this.method716(this.field1097.method2376((Integer)var4.field4081, this.field1099), var1);
   }

   public void method730(boolean var1) {
      class61 var3 = this.field1097.method2355(0, this.field1105);
      class510 var4 = var3.method262();
      this.method716(this.field1097.method2376((Integer)var4.field4081, this.field1110 + this.field1099), var1);
   }

   public void method739(int var1, int var2, boolean var3, boolean var4) {
      boolean var6 = false;
      class510 var7;
      int var9;
      if (!this.field1100) {
         var9 = 0;
      } else {
         var1 += this.field1111;
         var2 += this.field1099;
         var7 = this.method721();
         var9 = this.field1097.method2376(var1 - (Integer)var7.field4081, var2 - (Integer)var7.field4080);
      }

      if (var3 && var4) {
         this.field1114 = 1;
         var7 = this.method713(var9);
         class510 var8 = this.method713(this.field1106);
         this.method712(var8, var7);
      } else if (var3) {
         this.field1114 = 1;
         var7 = this.method713(var9);
         this.method683((Integer)var7.field4081, (Integer)var7.field4080);
         this.field1106 = (Integer)var7.field4081;
      } else if (var4) {
         this.method683(this.field1106, var9);
      } else {
         if (this.field1107 > 0 && var9 == this.field1106) {
            if (this.field1105 == this.field1104) {
               this.field1114 = 1;
               var7 = this.method713(var9);
               this.method683((Integer)var7.field4081, (Integer)var7.field4080);
            } else {
               this.field1114 = 2;
               var7 = this.method714(var9);
               this.method683((Integer)var7.field4081, (Integer)var7.field4080);
            }
         } else {
            this.field1114 = 0;
            this.method683(var9, var9);
            this.field1106 = var9;
         }

         this.field1107 = 25;
      }

   }

   public void method722(int var1, int var2) {
      if (this.field1100 && this.method702()) {
         var1 += this.field1111;
         var2 += this.field1099;
         class510 var4 = this.method721();
         int var5 = this.field1097.method2376(var1 - (Integer)var4.field4081, var2 - (Integer)var4.field4080);
         class510 var6;
         class510 var7;
         switch (this.field1114) {
            case 0:
               this.method683(this.field1104, var5);
               break;
            case 1:
               var6 = this.method713(this.field1106);
               var7 = this.method713(var5);
               this.method712(var6, var7);
               break;
            case 2:
               var6 = this.method714(this.field1106);
               var7 = this.method714(var5);
               this.method712(var6, var7);
         }
      }

   }

   public void method695(Clipboard var1) {
      class61 var3 = this.field1097.method2355(this.field1104, this.field1105);
      if (!var3.method257()) {
         String var4 = var3.method256();
         if (!var4.isEmpty()) {
            var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
         }
      }

   }

   public void method665(Clipboard var1) {
      if (this.method711()) {
         this.method695(var1);
         this.method682();
      }

   }

   public void method696(Clipboard var1) {
      Transferable var3 = var1.getContents((Object)null);
      if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var4 = this.method708((String)var3.getTransferData(DataFlavor.stringFlavor));
            this.method682();
            class511 var5 = this.field1097.method2356(var4, this.field1105, this.field1096);
            this.method683(var5.method2451(), var5.method2451());
            this.method715();
            this.method720();
         } catch (Exception var6) {
         }
      }

   }

   public void method736() {
      this.field1099 = Math.max(0, this.field1099 - this.field1097.method2363());
   }

   public void method697() {
      int var2 = Math.max(0, this.field1097.method2362() - this.field1110);
      this.field1099 = Math.min(var2, this.field1099 + this.field1097.method2363());
   }

   public void method698(class139 var1) {
      this.field1113 = var1;
   }

   public void method699(class139 var1) {
      this.field1108 = var1;
   }

   public class499 method726() {
      return this.field1097;
   }

   public class499 method700() {
      return this.field1094;
   }

   public class61 method675() {
      return this.field1097.method2355(this.field1104, this.field1105);
   }

   public boolean method702() {
      return this.field1109;
   }

   public boolean method703() {
      return this.field1098;
   }

   public boolean method725() {
      return this.method702() && this.field1095 % 60 < 30;
   }

   public int method704() {
      return this.field1105;
   }

   public int method705() {
      return this.field1104;
   }

   public boolean method706() {
      return this.field1100;
   }

   public int method707() {
      return this.field1111;
   }

   public int method732() {
      return this.field1099;
   }

   public int method738() {
      return this.field1097.method2386();
   }

   public int method734() {
      return this.field1097.method2366();
   }

   public int method740() {
      return this.field1112;
   }

   public int method709() {
      return this.field1101;
   }

   public int method677() {
      return this.field1097.method2374();
   }

   public int method728() {
      return this.field1103;
   }

   public int method671() {
      return this.field1097.method2367();
   }

   public boolean method727() {
      return this.method734() > 1;
   }

   boolean method711() {
      return this.field1105 != this.field1104;
   }

   String method708(String var1) {
      StringBuilder var3 = new StringBuilder(var1.length());

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if (this.method710(var5)) {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   void method712(class510 var1, class510 var2) {
      if ((Integer)var2.field4081 < (Integer)var1.field4081) {
         this.method683((Integer)var1.field4080, (Integer)var2.field4081);
      } else {
         this.method683((Integer)var1.field4081, (Integer)var2.field4080);
      }

   }

   class510 method713(int var1) {
      int var3 = this.field1097.method2349();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.method719(this.field1097.method2364(var6 - 1).field2431)) {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.method719(this.field1097.method2364(var6).field2431)) {
            var5 = var6;
            break;
         }
      }

      return new class510(var4, var5);
   }

   class510 method714(int var1) {
      int var3 = this.field1097.method2349();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.field1097.method2364(var6 - 1).field2431 == '\n') {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.field1097.method2364(var6).field2431 == '\n') {
            var5 = var6;
            break;
         }
      }

      return new class510(var4, var5);
   }

   boolean method715() {
      if (!this.method706()) {
         return false;
      } else {
         boolean var2 = false;
         if (this.field1097.method2349() > this.field1112) {
            this.field1097.method2359(this.field1112, this.field1097.method2349());
            var2 = true;
         }

         int var3 = this.method734();
         int var4;
         if (this.field1097.method2379() > var3) {
            var4 = this.field1097.method2360(0, var3) - 1;
            this.field1097.method2359(var4, this.field1097.method2349());
            var2 = true;
         }

         if (var2) {
            var4 = this.field1105;
            int var5 = this.field1104;
            int var6 = this.field1097.method2349();
            if (this.field1105 > var6) {
               var4 = var6;
            }

            if (this.field1104 > var6) {
               var5 = var6;
            }

            this.method683(var5, var4);
         }

         return var2;
      }
   }

   void method716(int var1, boolean var2) {
      if (var2) {
         this.method683(this.field1104, var1);
      } else {
         this.method683(var1, var1);
      }

   }

   int method717() {
      return this.field1110 / this.field1097.method2363();
   }

   void method718() {
      class61 var2 = this.field1097.method2355(0, this.field1105);
      class510 var3 = var2.method262();
      int var4 = this.field1097.method2363();
      int var5 = (Integer)var3.field4081 - 10;
      int var6 = var5 + 20;
      int var7 = (Integer)var3.field4080 - 3;
      int var8 = var7 + 6 + var4;
      int var9 = this.field1111;
      int var10 = this.field1102 + var9;
      int var11 = this.field1099;
      int var12 = var11 + this.field1110;
      int var13 = this.field1111;
      int var14 = this.field1099;
      if (var5 < var9) {
         var13 = var5;
      } else if (var6 > var10) {
         var13 = var6 - this.field1102;
      }

      if (var7 < var11) {
         var14 = var7;
      } else if (var8 > var12) {
         var14 = var8 - this.field1110;
      }

      this.method672(var13, var14);
   }

   boolean method719(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   void method720() {
      if (null != this.field1113) {
         this.field1113.method502();
      }

   }

   boolean method710(int var1) {
      switch (this.field1103) {
         case 1:
            return class447.method2093((char)var1);
         case 2:
            return class447.method2087((char)var1);
         case 3:
            return class193.method991((char)var1);
         case 4:
            char var3 = (char)var1;
            if (class193.method991(var3)) {
               return true;
            } else {
               if (var3 != 'k' && var3 != 'K' && var3 != 'm' && var3 != 'M' && var3 != 'b' && var3 != 'B') {
                  return false;
               }

               return true;
            }
         default:
            return true;
      }
   }

   class510 method721() {
      int var2 = this.field1097.method2368(this.field1102);
      int var3 = this.field1097.method2369(this.field1110);
      return new class510(var2, var3);
   }
}
