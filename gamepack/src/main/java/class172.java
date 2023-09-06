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
import java.net.URL;

public abstract class class172 extends Applet implements Runnable, FocusListener, WindowListener {
	protected static class302 field1652;
	protected static class451 field1680;
	protected static int field1657;
	static boolean field1659;
	static class172 field1663;
	static int field1649;
	static int field1653;
	static int field1654;
	static int field1655;
	static int field1672;
	static Image field1674;
	static long field1651;
	static long field1675;
	static long field1682;
	static long[] field1650;
	static long[] field1658;
	static volatile boolean field1679;
	boolean field1647;
	boolean field1673;
	class145 field1676;
	int field1648;
	int field1661;
	int field1664;
	int field1666;
	int field1670;
	int field1681;
	Canvas field1669;
	Frame field1668;
	Clipboard field1677;
	final EventQueue field1678;
	protected boolean field1667;
	protected int field1665;
	protected int field1671;
	volatile boolean field1656;
	volatile boolean field1660;
	volatile long field1662;

	static {
		field1663 = null;
		field1649 = 0;
		field1675 = 0L;
		field1659 = false;
		field1654 = 20;
		field1655 = 1;
		field1657 = 0;
		field1650 = new long[32];
		field1658 = new long[32];
		field1672 = 500;
		field1679 = true;
		field1680 = new class451();
		field1651 = -1L;
		field1682 = -1L;
	}

	protected class172() {
		this.field1647 = false;
		this.field1661 = 0;
		this.field1681 = 0;
		this.field1667 = false;
		this.field1660 = true;
		this.field1673 = false;
		this.field1656 = false;
		this.field1662 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.field1678 = var1;
		class492 var2 = new class492();
		class400.field3354 = var2;
	}

	protected abstract void method943();

	protected abstract void method951();

	protected abstract void method962(boolean var1);

	protected abstract void method966();

	protected abstract void method972();

	protected abstract void method973();

	public abstract void init();

	protected final void method942(int var1, int var2) {
		if (var1 != this.field1670 || this.field1666 != var2) {
			this.method960();
		}

		this.field1670 = var1;
		this.field1666 = var2;
	}

