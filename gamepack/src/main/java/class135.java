import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "cl")
public class class135 extends class342 {
	@ObfInfo(name = "<init>", desc = "()V")
	class135() {
	}

	@ObfInfo(name = "au", desc = "(IIILis;B)Z", opaqueValue = "-2")
	protected boolean method1879(int var1, int var2, int var3, class77 var4) {
		return super.field2700 == var2 && var3 == super.field2699;
	}

	@ObfInfo(name = "au", desc = "(III)I", opaqueValue = "-1371558530")
	static int method774(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	@ObfInfo(name = "ae", desc = "(II)Lhi;", opaqueValue = "596055365")
	public static class29 method773(int var0) {
		class29 var2 = (class29)class29.field468.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class29.field469.method2267(16, var0);
			var2 = new class29();
			if (null != var3) {
				var2.method412(new class280(var3));
			}

			class29.field468.method293(var2, (long)var0);
			return var2;
		}
	}
}
