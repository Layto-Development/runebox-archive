import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.zip.Inflater;

@ObfInfo(name = "us")
public class class221 {
	@ObfInfo(name = "au", desc = "Ljava/util/zip/Inflater;")
	Inflater field1938;

	@ObfInfo(name = "<init>", desc = "()V")
	public class221() {
		this(-1, 1000000, 1000000);
	}

	@ObfInfo(name = "<init>", desc = "(III)V")
	class221(int var1, int var2, int var3) {
	}

	@ObfInfo(name = "au", desc = "(Ltm;[BI)V", opaqueValue = "684351604")
	public void method1206(class280 var1, byte[] var2) {
		if (var1.field2252[var1.field2254] == 31 && var1.field2252[1 + var1.field2254] == -117) {
			if (null == this.field1938) {
				this.field1938 = new Inflater(true);
			}

			try {
				this.field1938.setInput(var1.field2252, var1.field2254 + 10, var1.field2252.length - (8 + var1.field2254 + 10));
				this.field1938.inflate(var2);
			} catch (Exception var5) {
				this.field1938.reset();
				throw new RuntimeException("");
			}

			this.field1938.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
