import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class496 implements MouseListener, MouseMotionListener, FocusListener {
   public static class496 field3974 = new class496();
   public static int field3960 = 0;
   public static int field3967 = 0;
   public static int field3971 = 0;
   public static int field3972 = 0;
   public static int field3973 = 0;
   public static int field3977 = 0;
   public static long field3961 = 0L;
   public static long field3968 = 0L;
   public static volatile int field3963 = 0;
   public static volatile int field3964 = -1;
   public static volatile int field3965 = -1;
   public static volatile int field3969 = 0;
   public static volatile int field3976 = 0;
   public static volatile int field3978 = 0;
   public static volatile long field3966 = -1L;
   public static volatile long field3970 = 0L;
   static int field3975;
   static volatile int field3962 = 0;

   class496() {
   }

   final int method2343(MouseEvent var1) {
      int var3 = var1.getButton();
      if (!var1.isAltDown() && var3 != 2) {
         return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (null != field3974) {
         field3962 = 0;
         field3978 = var1.getX();
         field3976 = var1.getY();
         field3970 = class123.method471();
         field3969 = this.method2343(var1);
         if (field3969 != 0) {
            field3963 = field3969;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (null != field3974) {
         field3962 = 0;
         field3963 = 0;
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
      if (field3974 != null) {
         field3962 = 0;
         field3964 = -1;
         field3965 = -1;
         field3966 = var1.getWhen();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (null != field3974) {
         field3962 = 0;
         field3964 = var1.getX();
         field3965 = var1.getY();
         field3966 = var1.getWhen();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field3974 != null) {
         field3963 = 0;
      }

   }

   public static int method2345() {
      return ++field3962 - 1;
   }

   public static void method2344(int var0) {
      field3962 = var0;
   }
}
