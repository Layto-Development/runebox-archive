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

public final class class442 extends class317 {
   Component field3491;
   Image field3492;

   class442(int var1, int var2, Component var3, boolean var4) {
      super.field2135 = var1;
      super.field2137 = var2;
      super.field2136 = new int[var2 * var1 + 1];
      if (var4) {
         super.field2134 = new float[var2 * var1 + 1];
      }

      DataBufferInt var5 = new DataBufferInt(super.field2136, super.field2136.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field2135, super.field2137), var5, (Point)null);
      this.field3492 = new BufferedImage(var6, var7, false, new Hashtable());
      this.method2046(var3);
      this.method1445();
   }

   final void method2046(Component var1) {
      this.field3491 = var1;
   }

   public final void method1442(int var1, int var2) {
      this.method2048(this.field3491.getGraphics(), var1, var2);
   }

   public final void method1443(int var1, int var2, int var3, int var4) {
      this.method2047(this.field3491.getGraphics(), var1, var2, var3, var4);
   }

   final void method2048(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field3492, var2, var3, this.field3491);
      } catch (Exception var6) {
         this.field3491.repaint();
      }

   }

   final void method2047(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field3492, 0, 0, this.field3491);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field3491.repaint();
      }

   }
}
