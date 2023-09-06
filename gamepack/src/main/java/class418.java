import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class418 extends class212 {
	int field3492;
	int field3493;
	int field3494;
	int field3495;

	class418() {
	}

	void method2147(class42 var1) {
		int var3 = var1.method278();
		if (class368.field3100.field3101 != var3) {
			throw new IllegalStateException("");
		} else {
			super.field1991 = var1.method278();
			super.field1992 = var1.method278();
			super.field1996 = var1.method327();
			super.field1994 = var1.method327();
			this.field3493 = var1.method278();
			this.field3494 = var1.method278();
			super.field1990 = var1.method327();
			super.field1997 = var1.method327();
			this.field3492 = var1.method278();
			this.field3495 = var1.method278();
			super.field1998 = var1.method326();
			super.field1988 = var1.method326();
		}
	}

	void method1202(class42 var1) {
		super.field1992 = Math.min(super.field1992, 4);
		super.field1995 = new short[1][64][64];
		super.field1993 = new short[super.field1992][64][64];
		super.field2002 = new byte[super.field1992][64][64];
		super.field1989 = new byte[super.field1992][64][64];
		super.field1999 = new class359[super.field1992][64][64][];
		int var3 = var1.method278();
		if (class295.field2729.field2728 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method278();
			int var5 = var1.method278();
			int var6 = var1.method278();
			int var7 = var1.method278();
			if (super.field1990 == var4 && var5 == super.field1997 && var6 == this.field3492 && this.field3495 == var7) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method1204(var8 + this.field3492 * 8, var9 + this.field3495 * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class418)) {
			return false;
		} else {
			class418 var2 = (class418)var1;
			if (super.field1990 == var2.field1990 && var2.field1997 == super.field1997) {
				return var2.field3492 == this.field3492 && this.field3495 == var2.field3495;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.field1990 | super.field1997 << 8 | this.field3492 << 16 | this.field3495 << 24;
	}

	int method2152() {
		return this.field3493;
	}

	int method2153() {
		return this.field3494;
	}

	int method2151() {
		return this.field3492;
	}

	int method2150() {
		return this.field3495;
	}

	public static final class115 method2149(byte[] var0) {
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
			return new class115(var5, var10, var4);
		} catch (IOException var8) {
		} catch (InterruptedException var9) {
		}

		return new class115(0, 0);
	}

	static boolean method2148(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						return false;
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					return false;
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var11 + var1 * var6;
				if (var6 != var10 / var1) {
					return false;
				}

				var6 = var10;
				var5 = true;
			}

			return var5;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	static void method2154() {
		class116.field1111 = false;
		class116.field1090.method712(class116.field1086, 0);
		class169.field1646.method712(class116.field1086 + 382, 0);
		class474.field4030.method207(382 + class116.field1086 - class474.field4030.field450 / 2, 18);
	}
}
