import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.File;
import java.io.RandomAccessFile;

@ObfInfo(name = "ln")
public class class331 {
	@ObfInfo(name = "va", desc = "Lci;")
	public static class14 field2633;
	@ObfInfo(name = "kj", desc = "[Luk;")
	static class398[] field2634;

	@ObfInfo(name = "<init>", desc = "()V")
	class331() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;I)Ljava/io/File;", opaqueValue = "-1951199713")
	static File method1809(String var0) {
		if (!class1.field1) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)class1.field3.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				File var3 = new File(class1.field2, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						class1.field3.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (var4 != null) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}
}
