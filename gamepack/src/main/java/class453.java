import java.util.Iterator;

public class class453 extends class424 implements class510 {
	final class215 field3959;
	final class270 field3960;
	final int field3958;

	public class453(class460 var1, int var2, class168 var3, class215 var4) {
		super(var1, var3, var4 != null ? var4.method1238(var2) : 0);
		this.field3960 = new class270(64);
		this.field3959 = var4;
		this.field3958 = var2;
	}

	protected class531 method2171(int var1) {
		synchronized(this.field3960) {
			class523 var3 = (class523)this.field3960.method1580((long)var1);
			if (null == var3) {
				var3 = this.method2254(var1);
				this.field3960.method1582(var3, (long)var1);
			}

			return var3;
		}
	}

	class523 method2254(int var1) {
		byte[] var3 = this.field3959.method1212(this.field3958, var1);
		class523 var4 = new class523(var1);
		if (var3 != null) {
			var4.method2561(new class42(var3));
		}

		return var4;
	}

	public void method2253() {
		synchronized(this.field3960) {
			this.field3960.method1585();
		}
	}

	public Iterator iterator() {
		return new class346(this);
	}
}
