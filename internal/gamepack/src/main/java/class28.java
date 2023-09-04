import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class28 {
   boolean field549 = true;
   boolean field551 = false;
   boolean field560 = false;
   class130 field559;
   class130 field564;
   class7 field545 = new class7();
   class7 field548 = new class7();
   int field546 = 0;
   int field547 = Integer.MAX_VALUE;
   int field550 = 0;
   int field552 = 0;
   int field553 = 0;
   int field554 = 0;
   int field555 = 0;
   int field556 = 0;
   int field557 = 0;
   int field558 = 0;
   int field561 = 0;
   int field562 = 0;
   int field563 = Integer.MAX_VALUE;
   int field565 = 0;

   class28() {
      this.field548.method110(1);
      this.field545.method110(1);
   }

   void method269() {
      this.field546 = (this.field546 + 1) % 60;
      if (this.field558 > 0) {
         --this.field558;
      }

   }

   public boolean method270(boolean var1) {
      var1 = var1 && this.field549;
      boolean var3 = this.field560 != var1;
      this.field560 = var1;
      if (!this.field560) {
         this.method289(this.field556, this.field556);
      }

      return var3;
   }

   public void method300(boolean var1) {
      this.field549 = var1;
      this.field560 = var1 && this.field560;
   }

   boolean method339(String var1) {
      String var3 = this.field548.method79();
      if (!var3.equals(var1)) {
         var1 = this.method314(var1);
         this.field548.method111(var1);
         this.method278(this.field562, this.field550);
         this.method321();
         this.method326();
         return true;
      } else {
         return false;
      }
   }

   boolean method272(String var1) {
      this.field545.method111(var1);
      return true;
   }

   boolean method273(class282 var1) {
      boolean var3 = !this.field551;
      this.field548.method81(var1);
      this.field545.method81(var1);
      this.field551 = true;
      var3 |= this.method278(this.field562, this.field550);
      var3 |= this.method289(this.field555, this.field556);
      if (this.method321()) {
         this.method326();
         var3 = true;
      }

      return var3;
   }

   public boolean method274(int var1, int var2) {
      boolean var4 = this.field553 != var1 || this.field561 != var2;
      this.field553 = var1;
      this.field561 = var2;
      var4 |= this.method278(this.field562, this.field550);
      return var4;
   }

   public boolean method275(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var3 = var1 == this.field548.method115();
      this.field548.method106(var1);
      this.field545.method106(var1);
      if (this.method321()) {
         this.method326();
         var3 = true;
      }

      return var3;
   }

   public boolean method276(int var1) {
      this.field548.method77(var1);
      if (this.method321()) {
         this.method326();
         return true;
      } else {
         return false;
      }
   }

   public boolean method343(int var1) {
      this.field563 = var1;
      if (this.method321()) {
         this.method326();
         return true;
      } else {
         return false;
      }
   }

   public boolean method278(int var1, int var2) {
      if (!this.method312()) {
         this.field562 = var1;
         this.field550 = var2;
         return false;
      } else {
         int var4 = this.field562;
         int var5 = this.field550;
         int var6 = Math.max(0, this.field548.method90() - this.field553 + 2);
         int var7 = Math.max(0, this.field548.method91() - this.field561 + 1);
         this.field562 = Math.max(0, Math.min(var6, var1));
         this.field550 = Math.max(0, Math.min(var7, var2));
         return var4 != this.field562 || this.field550 != var5;
      }
   }

   public boolean method335(int var1, int var2) {
      boolean var4 = true;
      if (var1 < 0 || var1 > 2) {
         var4 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var4 = false;
      }

      return var4 ? this.field548.method82(var1, var2) : false;
   }

   public void method279(int var1) {
      this.field548.method83(var1);
   }

   public void method280(int var1) {
      this.field552 = var1;
   }

   public void method349(int var1) {
      this.field548.method110(var1);
   }

   public void method348(int var1) {
      this.field548.method80(var1);
   }

   public boolean method330(int var1) {
      this.field554 = var1;
      String var3 = this.field548.method79();
      int var4 = var3.length();
      var3 = this.method314(var3);
      if (var3.length() != var4) {
         this.field548.method111(var3);
         this.method278(this.field562, this.field550);
         this.method321();
         this.method326();
         return true;
      } else {
         return false;
      }
   }

   public void method282() {
      this.field551 = false;
   }

   public boolean method329(int var1) {
      if (this.method316(var1)) {
         this.method288();
         class160 var3 = this.field548.method109((char)var1, this.field556, this.field547);
         this.method289(var3.method989(), var3.method989());
         this.method321();
         this.method326();
      }

      return true;
   }

   public void method284() {
      if (!this.method288() && this.field556 > 0) {
         int var2 = this.field548.method87(this.field556 - 1);
         this.method326();
         this.method289(var2, var2);
      }

   }

   public void method285() {
      if (!this.method288() && this.field556 < this.field548.method78()) {
         int var2 = this.field548.method87(this.field556);
         this.method326();
         this.method289(var2, var2);
      }

   }

   public void method286() {
      if (!this.method288() && this.field556 > 0) {
         class467 var2 = this.method319(this.field556 - 1);
         int var3 = this.field548.method88((Integer)var2.field3606, this.field556);
         this.method326();
         this.method289(var3, var3);
      }

   }

   public void method307() {
      if (!this.method288() && this.field556 < this.field548.method78()) {
         class467 var2 = this.method319(this.field556);
         int var3 = this.field548.method88(this.field556, (Integer)var2.field3605);
         this.method326();
         this.method289(var3, var3);
      }

   }

   boolean method288() {
      if (!this.method317()) {
         return false;
      } else {
         int var2 = this.field548.method88(this.field555, this.field556);
         this.method326();
         this.method289(var2, var2);
         return true;
      }
   }

   public void method347() {
      this.method289(0, this.field548.method78());
   }

   public boolean method289(int var1, int var2) {
      if (!this.method312()) {
         this.field555 = var1;
         this.field556 = var2;
         return false;
      } else {
         if (var1 > this.field548.method78()) {
            var1 = this.field548.method78();
         }

         if (var2 > this.field548.method78()) {
            var2 = this.field548.method78();
         }

         boolean var4 = this.field555 != var1 || var2 != this.field556;
         this.field555 = var1;
         if (var2 != this.field556) {
            this.field556 = var2;
            this.field546 = 0;
            this.method324();
         }

         if (var4 && null != this.field559) {
            this.field559.method889();
         }

         return var4;
      }
   }

   public void method290(boolean var1) {
      class467 var3 = this.method320(this.field556);
      this.method322((Integer)var3.field3606, var1);
   }

   public void method291(boolean var1) {
      class467 var3 = this.method320(this.field556);
      this.method322((Integer)var3.field3605, var1);
   }

   public void method292(boolean var1) {
      this.method322(0, var1);
   }

   public void method293(boolean var1) {
      this.method322(this.field548.method78(), var1);
   }

   public void method341(boolean var1) {
      if (this.method317() && !var1) {
         this.method322(Math.min(this.field555, this.field556), var1);
      } else if (this.field556 > 0) {
         this.method322(this.field556 - 1, var1);
      }

   }

   public void method294(boolean var1) {
      if (this.method317() && !var1) {
         this.method322(Math.max(this.field555, this.field556), var1);
      } else if (this.field556 < this.field548.method78()) {
         this.method322(1 + this.field556, var1);
      }

   }

   public void method295(boolean var1) {
      if (this.field556 > 0) {
         class467 var3 = this.method319(this.field556 - 1);
         this.method322((Integer)var3.field3606, var1);
      }

   }

   public void method296(boolean var1) {
      if (this.field556 < this.field548.method78()) {
         class467 var3 = this.method319(1 + this.field556);
         this.method322((Integer)var3.field3605, var1);
      }

   }

   public void method297(boolean var1) {
      if (this.field556 > 0) {
         this.method322(this.field548.method89(this.field556, -1), var1);
      }

   }

   public void method298(boolean var1) {
      if (this.field556 < this.field548.method78()) {
         this.method322(this.field548.method89(this.field556, 1), var1);
      }

   }

   public void method299(boolean var1) {
      if (this.field556 > 0) {
         int var3 = this.method323();
         this.method322(this.field548.method89(this.field556, -var3), var1);
      }

   }

   public void method287(boolean var1) {
      if (this.field556 < this.field548.method78()) {
         int var3 = this.method323();
         this.method322(this.field548.method89(this.field556, var3), var1);
      }

   }

   public void method337(boolean var1) {
      class437 var3 = this.field548.method84(0, this.field556);
      class467 var4 = var3.method2148();
      this.method322(this.field548.method105((Integer)var4.field3606, this.field550), var1);
   }

   public void method336(boolean var1) {
      class437 var3 = this.field548.method84(0, this.field556);
      class467 var4 = var3.method2148();
      this.method322(this.field548.method105((Integer)var4.field3606, this.field561 + this.field550), var1);
   }

   public void method345(int var1, int var2, boolean var3, boolean var4) {
      boolean var6 = false;
      class467 var7;
      int var9;
      if (!this.field551) {
         var9 = 0;
      } else {
         var1 += this.field562;
         var2 += this.field550;
         var7 = this.method327();
         var9 = this.field548.method105(var1 - (Integer)var7.field3606, var2 - (Integer)var7.field3605);
      }

      if (var3 && var4) {
         this.field565 = 1;
         var7 = this.method319(var9);
         class467 var8 = this.method319(this.field557);
         this.method318(var8, var7);
      } else if (var3) {
         this.field565 = 1;
         var7 = this.method319(var9);
         this.method289((Integer)var7.field3606, (Integer)var7.field3605);
         this.field557 = (Integer)var7.field3606;
      } else if (var4) {
         this.method289(this.field557, var9);
      } else {
         if (this.field558 > 0 && var9 == this.field557) {
            if (this.field556 == this.field555) {
               this.field565 = 1;
               var7 = this.method319(var9);
               this.method289((Integer)var7.field3606, (Integer)var7.field3605);
            } else {
               this.field565 = 2;
               var7 = this.method320(var9);
               this.method289((Integer)var7.field3606, (Integer)var7.field3605);
            }
         } else {
            this.field565 = 0;
            this.method289(var9, var9);
            this.field557 = var9;
         }

         this.field558 = 25;
      }

   }

   public void method328(int var1, int var2) {
      if (this.field551 && this.method308()) {
         var1 += this.field562;
         var2 += this.field550;
         class467 var4 = this.method327();
         int var5 = this.field548.method105(var1 - (Integer)var4.field3606, var2 - (Integer)var4.field3605);
         class467 var6;
         class467 var7;
         switch (this.field565) {
            case 0:
               this.method289(this.field555, var5);
               break;
            case 1:
               var6 = this.method319(this.field557);
               var7 = this.method319(var5);
               this.method318(var6, var7);
               break;
            case 2:
               var6 = this.method320(this.field557);
               var7 = this.method320(var5);
               this.method318(var6, var7);
         }
      }

   }

   public void method301(Clipboard var1) {
      class437 var3 = this.field548.method84(this.field555, this.field556);
      if (!var3.method2143()) {
         String var4 = var3.method2142();
         if (!var4.isEmpty()) {
            var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
         }
      }

   }

   public void method271(Clipboard var1) {
      if (this.method317()) {
         this.method301(var1);
         this.method288();
      }

   }

   public void method302(Clipboard var1) {
      Transferable var3 = var1.getContents((Object)null);
      if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var4 = this.method314((String)var3.getTransferData(DataFlavor.stringFlavor));
            this.method288();
            class160 var5 = this.field548.method85(var4, this.field556, this.field547);
            this.method289(var5.method989(), var5.method989());
            this.method321();
            this.method326();
         } catch (Exception var6) {
         }
      }

   }

   public void method342() {
      this.field550 = Math.max(0, this.field550 - this.field548.method92());
   }

   public void method303() {
      int var2 = Math.max(0, this.field548.method91() - this.field561);
      this.field550 = Math.min(var2, this.field550 + this.field548.method92());
   }

   public void method304(class130 var1) {
      this.field564 = var1;
   }

   public void method305(class130 var1) {
      this.field559 = var1;
   }

   public class7 method332() {
      return this.field548;
   }

   public class7 method306() {
      return this.field545;
   }

   public class437 method281() {
      return this.field548.method84(this.field555, this.field556);
   }

   public boolean method308() {
      return this.field560;
   }

   public boolean method309() {
      return this.field549;
   }

   public boolean method331() {
      return this.method308() && this.field546 % 60 < 30;
   }

   public int method310() {
      return this.field556;
   }

   public int method311() {
      return this.field555;
   }

   public boolean method312() {
      return this.field551;
   }

   public int method313() {
      return this.field562;
   }

   public int method338() {
      return this.field550;
   }

   public int method344() {
      return this.field548.method115();
   }

   public int method340() {
      return this.field548.method95();
   }

   public int method346() {
      return this.field563;
   }

   public int method315() {
      return this.field552;
   }

   public int method283() {
      return this.field548.method103();
   }

   public int method334() {
      return this.field554;
   }

   public int method277() {
      return this.field548.method96();
   }

   public boolean method333() {
      return this.method340() > 1;
   }

   boolean method317() {
      return this.field556 != this.field555;
   }

   String method314(String var1) {
      StringBuilder var3 = new StringBuilder(var1.length());

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if (this.method316(var5)) {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   void method318(class467 var1, class467 var2) {
      if ((Integer)var2.field3606 < (Integer)var1.field3606) {
         this.method289((Integer)var1.field3605, (Integer)var2.field3606);
      } else {
         this.method289((Integer)var1.field3606, (Integer)var2.field3605);
      }

   }

   class467 method319(int var1) {
      int var3 = this.field548.method78();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.method325(this.field548.method93(var6 - 1).field4170)) {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.method325(this.field548.method93(var6).field4170)) {
            var5 = var6;
            break;
         }
      }

      return new class467(var4, var5);
   }

   class467 method320(int var1) {
      int var3 = this.field548.method78();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.field548.method93(var6 - 1).field4170 == '\n') {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.field548.method93(var6).field4170 == '\n') {
            var5 = var6;
            break;
         }
      }

      return new class467(var4, var5);
   }

   boolean method321() {
      if (!this.method312()) {
         return false;
      } else {
         boolean var2 = false;
         if (this.field548.method78() > this.field563) {
            this.field548.method88(this.field563, this.field548.method78());
            var2 = true;
         }

         int var3 = this.method340();
         int var4;
         if (this.field548.method108() > var3) {
            var4 = this.field548.method89(0, var3) - 1;
            this.field548.method88(var4, this.field548.method78());
            var2 = true;
         }

         if (var2) {
            var4 = this.field556;
            int var5 = this.field555;
            int var6 = this.field548.method78();
            if (this.field556 > var6) {
               var4 = var6;
            }

            if (this.field555 > var6) {
               var5 = var6;
            }

            this.method289(var5, var4);
         }

         return var2;
      }
   }

   void method322(int var1, boolean var2) {
      if (var2) {
         this.method289(this.field555, var1);
      } else {
         this.method289(var1, var1);
      }

   }

   int method323() {
      return this.field561 / this.field548.method92();
   }

   void method324() {
      class437 var2 = this.field548.method84(0, this.field556);
      class467 var3 = var2.method2148();
      int var4 = this.field548.method92();
      int var5 = (Integer)var3.field3606 - 10;
      int var6 = var5 + 20;
      int var7 = (Integer)var3.field3605 - 3;
      int var8 = var7 + 6 + var4;
      int var9 = this.field562;
      int var10 = this.field553 + var9;
      int var11 = this.field550;
      int var12 = var11 + this.field561;
      int var13 = this.field562;
      int var14 = this.field550;
      if (var5 < var9) {
         var13 = var5;
      } else if (var6 > var10) {
         var13 = var6 - this.field553;
      }

      if (var7 < var11) {
         var14 = var7;
      } else if (var8 > var12) {
         var14 = var8 - this.field561;
      }

      this.method278(var13, var14);
   }

   boolean method325(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   void method326() {
      if (null != this.field564) {
         this.field564.method889();
      }

   }

   boolean method316(int var1) {
      switch (this.field554) {
         case 1:
            return class330.method1746((char)var1);
         case 2:
            return class330.method1740((char)var1);
         case 3:
            return class519.method2475((char)var1);
         case 4:
            char var3 = (char)var1;
            if (class519.method2475(var3)) {
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

   class467 method327() {
      int var2 = this.field548.method97(this.field553);
      int var3 = this.field548.method98(this.field561);
      return new class467(var2, var3);
   }
}
