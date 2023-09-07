import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class171 {

	final int field1697;

	final String field1694;

	final ThreadFactory field1696;

	final ThreadPoolExecutor field1695;

	public class171(String var1, int var2, int var3) {
		this.field1694 = var1;
		this.field1697 = var2;
		this.field1696 = new class237(this);
		this.field1695 = this.method990(var3);
	}

	final ThreadPoolExecutor method990(int var1) {
		return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field1697), this.field1696);
	}

	public class348 method991(class98 var1) {
		if (this.field1695.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field1695.getCorePoolSize() + " Queue capacity " + this.field1697);
			return new class348("Queue full");
		} else {
			class348 var3 = new class348(this.field1695.submit(new class118(this, var1)));
			return var3;
		}
	}

	public final void method992() {
		try {
			this.field1695.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}
	}

	static void method993(int var0, String var1) {
		int var3 = class274.field2240;
		int[] var4 = class274.field2241;
		boolean var5 = false;
		class78 var6 = new class78(var1, class267.field2198);
		for (int var7 = 0; var7 < var3; ++var7) {
			class82 var8 = Client.field1071[var4[var7]];
			if (null != var8 && class431.field3378 != var8 && var8.field822 != null && var8.field822.equals(var6)) {
				class457 var9;
				if (var0 == 1) {
					var9 = class457.method2237(class483.field3800, Client.field963.field1603);
					var9.field3487.method1121(var4[var7]);
					var9.field3487.method1132(0);
					Client.field963.method911(var9);
				} else if (var0 == 4) {
					var9 = class457.method2237(class483.field3856, Client.field963.field1603);
					var9.field3487.method1148(var4[var7]);
					var9.field3487.method1158(0);
					Client.field963.method911(var9);
				} else if (var0 == 6) {
					var9 = class457.method2237(class483.field3838, Client.field963.field1603);
					var9.field3487.method1148(var4[var7]);
					var9.field3487.method1132(0);
					Client.field963.method911(var9);
				} else if (var0 == 7) {
					var9 = class457.method2237(class483.field3889, Client.field963.field1603);
					var9.field3487.method1154(var4[var7]);
					var9.field3487.method1085(0);
					Client.field963.method911(var9);
				}
				var5 = true;
				break;
			}
		}
		if (!var5) {
			class156.method918(4, "", class55.field463 + var1);
		}
	}

	static final String method994(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return class74.method314(16711680);
		} else if (var3 < -6) {
			return class74.method314(16723968);
		} else if (var3 < -3) {
			return class74.method314(16740352);
		} else if (var3 < 0) {
			return class74.method314(16756736);
		} else if (var3 > 9) {
			return class74.method314(65280);
		} else if (var3 > 6) {
			return class74.method314(4259584);
		} else if (var3 > 3) {
			return class74.method314(8453888);
		} else {
			return var3 > 0 ? class74.method314(12648192) : class74.method314(16776960);
		}
	}
}
