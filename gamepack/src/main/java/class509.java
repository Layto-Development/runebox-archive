import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfInfo(name = "ay")
public final class class509 implements class359, MouseWheelListener {
	@ObfInfo(name = "au", desc = "I", intMultiplier = -489749087)
	int field4094;

	@ObfInfo(name = "<init>", desc = "()V")
	class509() {
		this.field4094 = 0;
	}

	@ObfInfo(name = "au", desc = "(Ljava/awt/Component;S)V")
	void method2512(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfInfo(name = "ae", desc = "(Ljava/awt/Component;B)V")
	void method2513(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfInfo(name = "mouseWheelMoved", desc = "(Ljava/awt/event/MouseWheelEvent;)V")
	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field4094 += var1.getWheelRotation();
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public synchronized int method1969() {
		int var2 = this.field4094;
		this.field4094 = 0;
		return var2;
	}
}
