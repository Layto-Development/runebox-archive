import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class class15 {

	static boolean field83;

	static File field84;

	static Hashtable field85;

	static {
		field83 = false;
		field85 = new Hashtable(16);
	}

	class15() throws Throwable {
	}

	static void method48(byte var0) {
		try {
			File var1 = new File(class523.field4166, "random.dat");
			int var3;
			if (var1.exists()) {
				class89.field885 = new class358(new class6(var1, "rw", 25L), 24, 0);
			} else {
				label37: for (int var2 = 0; var2 < class89.field889.length; ++var2) {
					for (var3 = 0; var3 < class293.field2339.length; ++var3) {
						File var4 = new File(class293.field2339[var3] + class89.field889[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							class89.field885 = new class358(new class6(var4, "rw", 25L), 24, 0);
							break label37;
						}
					}
				}
			}
			if (null == class89.field885) {
				RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
				var3 = var6.read();
				var6.seek(0L);
				var6.write(var3);
				var6.seek(0L);
				var6.close();
				class89.field885 = new class358(new class6(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}
	}
}
