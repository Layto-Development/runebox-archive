import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ma")
public abstract class class315 {
	@ObfInfo(name = "<init>", desc = "()V")
	class315() {
	}

	@ObfInfo(name = "ae", desc = "(I)[B")
	abstract byte[] method1735();

	@ObfInfo(name = "ao", desc = "([BI)V")
	public abstract void method1734(byte[] var1);

	@ObfInfo(name = "au", desc = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method1736(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var7 = (byte[])((byte[])var0);
			if (var1) {
				int var5 = var7.length;
				byte[] var6 = new byte[var5];
				System.arraycopy(var7, 0, var6, 0, var5);
				return var6;
			} else {
				return var7;
			}
		} else if (var0 instanceof class315) {
			class315 var3 = (class315)var0;
			return var3.method1735();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
