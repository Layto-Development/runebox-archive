import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ho")
public class class146 {
	@ObfInfo(name = "ef", desc = "Z")
	static boolean field1455;
	@ObfInfo(name = "jw", desc = "[I")
	static int[] field1452;
	@ObfInfo(name = "ao", desc = "[S")
	public short[] field1453;
	@ObfInfo(name = "at", desc = "[S")
	public short[] field1454;

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class146(int var1) {
		class270 var2 = class270.method1424(var1);
		if (var2.method1421()) {
			this.field1453 = new short[var2.field2173.length];
			System.arraycopy(var2.field2173, 0, this.field1453, 0, this.field1453.length);
		}

		if (var2.method1418()) {
			this.field1454 = new short[var2.field2175.length];
			System.arraycopy(var2.field2175, 0, this.field1454, 0, this.field1454.length);
		}

	}
}
