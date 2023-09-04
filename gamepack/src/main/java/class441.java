import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class441 implements MouseListener, MouseMotionListener, FocusListener {
   public static class441 field3346 = new class441();
   public static int field3332 = 0;
   public static int field3339 = 0;
   public static int field3343 = 0;
   public static int field3344 = 0;
   public static int field3345 = 0;
   public static int field3349 = 0;
   public static long field3333 = 0L;
   public static long field3340 = 0L;
   public static volatile int field3335 = 0;
   public static volatile int field3336 = -1;
   public static volatile int field3337 = -1;
   public static volatile int field3341 = 0;
   public static volatile int field3348 = 0;
   public static volatile int field3350 = 0;
   public static volatile long field3338 = -1L;
   public static volatile long field3342 = 0L;
   static int field3347;
   static volatile int field3334 = 0;

   class441() {
   }

   final int method2159(MouseEvent var1) {
      int var3 = var1.getButton();
      if (!var1.isAltDown() && var3 != 2) {
         return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (null != field3346) {
         field3334 = 0;
         field3350 = var1.getX();
         field3348 = var1.getY();
         field3342 = class80.method713();
         field3341 = this.method2159(var1);
         if (field3341 != 0) {
            field3335 = field3341;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (null != field3346) {
         field3334 = 0;
         field3335 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (field3346 != null) {
         field3334 = 0;
         field3336 = -1;
         field3337 = -1;
         field3338 = var1.getWhen();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (null != field3346) {
         field3334 = 0;
         field3336 = var1.getX();
         field3337 = var1.getY();
         field3338 = var1.getWhen();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field3346 != null) {
         field3335 = 0;
      }

   }

   public static int method2161() {
      return ++field3334 - 1;
   }

   public static void method2160(int var0) {
      field3334 = var0;
   }
}
