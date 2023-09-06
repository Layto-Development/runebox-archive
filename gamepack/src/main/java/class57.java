import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class57 {
	final int field616;
	final String field613;
	final ThreadFactory field615;
	final ThreadPoolExecutor field614;

	public class57(String var1, int var2, int var3) {
		this.field613 = var1;
		this.field616 = var2;
		this.field615 = new class501(this);
		this.field614 = this.method419(var3);
	}

	final ThreadPoolExecutor method419(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field616), this.field615);
	}

	public class454 method421(class503 var1) {
		if (this.field614.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field614.getCorePoolSize() + " Queue capacity " + this.field616);
			return new class454("Queue full");
		} else {
			class454 var3 = new class454(this.field614.submit(new class426(this, var1)));
			return var3;
		}
	}

	public final void method422() {
		try {
			this.field614.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}

	static int method420(class526 var0, int var1, int var2) {
		if (null == var0) {
			return var2;
		} else {
			class380 var4 = (class380)var0.method2543((long)var1);
			return var4 == null ? var2 : var4.field3226;
		}
	}

	static void method424(int var0, String var1) {
		int var3 = class481.field4085;
		int[] var4 = class481.field4086;
		boolean var5 = false;
		class440 var6 = new class440(var1, class168.field1640);

		for (int var7 = 0; var7 < var3; ++var7) {
			class287 var8 = Client.field176[var4[var7]];
			if (null != var8 && class82.field863 != var8 && var8.field2539 != null && var8.field2539.equals(var6)) {
				class160 var9;
				if (var0 == 1) {
					var9 = class85.method556(class129.field1186, Client.field68.field2426);
					var9.field1483.method303(var4[var7]);
					var9.field1483.method314(0);
					Client.field68.method1570(var9);
				} else if (var0 == 4) {
					var9 = class85.method556(class129.field1242, Client.field68.field2426);
					var9.field1483.method330(var4[var7]);
					var9.field1483.method340(0);
					Client.field68.method1570(var9);
				} else if (var0 == 6) {
					var9 = class85.method556(class129.field1224, Client.field68.field2426);
					var9.field1483.method330(var4[var7]);
					var9.field1483.method314(0);
					Client.field68.method1570(var9);
				} else if (var0 == 7) {
					var9 = class85.method556(class129.field1275, Client.field68.field2426);
					var9.field1483.method336(var4[var7]);
					var9.field1483.method267(0);
					Client.field68.method1570(var9);
				}

				var5 = true;
				break;
			}
		}

		if (!var5) {
			class184.method1019(4, "", class433.field3684 + var1);
		}

	}

	static final String method425(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return class394.method2064(16711680);
		} else if (var3 < -6) {
			return class394.method2064(16723968);
		} else if (var3 < -3) {
			return class394.method2064(16740352);
		} else if (var3 < 0) {
			return class394.method2064(16756736);
		} else if (var3 > 9) {
			return class394.method2064(65280);
		} else if (var3 > 6) {
			return class394.method2064(4259584);
		} else if (var3 > 3) {
			return class394.method2064(8453888);
		} else {
			return var3 > 0 ? class394.method2064(12648192) : class394.method2064(16776960);
		}
	}

	static void method423(boolean var0) {
		Client.field136 = var0;
	}

	static final void method418(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class176.field1701.method2519(var0);
	}
}
