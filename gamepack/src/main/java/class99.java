public abstract class class99 {

	class99() {
	}

	abstract byte[] method625();

	public abstract void method624(byte[] var1);

	public static byte[] method626(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var7 = (byte[]) (byte[]) var0;
			if (var1) {
				int var5 = var7.length;
				byte[] var6 = new byte[var5];
				System.arraycopy(var7, 0, var6, 0, var5);
				return var6;
			} else {
				return var7;
			}
		} else if (var0 instanceof class99) {
			class99 var3 = (class99) var0;
			return var3.method625();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
