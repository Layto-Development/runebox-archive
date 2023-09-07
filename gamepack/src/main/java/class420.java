import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class420 implements Runnable {

	public static String field3242;

	boolean field3241;

	class250 field3238;

	class250 field3239;

	Thread field3240;

	public class420() {
		this.field3238 = null;
		this.field3239 = null;
		this.field3241 = false;
		field3242 = "Unknown";
		class385.field3081 = "1.6";
		try {
			field3242 = System.getProperty("java.vendor");
			class385.field3081 = System.getProperty("java.version");
		} catch (Exception var2) {
		}
		this.field3241 = false;
		this.field3240 = new Thread(this);
		this.field3240.setPriority(10);
		this.field3240.setDaemon(true);
		this.field3240.start();
	}

	public final void method2113() {
		synchronized (this) {
			this.field3241 = true;
			this.notifyAll();
		}
		try {
			this.field3240.join();
		} catch (InterruptedException var4) {
		}
	}

	@Override
	public final void run() {
		while (true) {
			class250 var1;
			synchronized (this) {
				while (true) {
					if (this.field3241) {
						return;
					}
					if (this.field3238 != null) {
						var1 = this.field3238;
						this.field3238 = this.field3238.field2117;
						if (null == this.field3238) {
							this.field3239 = null;
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
				int var2 = var1.field2116;
				if (var2 == 1) {
					var1.field2115 = new Socket(InetAddress.getByName((String) var1.field2118), var1.field2119);
				} else if (var2 == 2) {
					Thread var3 = new Thread((Runnable) var1.field2118);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field2119);
					var1.field2115 = var3;
				} else if (var2 == 4) {
					var1.field2115 = new DataInputStream(((URL) var1.field2118).openStream());
				}
				var1.field2114 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.field2114 = 2;
			}
		}
	}

	final class250 method2112(int var1, int var2, int var3, Object var4) {
		class250 var6 = new class250();
		var6.field2116 = var1;
		var6.field2119 = var2;
		var6.field2118 = var4;
		synchronized (this) {
			if (null != this.field3239) {
				this.field3239.field2117 = var6;
				this.field3239 = var6;
			} else {
				this.field3239 = this.field3238 = var6;
			}
			this.notify();
			return var6;
		}
	}

	public final class250 method2110(String var1, int var2) {
		return this.method2112(1, var2, 0, var1);
	}

	public final class250 method2111(Runnable var1, int var2) {
		return this.method2112(2, var2, 0, var1);
	}
}
