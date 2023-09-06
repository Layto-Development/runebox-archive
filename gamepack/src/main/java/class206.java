public class class206 extends class1 {
	String field1909;
	// $FF: synthetic field
	final class226 this$0;

	class206(class226 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1909 = var3;
	}

	public int method4() {
		return 1;
	}

	public String method2() {
		return this.field1909;
	}

	static int method1154(int var0, class167 var1, boolean var2) {
		class60 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class366.method1967(class139.field1344[--class203.field1903]);
		} else {
			var4 = var2 ? class491.field4134 : class52.field599;
		}

		String var5 = class139.field1331[--class429.field3529];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = class139.field1344[--class203.field1903];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = class139.field1344[--class203.field1903]) {
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = class139.field1331[--class429.field3529];
			} else {
				var10[var8] = new Integer(class139.field1344[--class203.field1903]);
			}
		}

		var8 = class139.field1344[--class203.field1903];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == 1400) {
			var4.field696 = var10;
		} else if (var0 == 1401) {
			var4.field732 = var10;
		} else if (var0 == 1402) {
			var4.field729 = var10;
		} else if (var0 == 1403) {
			var4.field733 = var10;
		} else if (var0 == 1404) {
			var4.field705 = var10;
		} else if (var0 == 1405) {
			var4.field736 = var10;
		} else if (var0 == 1406) {
			var4.field739 = var10;
		} else if (var0 == 1407) {
			var4.field711 = var10;
			var4.field741 = var6;
		} else if (var0 == 1408) {
			var4.field637 = var10;
		} else if (var0 == 1409) {
			var4.field747 = var10;
		} else if (var0 == 1410) {
			var4.field737 = var10;
		} else if (var0 == 1411) {
			var4.field642 = var10;
		} else if (var0 == 1412) {
			var4.field734 = var10;
		} else if (var0 == 1414) {
			var4.field742 = var10;
			var4.field673 = var6;
		} else if (var0 == 1415) {
			var4.field744 = var10;
			var4.field745 = var6;
		} else if (var0 == 1416) {
			var4.field738 = var10;
		} else if (var0 == 1417) {
			var4.field669 = var10;
		} else if (var0 == 1418) {
			var4.field635 = var10;
		} else if (var0 == 1419) {
			var4.field751 = var10;
		} else if (var0 == 1420) {
			var4.field701 = var10;
		} else if (var0 == 1421) {
			var4.field755 = var10;
		} else if (var0 == 1422) {
			var4.field758 = var10;
		} else if (var0 == 1423) {
			var4.field691 = var10;
		} else if (var0 == 1424) {
			var4.field723 = var10;
		} else if (var0 == 1425) {
			var4.field762 = var10;
		} else if (var0 == 1426) {
			var4.field777 = var10;
		} else if (var0 == 1427) {
			var4.field638 = var10;
		} else if (var0 == 1428) {
			var4.field756 = var10;
		} else if (var0 == 1429) {
			var4.field757 = var10;
		} else if (var0 == 1430) {
			var4.field761 = var10;
		} else if (var0 == 1431) {
			var4.field718 = var10;
		} else if (var0 == 1434) {
			var4.field709 = var10;
		} else if (var0 == 1435) {
			var4.field748 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class108 var9 = var4.method459();
			if (var9 != null) {
				if (var0 == 1436) {
					var9.field1044 = var10;
				} else if (var0 == 1437) {
					var9.field1045 = var10;
				} else if (var0 == 1438) {
					var9.field1040 = var10;
				} else if (var0 == 1439) {
					var9.field1042 = var10;
				}
			}
		}

		var4.field727 = true;
		return 1;
	}

	static void method1153(class393 var0, int var1, int var2, int var3) {
		if (Client.field258 < 50 && class176.field1701.method2517() != 0) {
			if (null != var0.field3305 && var0.field3305.containsKey(var1)) {
				class184.method1017((Integer)var0.field3305.get(var1), var2, var3);
			}
		}
	}
}
