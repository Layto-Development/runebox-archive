import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class361 extends class337 {
	byte[] field3047;
	int field3046;
	AudioFormat field3044;
	SourceDataLine field3045;

	class361() {
	}

	protected void method1865() {
		this.field3044 = new AudioFormat((float)class337.field2934, 16, class337.field2949 ? 2 : 1, true, false);
		this.field3047 = new byte[256 << (class337.field2949 ? 2 : 1)];
	}

	protected void method1858(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field3044, var1 << (class337.field2949 ? 2 : 1));
			this.field3045 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field3045.open();
			this.field3045.start();
			this.field3046 = var1;
		} catch (LineUnavailableException var4) {
			if (class160.method895(var1) != 1) {
				this.method1858(class476.method2304(var1));
			} else {
				this.field3045 = null;
				throw var4;
			}
		}
	}

	protected int method1859() {
		return this.field3046 - (this.field3045.available() >> (class337.field2949 ? 2 : 1));
	}

	protected void method1852() {
		int var1 = 256;
		if (class337.field2949) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field2939[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field3047[var2 * 2] = (byte)(var3 >> 8);
			this.field3047[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.field3045.write(this.field3047, 0, var1 << 1);
	}

	protected void method1860() {
		if (null != this.field3045) {
			this.field3045.close();
			this.field3045 = null;
		}

	}

	protected void method1861() {
		this.field3045.flush();
	}
}
