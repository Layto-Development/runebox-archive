import java.util.concurrent.Future;

public class class348 {

	protected static String field2630;

	static class432 field2632;

	String field2631;

	Future field2633;

	class348(Future var1) {
		this.field2633 = var1;
	}

	class348(String var1) {
		this.method1811(var1);
	}

	void method1811(String var1) {
		if (null == var1) {
			var1 = "";
		}
		this.field2631 = var1;
		if (null != this.field2633) {
			this.field2633.cancel(true);
			this.field2633 = null;
		}
	}

	public final String method1815() {
		return this.field2631;
	}

	public boolean method1813() {
		return null != this.field2631 || this.field2633 == null;
	}

	public final boolean method1812() {
		return this.method1813() ? true : this.field2633.isDone();
	}

	public final class416 method1814() {
		if (this.method1813()) {
			return new class416(this.field2631);
		} else if (!this.method1812()) {
			return null;
		} else {
			try {
				return (class416) this.field2633.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method1811(var3);
				return new class416(var3);
			}
		}
	}
}
