import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class471 implements KeyListener, FocusListener {

	static class241 field3719;

	static int field3712;

	static int field3713;

	boolean[] field3716;

	class188[] field3715;

	Collection field3714;

	Collection field3718;

	volatile int field3717;

	class471() {
		this.field3715 = new class188[3];
		this.field3716 = new boolean[112];
		this.field3717 = 0;
		this.field3718 = new ArrayList(100);
		this.field3714 = new ArrayList(100);
	}

	void method2295(class188 var1, int var2) {
		this.field3715[var2] = var1;
	}

	public int method2296() {
		return this.field3717;
	}

	void method2294(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	synchronized void method2297(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized (this) {
			this.field3718.add(new class474(4, 0));
		}
	}

	void method2298() {
		++this.field3717;
		this.method2299();
		Iterator var2 = this.field3714.iterator();
		while (var2.hasNext()) {
			class474 var3 = (class474) var2.next();
			for (int var4 = 0; var4 < this.field3715.length && !var3.method2302(this.field3715[var4]); ++var4) {
			}
		}
		this.field3714.clear();
	}

	@Override
	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < class73.method312()) {
			var2 = class73.method313(var2);
			boolean var3 = (var2 & 128) != 0;
			if (var3) {
				var2 = -1;
			}
		} else {
			var2 = -1;
		}
		if (var2 >= 0) {
			this.field3716[var2] = true;
			this.field3718.add(new class474(1, var2));
			this.field3717 = 0;
		}
		var1.consume();
	}

	@Override
	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class73.field729.length;
				if (var2 < var4) {
					var2 = class73.method313(var2) & -129;
					break label16;
				}
			}
			var2 = -1;
		}
		if (var2 >= 0) {
			this.field3716[var2] = false;
			this.field3718.add(new class474(2, var2));
		}
		var1.consume();
	}

	@Override
	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class111.field1317;
						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var6 == var2) {
								var3 = true;
								break label47;
							}
						}
					}
					var3 = false;
				}
			} else {
				var3 = true;
			}
			if (var3) {
				this.field3718.add(new class474(3, var2));
			}
		}
		var1.consume();
	}

	synchronized void method2299() {
		Collection var2 = this.field3714;
		this.field3714 = this.field3718;
		this.field3718 = var2;
	}

	@Override
	public final synchronized void focusGained(FocusEvent var1) {
		this.field3718.add(new class474(4, 1));
	}

	@Override
	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field3716[var2]) {
				this.field3716[var2] = false;
				this.field3718.add(new class474(2, var2));
			}
		}
		this.field3718.add(new class474(4, 0));
	}
}
