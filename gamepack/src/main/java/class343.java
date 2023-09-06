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

public final class class343 extends class88 {
	Component field2973;
	Image field2974;

	class343(int var1, int var2, Component var3, boolean var4) {
		super.field880 = var1;
		super.field882 = var2;
		super.field881 = new int[var2 * var1 + 1];
		if (var4) {
			super.field879 = new float[var2 * var1 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.field881, super.field881.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field880, super.field882), var5, (Point)null);
		this.field2974 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method1884(var3);
		this.method607();
	}

	final void method1884(Component var1) {
		this.field2973 = var1;
	}

	public final void method604(int var1, int var2) {
		this.method1886(this.field2973.getGraphics(), var1, var2);
	}

	public final void method605(int var1, int var2, int var3, int var4) {
		this.method1885(this.field2973.getGraphics(), var1, var2, var3, var4);
	}

	final void method1886(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field2974, var2, var3, this.field2973);
		} catch (Exception var6) {
			this.field2973.repaint();
		}

	}

	final void method1885(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field2974, 0, 0, this.field2973);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field2973.repaint();
		}

	}
}