	final void method968(Object var1) {
		if (this.field1678 != null) {
			for (int var3 = 0; var3 < 50 && this.field1678.peekEvent() != null; ++var3) {
				class353.method1925(1L);
			}

			if (var1 != null) {
				this.field1678.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	protected class294 method976() {
		if (null == this.field1676) {
			this.field1676 = new class145();
			this.field1676.method848(this.field1669);
		}

		return this.field1676;
	}

	protected void method944() {
		this.field1677 = this.getToolkit().getSystemClipboard();
	}

	protected void method945(String var1) {
		this.field1677.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	protected Clipboard method946() {
		return this.field1677;
	}

	protected final void method947() {
		if (class302.field2761.toLowerCase().indexOf("microsoft") != -1) {
			class15.field382[186] = 57;
			class15.field382[187] = 27;
			class15.field382[188] = 71;
			class15.field382[189] = 26;
			class15.field382[190] = 72;
			class15.field382[191] = 73;
			class15.field382[192] = 58;
			class15.field382[219] = 42;
			class15.field382[220] = 74;
			class15.field382[221] = 43;
			class15.field382[222] = 59;
			class15.field382[223] = 28;
		} else {
			class15.field382[44] = 71;
			class15.field382[45] = 26;
			class15.field382[46] = 72;
			class15.field382[47] = 73;
			class15.field382[59] = 57;
			class15.field382[61] = 27;
			class15.field382[91] = 42;
			class15.field382[92] = 74;
			class15.field382[93] = 43;
			class15.field382[192] = 28;
			class15.field382[222] = 58;
			class15.field382[520] = 59;
		}

		field1680.method2241(this.field1669);
	}

	protected final void method948() {
		field1680.method2245();
	}

	protected void method974(class68 var1, int var2) {
		field1680.method2242(var1, var2);
	}

	protected final void method949() {
		Canvas var2 = this.field1669;
		var2.addMouseListener(class184.field1742);
		var2.addMouseMotionListener(class184.field1742);
		var2.addFocusListener(class184.field1742);
	}

	final void method950() {
		Container var2 = this.method964();
		if (var2 != null) {
			class169 var3 = this.method965();
			this.field1665 = Math.max(var3.field1644, this.field1648);
			this.field1671 = Math.max(var3.field1642, this.field1664);
			if (this.field1665 <= 0) {
				this.field1665 = 1;
			}

			if (this.field1671 <= 0) {
				this.field1671 = 1;
			}

			class237.field2181 = Math.min(this.field1665, this.field1670);
			class5.field322 = Math.min(this.field1671, this.field1666);
			this.field1661 = (this.field1665 - class237.field2181) / 2;
			this.field1681 = 0;
			this.field1669.setSize(class237.field2181, class5.field322);
			class94.field937 = new class343(class237.field2181, class5.field322, this.field1669, this.field1667);
			if (this.field1668 == var2) {
				Insets var4 = this.field1668.getInsets();
				this.field1669.setLocation(var4.left + this.field1661, var4.top + this.field1681);
			} else {
				this.field1669.setLocation(this.field1661, this.field1681);
			}

			this.field1660 = true;
			this.method951();
		}
	}

	void method970() {
		int var2 = this.field1661;
		int var3 = this.field1681;
		int var4 = this.field1665 - class237.field2181 - var2;
		int var5 = this.field1671 - class5.field322 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method964();
				int var7 = 0;
				int var8 = 0;
				if (var6 == this.field1668) {
					Insets var9 = this.field1668.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field1671);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field1665, var3);
				}

				if (var4 > 0) {
					var11.fillRect(var7 + this.field1665 - var4, var8, var4, this.field1671);
				}

				if (var5 > 0) {
					var11.fillRect(var7, this.field1671 + var8 - var5, this.field1665, var5);
				}
			} catch (Exception var10) {
			}
		}

	}

	final void method971() {
		field1680.method2244(this.field1669);
		Canvas var2 = this.field1669;
		var2.removeMouseListener(class184.field1742);
		var2.removeMouseMotionListener(class184.field1742);
		var2.removeFocusListener(class184.field1742);
		class184.field1731 = 0;
		if (this.field1676 != null) {
			this.field1676.method850(this.field1669);
		}

		this.method952();
		field1680.method2241(this.field1669);
		Canvas var3 = this.field1669;
		var3.addMouseListener(class184.field1742);
		var3.addMouseMotionListener(class184.field1742);
		var3.addFocusListener(class184.field1742);
		if (this.field1676 != null) {
			this.field1676.method848(this.field1669);
		}

		this.method960();
	}

