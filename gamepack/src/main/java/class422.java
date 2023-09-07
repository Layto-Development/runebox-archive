import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class422 implements MouseListener, MouseMotionListener, FocusListener {

	public static class422 field3267;

	public static int field3253;

	public static int field3260;

	public static int field3264;

	public static int field3265;

	public static int field3266;

	public static int field3270;

	public static long field3254;

	public static long field3261;

	public static volatile int field3256;

	public static volatile int field3257;

	public static volatile int field3258;

	public static volatile int field3262;

	public static volatile int field3269;

	public static volatile int field3271;

	public static volatile long field3259;

	public static volatile long field3263;

	static int field3268;

	static volatile int field3255;

	static {
		field3267 = new class422();
		field3255 = 0;
		field3256 = 0;
		field3257 = -1;
		field3258 = -1;
		field3259 = -1L;
		field3260 = 0;
		field3270 = 0;
		field3253 = 0;
		field3261 = 0L;
		field3262 = 0;
		field3271 = 0;
		field3269 = 0;
		field3263 = 0L;
		field3264 = 0;
		field3265 = 0;
		field3266 = 0;
		field3254 = 0L;
	}

	class422() {
	}

	final int method2122(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	@Override
	public final synchronized void mousePressed(MouseEvent var1) {
		if (null != field3267) {
			field3255 = 0;
			field3271 = var1.getX();
			field3269 = var1.getY();
			field3263 = class48.method197();
			field3262 = this.method2122(var1);
			if (field3262 != 0) {
				field3256 = field3262;
			}
		}
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@Override
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (null != field3267) {
			field3255 = 0;
			field3256 = 0;
		}
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@Override
	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@Override
	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@Override
	public final synchronized void mouseExited(MouseEvent var1) {
		if (field3267 != null) {
			field3255 = 0;
			field3257 = -1;
			field3258 = -1;
			field3259 = var1.getWhen();
		}
	}

	@Override
	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@Override
	public final synchronized void mouseMoved(MouseEvent var1) {
		if (null != field3267) {
			field3255 = 0;
			field3257 = var1.getX();
			field3258 = var1.getY();
			field3259 = var1.getWhen();
		}
	}

	@Override
	public final void focusGained(FocusEvent var1) {
	}

	@Override
	public final synchronized void focusLost(FocusEvent var1) {
		if (field3267 != null) {
			field3256 = 0;
		}
	}

	public static int method2124() {
		return ++field3255 - 1;
	}

	public static void method2123(int var0) {
		field3255 = var0;
	}
}
