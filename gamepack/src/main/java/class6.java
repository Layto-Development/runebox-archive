import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class6 {

	RandomAccessFile field22;

	long field24;

	final long field23;

	public class6(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}
		if (var1.length() > var3) {
			var1.delete();
		}
		this.field22 = new RandomAccessFile(var1, var2);
		this.field23 = var3;
		this.field24 = 0L;
		int var5 = this.field22.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field22.seek(0L);
			this.field22.write(var5);
		}
		this.field22.seek(0L);
	}

	final void method12(long var1) throws IOException {
		this.field22.seek(var1);
		this.field24 = var1;
	}

	public final void method13(byte[] var1, int var2, int var3) throws IOException {
		if ((long) var3 + this.field24 > this.field23) {
			this.field22.seek(this.field23);
			this.field22.write(1);
			throw new EOFException();
		} else {
			this.field22.write(var1, var2, var3);
			this.field24 += (long) var3;
		}
	}

	public final void method16() throws IOException {
		this.method17(false);
	}

	public final void method17(boolean var1) throws IOException {
		if (null != this.field22) {
			if (var1) {
				try {
					this.field22.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}
			this.field22.close();
			this.field22 = null;
		}
	}

	public final long method14() throws IOException {
		return this.field22.length();
	}

	public final int method15(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field22.read(var1, var2, var3);
		if (var5 > 0) {
			this.field24 += (long) var5;
		}
		return var5;
	}

	@Override
	protected void finalize() throws Throwable {
		if (this.field22 != null) {
			System.out.println("");
			this.method16();
		}
	}
}
