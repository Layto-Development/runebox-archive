import io.runebox.internal.deobfuscator.includes.ObfInfo;
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

@ObfInfo(name = "by")
public final class class97 extends class482 {
	@ObfInfo(name = "au", desc = "Ljava/awt/Component;")
	Component field966;
	@ObfInfo(name = "ae", desc = "Ljava/awt/Image;")
	Image field967;

	@ObfInfo(name = "<init>", desc = "(IILjava/awt/Component;Z)V")
	class97(int var1, int var2, Component var3, boolean var4) {
		super.field3941 = var1;
		super.field3943 = var2;
		super.field3942 = new int[var2 * var1 + 1];
		if (var4) {
			super.field3940 = new float[var2 * var1 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.field3942, super.field3942.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field3941, super.field3943), var5, (Point)null);
		this.field967 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method594(var3);
		this.method2452();
	}

	@ObfInfo(name = "au", desc = "(Ljava/awt/Component;S)V")
	final void method594(Component var1) {
		this.field966 = var1;
	}

	@ObfInfo(name = "ae", desc = "(IIB)V")
	public final void method2449(int var1, int var2) {
		this.method597(this.field966.getGraphics(), var1, var2);
	}

	@ObfInfo(name = "ao", desc = "(IIIII)V")
	public final void method2450(int var1, int var2, int var3, int var4) {
		this.method596(this.field966.getGraphics(), var1, var2, var3, var4);
	}

	@ObfInfo(name = "at", desc = "(Ljava/awt/Graphics;III)V")
	final void method597(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field967, var2, var3, this.field966);
		} catch (Exception var6) {
			this.field966.repaint();
		}

	}

	@ObfInfo(name = "ac", desc = "(Ljava/awt/Graphics;IIIII)V")
	final void method596(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field967, 0, 0, this.field966);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field966.repaint();
		}

	}
}
