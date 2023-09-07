import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class17 implements class420, MouseWheelListener {
    int field64;

    class17() {
        this.field64 = 0;
    }

    void method42(Component var1) {
        var1.addMouseWheelListener(this);
    }

    void method44(Component var1) {
        var1.removeMouseWheelListener(this);
    }

    @Override
    public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
        this.field64 += var1.getWheelRotation();
    }

    @Override
    public synchronized int method1937() {
        int var2 = this.field64;
        this.field64 = 0;
        return var2;
    }
}
