import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfInfo(name = "tu")
public final class class408 {
	@ObfInfo(name = "au", desc = "Ljava/io/RandomAccessFile;")
	RandomAccessFile field3151;
	@ObfInfo(name = "ao", desc = "J", longMultiplier = 3555788345874530741L)
	long field3153;
	@ObfInfo(name = "ae", desc = "J", longMultiplier = 2616573618568173947L)
	final long field3152;

	@ObfInfo(name = "<init>", desc = "(Ljava/io/File;Ljava/lang/String;J)V")
	public class408(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field3151 = new RandomAccessFile(var1, var2);
		this.field3152 = var3;
		this.field3153 = 0L;
		int var5 = this.field3151.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field3151.seek(0L);
			this.field3151.write(var5);
		}

		this.field3151.seek(0L);
	}

	@ObfInfo(name = "au", desc = "(J)V")
	final void method2135(long var1) throws IOException {
		this.field3151.seek(var1);
		this.field3153 = var1;
	}

	@ObfInfo(name = "ae", desc = "([BIII)V", opaqueValue = "-129477279")
	public final void method2136(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.field3153 > this.field3152) {
			this.field3151.seek(this.field3152);
			this.field3151.write(1);
			throw new EOFException();
		} else {
			this.field3151.write(var1, var2, var3);
			this.field3153 += (long)var3;
		}
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	public final void method2139() throws IOException {
		this.method2140(false);
	}

	@ObfInfo(name = "at", desc = "(ZB)V", opaqueValue = "78")
	public final void method2140(boolean var1) throws IOException {
		if (null != this.field3151) {
			if (var1) {
				try {
					this.field3151.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field3151.close();
			this.field3151 = null;
		}

	}

	@ObfInfo(name = "ac", desc = "(I)J")
	public final long method2137() throws IOException {
		return this.field3151.length();
	}

	@ObfInfo(name = "ai", desc = "([BIIB)I", opaqueValue = "9")
	public final int method2138(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field3151.read(var1, var2, var3);
		if (var5 > 0) {
			this.field3153 += (long)var5;
		}

		return var5;
	}

	@ObfInfo(name = "finalize", desc = "()V")
	protected void finalize() throws Throwable {
		if (this.field3151 != null) {
			System.out.println("");
			this.method2139();
		}

	}
}
