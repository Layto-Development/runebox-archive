import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class class522 extends Applet implements Runnable, FocusListener, WindowListener {

	protected static class420 field4135;

	protected static class471 field4163;

	protected static int field4140;

	static boolean field4142;

	static class522 field4146;

	static int field4132;

	static int field4136;

	static int field4137;

	static int field4138;

	static int field4155;

	static Image field4157;

	static long field4134;

	static long field4158;

	static long field4165;

	static long[] field4133;

	static long[] field4141;

	static volatile boolean field4162;

	boolean field4130;

	boolean field4156;

	class391 field4159;

	int field4131;

	int field4144;

	int field4147;

	int field4149;

	int field4153;

	int field4164;

	Canvas field4152;

	Frame field4151;

	Clipboard field4160;

	final EventQueue field4161;

	protected boolean field4150;

	protected int field4148;

	protected int field4154;

	volatile boolean field4139;

	volatile boolean field4143;

	volatile long field4145;

	static {
		field4146 = null;
		field4132 = 0;
		field4158 = 0L;
		field4142 = false;
		field4137 = 20;
		field4138 = 1;
		field4140 = 0;
		field4133 = new long[32];
		field4141 = new long[32];
		field4155 = 500;
		field4162 = true;
		field4163 = new class471();
		field4134 = -1L;
		field4165 = -1L;
	}

	protected class522() {
		this.field4130 = false;
		this.field4144 = 0;
		this.field4164 = 0;
		this.field4150 = false;
		this.field4143 = true;
		this.field4156 = false;
		this.field4139 = false;
		this.field4145 = 0L;
		EventQueue var1 = null;
		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}
		this.field4161 = var1;
		class169 var2 = new class169();
		class460.field3496 = var2;
	}

	protected abstract void method2523();

	protected abstract void method2531();

	protected abstract void method2542(boolean var1);

	protected abstract void method2546();

	protected abstract void method2552();

	protected abstract void method2553();

	@Override
	public abstract void init();

	protected final void method2522(int var1, int var2) {
		if (var1 != this.field4153 || this.field4149 != var2) {
			this.method2540();
		}
		this.field4153 = var1;
		this.field4149 = var2;
	}

	final void method2548(Object var1) {
		if (this.field4161 != null) {
			for (int var3 = 0; var3 < 50 && this.field4161.peekEvent() != null; ++var3) {
				class39.method171(1L);
			}
			if (var1 != null) {
				this.field4161.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}
		}
	}

	protected class403 method2556() {
		if (null == this.field4159) {
			this.field4159 = new class391();
			this.field4159.method2028(this.field4152);
		}
		return this.field4159;
	}

	protected void method2524() {
		this.field4160 = this.getToolkit().getSystemClipboard();
	}

	protected void method2525(String var1) {
		this.field4160.setContents(new StringSelection(var1), (ClipboardOwner) null);
	}

	protected Clipboard method2526() {
		return this.field4160;
	}

	protected final void method2527() {
		if (class420.field3242.toLowerCase().indexOf("microsoft") != -1) {
			class73.field729[186] = 57;
			class73.field729[187] = 27;
			class73.field729[188] = 71;
			class73.field729[189] = 26;
			class73.field729[190] = 72;
			class73.field729[191] = 73;
			class73.field729[192] = 58;
			class73.field729[219] = 42;
			class73.field729[220] = 74;
			class73.field729[221] = 43;
			class73.field729[222] = 59;
			class73.field729[223] = 28;
		} else {
			class73.field729[44] = 71;
			class73.field729[45] = 26;
			class73.field729[46] = 72;
			class73.field729[47] = 73;
			class73.field729[59] = 57;
			class73.field729[61] = 27;
			class73.field729[91] = 42;
			class73.field729[92] = 74;
			class73.field729[93] = 43;
			class73.field729[192] = 28;
			class73.field729[222] = 58;
			class73.field729[520] = 59;
		}
		field4163.method2294(this.field4152);
	}

	protected final void method2528() {
		field4163.method2298();
	}

	protected void method2554(class188 var1, int var2) {
		field4163.method2295(var1, var2);
	}

	protected final void method2529() {
		Canvas var2 = this.field4152;
		var2.addMouseListener(class422.field3267);
		var2.addMouseMotionListener(class422.field3267);
		var2.addFocusListener(class422.field3267);
	}

	final void method2530() {
		Container var2 = this.method2544();
		if (var2 != null) {
			class166 var3 = this.method2545();
			this.field4148 = Math.max(var3.field1678, this.field4131);
			this.field4154 = Math.max(var3.field1676, this.field4147);
			if (this.field4148 <= 0) {
				this.field4148 = 1;
			}
			if (this.field4154 <= 0) {
				this.field4154 = 1;
			}
			class86.field856 = Math.min(this.field4148, this.field4153);
			class271.field2226 = Math.min(this.field4154, this.field4149);
			this.field4144 = (this.field4148 - class86.field856) / 2;
			this.field4164 = 0;
			this.field4152.setSize(class86.field856, class271.field2226);
			class389.field3103 = new class455(class86.field856, class271.field2226, this.field4152, this.field4150);
			if (this.field4151 == var2) {
				Insets var4 = this.field4151.getInsets();
				this.field4152.setLocation(var4.left + this.field4144, var4.top + this.field4164);
			} else {
				this.field4152.setLocation(this.field4144, this.field4164);
			}
			this.field4143 = true;
			this.method2531();
		}
	}

	void method2550() {
		int var2 = this.field4144;
		int var3 = this.field4164;
		int var4 = this.field4148 - class86.field856 - var2;
		int var5 = this.field4154 - class271.field2226 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method2544();
				int var7 = 0;
				int var8 = 0;
				if (var6 == this.field4151) {
					Insets var9 = this.field4151.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}
				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field4154);
				}
				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field4148, var3);
				}
				if (var4 > 0) {
					var11.fillRect(var7 + this.field4148 - var4, var8, var4, this.field4154);
				}
				if (var5 > 0) {
					var11.fillRect(var7, this.field4154 + var8 - var5, this.field4148, var5);
				}
			} catch (Exception var10) {
			}
		}
	}

	final void method2551() {
		field4163.method2297(this.field4152);
		Canvas var2 = this.field4152;
		var2.removeMouseListener(class422.field3267);
		var2.removeMouseMotionListener(class422.field3267);
		var2.removeFocusListener(class422.field3267);
		class422.field3256 = 0;
		if (this.field4159 != null) {
			this.field4159.method2030(this.field4152);
		}
		this.method2532();
		field4163.method2294(this.field4152);
		Canvas var3 = this.field4152;
		var3.addMouseListener(class422.field3267);
		var3.addMouseMotionListener(class422.field3267);
		var3.addFocusListener(class422.field3267);
		if (this.field4159 != null) {
			this.field4159.method2028(this.field4152);
		}
		this.method2540();
	}

	protected final void method2541(int var1, int var2, int var3, int var4) {
		try {
			if (field4146 != null) {
				++field4132;
				if (field4132 >= 3) {
					this.method2543("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			field4146 = this;
			class86.field856 = 765;
			class271.field2226 = 503;
			class472.field3727 = 216;
			class472.field3723 = 1;
			class472.field3721 = this;
			if (field4135 == null) {
				field4135 = new class420();
			}
			field4135.method2111(this, 1);
		} catch (Exception var7) {
			class156.method917((String) null, var7);
			this.method2543("crash");
		}
	}

	final synchronized void method2532() {
		Container var2 = this.method2544();
		if (this.field4152 != null) {
			this.field4152.removeFocusListener(this);
			var2.remove(this.field4152);
		}
		class86.field856 = Math.max(var2.getWidth(), this.field4131);
		class271.field2226 = Math.max(var2.getHeight(), this.field4147);
		Insets var3;
		if (this.field4151 != null) {
			var3 = this.field4151.getInsets();
			class86.field856 -= var3.right + var3.left;
			class271.field2226 -= var3.bottom + var3.top;
		}
		this.field4152 = new class26(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager) null);
		var2.add(this.field4152);
		this.field4152.setSize(class86.field856, class271.field2226);
		this.field4152.setVisible(true);
		this.field4152.setBackground(Color.BLACK);
		if (var2 == this.field4151) {
			var3 = this.field4151.getInsets();
			this.field4152.setLocation(this.field4144 + var3.left, this.field4164 + var3.top);
		} else {
			this.field4152.setLocation(this.field4144, this.field4164);
		}
		this.field4152.addFocusListener(this);
		this.field4152.requestFocus();
		this.field4143 = true;
		if (null != class389.field3103 && class389.field3103.field2563 == class86.field856 && class271.field2226 == class389.field3103.field2565) {
			((class455) class389.field3103).method2232(this.field4152);
			class389.field3103.method1756(0, 0);
		} else {
			class389.field3103 = new class455(class86.field856, class271.field2226, this.field4152, this.field4150);
		}
		this.field4139 = false;
		this.field4145 = class48.method197();
	}

	protected void method2533(boolean var1) {
		if (var1 != this.field4150) {
			this.field4150 = var1;
			class389.field3103.method1758(var1);
			class389.field3103.method1759();
		}
	}

	protected final boolean method2549() {
		String var2 = this.getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
				if (var2.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
						var2 = var2.substring(0, var2.length() - 1);
					}
					if (var2.endsWith("192.168.1.")) {
						return true;
					} else {
						this.method2543("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@Override
	public void run() {
		try {
			if (class420.field3242 != null) {
				String var1 = class420.field3242.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class385.field3081;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method2543("wrongjava");
						return;
					}
					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class414.method2089(var2.charAt(var3)); ++var3) {
						}
						String var4 = var2.substring(6, var3);
						if (class514.method2476(var4) && class514.method2470(var4) < 10) {
							this.method2543("wrongjava");
							return;
						}
					}
					field4138 = 5;
				}
			}
			this.setFocusCycleRoot(true);
			this.method2532();
			this.method2552();
			Object var7;
			try {
				var7 = new class109();
			} catch (Throwable var5) {
				var7 = new class193();
			}
			class313.field2432 = (class356) var7;
			while (0L == field4158 || class48.method197() < field4158) {
				field4136 = class313.field2432.method1869(field4137, field4138);
				for (int var8 = 0; var8 < field4136; ++var8) {
					this.method2534();
				}
				this.method2536();
				this.method2548(this.field4152);
			}
		} catch (Exception var6) {
			class156.method917((String) null, var6);
			this.method2543("crash");
		}
		this.method2538();
	}

	void method2534() {
		long var2 = class48.method197();
		long var4 = field4141[class155.field1599];
		field4141[class155.field1599] = var2;
		class155.field1599 = class155.field1599 + 1 & 31;
		if (0L != var4 && var2 > var4) {
		}
		synchronized (this) {
			class325.field2528 = field4162;
		}
		this.method2553();
	}

	protected final void method2535() {
		this.field4143 = true;
	}

	void method2536() {
		Container var2 = this.method2544();
		long var3 = class48.method197();
		long var5 = field4133[class408.field3189];
		field4133[class408.field3189] = var3;
		class408.field3189 = class408.field3189 + 1 & 31;
		if (var5 != 0L && var3 > var5) {
			int var7 = (int) (var3 - var5);
			field4140 = ((var7 >> 1) + 32000) / var7;
		}
		if (++field4155 - 1 > 50) {
			field4155 -= 50;
			this.field4143 = true;
			this.field4152.setSize(class86.field856, class271.field2226);
			this.field4152.setVisible(true);
			if (var2 == this.field4151) {
				Insets var8 = this.field4151.getInsets();
				this.field4152.setLocation(this.field4144 + var8.left, this.field4164 + var8.top);
			} else {
				this.field4152.setLocation(this.field4144, this.field4164);
			}
		}
		if (this.field4139) {
			this.method2551();
		}
		this.method2537();
		this.method2542(this.field4143);
		if (this.field4143) {
			this.method2550();
		}
		this.field4143 = false;
	}

	final void method2537() {
		class166 var2 = this.method2545();
		if (this.field4148 != var2.field1678 || this.field4154 != var2.field1676 || this.field4156) {
			this.method2530();
			this.field4156 = false;
		}
	}

	final void method2540() {
		this.field4156 = true;
	}

	final synchronized void method2538() {
		if (!field4142) {
			field4142 = true;
			try {
				this.field4152.removeFocusListener(this);
			} catch (Exception var6) {
			}
			try {
				this.method2523();
			} catch (Exception var5) {
			}
			if (this.field4151 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}
			if (field4135 != null) {
				try {
					field4135.method2113();
				} catch (Exception var3) {
				}
			}
			this.method2546();
		}
	}

	@Override
	public final void start() {
		if (field4146 == this && !field4142) {
			field4158 = 0L;
		}
	}

	@Override
	public final void stop() {
		if (this == field4146 && !field4142) {
			field4158 = class48.method197() + 4000L;
		}
	}

	@Override
	public final void destroy() {
		if (field4146 == this && !field4142) {
			field4158 = class48.method197();
			class39.method171(5000L);
			this.method2538();
		}
	}

	@Override
	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@Override
	public final synchronized void paint(Graphics var1) {
		if (this == field4146 && !field4142) {
			this.field4143 = true;
			if (class48.method197() - this.field4145 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= class86.field856 && var2.height >= class271.field2226) {
					this.field4139 = true;
				}
			}
		}
	}

	@Override
	public final void focusGained(FocusEvent var1) {
		field4162 = true;
		this.field4143 = true;
	}

	@Override
	public final void focusLost(FocusEvent var1) {
		field4162 = false;
	}

	@Override
	public final void windowActivated(WindowEvent var1) {
	}

	@Override
	public final void windowClosed(WindowEvent var1) {
	}

	@Override
	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	@Override
	public final void windowDeactivated(WindowEvent var1) {
	}

	@Override
	public final void windowDeiconified(WindowEvent var1) {
	}

	@Override
	public final void windowIconified(WindowEvent var1) {
	}

	@Override
	public final void windowOpened(WindowEvent var1) {
	}

	protected final void method2539(int var1, String var2, boolean var3) {
		try {
			Graphics var5 = this.field4152.getGraphics();
			if (null == class46.field230) {
				class46.field230 = new Font("Helvetica", 1, 13);
				class240.field2044 = this.field4152.getFontMetrics(class46.field230);
			}
			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class86.field856, class271.field2226);
			}
			Color var6 = new Color(140, 17, 17);
			try {
				if (null == field4157) {
					field4157 = this.field4152.createImage(304, 34);
				}
				Graphics var7 = field4157.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var7.setFont(class46.field230);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class240.field2044.stringWidth(var2)) / 2, 22);
				var5.drawImage(field4157, class86.field856 / 2 - 152, class271.field2226 / 2 - 18, (ImageObserver) null);
			} catch (Exception var10) {
				int var8 = class86.field856 / 2 - 152;
				int var9 = class271.field2226 / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class46.field230);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class240.field2044.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.field4152.repaint();
		}
	}

	protected final void method2555() {
		field4157 = null;
		class46.field230 = null;
		class240.field2044 = null;
	}

	protected void method2543(String var1) {
		if (!this.field4130) {
			this.field4130 = true;
			System.out.println("error_game_" + var1);
			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}
		}
	}

	Container method2544() {
		return (Container) (null != this.field4151 ? this.field4151 : this);
	}

	class166 method2545() {
		Container var2 = this.method2544();
		int var3 = Math.max(var2.getWidth(), this.field4131);
		int var4 = Math.max(var2.getHeight(), this.field4147);
		if (null != this.field4151) {
			Insets var5 = this.field4151.getInsets();
			var3 -= var5.right + var5.left;
			var4 -= var5.top + var5.bottom;
		}
		return new class166(var3, var4);
	}

	protected final boolean method2547() {
		return null != this.field4151;
	}

	protected static final void method2557() {
		class313.field2432.method1868();
		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			field4133[var1] = 0L;
		}
		for (var1 = 0; var1 < 32; ++var1) {
			field4141[var1] = 0L;
		}
		field4136 = 0;
	}

	protected static int method2558() {
		int var1 = 0;
		if (class186.field1820 == null || !class186.field1820.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean) var2.next();
					if (var3.isValid()) {
						class186.field1820 = var3;
						field4165 = -1L;
						field4134 = -1L;
					}
				}
			} catch (Throwable var10) {
			}
		}
		if (class186.field1820 != null) {
			long var11 = class48.method197();
			long var4 = class186.field1820.getCollectionTime();
			if (field4134 != -1L) {
				long var6 = var4 - field4134;
				long var8 = var11 - field4165;
				if (var8 != 0L) {
					var1 = (int) (var6 * 100L / var8);
				}
			}
			field4134 = var4;
			field4165 = var11;
		}
		return var1;
	}
}
