import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class184 implements MouseListener, MouseMotionListener, FocusListener {
	public static class184 field1742;
	public static int field1728;
	public static int field1735;
	public static int field1739;
	public static int field1740;
	public static int field1741;
	public static int field1745;
	public static long field1729;
	public static long field1736;
	public static volatile int field1731;
	public static volatile int field1732;
	public static volatile int field1733;
	public static volatile int field1737;
	public static volatile int field1744;
	public static volatile int field1746;
	public static volatile long field1734;
	public static volatile long field1738;
	static int field1743;
	static volatile int field1730;

	static {
		field1742 = new class184();
		field1730 = 0;
		field1731 = 0;
		field1732 = -1;
		field1733 = -1;
		field1734 = -1L;
		field1735 = 0;
		field1745 = 0;
		field1728 = 0;
		field1736 = 0L;
		field1737 = 0;
		field1746 = 0;
		field1744 = 0;
		field1738 = 0L;
		field1739 = 0;
		field1740 = 0;
		field1741 = 0;
		field1729 = 0L;
	}

	class184() {
	}

	final int method1018(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (null != field1742) {
			field1730 = 0;
			field1746 = var1.getX();
			field1744 = var1.getY();
			field1738 = class172.method977();
			field1737 = this.method1018(var1);
			if (field1737 != 0) {
				field1731 = field1737;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (null != field1742) {
			field1730 = 0;
			field1731 = 0;
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
		if (field1742 != null) {
			field1730 = 0;
			field1732 = -1;
			field1733 = -1;
			field1734 = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (null != field1742) {
			field1730 = 0;
			field1732 = var1.getX();
			field1733 = var1.getY();
			field1734 = var1.getWhen();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (field1742 != null) {
			field1731 = 0;
		}

	}

	static void method1019(int var0, String var1, String var2) {
		class483.method2399(var0, var1, var2, (String)null);
	}

	static final void method1020(String var0) {
		class160 var2 = class85.method556(class129.field1183, Client.field68.field2426);
		var2.field1483.method267(class431.method2196(var0));
		var2.field1483.method270(var0);
		Client.field68.method1570(var2);
	}

	static void method1017(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var4 = var0 >> 8;
			int var5 = var0 >> 4 & 7;
			int var6 = var0 & 15;
			Client.field259[Client.field258] = var4;
			Client.field260[Client.field258] = var5;
			Client.field215[Client.field258] = 0;
			Client.field47[Client.field258] = null;
			int var7 = (var1 - 64) / 128;
			int var8 = (var2 - 64) / 128;
			Client.field10[Client.field258] = (var7 << 16) + (var8 << 8) + var6;
			++Client.field258;
		}
	}
}
