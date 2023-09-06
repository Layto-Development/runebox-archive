import java.io.File;
import java.io.IOException;

public class class137 extends class538 {
	String field1327;
	long field1328;
	// $FF: synthetic field
	final class464 this$0;

	class137(class464 var1) {
		this.this$0 = var1;
		this.field1328 = -1L;
		this.field1327 = null;
	}

	void method2583(class42 var1) {
		if (var1.method278() != 255) {
			--var1.field527;
			this.field1328 = var1.method283();
		}

		this.field1327 = var1.method337();
	}

	void method2582(class379 var1) {
		var1.method2023(this.field1328, this.field1327);
	}

	static void method831(File var0, File var1) {
		try {
			class307 var3 = new class307(class297.field2743, "rw", 10000L);
			class42 var4 = new class42(500);
			var4.method267(3);
			var4.method267(null != var1 ? 1 : 0);
			var4.method264(var0.getPath());
			if (null != var1) {
				var4.method264("");
			}

			var3.method1735(var4.field525, 0, var4.field527);
			var3.method1738();
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}

	static final void method829() {
		for (class353 var1 = (class353)Client.field144.method563(); null != var1; var1 = (class353)Client.field144.method565()) {
			if (var1.field3026 == -1) {
				var1.field3025 = 0;
				class269.method1578(var1);
			} else {
				var1.method2269();
			}
		}

	}
}
