import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class391 implements class403, MouseWheelListener {

	int field3109;

	class391() {
		this.field3109 = 0;
	}

	void method2028(Component var1) {
		var1.addMouseWheelListener(this);
	}

	void method2030(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field3109 += var1.getWheelRotation();
	}

	@Override
	public synchronized int method2064() {
		int var2 = this.field3109;
		this.field3109 = 0;
		return var2;
	}
}
