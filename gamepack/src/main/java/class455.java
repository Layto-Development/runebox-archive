import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class455 extends class336 {

	Component field3478;

	Image field3479;

	class455(int var1, int var2, Component var3, boolean var4) {
		super.field2563 = var1;
		super.field2565 = var2;
		super.field2564 = new int[var2 * var1 + 1];
		if (var4) {
			super.field2562 = new float[var2 * var1 + 1];
		}
		DataBufferInt var5 = new DataBufferInt(super.field2564, super.field2564.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field2563, super.field2565), var5, (Point) null);
		this.field3479 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method2232(var3);
		this.method1759();
	}

	final void method2232(Component var1) {
		this.field3478 = var1;
	}

	@Override
	public final void method1756(int var1, int var2) {
		this.method2234(this.field3478.getGraphics(), 0, 0);
	}

	@Override
	public final void method1757(int var1, int var2, int var3, int var4) {
		this.method2233(this.field3478.getGraphics(), var1, var2, var3, var4);
	}

	final void method2234(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field3479, 0, 0, this.field3478);
		} catch (Exception var6) {
			this.field3478.repaint();
		}
	}

	final void method2233(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field3479, 0, 0, this.field3478);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field3478.repaint();
		}
	}
}
