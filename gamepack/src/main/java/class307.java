import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class307 {
	RandomAccessFile field2776;
	long field2778;
	final long field2777;

	public class307(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field2776 = new RandomAccessFile(var1, var2);
		this.field2777 = var3;
		this.field2778 = 0L;
		int var5 = this.field2776.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field2776.seek(0L);
			this.field2776.write(var5);
		}

		this.field2776.seek(0L);
	}

	final void method1734(long var1) throws IOException {
		this.field2776.seek(var1);
		this.field2778 = var1;
	}

	public final void method1735(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.field2778 > this.field2777) {
			this.field2776.seek(this.field2777);
			this.field2776.write(1);
			throw new EOFException();
		} else {
			this.field2776.write(var1, var2, var3);
			this.field2778 += (long)var3;
		}
	}

	public final void method1738() throws IOException {
		this.method1739(false);
	}

	public final void method1739(boolean var1) throws IOException {
		if (null != this.field2776) {
			if (var1) {
				try {
					this.field2776.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field2776.close();
			this.field2776 = null;
		}

	}

	public final long method1736() throws IOException {
		return this.field2776.length();
	}

	public final int method1737(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field2776.read(var1, var2, var3);
		if (var5 > 0) {
			this.field2778 += (long)var5;
		}

		return var5;
	}

	protected void finalize() throws Throwable {
		if (this.field2776 != null) {
			System.out.println("");
			this.method1738();
		}

	}
}
