import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class class209 {
	static boolean field1927;
	static File field1928;
	static Hashtable field1929;

	static {
		field1927 = false;
		field1929 = new Hashtable(16);
	}

	class209() throws Throwable {
	}

	public static void method1176(class215 var0) {
		class243.field2217 = var0;
		class243.field2215 = class243.field2217.method1238(16);
	}

	static class224[] method1175() {
		return new class224[]{class224.field2036, class224.field2039, class224.field2037, class224.field2038, class224.field2042};
	}

	static void method1177(byte var0) {
		try {
			File var1 = new File(class493.field4135, "random.dat");
			int var3;
			if (var1.exists()) {
				class297.field2738 = new class413(new class307(var1, "rw", 25L), 24, 0);
			} else {
				label46:
				for (int var2 = 0; var2 < class297.field2742.length; ++var2) {
					if (var0 != -1) {
						throw new IllegalStateException();
					}

					for (var3 = 0; var3 < class495.field4139.length; ++var3) {
						if (var0 != -1) {
							throw new IllegalStateException();
						}

						File var4 = new File(class495.field4139[var3] + class297.field2742[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							if (var0 != -1) {
								throw new IllegalStateException();
							}

							class297.field2738 = new class413(new class307(var4, "rw", 25L), 24, 0);
							break label46;
						}
					}
				}
			}

			if (null == class297.field2738) {
				RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
				var3 = var6.read();
				var6.seek(0L);
				var6.write(var3);
				var6.seek(0L);
				var6.close();
				class297.field2738 = new class413(new class307(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	static void method1178(class393 var0, int var1, int var2, int var3) {
		if (Client.field258 < 50 && class176.field1701.method2517() != 0) {
			if (null != var0.field3291 && var1 < var0.field3291.length) {
				class184.method1017(var0.field3291[var1], var2, var3);
			}
		}
	}

	static void method1179() {
		for (int var1 = 0; var1 < Client.field172.size(); ++var1) {
			if (class516.method2515((Integer)Client.field172.get(var1), (byte)-51) != 2) {
				Client.field172.remove(var1);
				--var1;
			}
		}

	}
}
