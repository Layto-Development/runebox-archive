import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class346 implements Runnable {

	static int field2624;

	int field2622;

	Queue field2620;

	final Thread field2623;

	volatile boolean field2621;

	class346(int var1) {
		this.field2620 = new LinkedList();
		this.field2623 = new Thread(this);
		this.field2623.setPriority(1);
		this.field2623.start();
		this.field2622 = var1;
	}

	abstract void method1804(class64 var1) throws IOException;

	@Override
	public void run() {
		while (!this.field2621) {
			try {
				class64 var1;
				synchronized (this) {
					var1 = (class64) this.field2620.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}
				this.method1804(var1);
			} catch (Exception var7) {
				class156.method917((String) null, var7);
			}
		}
	}

	int method1808(URLConnection var1) {
		int var3 = class64.field683;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var3 = ((HttpURLConnection) var1).getResponseCode();
				}
			} catch (IOException var5) {
			}
		}
		return var3;
	}

	void method1809(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field2622);
	}

	void method1805(URLConnection var1, class64 var2) {
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
				byte[] var7 = class248.method1433(5000);
				byte[] var9;
				for (int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
					var9 = new byte[var5.length + var8];
					System.arraycopy(var5, 0, var9, 0, var5.length);
					System.arraycopy(var7, 0, var9, var5.length, var8);
				}
				class248.method1435(var7);
			}
			var2.field685 = var5;
		} catch (IOException var15) {
			var2.field685 = null;
		} finally {
			var2.field684 = this.method1808(var1);
		}
		if (var4 != null) {
			try {
				var4.close();
			} catch (IOException var14) {
			}
		}
	}

	public class64 method1806(URL var1) {
		class64 var3 = new class64(var1);
		synchronized (this) {
			this.field2620.add(var3);
			this.notify();
			return var3;
		}
	}

	public void method1807() {
		this.field2621 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.field2623.join();
		} catch (InterruptedException var5) {
		}
	}

	public static void method1810() {
		class388.field3091.clear();
	}
}
