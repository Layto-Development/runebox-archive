import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class class304 extends class537 {

	byte[] field2359;

	int field2358;

	AudioFormat field2356;

	SourceDataLine field2357;

	class304() {
	}

	@Override
	protected void method2599() {
		this.field2356 = new AudioFormat((float) class537.field4217, 16, class537.field4232 ? 2 : 1, true, false);
		this.field2359 = new byte[256 << (class537.field4232 ? 2 : 1)];
	}

	@Override
	protected void method2593(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field2356, var1 << (class537.field4232 ? 2 : 1));
			this.field2357 = (SourceDataLine) AudioSystem.getLine(var3);
			this.field2357.open();
			this.field2357.start();
			this.field2358 = var1;
		} catch (LineUnavailableException var4) {
			if (class457.method2236(var1) != 1) {
				this.method2593(class50.method204(var1));
			} else {
				this.field2357 = null;
				throw var4;
			}
		}
	}

	@Override
	protected int method2594() {
		return this.field2358 - (this.field2357.available() >> (class537.field4232 ? 2 : 1));
	}

	@Override
	protected void method2587() {
		short var1 = 256;
		if (class537.field4232) {
			var1 = 512;
		}
		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field4222[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}
			this.field2359[var2 * 2] = (byte) (var3 >> 8);
			this.field2359[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.field2357.write(this.field2359, 0, var1 << 1);
	}

	@Override
	protected void method2595() {
		if (null != this.field2357) {
			this.field2357.close();
			this.field2357 = null;
		}
	}

	@Override
	protected void method2596() {
		this.field2357.flush();
	}
}
