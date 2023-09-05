import io.runebox.internal.deobfuscator.includes.ObfInfo;
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

@ObfInfo(name = "bm")
public abstract class class346 extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfInfo(name = "be", desc = "Lak;")
	protected static class171 field2743;
	@ObfInfo(name = "au", desc = "Lgh;")
	protected static class502 field2715;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1171551213)
	protected static int field2720;
	@ObfInfo(name = "ac", desc = "Z")
	static boolean field2722;
	@ObfInfo(name = "ae", desc = "Lbm;")
	static class346 field2726;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -80992633)
	static int field2712;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -192567109)
	static int field2716;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1827165193)
	static int field2717;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -107171581)
	static int field2718;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = 2073437199)
	static int field2735;
	@ObfInfo(name = "by", desc = "Ljava/awt/Image;")
	static Image field2737;
	@ObfInfo(name = "bz", desc = "J", longMultiplier = -2779907213028214903L)
	static long field2714;
	@ObfInfo(name = "at", desc = "J", longMultiplier = 3016094804513310631L)
	static long field2738;
	@ObfInfo(name = "bx", desc = "J", longMultiplier = 5360925924090142977L)
	static long field2745;
	@ObfInfo(name = "al", desc = "[J")
	static long[] field2713;
	@ObfInfo(name = "ar", desc = "[J")
	static long[] field2721;
	@ObfInfo(name = "bb", desc = "Z")
	static volatile boolean field2742;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field2710;
	@ObfInfo(name = "bm", desc = "Z")
	boolean field2736;
	@ObfInfo(name = "bp", desc = "Lay;")
	class509 field2739;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1990910523)
	int field2711;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -881106813)
	int field2724;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1825729143)
	int field2727;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 350734463)
	int field2729;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -1539012411)
	int field2733;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -21705825)
	int field2744;
	@ObfInfo(name = "bt", desc = "Ljava/awt/Canvas;")
	Canvas field2732;
	@ObfInfo(name = "bv", desc = "Ljava/awt/Frame;")
	Frame field2731;
	@ObfInfo(name = "bu", desc = "Ljava/awt/datatransfer/Clipboard;")
	Clipboard field2740;
	@ObfInfo(name = "bo", desc = "Ljava/awt/EventQueue;")
	final EventQueue field2741;
	@ObfInfo(name = "bh", desc = "Z")
	protected boolean field2730;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1518730529)
	protected int field2728;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 1015126009)
	protected int field2734;
	@ObfInfo(name = "bf", desc = "Z")
	volatile boolean field2719;
	@ObfInfo(name = "bd", desc = "Z")
	volatile boolean field2723;
	@ObfInfo(name = "bq", desc = "J", longMultiplier = -1248212789802974837L)
	volatile long field2725;

	static {
		field2726 = null;
		field2712 = 0;
		field2738 = 0L;
		field2722 = false;
		field2717 = 20;
		field2718 = 1;
		field2720 = 0;
		field2713 = new long[32];
		field2721 = new long[32];
		field2735 = 500;
		field2742 = true;
		field2743 = new class171();
		field2714 = -1L;
		field2745 = -1L;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	protected class346() {
		this.field2710 = false;
		this.field2724 = 0;
		this.field2744 = 0;
		this.field2730 = false;
		this.field2723 = true;
		this.field2736 = false;
		this.field2719 = false;
		this.field2725 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.field2741 = var1;
		class240 var2 = new class240();
		class355.field2801 = var2;
	}

	@ObfInfo(name = "bf", desc = "(I)V")
	protected abstract void method1884();

	@ObfInfo(name = "ar", desc = "(B)V")
	protected abstract void method1892();

	@ObfInfo(name = "bm", desc = "(ZI)V")
	protected abstract void method1903(boolean var1);

	@ObfInfo(name = "br", desc = "(I)V")
	protected abstract void method1907();

	@ObfInfo(name = "by", desc = "(I)V")
	protected abstract void method1913();

	@ObfInfo(name = "bs", desc = "(I)V")
	protected abstract void method1914();

	@ObfInfo(name = "init", desc = "()V")
	public abstract void init();

	@ObfInfo(name = "at", desc = "(III)V", opaqueValue = "129546162")
	protected final void method1883(int var1, int var2) {
		if (var1 != this.field2733 || this.field2729 != var2) {
			this.method1901();
		}

		this.field2733 = var1;
		this.field2729 = var2;
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/Object;I)V", opaqueValue = "-173235772")
	final void method1909(Object var1) {
		if (this.field2741 != null) {
			for (int var3 = 0; var3 < 50 && this.field2741.peekEvent() != null; ++var3) {
				class296.method1638(1L);
			}

			if (var1 != null) {
				this.field2741.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfInfo(name = "ai", desc = "(B)Lgk;", opaqueValue = "0")
	protected class359 method1917() {
		if (null == this.field2739) {
			this.field2739 = new class509();
			this.field2739.method2512(this.field2732);
		}

		return this.field2739;
	}

	@ObfInfo(name = "az", desc = "(B)V")
	protected void method1885() {
		this.field2740 = this.getToolkit().getSystemClipboard();
	}

	@ObfInfo(name = "ap", desc = "(Ljava/lang/String;S)V")
	protected void method1886(String var1) {
		this.field2740.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfInfo(name = "aa", desc = "(I)Ljava/awt/datatransfer/Clipboard;")
	protected Clipboard method1887() {
		return this.field2740;
	}

	@ObfInfo(name = "af", desc = "(I)V", opaqueValue = "-343310762")
	protected final void method1888() {
		if (class502.field4055.toLowerCase().indexOf("microsoft") != -1) {
			class310.field2522[186] = 57;
			class310.field2522[187] = 27;
			class310.field2522[188] = 71;
			class310.field2522[189] = 26;
			class310.field2522[190] = 72;
			class310.field2522[191] = 73;
			class310.field2522[192] = 58;
			class310.field2522[219] = 42;
			class310.field2522[220] = 74;
			class310.field2522[221] = 43;
			class310.field2522[222] = 59;
			class310.field2522[223] = 28;
		} else {
			class310.field2522[44] = 71;
			class310.field2522[45] = 26;
			class310.field2522[46] = 72;
			class310.field2522[47] = 73;
			class310.field2522[59] = 57;
			class310.field2522[61] = 27;
			class310.field2522[91] = 42;
			class310.field2522[92] = 74;
			class310.field2522[93] = 43;
			class310.field2522[192] = 28;
			class310.field2522[222] = 58;
			class310.field2522[520] = 59;
		}

		field2743.method955(this.field2732);
	}

	@ObfInfo(name = "ad", desc = "(B)V")
	protected final void method1889() {
		field2743.method959();
	}

	@ObfInfo(name = "aq", desc = "(Lbv;II)V")
	protected void method1915(class53 var1, int var2) {
		field2743.method956(var1, var2);
	}

	@ObfInfo(name = "al", desc = "(I)V")
	protected final void method1890() {
		Canvas var2 = this.field2732;
		var2.addMouseListener(class166.field1577);
		var2.addMouseMotionListener(class166.field1577);
		var2.addFocusListener(class166.field1577);
	}

	@ObfInfo(name = "an", desc = "(B)V", opaqueValue = "3")
	final void method1891() {
		Container var2 = this.method1905();
		if (var2 != null) {
			class238 var3 = this.method1906();
			this.field2728 = Math.max(var3.field1986, this.field2711);
			this.field2734 = Math.max(var3.field1984, this.field2727);
			if (this.field2728 <= 0) {
				this.field2728 = 1;
			}

			if (this.field2734 <= 0) {
				this.field2734 = 1;
			}

			class537.field4270 = Math.min(this.field2728, this.field2733);
			class396.field3101 = Math.min(this.field2734, this.field2729);
			this.field2724 = (this.field2728 - class537.field4270) / 2;
			this.field2744 = 0;
			this.field2732.setSize(class537.field4270, class396.field3101);
			class535.field4266 = new class97(class537.field4270, class396.field3101, this.field2732, this.field2730);
			if (this.field2731 == var2) {
				Insets var4 = this.field2731.getInsets();
				this.field2732.setLocation(var4.left + this.field2724, var4.top + this.field2744);
			} else {
				this.field2732.setLocation(this.field2724, this.field2744);
			}

			this.field2723 = true;
			this.method1892();
		}
	}

	@ObfInfo(name = "ab", desc = "(I)V", opaqueValue = "-1724529603")
	void method1911() {
		int var2 = this.field2724;
		int var3 = this.field2744;
		int var4 = this.field2728 - class537.field4270 - var2;
		int var5 = this.field2734 - class396.field3101 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method1905();
				int var7 = 0;
				int var8 = 0;
				if (var6 == this.field2731) {
					Insets var9 = this.field2731.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field2734);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field2728, var3);
				}

				if (var4 > 0) {
					var11.fillRect(var7 + this.field2728 - var4, var8, var4, this.field2734);
				}

				if (var5 > 0) {
					var11.fillRect(var7, this.field2734 + var8 - var5, this.field2728, var5);
				}
			} catch (Exception var10) {
			}
		}

	}

	@ObfInfo(name = "ag", desc = "(S)V", opaqueValue = "239")
	final void method1912() {
		field2743.method958(this.field2732);
		Canvas var2 = this.field2732;
		var2.removeMouseListener(class166.field1577);
		var2.removeMouseMotionListener(class166.field1577);
		var2.removeFocusListener(class166.field1577);
		class166.field1566 = 0;
		if (this.field2739 != null) {
			this.field2739.method2513(this.field2732);
		}

		this.method1893();
		field2743.method955(this.field2732);
		Canvas var3 = this.field2732;
		var3.addMouseListener(class166.field1577);
		var3.addMouseMotionListener(class166.field1577);
		var3.addFocusListener(class166.field1577);
		if (this.field2739 != null) {
			this.field2739.method2512(this.field2732);
		}

		this.method1901();
	}

	@ObfInfo(name = "am", desc = "(IIIII)V", opaqueValue = "864324558")
	protected final void method1902(int var1, int var2, int var3, int var4) {
		try {
			if (field2726 != null) {
				++field2712;
				if (field2712 >= 3) {
					this.method1904("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			field2726 = this;
			class537.field4270 = var1;
			class396.field3101 = var2;
			class348.field2761 = var3;
			class348.field2757 = var4;
			class348.field2755 = this;
			if (field2715 == null) {
				field2715 = new class502();
			}

			field2715.method2498(this, 1);
		} catch (Exception var7) {
			class159.method913((String)null, var7);
			this.method1904("crash");
		}

	}

	@ObfInfo(name = "ax", desc = "(B)V", opaqueValue = "3")
	final synchronized void method1893() {
		Container var2 = this.method1905();
		if (this.field2732 != null) {
			this.field2732.removeFocusListener(this);
			var2.remove(this.field2732);
		}

		class537.field4270 = Math.max(var2.getWidth(), this.field2711);
		class396.field3101 = Math.max(var2.getHeight(), this.field2727);
		Insets var3;
		if (this.field2731 != null) {
			var3 = this.field2731.getInsets();
			class537.field4270 -= var3.right + var3.left;
			class396.field3101 -= var3.bottom + var3.top;
		}

		this.field2732 = new class34(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager)null);
		var2.add(this.field2732);
		this.field2732.setSize(class537.field4270, class396.field3101);
		this.field2732.setVisible(true);
		this.field2732.setBackground(Color.BLACK);
		if (var2 == this.field2731) {
			var3 = this.field2731.getInsets();
			this.field2732.setLocation(this.field2724 + var3.left, this.field2744 + var3.top);
		} else {
			this.field2732.setLocation(this.field2724, this.field2744);
		}

		this.field2732.addFocusListener(this);
		this.field2732.requestFocus();
		this.field2723 = true;
		if (null != class535.field4266 && class535.field4266.field3941 == class537.field4270 && class396.field3101 == class535.field4266.field3943) {
			((class97)class535.field4266).method594(this.field2732);
			class535.field4266.method2449(0, 0);
		} else {
			class535.field4266 = new class97(class537.field4270, class396.field3101, this.field2732, this.field2730);
		}

		this.field2719 = false;
		this.field2725 = class43.method443();
	}

	@ObfInfo(name = "ah", desc = "(ZI)V")
	protected void method1894(boolean var1) {
		if (var1 != this.field2730) {
			this.field2730 = var1;
			class535.field4266.method2451(var1);
			class535.field4266.method2452();
		}

	}

	@ObfInfo(name = "as", desc = "(I)Z", opaqueValue = "-1677234839")
	protected final boolean method1910() {
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
						this.method1904("invalidhost");
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

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		try {
			if (class502.field4055 != null) {
				String var1 = class502.field4055.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class376.field2891;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method1904("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class105.method608(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class455.method2378(var4) && class455.method2372(var4) < 10) {
							this.method1904("wrongjava");
							return;
						}
					}

					field2718 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method1893();
			this.method1913();

			Object var7;
			try {
				var7 = new class440();
			} catch (Throwable var5) {
				var7 = new class419();
			}

			class200.field1814 = (class325)var7;

			while (0L == field2738 || class43.method443() < field2738) {
				field2716 = class200.field1814.method1801(field2717, field2718);

				for (int var8 = 0; var8 < field2716; ++var8) {
					this.method1895();
				}

				this.method1897();
				this.method1909(this.field2732);
			}
		} catch (Exception var6) {
			class159.method913((String)null, var6);
			this.method1904("crash");
		}

		this.method1899();
	}

	@ObfInfo(name = "ay", desc = "(I)V", opaqueValue = "-1639696093")
	void method1895() {
		long var2 = class43.method443();
		long var4 = field2721[class336.field2661];
		field2721[class336.field2661] = var2;
		class336.field2661 = class336.field2661 + 1 & 31;
		if (0L != var4 && var2 > var4) {
		}

		synchronized(this) {
			class400.field3115 = field2742;
		}

		this.method1914();
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	protected final void method1896() {
		this.field2723 = true;
	}

	@ObfInfo(name = "av", desc = "(I)V", opaqueValue = "-349145456")
	void method1897() {
		Container var2 = this.method1905();
		long var3 = class43.method443();
		long var5 = field2713[class409.field3160];
		field2713[class409.field3160] = var3;
		class409.field3160 = class409.field3160 + 1 & 31;
		if (var5 != 0L && var3 > var5) {
			int var7 = (int)(var3 - var5);
			field2720 = ((var7 >> 1) + 32000) / var7;
		}

		if (++field2735 - 1 > 50) {
			field2735 -= 50;
			this.field2723 = true;
			this.field2732.setSize(class537.field4270, class396.field3101);
			this.field2732.setVisible(true);
			if (var2 == this.field2731) {
				Insets var8 = this.field2731.getInsets();
				this.field2732.setLocation(this.field2724 + var8.left, this.field2744 + var8.top);
			} else {
				this.field2732.setLocation(this.field2724, this.field2744);
			}
		}

		if (this.field2719) {
			this.method1912();
		}

		this.method1898();
		this.method1903(this.field2723);
		if (this.field2723) {
			this.method1911();
		}

		this.field2723 = false;
	}

	@ObfInfo(name = "aw", desc = "(I)V", opaqueValue = "-1623627151")
	final void method1898() {
		class238 var2 = this.method1906();
		if (this.field2728 != var2.field1986 || this.field2734 != var2.field1984 || this.field2736) {
			this.method1891();
			this.field2736 = false;
		}

	}

	@ObfInfo(name = "ak", desc = "(B)V")
	final void method1901() {
		this.field2736 = true;
	}

	@ObfInfo(name = "bh", desc = "(B)V", opaqueValue = "0")
	final synchronized void method1899() {
		if (!field2722) {
			field2722 = true;

			try {
				this.field2732.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.method1884();
			} catch (Exception var5) {
			}

			if (this.field2731 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (field2715 != null) {
				try {
					field2715.method2500();
				} catch (Exception var3) {
				}
			}

			this.method1907();
		}
	}

	@ObfInfo(name = "start", desc = "()V")
	public final void start() {
		if (field2726 == this && !field2722) {
			field2738 = 0L;
		}
	}

	@ObfInfo(name = "stop", desc = "()V")
	public final void stop() {
		if (this == field2726 && !field2722) {
			field2738 = class43.method443() + 4000L;
		}
	}

	@ObfInfo(name = "destroy", desc = "()V")
	public final void destroy() {
		if (field2726 == this && !field2722) {
			field2738 = class43.method443();
			class296.method1638(5000L);
			this.method1899();
		}
	}

	@ObfInfo(name = "update", desc = "(Ljava/awt/Graphics;)V")
	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@ObfInfo(name = "paint", desc = "(Ljava/awt/Graphics;)V")
	public final synchronized void paint(Graphics var1) {
		if (this == field2726 && !field2722) {
			this.field2723 = true;
			if (class43.method443() - this.field2725 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= class537.field4270 && var2.height >= class396.field3101) {
					this.field2719 = true;
				}
			}

		}
	}

	@ObfInfo(name = "focusGained", desc = "(Ljava/awt/event/FocusEvent;)V")
	public final void focusGained(FocusEvent var1) {
		field2742 = true;
		this.field2723 = true;
	}

	@ObfInfo(name = "focusLost", desc = "(Ljava/awt/event/FocusEvent;)V")
	public final void focusLost(FocusEvent var1) {
		field2742 = false;
	}

	@ObfInfo(name = "windowActivated", desc = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowActivated(WindowEvent var1) {
	}

	@ObfInfo(name = "windowClosed", desc = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowClosed(WindowEvent var1) {
	}

	@ObfInfo(name = "windowClosing", desc = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	@ObfInfo(name = "windowDeactivated", desc = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowDeactivated(WindowEvent var1) {
	}

	@ObfInfo(name = "windowDeiconified", desc = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowDeiconified(WindowEvent var1) {
	}

	@ObfInfo(name = "windowIconified", desc = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowIconified(WindowEvent var1) {
	}

	@ObfInfo(name = "windowOpened", desc = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowOpened(WindowEvent var1) {
	}

	@ObfInfo(name = "bq", desc = "(ILjava/lang/String;ZB)V", opaqueValue = "-1")
	protected final void method1900(int var1, String var2, boolean var3) {
		try {
			Graphics var5 = this.field2732.getGraphics();
			if (null == class470.field3802) {
				class470.field3802 = new Font("Helvetica", 1, 13);
				class447.field3384 = this.field2732.getFontMetrics(class470.field3802);
			}

			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class537.field4270, class396.field3101);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (null == field2737) {
					field2737 = this.field2732.createImage(304, 34);
				}

				Graphics var7 = field2737.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var7.setFont(class470.field3802);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class447.field3384.stringWidth(var2)) / 2, 22);
				var5.drawImage(field2737, class537.field4270 / 2 - 152, class396.field3101 / 2 - 18, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class537.field4270 / 2 - 152;
				int var9 = class396.field3101 / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class470.field3802);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class447.field3384.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.field2732.repaint();
		}

	}

	@ObfInfo(name = "ba", desc = "(I)V")
	protected final void method1916() {
		field2737 = null;
		class470.field3802 = null;
		class447.field3384 = null;
	}

	@ObfInfo(name = "bl", desc = "(Ljava/lang/String;I)V", opaqueValue = "-1309720834")
	protected void method1904(String var1) {
		if (!this.field2710) {
			this.field2710 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}

		}
	}

	@ObfInfo(name = "bp", desc = "(I)Ljava/awt/Container;", opaqueValue = "1973767175")
	Container method1905() {
		return (Container)(null != this.field2731 ? this.field2731 : this);
	}

	@ObfInfo(name = "bu", desc = "(I)Lrb;", opaqueValue = "-1947501744")
	class238 method1906() {
		Container var2 = this.method1905();
		int var3 = Math.max(var2.getWidth(), this.field2711);
		int var4 = Math.max(var2.getHeight(), this.field2727);
		if (null != this.field2731) {
			Insets var5 = this.field2731.getInsets();
			var3 -= var5.right + var5.left;
			var4 -= var5.top + var5.bottom;
		}

		return new class238(var3, var4);
	}

	@ObfInfo(name = "bo", desc = "(I)Z", opaqueValue = "1032464717")
	protected final boolean method1908() {
		return null != this.field2731;
	}

	@ObfInfo(name = "bj", desc = "(I)V")
	protected static final void method1918() {
		class200.field1814.method1800();

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			field2713[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			field2721[var1] = 0L;
		}

		field2716 = 0;
	}

	@ObfInfo(name = "bb", desc = "(I)I")
	protected static int method1919() {
		int var1 = 0;
		if (class70.field779 == null || !class70.field779.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						class70.field779 = var3;
						field2745 = -1L;
						field2714 = -1L;
					}
				}
			} catch (Throwable var10) {
			}
		}

		if (class70.field779 != null) {
			long var11 = class43.method443();
			long var4 = class70.field779.getCollectionTime();
			if (field2714 != -1L) {
				long var6 = var4 - field2714;
				long var8 = var11 - field2745;
				if (var8 != 0L) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			field2714 = var4;
			field2745 = var11;
		}

		return var1;
	}
}
