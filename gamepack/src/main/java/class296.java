import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class296 implements Runnable {
	static int field2735;
	int field2733;
	Queue field2731;
	final Thread field2734;
	volatile boolean field2732;

	class296(int var1) {
		this.field2731 = new LinkedList();
		this.field2734 = new Thread(this);
		this.field2734.setPriority(1);
		this.field2734.start();
		this.field2733 = var1;
	}

	abstract void method1681(class349 var1) throws IOException;

	public void run() {
		while (!this.field2732) {
			try {
				class349 var1;
				synchronized(this) {
					var1 = (class349)this.field2731.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.method1681(var1);
			} catch (Exception var7) {
				class41.method263((String)null, var7);
			}
		}

	}

	int method1686(URLConnection var1) {
		int var3 = class349.field3002;
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

	void method1687(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field2733);
	}

	void method1683(URLConnection var1, class349 var2) {
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
				byte[] var7 = class98.method646(5000);

				byte[] var9;
				for (int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
					var9 = new byte[var5.length + var8];
					System.arraycopy(var5, 0, var9, 0, var5.length);
					System.arraycopy(var7, 0, var9, var5.length, var8);
				}

				class397.method2074(var7);
			}

			var2.field3004 = var5;
		} catch (IOException var15) {
			var2.field3004 = null;
		} finally {
			var2.field3003 = this.method1686(var1);
		}

		if (var4 != null) {
			try {
				var4.close();
			} catch (IOException var14) {
			}
		}

	}

	public class349 method1684(URL var1) {
		class349 var3 = new class349(var1);
		synchronized(this) {
			this.field2731.add(var3);
			this.notify();
			return var3;
		}
	}

	public void method1685() {
		this.field2732 = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field2734.join();
		} catch (InterruptedException var5) {
		}

	}

	public static void method1689() {
		class92.field904.clear();
	}

	public static void method1691() {
		class210.field1937.method1887();
	}

	static long method1682() {
		return Client.field133;
	}

	static boolean method1690() {
		return (Client.field6 & 2) != 0;
	}

	static final void method1688(String var0) {
		if (!var0.equals("")) {
			class160 var2 = class85.method556(class129.field1243, Client.field68.field2426);
			var2.field1483.method267(class431.method2196(var0));
			var2.field1483.method270(var0);
			Client.field68.method1570(var2);
		}
	}
}
