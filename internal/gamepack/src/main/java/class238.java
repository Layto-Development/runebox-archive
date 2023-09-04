import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class238 implements KeyListener, FocusListener {
   static class338 field1742;
   static int field1735;
   static int field1736;
   boolean[] field1739 = new boolean[112];
   class44[] field1738 = new class44[3];
   Collection field1737 = new ArrayList(100);
   Collection field1741 = new ArrayList(100);
   volatile int field1740 = 0;

   class238() {
   }

   void method1159(class44 var1, int var2) {
      this.field1738[var2] = var1;
   }

   public int method1160() {
      return this.field1740;
   }

   void method1158(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   synchronized void method1161(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field1741.add(new class79(4, 0));
      }
   }

   void method1162() {
      ++this.field1740;
      this.method1163();
      Iterator var2 = this.field1737.iterator();

      while(var2.hasNext()) {
         class79 var3 = (class79)var2.next();

         for(int var4 = 0; var4 < this.field1738.length && !var3.method314(this.field1738[var4]); ++var4) {
         }
      }

      this.field1737.clear();
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < class150.method569()) {
         var2 = class150.method570(var2);
         boolean var3 = 0 != (var2 & 128);
         if (var3) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.field1739[var2] = true;
         this.field1741.add(new class79(1, var2));
         this.field1740 = 0;
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label16: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class150.field959.length;
            if (var2 < var4) {
               var2 = class150.method570(var2) & -129;
               break label16;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field1739[var2] = false;
         this.field1741.add(new class79(2, var2));
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
                  char[] var4 = class459.field3647;

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
            this.field1741.add(new class79(3, var2));
         }
      }

      var1.consume();
   }

   synchronized void method1163() {
      Collection var2 = this.field1737;
      this.field1737 = this.field1741;
      this.field1741 = var2;
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field1741.add(new class79(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.field1739[var2]) {
            this.field1739[var2] = false;
            this.field1741.add(new class79(2, var2));
         }
      }

      this.field1741.add(new class79(4, 0));
   }
}
