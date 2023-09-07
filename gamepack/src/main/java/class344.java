import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class class344 extends class536 {
    Component field2467;
    Image field2468;

    class344(int var1, int var2, Component var3, boolean var4) {
        super.field4263 = var1;
        super.field4265 = var2;
        super.field4264 = new int[var2 * var1 + 1];
        if (var4) {
            super.field4262 = new float[var2 * var1 + 1];
        }

        DataBufferInt var5 = new DataBufferInt(super.field4264, super.field4264.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field4263, super.field4265), var5, null);
        this.field2468 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method1615(var3);
        this.method2583();
    }

    void method1615(Component var1) {
        this.field2467 = var1;
    }

    @Override
    public void method2580(int var1, int var2) {
        this.method1618(this.field2467.getGraphics(), 0, 0);
    }

    @Override
    public void method2581(int var1, int var2, int var3, int var4) {
        this.method1617(this.field2467.getGraphics(), var1, var2, var3, var4);
    }

    void method1618(Graphics var1, int var2, int var3) {
        try {
            var1.drawImage(this.field2468, 0, 0, this.field2467);
        } catch (Exception var6) {
            this.field2467.repaint();
        }

    }

    void method1617(Graphics var1, int var2, int var3, int var4, int var5) {
        try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.field2468, 0, 0, this.field2467);
            var1.setClip(var7);
        } catch (Exception var8) {
            this.field2467.repaint();
        }

    }
}
