import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class512 {

	static int field4087;

	static String field4086;

	static {
		ImageIO.setUseCache(false);
	}

	class512() throws Throwable {
	}

	static boolean method2460(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
	}

	public static final class84 method2461(byte[] var0) {
		BufferedImage var2 = null;
		try {
			Class var3 = ImageIO.class;
			synchronized (ImageIO.class) {
				var2 = ImageIO.read(new ByteArrayInputStream(var0));
			}
			int var10 = var2.getWidth();
			int var4 = var2.getHeight();
			int[] var5 = new int[var4 * var10];
			PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var10, var4, var5, 0, var10);
			var6.grabPixels();
			return new class84(var5, var10, var4);
		} catch (IOException var8) {
		} catch (InterruptedException var9) {
		}
		return new class84(0, 0);
	}
}
