import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfInfo(name = "ak")
public class class171 implements KeyListener, FocusListener {
	@ObfInfo(name = "rb", desc = "Lej;")
	static class308 field1595;
	@ObfInfo(name = "gp", desc = "I", intMultiplier = -9167837)
	static int field1588;
	@ObfInfo(name = "uw", desc = "I", intMultiplier = 712005029)
	static int field1589;
	@ObfInfo(name = "ac", desc = "[Z")
	boolean[] field1592;
	@ObfInfo(name = "at", desc = "[Lbv;")
	class53[] field1591;
	@ObfInfo(name = "ao", desc = "Ljava/util/Collection;")
	Collection field1590;
	@ObfInfo(name = "ae", desc = "Ljava/util/Collection;")
	Collection field1594;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1759868525)
	volatile int field1593;

	@ObfInfo(name = "<init>", desc = "()V")
	class171() {
		this.field1591 = new class53[3];
		this.field1592 = new boolean[112];
		this.field1593 = 0;
		this.field1594 = new ArrayList(100);
		this.field1590 = new ArrayList(100);
	}

	@ObfInfo(name = "au", desc = "(Lbv;II)V")
	void method956(class53 var1, int var2) {
		this.field1591[var2] = var1;
	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method957() {
		return this.field1593;
	}

	@ObfInfo(name = "ao", desc = "(Ljava/awt/Component;B)V")
	void method955(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfInfo(name = "at", desc = "(Ljava/awt/Component;B)V")
	synchronized void method958(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field1594.add(new class117(4, 0));
		}
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaqueValue = "1964990131")
	void method959() {
		++this.field1593;
		this.method960();
		Iterator var2 = this.field1590.iterator();

		while (var2.hasNext()) {
			class117 var3 = (class117)var2.next();

			for (int var4 = 0; var4 < this.field1591.length && !var3.method682(this.field1591[var4]); ++var4) {
			}
		}

		this.field1590.clear();
	}

	@ObfInfo(name = "keyPressed", desc = "(Ljava/awt/event/KeyEvent;)V")
	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < class310.method1721()) {
			var2 = class310.method1722(var2);
			boolean var3 = (var2 & 128) != 0;
			if (var3) {
				var2 = -1;
			}
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.field1592[var2] = true;
			this.field1594.add(new class117(1, var2));
			this.field1593 = 0;
		}

		var1.consume();
	}

	@ObfInfo(name = "keyReleased", desc = "(Ljava/awt/event/KeyEvent;)V")
	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class310.field2522.length;
				if (var2 < var4) {
					var2 = class310.method1722(var2) & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field1592[var2] = false;
			this.field1594.add(new class117(2, var2));
		}

		var1.consume();
	}

	@ObfInfo(name = "keyTyped", desc = "(Ljava/awt/event/KeyEvent;)V")
	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class244.field2013;

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
				this.field1594.add(new class117(3, var2));
			}
		}

		var1.consume();
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	synchronized void method960() {
		Collection var2 = this.field1590;
		this.field1590 = this.field1594;
		this.field1594 = var2;
	}

	@ObfInfo(name = "focusGained", desc = "(Ljava/awt/event/FocusEvent;)V")
	public final synchronized void focusGained(FocusEvent var1) {
		this.field1594.add(new class117(4, 1));
	}

	@ObfInfo(name = "focusLost", desc = "(Ljava/awt/event/FocusEvent;)V")
	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field1592[var2]) {
				this.field1592[var2] = false;
				this.field1594.add(new class117(2, var2));
			}
		}

		this.field1594.add(new class117(4, 0));
	}
}
