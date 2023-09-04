import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class113 implements KeyListener, FocusListener {
   static class327 field1463;
   static int field1456;
   static int field1457;
   boolean[] field1460 = new boolean[112];
   class203[] field1459 = new class203[3];
   Collection field1458 = new ArrayList(100);
   Collection field1462 = new ArrayList(100);
   volatile int field1461 = 0;

   class113() {
   }

   void method810(class203 var1, int var2) {
      this.field1459[var2] = var1;
   }

   public int method811() {
      return this.field1461;
   }

   void method809(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   synchronized void method812(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field1462.add(new class180(4, 0));
      }
   }

   void method813() {
      ++this.field1461;
      this.method814();
      Iterator var2 = this.field1458.iterator();

      while(var2.hasNext()) {
         class180 var3 = (class180)var2.next();

         for(int var4 = 0; var4 < this.field1459.length && !var3.method1109(this.field1459[var4]); ++var4) {
         }
      }

      this.field1458.clear();
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < class57.method609()) {
         var2 = class57.method610(var2);
         boolean var3 = (var2 & 128) != 0;
         if (var3) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.field1460[var2] = true;
         this.field1462.add(new class180(1, var2));
         this.field1461 = 0;
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label16: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class57.field1080.length;
            if (var2 < var4) {
               var2 = class57.method610(var2) & -129;
               break label16;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field1460[var2] = false;
         this.field1462.add(new class180(2, var2));
      }

      var1.consume();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff') {
         boolean var3;
         if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
            label47: {
               if (var2 != 0) {
                  char[] var4 = class162.field1691;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label47;
                     }
                  }
               }

               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (var3) {
            this.field1462.add(new class180(3, var2));
         }
      }

      var1.consume();
   }

   synchronized void method814() {
      Collection var2 = this.field1458;
      this.field1458 = this.field1462;
      this.field1462 = var2;
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field1462.add(new class180(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.field1460[var2]) {
            this.field1460[var2] = false;
            this.field1462.add(new class180(2, var2));
         }
      }

      this.field1462.add(new class180(4, 0));
   }
}
