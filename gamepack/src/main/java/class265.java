import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfInfo(name = "ev")
public abstract class class265 implements Runnable {
	@ObfInfo(name = "je", desc = "I", intMultiplier = 1638537919)
	static int field2147;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1715908929)
	int field2145;
	@ObfInfo(name = "ao", desc = "Ljava/util/Queue;")
	Queue field2143;
	@ObfInfo(name = "au", desc = "Ljava/lang/Thread;")
	final Thread field2146;
	@ObfInfo(name = "ae", desc = "Z")
	volatile boolean field2144;

	@ObfInfo(name = "<init>", desc = "(I)V")
	class265(int var1) {
		this.field2143 = new LinkedList();
		this.field2146 = new Thread(this);
		this.field2146.setPriority(1);
		this.field2146.start();
		this.field2145 = var1;
	}

	@ObfInfo(name = "au", desc = "(Let;B)V")
	abstract void method1382(class22 var1) throws IOException;

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		while (!this.field2144) {
			try {
				class22 var1;
				synchronized(this) {
					var1 = (class22)this.field2143.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.method1382(var1);
			} catch (Exception var7) {
				class159.method913((String)null, var7);
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(Ljava/net/URLConnection;B)I", opaqueValue = "20")
	int method1386(URLConnection var1) {
		int var3 = class22.field401;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var3 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var5) {
			}
		}

		return var3;
	}

	@ObfInfo(name = "ao", desc = "(Ljava/net/URLConnection;B)V")
	void method1387(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field2145);
	}

	@ObfInfo(name = "at", desc = "(Ljava/net/URLConnection;Let;I)V", opaqueValue = "-514723227")
	void method1383(URLConnection var1, class22 var2) {
		DataInputStream var4 = null;

		try {
			int var6 = var1.getContentLength();
			var4 = new DataInputStream(var1.getInputStream());
			byte[] var5;
			if (var6 >= 0) {
				var5 = new byte[var6];
				var4.readFully(var5);
			} else {
				var5 = new byte[0];
				byte[] var7 = class481.method2446(5000);

				byte[] var9;
				for (int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
					var9 = new byte[var5.length + var8];
					System.arraycopy(var5, 0, var9, 0, var5.length);
					System.arraycopy(var7, 0, var9, var5.length, var8);
				}

				class481.method2448(var7);
			}

			var2.field403 = var5;
		} catch (IOException var15) {
			var2.field403 = null;
		} finally {
			var2.field402 = this.method1386(var1);
		}

		if (var4 != null) {
			try {
				var4.close();
			} catch (IOException var14) {
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(Ljava/net/URL;B)Let;")
	public class22 method1384(URL var1) {
		class22 var3 = new class22(var1);
		synchronized(this) {
			this.field2143.add(var3);
			this.notify();
			return var3;
		}
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public void method1385() {
		this.field2144 = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field2146.join();
		} catch (InterruptedException var5) {
		}

	}

	@ObfInfo(name = "az", desc = "(I)V")
	public static void method1388() {
		class303.field2448.clear();
	}
}