	protected final void method961(int var1, int var2, int var3, int var4) {
		try {
			if (field1663 != null) {
				++field1649;
				if (field1649 >= 3) {
					this.method963("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			field1663 = this;
			class237.field2181 = var1;
			class5.field322 = var2;
			class280.field2503 = var3;
			class280.field2499 = var4;
			class280.field2497 = this;
			if (field1652 == null) {
				field1652 = new class302();
			}

			field1652.method1700(this, 1);
		} catch (Exception var7) {
			class41.method263((String)null, var7);
			this.method963("crash");
		}

	}

	final synchronized void method952() {
		Container var2 = this.method964();
		if (this.field1669 != null) {
			this.field1669.removeFocusListener(this);
			var2.remove(this.field1669);
		}

		class237.field2181 = Math.max(var2.getWidth(), this.field1648);
		class5.field322 = Math.max(var2.getHeight(), this.field1664);
		Insets var3;
		if (this.field1668 != null) {
			var3 = this.field1668.getInsets();
			class237.field2181 -= var3.right + var3.left;
			class5.field322 -= var3.bottom + var3.top;
		}

		this.field1669 = new class306(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager)null);
		var2.add(this.field1669);
		this.field1669.setSize(class237.field2181, class5.field322);
		this.field1669.setVisible(true);
		this.field1669.setBackground(Color.BLACK);
		if (var2 == this.field1668) {
			var3 = this.field1668.getInsets();
			this.field1669.setLocation(this.field1661 + var3.left, this.field1681 + var3.top);
		} else {
			this.field1669.setLocation(this.field1661, this.field1681);
		}

		this.field1669.addFocusListener(this);
		this.field1669.requestFocus();
		this.field1660 = true;
		if (null != class94.field937 && class94.field937.field880 == class237.field2181 && class5.field322 == class94.field937.field882) {
			((class343)class94.field937).method1884(this.field1669);
			class94.field937.method604(0, 0);
		} else {
			class94.field937 = new class343(class237.field2181, class5.field322, this.field1669, this.field1667);
		}

		this.field1656 = false;
		this.field1662 = method977();
	}

	protected void method953(boolean var1) {
		if (var1 != this.field1667) {
			this.field1667 = var1;
			class94.field937.method606(var1);
			class94.field937.method607();
		}

	}

	protected final boolean method969() {
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
						this.method963("invalidhost");
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

	public void run() {
		try {
			if (class302.field2761 != null) {
				String var1 = class302.field2761.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class188.field1754;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method963("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class231.method1328(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class185.method1023(var4) && class177.method1005(var4) < 10) {
							this.method963("wrongjava");
							return;
						}
					}

					field1655 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method952();
			this.method972();

			Object var7;
			try {
				var7 = new class416();
			} catch (Throwable var5) {
				var7 = new class194();
			}

			class245.field2224 = (class50)var7;

			while (0L == field1675 || method977() < field1675) {
				field1653 = class245.field2224.method379(field1654, field1655);

				for (int var8 = 0; var8 < field1653; ++var8) {
					this.method954();
				}

				this.method956();
				this.method968(this.field1669);
			}
		} catch (Exception var6) {
			class41.method263((String)null, var6);
			this.method963("crash");
		}

		this.method958();
	}

	void method954() {
		long var2 = method977();
		long var4 = field1658[class269.field2422];
		field1658[class269.field2422] = var2;
		class269.field2422 = class269.field2422 + 1 & 31;
		if (0L != var4 && var2 > var4) {
		}

		synchronized(this) {
			class229.field2086 = field1679;
		}

		this.method973();
	}

	protected final void method955() {
		this.field1660 = true;
	}

	void method956() {
		Container var2 = this.method964();
		long var3 = method977();
		long var5 = field1650[class425.field3522];
		field1650[class425.field3522] = var3;
		class425.field3522 = class425.field3522 + 1 & 31;
		if (var5 != 0L && var3 > var5) {
			int var7 = (int)(var3 - var5);
			field1657 = ((var7 >> 1) + 32000) / var7;
		}

		if (++field1672 - 1 > 50) {
			field1672 -= 50;
			this.field1660 = true;
			this.field1669.setSize(class237.field2181, class5.field322);
			this.field1669.setVisible(true);
			if (var2 == this.field1668) {
				Insets var8 = this.field1668.getInsets();
				this.field1669.setLocation(this.field1661 + var8.left, this.field1681 + var8.top);
			} else {
				this.field1669.setLocation(this.field1661, this.field1681);
			}
		}

		if (this.field1656) {
			this.method971();
		}

		this.method957();
		this.method962(this.field1660);
		if (this.field1660) {
			this.method970();
		}

		this.field1660 = false;
	}

	final void method957() {
		class169 var2 = this.method965();
		if (this.field1665 != var2.field1644 || this.field1671 != var2.field1642 || this.field1673) {
			this.method950();
			this.field1673 = false;
		}

	}

	final void method960() {
		this.field1673 = true;
	}

	final synchronized void method958() {
		if (!field1659) {
			field1659 = true;

			try {
				this.field1669.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.method943();
			} catch (Exception var5) {
			}

			if (this.field1668 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (field1652 != null) {
				try {
					field1652.method1702();
				} catch (Exception var3) {
				}
			}

			this.method966();
		}
	}

	public final void start() {
		if (field1663 == this && !field1659) {
			field1675 = 0L;
		}
	}

	public final void stop() {
		if (this == field1663 && !field1659) {
			field1675 = method977() + 4000L;
		}
	}

	public final void destroy() {
		if (field1663 == this && !field1659) {
			field1675 = method977();
			class353.method1925(5000L);
			this.method958();
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final synchronized void paint(Graphics var1) {
		if (this == field1663 && !field1659) {
			this.field1660 = true;
			if (method977() - this.field1662 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= class237.field2181 && var2.height >= class5.field322) {
					this.field1656 = true;
				}
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		field1679 = true;
		this.field1660 = true;
	}

	public final void focusLost(FocusEvent var1) {
		field1679 = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	protected final void method959(int var1, String var2, boolean var3) {
		try {
			Graphics var5 = this.field1669.getGraphics();
			if (null == class154.field1450) {
				class154.field1450 = new Font("Helvetica", 1, 13);
				class122.field1134 = this.field1669.getFontMetrics(class154.field1450);
			}

			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class237.field2181, class5.field322);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (null == field1674) {
					field1674 = this.field1669.createImage(304, 34);
				}

				Graphics var7 = field1674.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var7.setFont(class154.field1450);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class122.field1134.stringWidth(var2)) / 2, 22);
				var5.drawImage(field1674, class237.field2181 / 2 - 152, class5.field322 / 2 - 18, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class237.field2181 / 2 - 152;
				int var9 = class5.field322 / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class154.field1450);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class122.field1134.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.field1669.repaint();
		}

	}

	protected final void method975() {
		field1674 = null;
		class154.field1450 = null;
		class122.field1134 = null;
	}

	protected void method963(String var1) {
		if (!this.field1647) {
			this.field1647 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}

		}
	}

	Container method964() {
		return (Container)(null != this.field1668 ? this.field1668 : this);
	}

	class169 method965() {
		Container var2 = this.method964();
		int var3 = Math.max(var2.getWidth(), this.field1648);
		int var4 = Math.max(var2.getHeight(), this.field1664);
		if (null != this.field1668) {
			Insets var5 = this.field1668.getInsets();
			var3 -= var5.right + var5.left;
			var4 -= var5.top + var5.bottom;
		}

		return new class169(var3, var4);
	}

	protected final boolean method967() {
		return null != this.field1668;
	}

	public static final synchronized long method977() {
		long var1 = System.currentTimeMillis();
		if (var1 < class77.field840) {
			class306.field2772 += class77.field840 - var1;
		}

		class77.field840 = var1;
		return var1 + class306.field2772;
	}

	static void method978(class12[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var1 + var2) / 2;
			class12 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var7].field374;
							var13 = var9.field374;
						} else if (var3[var11] == 1) {
							var12 = var0[var7].field370;
							var13 = var9.field370;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var7].method108() ? 1 : 0;
							var13 = var9.method108() ? 1 : 0;
						} else {
							var12 = var0[var7].field368;
							var13 = var9.field368;
						}

						if (var12 != var13) {
							if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var6].field374;
							var13 = var9.field374;
						} else if (var3[var11] == 1) {
							var12 = var0[var6].field370;
							var13 = var9.field370;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var6].method108() ? 1 : 0;
							var13 = var9.method108() ? 1 : 0;
						} else {
							var12 = var0[var6].field368;
							var13 = var9.field368;
						}

						if (var12 != var13) {
							if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					class12 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method978(var0, var1, var7, var3, var4);
			method978(var0, var7 + 1, var2, var3, var4);
		}

	}
}
