import java.applet.Applet;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class451 implements KeyListener, FocusListener {
	static class20 field3950;
	static int field3943;
	static int field3944;
	boolean[] field3947;
	class68[] field3946;
	Collection field3945;
	Collection field3949;
	volatile int field3948;

	class451() {
		this.field3946 = new class68[3];
		this.field3947 = new boolean[112];
		this.field3948 = 0;
		this.field3949 = new ArrayList(100);
		this.field3945 = new ArrayList(100);
	}

	void method2242(class68 var1, int var2) {
		this.field3946[var2] = var1;
	}

	public int method2243() {
		return this.field3948;
	}

	void method2241(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	synchronized void method2244(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field3949.add(new class47(4, 0));
		}
	}

	void method2245() {
		++this.field3948;
		this.method2246();
		Iterator var2 = this.field3945.iterator();

		while (var2.hasNext()) {
			class47 var3 = (class47)var2.next();

			for (int var4 = 0; var4 < this.field3946.length && !var3.method351(this.field3946[var4]); ++var4) {
			}
		}

		this.field3945.clear();
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < class26.method208()) {
			var2 = class297.method1692(var2);
			boolean var3 = (var2 & 128) != 0;
			if (var3) {
				var2 = -1;
			}
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.field3947[var2] = true;
			this.field3949.add(new class47(1, var2));
			this.field3948 = 0;
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class15.field382.length;
				if (var2 < var4) {
					var2 = class297.method1692(var2) & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field3947[var2] = false;
			this.field3949.add(new class47(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class389.field3272;

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
				this.field3949.add(new class47(3, var2));
			}
		}

		var1.consume();
	}

	synchronized void method2246() {
		Collection var2 = this.field3945;
		this.field3945 = this.field3949;
		this.field3949 = var2;
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field3949.add(new class47(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field3947[var2]) {
				this.field3947[var2] = false;
				this.field3949.add(new class47(2, var2));
			}
		}

		this.field3949.add(new class47(4, 0));
	}

	public static class367 method2249(class367[] var0, int var1) {
		class367[] var3 = var0;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class367 var5 = var3[var4];
			if (var1 == var5.method1970()) {
				return var5;
			}
		}

		return null;
	}

	public static void method2247(Applet var0, String var1) {
		class504.field4174 = var0;
		if (null != var1) {
			class504.field4173 = var1;
		}

	}

	static Object[] method2251(class42 var0, int[] var1) {
		int var3 = var0.method325();
		Object[] var4 = new Object[var3 * var1.length];

		for (int var5 = 0; var5 < var3; ++var5) {
			for (int var6 = 0; var6 < var1.length; ++var6) {
				int var7 = var6 + var1.length * var5;
				class140 var8 = class393.method2063(var1[var6]);
				var4[var7] = var8.method840(var0);
			}
		}

		return var4;
	}

	public static char method2250(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00df':
			return 'b';
		case '\u00ff':
		case '\u0178':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	static void method2248(int var0) {
		class281 var2 = (class281)class281.field2506.method1492((long)var0);
		if (null != var2) {
			var2.method2269();
		}
	}
}
