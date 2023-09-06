public class class131 extends class538 {
	public static short[][] field1279;
	int field1276;
	int field1277;
	int field1278;
	int field1280;
	// $FF: synthetic field
	final class464 this$0;

	class131(class464 var1) {
		this.this$0 = var1;
		this.field1278 = -1;
	}

	void method2583(class42 var1) {
		this.field1278 = var1.method327();
		this.field1277 = var1.method282();
		this.field1280 = var1.method278();
		this.field1276 = var1.method278();
	}

	void method2582(class379 var1) {
		var1.method2028(this.field1278, this.field1277, this.field1280, this.field1276);
	}

	static final void method777() {
		int var1;
		int var2;
		int var3;
		if (!Client.field265) {
			var1 = 64 + class481.field4081 * 128;
			var2 = class47.field542 * 128 + 64;
			var3 = class454.method2262(var1, var2, class358.field3038) - class243.field2219;
			class525.method2542(var1, var3, var2);
		} else if (null != Client.field268) {
			class375.field3180 = Client.field268.method1340();
			class196.field1796 = Client.field268.method1341();
			if (Client.field267) {
				class463.field3989 = Client.field268.method1342();
			} else {
				class463.field3989 = class454.method2262(class375.field3180, class196.field1796, class358.field3038) - Client.field268.method1342();
			}

			Client.field268.method1048();
		}

		if (!Client.field266) {
			var1 = 64 + class353.field3015 * 128;
			var2 = class82.field860 * 128 + 64;
			var3 = class454.method2262(var1, var2, class358.field3038) - class401.field3369;
			int var4 = var1 - class375.field3180;
			int var5 = var3 - class463.field3989;
			int var6 = var2 - class196.field1796;
			int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
			int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.9490051269531D) & 2047;
			int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.9490051269531D) & 2047;
			class483.method2400(var8, var9);
		} else {
			if (Client.field85 != null) {
				class452.field3956 = Client.field85.method1439();
				class452.field3956 = Math.min(Math.max(class452.field3956, 128), 383);
				Client.field85.method1048();
			}

			if (Client.field59 != null) {
				class175.field1694 = Client.field59.method1439() & 2047;
				Client.field59.method1048();
			}
		}

	}
}
