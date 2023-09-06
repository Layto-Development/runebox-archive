import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class145 implements class294, MouseWheelListener {
	int field1382;

	class145() {
		this.field1382 = 0;
	}

	void method848(Component var1) {
		var1.addMouseWheelListener(this);
	}

	void method850(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field1382 += var1.getWheelRotation();
	}

	public synchronized int method1676() {
		int var2 = this.field1382;
		this.field1382 = 0;
		return var2;
	}
}
