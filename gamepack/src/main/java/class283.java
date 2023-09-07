import java.util.concurrent.Callable;

public class class283 implements Callable {

	static class21 field2295;

	static int field2296;

	static int field2297;

	final class259 field2292;

	final class369 field2291;

	final class377 field2294;

	// $FF: synthetic field
	final class421 this$0;

	final int field2293;

	class283(class421 var1, class377 var2, class369 var3, class259 var4, int var5) {
		this.this$0 = var1;
		this.field2294 = var2;
		this.field2291 = var3;
		this.field2292 = var4;
		this.field2293 = var5;
	}

	@Override
	public Object call() {
		this.field2294.method1998();
		class377[][] var1;
		if (class369.field2951 == this.field2291) {
			var1 = this.this$0.field3244;
		} else {
			var1 = this.this$0.field3250;
		}
		var1[this.field2293][this.field2292.method1458()] = this.field2294;
		return null;
	}
}
