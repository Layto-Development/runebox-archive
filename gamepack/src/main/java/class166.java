import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfInfo(name = "bf")
public class class166 implements MouseListener, MouseMotionListener, FocusListener {
	@ObfInfo(name = "at", desc = "Lbf;")
	public static class166 field1577;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1675983005)
	public static int field1563;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -2109837207)
	public static int field1570;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -1466521579)
	public static int field1574;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -163059513)
	public static int field1575;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1953612693)
	public static int field1576;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 72258787)
	public static int field1580;
	@ObfInfo(name = "as", desc = "J", longMultiplier = 4296976941923200635L)
	public static long field1564;
	@ObfInfo(name = "al", desc = "J", longMultiplier = -6694168432919730217L)
	public static long field1571;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -516344517)
	public static volatile int field1566;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1431180941)
	public static volatile int field1567;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1639177563)
	public static volatile int field1568;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1494561027)
	public static volatile int field1572;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1067270293)
	public static volatile int field1579;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -1385110719)
	public static volatile int field1581;
	@ObfInfo(name = "aa", desc = "J", longMultiplier = 245110053620769011L)
	public static volatile long field1569;
	@ObfInfo(name = "ag", desc = "J", longMultiplier = -4128736015997000351L)
	public static volatile long field1573;
	@ObfInfo(name = "uf", desc = "I", intMultiplier = 1970459575)
	static int field1578;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 915863853)
	static volatile int field1565;

	static {
		field1577 = new class166();
		field1565 = 0;
		field1566 = 0;
		field1567 = -1;
		field1568 = -1;
		field1569 = -1L;
		field1570 = 0;
		field1580 = 0;
		field1563 = 0;
		field1571 = 0L;
		field1572 = 0;
		field1581 = 0;
		field1579 = 0;
		field1573 = 0L;
		field1574 = 0;
		field1575 = 0;
		field1576 = 0;
		field1564 = 0L;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class166() {
	}

	@ObfInfo(name = "ao", desc = "(Ljava/awt/event/MouseEvent;I)I", opaqueValue = "-343088867")
	final int method945(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	@ObfInfo(name = "mousePressed", desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mousePressed(MouseEvent var1) {
		if (null != field1577) {
			field1565 = 0;
			field1581 = var1.getX();
			field1579 = var1.getY();
			field1573 = class43.method443();
			field1572 = this.method945(var1);
			if (field1572 != 0) {
				field1566 = field1572;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(name = "mouseReleased", desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (null != field1577) {
			field1565 = 0;
			field1566 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(name = "mouseClicked", desc = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(name = "mouseEntered", desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfInfo(name = "mouseExited", desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseExited(MouseEvent var1) {
		if (field1577 != null) {
			field1565 = 0;
			field1567 = -1;
			field1568 = -1;
			field1569 = var1.getWhen();
		}

	}

	@ObfInfo(name = "mouseDragged", desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfInfo(name = "mouseMoved", desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseMoved(MouseEvent var1) {
		if (null != field1577) {
			field1565 = 0;
			field1567 = var1.getX();
			field1568 = var1.getY();
			field1569 = var1.getWhen();
		}

	}

	@ObfInfo(name = "focusGained", desc = "(Ljava/awt/event/FocusEvent;)V")
	public final void focusGained(FocusEvent var1) {
	}

	@ObfInfo(name = "focusLost", desc = "(Ljava/awt/event/FocusEvent;)V")
	public final synchronized void focusLost(FocusEvent var1) {
		if (field1577 != null) {
			field1566 = 0;
		}

	}

	@ObfInfo(name = "au", desc = "(S)I")
	public static int method947() {
		return ++field1565 - 1;
	}

	@ObfInfo(name = "ae", desc = "(IB)V")
	public static void method946(int var0) {
		field1565 = var0;
	}
}
