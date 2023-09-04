import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class435 implements class457, MouseWheelListener {
   int field3311 = 0;

   class435() {
   }

   void method2134(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method2136(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field3311 += var1.getWheelRotation();
   }

   public synchronized int method2250() {
      int var2 = this.field3311;
      this.field3311 = 0;
      return var2;
   }
}
