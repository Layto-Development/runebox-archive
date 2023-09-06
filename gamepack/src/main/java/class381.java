import java.util.zip.Inflater;

public class class381 {
	Inflater field3227;

	public class381() {
		this(-1, 1000000, 1000000);
	}

	class381(int var1, int var2, int var3) {
	}

	public void method2037(class42 var1, byte[] var2) {
		if (var1.field525[var1.field527] == 31 && var1.field525[1 + var1.field527] == -117) {
			if (null == this.field3227) {
				this.field3227 = new Inflater(true);
			}

			try {
				this.field3227.setInput(var1.field525, var1.field527 + 10, var1.field525.length - (8 + var1.field527 + 10));
				this.field3227.inflate(var2);
			} catch (Exception var5) {
				this.field3227.reset();
				throw new RuntimeException("");
			}

			this.field3227.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
