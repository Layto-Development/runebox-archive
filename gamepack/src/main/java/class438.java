import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "oi")
public final class class438 {
	@ObfInfo(name = "<init>", desc = "()V")
	class438() throws Throwable {
	}

	@ObfInfo(name = "oc", desc = "(I)V", opaqueValue = "43747649")
	static void method2296() {
		if (null != class272.field2224) {
			Client.field150 = Client.field330;
			class272.field2224.method2023();

			for (int var1 = 0; var1 < Client.field200.length; ++var1) {
				if (null != Client.field200[var1]) {
					class272.field2224.method2022((Client.field200[var1].field1061 >> 7) + class265.field2147, class508.field4092 + (Client.field200[var1].field1032 >> 7));
				}
			}
		}

	}
}
