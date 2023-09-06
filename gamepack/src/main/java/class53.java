import java.nio.ByteBuffer;

public class class53 extends class178 {
	ByteBuffer field601;

	byte[] method1008() {
		byte[] var2 = new byte[this.field601.capacity()];
		this.field601.position(0);
		this.field601.get(var2);
		return var2;
	}

	public void method1007(byte[] var1) {
		this.field601 = ByteBuffer.allocateDirect(var1.length);
		this.field601.position(0);
		this.field601.put(var1);
	}

	public static String method388(class42 var0) {
		return class214.method1210(var0, 32767);
	}

	static void method391(int var0, int var1, int var2, int var3) {
		class60 var5 = class203.method1149(var0, var1);
		if (var5 != null && null != var5.field738) {
			class309 var6 = new class309();
			var6.field2791 = var5;
			var6.field2794 = var5.field738;
			class186.method1031(var6);
		}

		Client.field137 = var3;
		Client.field95 = true;
		class292.field2723 = var0;
		Client.field171 = var1;
		class306.field2773 = var2;
		class185.method1024(var5);
	}
}
