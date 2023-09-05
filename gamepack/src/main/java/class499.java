import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfInfo(name = "bt")
public class class499 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = 183350311)
	static int field4035;
	@ObfInfo(name = "he", desc = "Ljava/lang/String;")
	static String field4034;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class499() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(IIIB)Z", opaqueValue = "15")
	static boolean method2494(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
	}

	@ObfInfo(name = "au", desc = "([BI)Lui;")
	public static final class150 method2495(byte[] var0) {
		BufferedImage var2 = null;

		try {
			Class var3 = ImageIO.class;
			synchronized(ImageIO.class) {
				var2 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var10 = var2.getWidth();
			int var4 = var2.getHeight();
			int[] var5 = new int[var4 * var10];
			PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var10, var4, var5, 0, var10);
			var6.grabPixels();
			return new class150(var5, var10, var4);
		} catch (IOException var8) {
		} catch (InterruptedException var9) {
		}

		return new class150(0, 0);
	}
}
