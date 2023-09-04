import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class253 implements class45, MouseWheelListener {
   int field1839 = 0;

   class253() {
   }

   void method1195(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method1196(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field1839 += var1.getWheelRotation();
   }

   public synchronized int method185() {
      int var2 = this.field1839;
      this.field1839 = 0;
      return var2;
   }
}
