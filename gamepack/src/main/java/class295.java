import io.runebox.internal.deobfuscator.includes.ObfInfo;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfInfo(name = "aw")
public class class295 extends class429 {
	@ObfInfo(name = "at", desc = "[B")
	byte[] field2386;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -572121459)
	int field2385;
	@ObfInfo(name = "au", desc = "Ljavax/sound/sampled/AudioFormat;")
	AudioFormat field2383;
	@ObfInfo(name = "ae", desc = "Ljavax/sound/sampled/SourceDataLine;")
	SourceDataLine field2384;

	@ObfInfo(name = "<init>", desc = "()V")
	class295() {
	}

	@ObfInfo(name = "au", desc = "(I)V", opaqueValue = "590134754")
	protected void method2242() {
		this.field2383 = new AudioFormat((float)class429.field3242, 16, class429.field3257 ? 2 : 1, true, false);
		this.field2386 = new byte[256 << (class429.field3257 ? 2 : 1)];
	}

	@ObfInfo(name = "ae", desc = "(IB)V", opaqueValue = "-1")
	protected void method2236(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field2383, var1 << (class429.field3257 ? 2 : 1));
			this.field2384 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field2384.open();
			this.field2384.start();
			this.field2385 = var1;
		} catch (LineUnavailableException var4) {
			if (class121.method688(var1) != 1) {
				this.method2236(class497.method2492(var1));
			} else {
				this.field2384 = null;
				throw var4;
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(I)I", opaqueValue = "-1430038546")
	protected int method2237() {
		return this.field2385 - (this.field2384.available() >> (class429.field3257 ? 2 : 1));
	}

	@ObfInfo(name = "at", desc = "()V")
	protected void method2230() {
		int var1 = 256;
		if (class429.field3257) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field3247[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field2386[var2 * 2] = (byte)(var3 >> 8);
			this.field2386[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.field2384.write(this.field2386, 0, var1 << 1);
	}

	@ObfInfo(name = "ac", desc = "(I)V")
	protected void method2238() {
		if (null != this.field2384) {
			this.field2384.close();
			this.field2384 = null;
		}

	}

	@ObfInfo(name = "ai", desc = "(B)V")
	protected void method2239() {
		this.field2384.flush();
	}
}
