import java.util.zip.Inflater;

public class class115 {

	Inflater field1412;

	public class115() {
		this(-1, 1000000, 1000000);
	}

	class115(int var1, int var2, int var3) {
	}

	public void method792(class187 var1, byte[] var2) {
		if (var1.field1830[var1.field1832] == 31 && var1.field1830[1 + var1.field1832] == -117) {
			if (null == this.field1412) {
				this.field1412 = new Inflater(true);
			}
			try {
				this.field1412.setInput(var1.field1830, var1.field1832 + 10, var1.field1830.length - (8 + var1.field1832 + 10));
				this.field1412.inflate(var2);
			} catch (Exception var5) {
				this.field1412.reset();
				throw new RuntimeException("");
			}
			this.field1412.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
