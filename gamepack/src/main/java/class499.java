import java.awt.event.*;

public class class499 implements MouseListener, MouseMotionListener, FocusListener {
    public static class499 field3648;
    public static int field3634;
    public static int field3641;
    public static int field3645;
    public static int field3646;
    public static int field3647;
    public static int field3651;
    public static long field3635;
    public static long field3642;
    public static volatile int field3637;
    public static volatile int field3638;
    public static volatile int field3639;
    public static volatile int field3643;
    public static volatile int field3650;
    public static volatile int field3652;
    public static volatile long field3640;
    public static volatile long field3644;
    static int field3649;
    static volatile int field3636;

    static {
        field3648 = new class499();
        field3636 = 0;
        field3637 = 0;
        field3638 = -1;
        field3639 = -1;
        field3640 = -1L;
        field3641 = 0;
        field3651 = 0;
        field3634 = 0;
        field3642 = 0L;
        field3643 = 0;
        field3652 = 0;
        field3650 = 0;
        field3644 = 0L;
        field3645 = 0;
        field3646 = 0;
        field3647 = 0;
        field3635 = 0L;
    }

    class499() {
    }

    public static int method2255() {
        return ++field3636 - 1;
    }

    public static void method2254(int var0) {
        field3636 = var0;
    }

    final int method2253(MouseEvent var1) {
        int var3 = var1.getButton();
        if (!var1.isAltDown() && var3 != 2) {
            return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
        } else {
            return 4;
        }
    }

    @Override
    public final synchronized void mousePressed(MouseEvent var1) {
        if (null != field3648) {
            field3636 = 0;
            field3652 = var1.getX();
            field3650 = var1.getY();
            field3644 = class206.method982();
            field3643 = this.method2253(var1);
            if (field3643 != 0) {
                field3637 = field3643;
            }
        }

        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    @Override
    public final synchronized void mouseReleased(MouseEvent var1) {
        if (null != field3648) {
            field3636 = 0;
            field3637 = 0;
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
        if (field3648 != null) {
            field3636 = 0;
            field3638 = -1;
            field3639 = -1;
            field3640 = var1.getWhen();
        }

    }

    @Override
    public final synchronized void mouseDragged(MouseEvent var1) {
        this.mouseMoved(var1);
    }

    @Override
    public final synchronized void mouseMoved(MouseEvent var1) {
        if (null != field3648) {
            field3636 = 0;
            field3638 = var1.getX();
            field3639 = var1.getY();
            field3640 = var1.getWhen();
        }

    }

    @Override
    public final void focusGained(FocusEvent var1) {
    }

    @Override
    public final synchronized void focusLost(FocusEvent var1) {
        if (field3648 != null) {
            field3637 = 0;
        }

    }
}
