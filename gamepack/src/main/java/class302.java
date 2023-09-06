import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class302 implements Runnable {
	public static String field2761;
	boolean field2760;
	class135 field2757;
	class135 field2758;
	Thread field2759;

	public class302() {
		this.field2757 = null;
		this.field2758 = null;
		this.field2760 = false;
		field2761 = "Unknown";
		class188.field1754 = "1.6";

		try {
			field2761 = System.getProperty("java.vendor");
			class188.field1754 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field2760 = false;
		this.field2759 = new Thread(this);
		this.field2759.setPriority(10);
		this.field2759.setDaemon(true);
		this.field2759.start();
	}

	public final void method1702() {
		synchronized(this) {
			this.field2760 = true;
			this.notifyAll();
		}

		try {
			this.field2759.join();
		} catch (InterruptedException var4) {
		}

	}

	public final void run() {
		while (true) {
			class135 var1;
			synchronized(this) {
				while (true) {
					if (this.field2760) {
						return;
					}

					if (this.field2757 != null) {
						var1 = this.field2757;
						this.field2757 = this.field2757.field1316;
						if (null == this.field2757) {
							this.field2758 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
					}
				}
			}

			try {
				int var2 = var1.field1315;
				if (var2 == 1) {
					var1.field1314 = new Socket(InetAddress.getByName((String)var1.field1317), var1.field1318);
				} else if (var2 == 2) {
					Thread var3 = new Thread((Runnable)var1.field1317);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field1318);
					var1.field1314 = var3;
				} else if (var2 == 4) {
					var1.field1314 = new DataInputStream(((URL)var1.field1317).openStream());
				}

				var1.field1313 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.field1313 = 2;
			}
		}
	}

	final class135 method1701(int var1, int var2, int var3, Object var4) {
		class135 var6 = new class135();
		var6.field1315 = var1;
		var6.field1318 = var2;
		var6.field1317 = var4;
		synchronized(this) {
			if (null != this.field2758) {
				this.field2758.field1316 = var6;
				this.field2758 = var6;
			} else {
				this.field2758 = this.field2757 = var6;
			}

			this.notify();
			return var6;
		}
	}

	public final class135 method1699(String var1, int var2) {
		return this.method1701(1, var2, 0, var1);
	}

	public final class135 method1700(Runnable var1, int var2) {
		return this.method1701(2, var2, 0, var1);
	}
}
