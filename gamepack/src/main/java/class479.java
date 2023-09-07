import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class class479 extends Applet implements Runnable, FocusListener, WindowListener {
    protected static class108 field3426;
    protected static class305 field3454;
    protected static int field3431;
    static boolean field3433;
    static class479 field3437;
    static int field3423;
    static int field3427;
    static int field3428;
    static int field3429;
    static int field3446;
    static Image field3448;
    static long field3425;
    static long field3449;
    static long field3456;
    static long[] field3424;
    static long[] field3432;
    static volatile boolean field3453;

    static {
        field3437 = null;
        field3423 = 0;
        field3449 = 0L;
        field3433 = false;
        field3428 = 20;
        field3429 = 1;
        field3431 = 0;
        field3424 = new long[32];
        field3432 = new long[32];
        field3446 = 500;
        field3453 = true;
        field3454 = new class305();
        field3425 = -1L;
        field3456 = -1L;
    }

    final EventQueue field3452;
    protected boolean field3441;
    protected int field3439;
    protected int field3445;
    boolean field3421;
    boolean field3447;
    class17 field3450;
    int field3422;
    int field3435;
    int field3438;
    int field3440;
    int field3444;
    int field3455;
    Canvas field3443;
    Frame field3442;
    Clipboard field3451;
    volatile boolean field3430;
    volatile boolean field3434;
    volatile long field3436;

    protected class479() {
        this.field3421 = false;
        this.field3435 = 0;
        this.field3455 = 0;
        this.field3441 = false;
        this.field3434 = true;
        this.field3447 = false;
        this.field3430 = false;
        this.field3436 = 0L;
        EventQueue var1 = null;

        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }

        this.field3452 = var1;
        class219 var2 = new class219();
        class294.field2129 = var2;
    }

    protected static final void method2223() {
        class383.field2760.method1933();

        int var1;
        for (var1 = 0; var1 < 32; ++var1) {
            field3424[var1] = 0L;
        }

        for (var1 = 0; var1 < 32; ++var1) {
            field3432[var1] = 0L;
        }

        field3427 = 0;
    }

    protected static int method2224() {
        int var1 = 0;
        if (class481.field3462 == null || !class481.field3462.isValid()) {
            try {
                Iterator<GarbageCollectorMXBean> var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                while (var2.hasNext()) {
                    GarbageCollectorMXBean var3 = var2.next();
                    if (var3.isValid()) {
                        class481.field3462 = var3;
                        field3456 = -1L;
                        field3425 = -1L;
                    }
                }
            } catch (Throwable var10) {
            }
        }

        if (class481.field3462 != null) {
            long var11 = class206.method982();
            long var4 = class481.field3462.getCollectionTime();
            if (field3425 != -1L) {
                long var6 = var4 - field3425;
                long var8 = var11 - field3456;
                if (var8 != 0L) {
                    var1 = (int) (var6 * 100L / var8);
                }
            }

            field3425 = var4;
            field3456 = var11;
        }

        return var1;
    }

    protected abstract void method2189();

    protected abstract void method2197();

    protected abstract void method2208(boolean var1);

    protected abstract void method2212();

    protected abstract void method2218();

    protected abstract void method2219();

    @Override
    public abstract void init();

    protected final void method2188(int var1, int var2) {
        if (var1 != this.field3444 || this.field3440 != var2) {
            this.method2206();
        }

        this.field3444 = var1;
        this.field3440 = var2;
    }

    final void method2214(Object var1) {
        if (this.field3452 != null) {
            for (int var3 = 0; var3 < 50 && this.field3452.peekEvent() != null; ++var3) {
                class316.method1394(1L);
            }

            if (var1 != null) {
                this.field3452.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }

        }
    }

    protected class420 method2222() {
        if (null == this.field3450) {
            this.field3450 = new class17();
            this.field3450.method42(this.field3443);
        }

        return this.field3450;
    }

    protected void method2190() {
        this.field3451 = this.getToolkit().getSystemClipboard();
    }

    protected void method2191(String var1) {
        this.field3451.setContents(new StringSelection(var1), null);
    }

    protected Clipboard method2192() {
        return this.field3451;
    }

    protected final void method2193() {
        if (class108.field1040.toLowerCase().indexOf("microsoft") != -1) {
            class215.field1738[186] = 57;
            class215.field1738[187] = 27;
            class215.field1738[188] = 71;
            class215.field1738[189] = 26;
            class215.field1738[190] = 72;
            class215.field1738[191] = 73;
            class215.field1738[192] = 58;
            class215.field1738[219] = 42;
            class215.field1738[220] = 74;
            class215.field1738[221] = 43;
            class215.field1738[222] = 59;
            class215.field1738[223] = 28;
        } else {
            class215.field1738[44] = 71;
            class215.field1738[45] = 26;
            class215.field1738[46] = 72;
            class215.field1738[47] = 73;
            class215.field1738[59] = 57;
            class215.field1738[61] = 27;
            class215.field1738[91] = 42;
            class215.field1738[92] = 74;
            class215.field1738[93] = 43;
            class215.field1738[192] = 28;
            class215.field1738[222] = 58;
            class215.field1738[520] = 59;
        }

        field3454.method1352(this.field3443);
    }

    protected final void method2194() {
        field3454.method1356();
    }

    protected void method2220(class200 var1, int var2) {
        field3454.method1353(var1, var2);
    }

    protected final void method2195() {
        Canvas var2 = this.field3443;
        var2.addMouseListener(class499.field3648);
        var2.addMouseMotionListener(class499.field3648);
        var2.addFocusListener(class499.field3648);
    }

    final void method2196() {
        Container var2 = this.method2210();
        if (var2 != null) {
            class8 var3 = this.method2211();
            this.field3439 = Math.max(var3.field42, this.field3422);
            this.field3445 = Math.max(var3.field40, this.field3438);
            if (this.field3439 <= 0) {
                this.field3439 = 1;
            }

            if (this.field3445 <= 0) {
                this.field3445 = 1;
            }

            class223.field1763 = Math.min(this.field3439, this.field3444);
            class519.field4188 = Math.min(this.field3445, this.field3440);
            this.field3435 = (this.field3439 - class223.field1763) / 2;
            this.field3455 = 0;
            this.field3443.setSize(class223.field1763, class519.field4188);
            class295.field2141 = new class344(class223.field1763, class519.field4188, this.field3443, this.field3441);
            if (this.field3442 == var2) {
                Insets var4 = this.field3442.getInsets();
                this.field3443.setLocation(var4.left + this.field3435, var4.top + this.field3455);
            } else {
                this.field3443.setLocation(this.field3435, this.field3455);
            }

            this.field3434 = true;
            this.method2197();
        }
    }

    void method2216() {
        int var2 = this.field3435;
        int var3 = this.field3455;
        int var4 = this.field3439 - class223.field1763 - var2;
        int var5 = this.field3445 - class519.field4188 - var3;
        if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
            try {
                Container var6 = this.method2210();
                int var7 = 0;
                int var8 = 0;
                if (var6 == this.field3442) {
                    Insets var9 = this.field3442.getInsets();
                    var7 = var9.left;
                    var8 = var9.top;
                }

                Graphics var11 = var6.getGraphics();
                var11.setColor(Color.black);
                if (var2 > 0) {
                    var11.fillRect(var7, var8, var2, this.field3445);
                }

                if (var3 > 0) {
                    var11.fillRect(var7, var8, this.field3439, var3);
                }

                if (var4 > 0) {
                    var11.fillRect(var7 + this.field3439 - var4, var8, var4, this.field3445);
                }

                if (var5 > 0) {
                    var11.fillRect(var7, this.field3445 + var8 - var5, this.field3439, var5);
                }
            } catch (Exception var10) {
            }
        }

    }

    final void method2217() {
        field3454.method1355(this.field3443);
        Canvas var2 = this.field3443;
        var2.removeMouseListener(class499.field3648);
        var2.removeMouseMotionListener(class499.field3648);
        var2.removeFocusListener(class499.field3648);
        class499.field3637 = 0;
        if (this.field3450 != null) {
            this.field3450.method44(this.field3443);
        }

        this.method2198();
        field3454.method1352(this.field3443);
        Canvas var3 = this.field3443;
        var3.addMouseListener(class499.field3648);
        var3.addMouseMotionListener(class499.field3648);
        var3.addFocusListener(class499.field3648);
        if (this.field3450 != null) {
            this.field3450.method42(this.field3443);
        }

        this.method2206();
    }

    protected final void method2207(int var1, int var2, int var3, int var4) {
        try {
            if (field3437 != null) {
                ++field3423;
                if (field3423 >= 3) {
                    this.method2209("alreadyloaded");
                    return;
                }

                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }

            field3437 = this;
            class223.field1763 = 765;
            class519.field4188 = 503;
            class80.field707 = 216;
            class80.field703 = 1;
            class80.field701 = this;
            if (field3426 == null) {
                field3426 = new class108();
            }

            field3426.method502(this, 1);
        } catch (Exception var7) {
            class157.method728(null, var7);
            this.method2209("crash");
        }

    }

    final synchronized void method2198() {
        Container var2 = this.method2210();
        if (this.field3443 != null) {
            this.field3443.removeFocusListener(this);
            var2.remove(this.field3443);
        }

        class223.field1763 = Math.max(var2.getWidth(), this.field3422);
        class519.field4188 = Math.max(var2.getHeight(), this.field3438);
        Insets var3;
        if (this.field3442 != null) {
            var3 = this.field3442.getInsets();
            class223.field1763 -= var3.right + var3.left;
            class519.field4188 -= var3.bottom + var3.top;
        }

        this.field3443 = new class466(this);
        var2.setBackground(Color.BLACK);
        var2.setLayout(null);
        var2.add(this.field3443);
        this.field3443.setSize(class223.field1763, class519.field4188);
        this.field3443.setVisible(true);
        this.field3443.setBackground(Color.BLACK);
        if (var2 == this.field3442) {
            var3 = this.field3442.getInsets();
            this.field3443.setLocation(this.field3435 + var3.left, this.field3455 + var3.top);
        } else {
            this.field3443.setLocation(this.field3435, this.field3455);
        }

        this.field3443.addFocusListener(this);
        this.field3443.requestFocus();
        this.field3434 = true;
        if (null != class295.field2141 && class295.field2141.field4263 == class223.field1763 && class519.field4188 == class295.field2141.field4265) {
            ((class344) class295.field2141).method1615(this.field3443);
            class295.field2141.method2580(0, 0);
        } else {
            class295.field2141 = new class344(class223.field1763, class519.field4188, this.field3443, this.field3441);
        }

        this.field3430 = false;
        this.field3436 = class206.method982();
    }

    protected void method2199(boolean var1) {
        if (var1 != this.field3441) {
            this.field3441 = var1;
            class295.field2141.method2582(var1);
            class295.field2141.method2583();
        }

    }

    protected final boolean method2215() {
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
                        this.method2209("invalidhost");
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
            if (class108.field1040 != null) {
                String var1 = class108.field1040.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class332.field2424;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2209("wrongjava");
                        return;
                    }

                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class237.method1067(var2.charAt(var3)); ++var3) {
                        }

                        String var4 = var2.substring(6, var3);
                        if (class95.method374(var4) && class95.method368(var4) < 10) {
                            this.method2209("wrongjava");
                            return;
                        }
                    }

                    field3429 = 5;
                }
            }

            this.setFocusCycleRoot(true);
            this.method2198();
            this.method2218();

            Object var7;
            try {
                var7 = new class308();
            } catch (Throwable var5) {
                var7 = new class246();
            }

            class383.field2760 = (class418) var7;

            while (0L == field3449 || class206.method982() < field3449) {
                field3427 = class383.field2760.method1934(field3428, field3429);

                for (int var8 = 0; var8 < field3427; ++var8) {
                    this.method2200();
                }

                this.method2202();
                this.method2214(this.field3443);
            }
        } catch (Exception var6) {
            class157.method728(null, var6);
            this.method2209("crash");
        }

        this.method2204();
    }

    void method2200() {
        long var2 = class206.method982();
        long var4 = field3432[class306.field2234];
        field3432[class306.field2234] = var2;
        class306.field2234 = class306.field2234 + 1 & 31;
        if (0L != var4 && var2 > var4) {
        }

        synchronized (this) {
            class370.field2643 = field3453;
        }

        this.method2219();
    }

    protected final void method2201() {
        this.field3434 = true;
    }

    void method2202() {
        Container var2 = this.method2210();
        long var3 = class206.method982();
        long var5 = field3424[class243.field1860];
        field3424[class243.field1860] = var3;
        class243.field1860 = class243.field1860 + 1 & 31;
        if (var5 != 0L && var3 > var5) {
            int var7 = (int) (var3 - var5);
            field3431 = ((var7 >> 1) + 32000) / var7;
        }

        if (++field3446 - 1 > 50) {
            field3446 -= 50;
            this.field3434 = true;
            this.field3443.setSize(class223.field1763, class519.field4188);
            this.field3443.setVisible(true);
            if (var2 == this.field3442) {
                Insets var8 = this.field3442.getInsets();
                this.field3443.setLocation(this.field3435 + var8.left, this.field3455 + var8.top);
            } else {
                this.field3443.setLocation(this.field3435, this.field3455);
            }
        }

        if (this.field3430) {
            this.method2217();
        }

        this.method2203();
        this.method2208(this.field3434);
        if (this.field3434) {
            this.method2216();
        }

        this.field3434 = false;
    }

    final void method2203() {
        class8 var2 = this.method2211();
        if (this.field3439 != var2.field42 || this.field3445 != var2.field40 || this.field3447) {
            this.method2196();
            this.field3447 = false;
        }

    }

    final void method2206() {
        this.field3447 = true;
    }

    final synchronized void method2204() {
        if (!field3433) {
            field3433 = true;

            try {
                this.field3443.removeFocusListener(this);
            } catch (Exception var6) {
            }

            try {
                this.method2189();
            } catch (Exception var5) {
            }

            if (this.field3442 != null) {
                try {
                    System.exit(0);
                } catch (Throwable var4) {
                }
            }

            if (field3426 != null) {
                try {
                    field3426.method504();
                } catch (Exception var3) {
                }
            }

            this.method2212();
        }
    }

    @Override
    public final void start() {
        if (field3437 == this && !field3433) {
            field3449 = 0L;
        }
    }

    @Override
    public final void stop() {
        if (this == field3437 && !field3433) {
            field3449 = class206.method982() + 4000L;
        }
    }

    @Override
    public final void destroy() {
        if (field3437 == this && !field3433) {
            field3449 = class206.method982();
            class316.method1394(5000L);
            this.method2204();
        }
    }

    @Override
    public final void update(Graphics var1) {
        this.paint(var1);
    }

    @Override
    public final synchronized void paint(Graphics var1) {
        if (this == field3437 && !field3433) {
            this.field3434 = true;
            if (class206.method982() - this.field3436 > 1000L) {
                Rectangle var2 = var1.getClipBounds();
                if (null == var2 || var2.width >= class223.field1763 && var2.height >= class519.field4188) {
                    this.field3430 = true;
                }
            }

        }
    }

    @Override
    public final void focusGained(FocusEvent var1) {
        field3453 = true;
        this.field3434 = true;
    }

    @Override
    public final void focusLost(FocusEvent var1) {
        field3453 = false;
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

    protected final void method2205(int var1, String var2, boolean var3) {
        try {
            Graphics var5 = this.field3443.getGraphics();
            if (null == class51.field572) {
                class51.field572 = new Font("Helvetica", 1, 13);
                class496.field3630 = this.field3443.getFontMetrics(class51.field572);
            }

            if (var3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class223.field1763, class519.field4188);
            }

            Color var6 = new Color(140, 17, 17);

            try {
                if (null == field3448) {
                    field3448 = this.field3443.createImage(304, 34);
                }

                Graphics var7 = field3448.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, var1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
                var7.setFont(class51.field572);
                var7.setColor(Color.white);
                var7.drawString(var2, (304 - class496.field3630.stringWidth(var2)) / 2, 22);
                var5.drawImage(field3448, class223.field1763 / 2 - 152, class519.field4188 / 2 - 18, null);
            } catch (Exception var10) {
                int var8 = class223.field1763 / 2 - 152;
                int var9 = class519.field4188 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
                var5.setFont(class51.field572);
                var5.setColor(Color.white);
                var5.drawString(var2, var8 + (304 - class496.field3630.stringWidth(var2)) / 2, var9 + 22);
            }
        } catch (Exception var11) {
            this.field3443.repaint();
        }

    }

    protected final void method2221() {
        field3448 = null;
        class51.field572 = null;
        class496.field3630 = null;
    }

    protected void method2209(String var1) {
        if (!this.field3421) {
            this.field3421 = true;
            System.out.println("error_game_" + var1);

            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var4) {
            }

        }
    }

    Container method2210() {
        return null != this.field3442 ? this.field3442 : this;
    }

    class8 method2211() {
        Container var2 = this.method2210();
        int var3 = Math.max(var2.getWidth(), this.field3422);
        int var4 = Math.max(var2.getHeight(), this.field3438);
        if (null != this.field3442) {
            Insets var5 = this.field3442.getInsets();
            var3 -= var5.right + var5.left;
            var4 -= var5.top + var5.bottom;
        }

        return new class8(var3, var4);
    }

    protected final boolean method2213() {
        return null != this.field3442;
    }
}
