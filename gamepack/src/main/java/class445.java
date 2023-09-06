import java.io.File;
import java.io.RandomAccessFile;

public class class445 extends class218 {
	static class115[] field3912;
	static class342 field3911;
	class271 field3902;
	class271 field3908;
	class440 field3906;
	int field3903;
	int field3904;
	int field3907;
	String field3905;
	String field3909;
	String field3910;

	class445(int var1, String var2, String var3, String var4) {
		this.field3902 = class271.field2444;
		this.field3908 = class271.field2444;
		this.method2226(var1, var2, var3, var4);
	}

	void method2226(int var1, String var2, String var3, String var4) {
		int var6 = ++class41.field523 - 1;
		this.field3907 = var6;
		this.field3903 = Client.field306;
		this.field3904 = var1;
		this.field3905 = var2;
		this.method2231();
		this.field3909 = var3;
		this.field3910 = var4;
		this.method2224();
		this.method2228();
	}

	void method2224() {
		this.field3902 = class271.field2444;
	}

	final boolean method2229() {
		if (this.field3902 == class271.field2444) {
			this.method2225();
		}

		return this.field3902 == class271.field2443;
	}

	void method2225() {
		this.field3902 = class316.field2827.field1926.method1719(this.field3906) ? class271.field2443 : class271.field2442;
	}

	void method2228() {
		this.field3908 = class271.field2444;
	}

	final boolean method2227() {
		if (class271.field2444 == this.field3908) {
			this.method2230();
		}

		return this.field3908 == class271.field2443;
	}

	void method2230() {
		this.field3908 = class316.field2827.field1925.method1719(this.field3906) ? class271.field2443 : class271.field2442;
	}

	final void method2231() {
		if (this.field3905 != null) {
			this.field3906 = new class440(class30.method214(this.field3905), class168.field1640);
		} else {
			this.field3906 = null;
		}

	}

	static boolean method2223(File var0, boolean var1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}

	static void method2232() {
		class160 var1 = class85.method556(class129.field1266, Client.field68.field2426);
		var1.field1483.method267(class185.method1022());
		var1.field1483.method308(class237.field2181);
		var1.field1483.method308(class5.field322);
		Client.field68.method1570(var1);
	}
}
