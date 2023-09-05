import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfInfo(name = "ga")
public class class1 {
	@ObfInfo(name = "au", desc = "Z")
	static boolean field1;
	@ObfInfo(name = "ae", desc = "Ljava/io/File;")
	static File field2;
	@ObfInfo(name = "ao", desc = "Ljava/util/Hashtable;")
	static Hashtable field3;

	static {
		field1 = false;
		field3 = new Hashtable(16);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class1() throws Throwable {
	}

	@ObfInfo(name = "ac", desc = "(B)V")
	static void method1(byte var0) {
		try {
			File var1 = new File(class64.field754, "random.dat");
			int var3;
			if (var1.exists()) {
				class519.field4151 = new class25(new class408(var1, "rw", 25L), 24, 0);
			} else {
				label46:
				for (int var2 = 0; var2 < class519.field4155.length; ++var2) {
					if (var0 != -1) {
						throw new IllegalStateException();
					}

					for (var3 = 0; var3 < class156.field1487.length; ++var3) {
						if (var0 != -1) {
							throw new IllegalStateException();
						}

						File var4 = new File(class156.field1487[var3] + class519.field4155[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							if (var0 != -1) {
								throw new IllegalStateException();
							}

							class519.field4151 = new class25(new class408(var4, "rw", 25L), 24, 0);
							break label46;
						}
					}
				}
			}

			if (null == class519.field4151) {
				RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
				var3 = var6.read();
				var6.seek(0L);
				var6.write(var3);
				var6.seek(0L);
				var6.close();
				class519.field4151 = new class25(new class408(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}
}
