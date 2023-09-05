import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfInfo(name = "gh")
public class class502 implements Runnable {
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	public static String field4055;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field4054;
	@ObfInfo(name = "ao", desc = "Lgz;")
	class407 field4051;
	@ObfInfo(name = "at", desc = "Lgz;")
	class407 field4052;
	@ObfInfo(name = "ac", desc = "Ljava/lang/Thread;")
	Thread field4053;

	@ObfInfo(name = "<init>", desc = "()V")
	public class502() {
		this.field4051 = null;
		this.field4052 = null;
		this.field4054 = false;
		field4055 = "Unknown";
		class376.field2891 = "1.6";

		try {
			field4055 = System.getProperty("java.vendor");
			class376.field2891 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field4054 = false;
		this.field4053 = new Thread(this);
		this.field4053.setPriority(10);
		this.field4053.setDaemon(true);
		this.field4053.start();
	}

	@ObfInfo(name = "au", desc = "(I)V")
	public final void method2500() {
		synchronized(this) {
			this.field4054 = true;
			this.notifyAll();
		}

		try {
			this.field4053.join();
		} catch (InterruptedException var4) {
		}

	}

	@ObfInfo(name = "run", desc = "()V")
	public final void run() {
		while (true) {
			class407 var1;
			synchronized(this) {
				while (true) {
					if (this.field4054) {
						return;
					}

					if (this.field4051 != null) {
						var1 = this.field4051;
						this.field4051 = this.field4051.field3148;
						if (null == this.field4051) {
							this.field4052 = null;
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
				int var2 = var1.field3147;
				if (var2 == 1) {
					var1.field3146 = new Socket(InetAddress.getByName((String)var1.field3149), var1.field3150);
				} else if (var2 == 2) {
					Thread var3 = new Thread((Runnable)var1.field3149);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field3150);
					var1.field3146 = var3;
				} else if (var2 == 4) {
					var1.field3146 = new DataInputStream(((URL)var1.field3149).openStream());
				}

				var1.field3145 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.field3145 = 2;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(IIILjava/lang/Object;B)Lgz;", opaqueValue = "0")
	final class407 method2499(int var1, int var2, int var3, Object var4) {
		class407 var6 = new class407();
		var6.field3147 = var1;
		var6.field3150 = var2;
		var6.field3149 = var4;
		synchronized(this) {
			if (null != this.field4052) {
				this.field4052.field3148 = var6;
				this.field4052 = var6;
			} else {
				this.field4052 = this.field4051 = var6;
			}

			this.notify();
			return var6;
		}
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;II)Lgz;")
	public final class407 method2497(String var1, int var2) {
		return this.method2499(1, var2, 0, var1);
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/Runnable;II)Lgz;")
	public final class407 method2498(Runnable var1, int var2) {
		return this.method2499(2, var2, 0, var1);
	}
}
