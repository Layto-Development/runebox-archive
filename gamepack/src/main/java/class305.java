import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class305 implements KeyListener, FocusListener {
    static class195 field2233;
    static int field2226;
    static int field2227;
    boolean[] field2230;
    class200[] field2229;
    Collection<class533> field2228;
    Collection<class533> field2232;
    volatile int field2231;

    class305() {
        this.field2229 = new class200[3];
        this.field2230 = new boolean[112];
        this.field2231 = 0;
        this.field2232 = new ArrayList<>(100);
        this.field2228 = new ArrayList<>(100);
    }

    void method1353(class200 var1, int var2) {
        this.field2229[var2] = var1;
    }

    public int method1354() {
        return this.field2231;
    }

    void method1352(Component var1) {
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(this);
        var1.addFocusListener(this);
    }

    synchronized void method1355(Component var1) {
        var1.removeKeyListener(this);
        var1.removeFocusListener(this);
        synchronized (this) {
            this.field2232.add(new class533(4, 0));
        }
    }

    void method1356() {
        ++this.field2231;
        this.method1357();
        Iterator<class533> var2 = this.field2228.iterator();

        while (var2.hasNext()) {
            class533 var3 = var2.next();

            for (int var4 = 0; var4 < this.field2229.length && !var3.method2558(this.field2229[var4]); ++var4) {
            }
        }

        this.field2228.clear();
    }

    @Override
    public final synchronized void keyPressed(KeyEvent var1) {
        int var2 = var1.getKeyCode();
        if (var2 >= 0 && var2 < class215.method1017()) {
            var2 = class215.method1018(var2);
            boolean var3 = (var2 & 128) != 0;
            if (var3) {
                var2 = -1;
            }
        } else {
            var2 = -1;
        }

        if (var2 >= 0) {
            this.field2230[var2] = true;
            this.field2232.add(new class533(1, var2));
            this.field2231 = 0;
        }

        var1.consume();
    }

    @Override
    public final synchronized void keyReleased(KeyEvent var1) {
        int var2;
        label16:
        {
            var2 = var1.getKeyCode();
            if (var2 >= 0) {
                int var4 = class215.field1738.length;
                if (var2 < var4) {
                    var2 = class215.method1018(var2) & -129;
                    break label16;
                }
            }

            var2 = -1;
        }

        if (var2 >= 0) {
            this.field2230[var2] = false;
            this.field2232.add(new class533(2, var2));
        }

        var1.consume();
    }

    @Override
    public final synchronized void keyTyped(KeyEvent var1) {
        char var2 = var1.getKeyChar();
        if (var2 != 0 && var2 != '\uffff') {
            boolean var3;
            if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
                label47:
                {
                    if (var2 != 0) {
                        char[] var4 = class209.field1685;

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
                this.field2232.add(new class533(3, var2));
            }
        }

        var1.consume();
    }

    synchronized void method1357() {
        Collection<class533> var2 = this.field2228;
        this.field2228 = this.field2232;
        this.field2232 = var2;
    }

    @Override
    public final synchronized void focusGained(FocusEvent var1) {
        this.field2232.add(new class533(4, 1));
    }

    @Override
    public final synchronized void focusLost(FocusEvent var1) {
        for (int var2 = 0; var2 < 112; ++var2) {
            if (this.field2230[var2]) {
                this.field2230[var2] = false;
                this.field2232.add(new class533(2, var2));
            }
        }

        this.field2232.add(new class533(4, 0));
    }
}
