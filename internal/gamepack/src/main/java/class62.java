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

public final class class62 extends class148 {
   Component field1115;
   Image field1116;

   class62(int var1, int var2, Component var3, boolean var4) {
      super.field1615 = var1;
      super.field1617 = var2;
      super.field1616 = new int[var2 * var1 + 1];
      if (var4) {
         super.field1614 = new float[var2 * var1 + 1];
      }

      DataBufferInt var5 = new DataBufferInt(super.field1616, super.field1616.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field1615, super.field1617), var5, (Point)null);
      this.field1116 = new BufferedImage(var6, var7, false, new Hashtable());
      this.method631(var3);
      this.method932();
   }

   final void method631(Component var1) {
      this.field1115 = var1;
   }

   public final void method929(int var1, int var2) {
      this.method634(this.field1115.getGraphics(), var1, var2);
   }

   public final void method930(int var1, int var2, int var3, int var4) {
      this.method633(this.field1115.getGraphics(), var1, var2, var3, var4);
   }

   final void method634(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field1116, var2, var3, this.field1115);
      } catch (Exception var6) {
         this.field1115.repaint();
      }

   }

   final void method633(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field1116, 0, 0, this.field1115);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field1115.repaint();
      }

   }
}
