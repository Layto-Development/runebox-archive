final class class286 implements class187 {
	static class342 field2521;

	void method1628(Integer var1, class42 var2) {
		var2.method333(var1);
	}

	public Object method1035(class42 var1) {
		return var1.method282();
	}

	public void method1036(Object var1, class42 var2) {
		this.method1628((Integer)var1, var2);
	}

	static int method1629(int var0, class167 var1, boolean var2) {
		class60 var4;
		if (var0 != 1927 && var0 != 2927) {
			int var9;
			if (var0 == 1928) {
				var4 = var2 ? class491.field4134 : class52.field599;
				var9 = class139.field1344[--class203.field1903];
				if (var9 >= 1 && var9 <= 10) {
					class434 var10 = new class434(var9, var4.field644, var4.field763, var4.field772);
					class139.field1341.add(var10);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				class203.field1903 -= 3;
				int var8 = class139.field1344[class203.field1903];
				var9 = class139.field1344[class203.field1903 + 1];
				int var6 = class139.field1344[2 + class203.field1903];
				if (var6 >= 1 && var6 <= 10) {
					class434 var7 = new class434(var6, var8, var9, class366.method1967(var8).field772);
					class139.field1341.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (class139.field1342 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = class366.method1967(class139.field1344[--class203.field1903]);
			} else {
				var4 = var2 ? class491.field4134 : class52.field599;
			}

			if (null == var4.field638) {
				return 0;
			} else {
				class309 var5 = new class309();
				var5.field2791 = var4;
				var5.field2794 = var4.field638;
				var5.field2801 = 1 + class139.field1342;
				Client.field218.method567(var5);
				return 1;
			}
		}
	}
}
