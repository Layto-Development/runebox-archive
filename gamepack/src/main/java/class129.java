import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfInfo(name = "ar")
public class class129 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = -671093253)
	final int field1169;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	final String field1166;
	@ObfInfo(name = "ao", desc = "Ljava/util/concurrent/ThreadFactory;")
	final ThreadFactory field1168;
	@ObfInfo(name = "at", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	final ThreadPoolExecutor field1167;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;II)V")
	public class129(String var1, int var2, int var3) {
		this.field1166 = var1;
		this.field1169 = var2;
		this.field1168 = new class527(this);
		this.field1167 = this.method703(var3);
	}

	@ObfInfo(name = "au", desc = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
	final ThreadPoolExecutor method703(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field1169), this.field1168);
	}

	@ObfInfo(name = "ae", desc = "(Lad;B)Lax;")
	public class282 method704(class540 var1) {
		if (this.field1167.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field1167.getCorePoolSize() + " Queue capacity " + this.field1169);
			return new class282("Queue full");
		} else {
			class282 var3 = new class282(this.field1167.submit(new class78(this, var1)));
			return var3;
		}
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	public final void method705() {
		try {
			this.field1167.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}

	@ObfInfo(name = "lp", desc = "(ILjava/lang/String;I)V", opaqueValue = "-1162572604")
	static void method706(int var0, String var1) {
		int var3 = class183.field1652;
		int[] var4 = class183.field1653;
		boolean var5 = false;
		class353 var6 = new class353(var1, class67.field769);

		for (int var7 = 0; var7 < var3; ++var7) {
			class439 var8 = Client.field200[var4[var7]];
			if (null != var8 && class126.field1164 != var8 && var8.field3315 != null && var8.field3315.equals(var6)) {
				class121 var9;
				if (var0 == 1) {
					var9 = class121.method689(class480.field3837, Client.field92.field2665);
					var9.field1141.method1517(var4[var7]);
					var9.field1141.method1528(0);
					Client.field92.method1821(var9);
				} else if (var0 == 4) {
					var9 = class121.method689(class480.field3893, Client.field92.field2665);
					var9.field1141.method1544(var4[var7]);
					var9.field1141.method1554(0);
					Client.field92.method1821(var9);
				} else if (var0 == 6) {
					var9 = class121.method689(class480.field3875, Client.field92.field2665);
					var9.field1141.method1544(var4[var7]);
					var9.field1141.method1528(0);
					Client.field92.method1821(var9);
				} else if (var0 == 7) {
					var9 = class121.method689(class480.field3926, Client.field92.field2665);
					var9.field1141.method1550(var4[var7]);
					var9.field1141.method1481(0);
					Client.field92.method1821(var9);
				}

				var5 = true;
				break;
			}
		}

		if (!var5) {
			class159.method914(4, "", class453.field3541 + var1);
		}

	}

	@ObfInfo(name = "lt", desc = "(III)Ljava/lang/String;", opaqueValue = "-2095424665")
	static final String method707(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return class479.method2443(16711680);
		} else if (var3 < -6) {
			return class479.method2443(16723968);
		} else if (var3 < -3) {
			return class479.method2443(16740352);
		} else if (var3 < 0) {
			return class479.method2443(16756736);
		} else if (var3 > 9) {
			return class479.method2443(65280);
		} else if (var3 > 6) {
			return class479.method2443(4259584);
		} else if (var3 > 3) {
			return class479.method2443(8453888);
		} else {
			return var3 > 0 ? class479.method2443(12648192) : class479.method2443(16776960);
		}
	}
}
