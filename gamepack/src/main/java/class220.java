public class class220 extends class303 {
	final class392 field2033;

	public class220(class392 var1) {
		super(400);
		this.field2033 = var1;
	}

	class71 method1721() {
		return new class350();
	}

	class71[] method1715(int var1) {
		return new class350[var1];
	}

	public void method1256(class42 var1, int var2) {
		while (var1.field527 < var2) {
			int var4 = var1.method278();
			if (var4 == 4) {
				class440 var10 = new class440(var1.method286(), this.field2033);
				if (!var10.method2215()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class316.field2827.method1169(var10.method2214(), var11);
			} else {
				boolean var5 = (var4 & 1) != 0;
				class440 var6 = new class440(var1.method286(), this.field2033);
				class440 var7 = new class440(var1.method286(), this.field2033);
				var1.method286();
				if (!var6.method2215()) {
					throw new IllegalStateException();
				}

				class350 var8 = (class350)this.method1706(var6);
				if (var5) {
					class350 var9 = (class350)this.method1706(var7);
					if (null != var9 && var8 != var9) {
						if (var8 != null) {
							this.method1707(var9);
						} else {
							var8 = var9;
						}
					}
				}

				if (null != var8) {
					this.method1710(var8, var6, var7);
				} else if (this.method1724() < 400) {
					int var12 = this.method1724();
					var8 = (class350)this.method1708(var6, var7);
					var8.field3006 = var12;
				}
			}
		}

	}

	static final void method1258(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		class102 var10;
		class160 var11;
		if (var2 == 9) {
			var10 = Client.field63[var3];
			if (null != var10) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1265, Client.field68.field2426);
				var11.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
				var11.field1483.method330(var3);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 12) {
			var10 = Client.field63[var3];
			if (var10 != null) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1235, Client.field68.field2426);
				var11.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
				var11.field1483.method308(var3);
				Client.field68.method1570(var11);
			}
		}

		class287 var13;
		if (var2 == 45) {
			var13 = Client.field176[var3];
			if (null != var13) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1227, Client.field68.field2426);
				var11.field1483.method303(var3);
				var11.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 47) {
			var13 = Client.field176[var3];
			if (var13 != null) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1242, Client.field68.field2426);
				var11.field1483.method330(var3);
				var11.field1483.method340(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		class60 var14;
		if (var2 == 57 || var2 == 1007) {
			var14 = class203.method1149(var1, var0);
			if (null != var14) {
				class164.method912(var3, var1, var0, var4, var6);
			}
		}

		class160 var15;
		if (var2 == 19) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1226, Client.field68.field2426);
			var15.field1483.method308(var1 + class164.field1606);
			var15.field1483.method303(class296.field2735 + var0);
			var15.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method336(var3);
			Client.field68.method1570(var15);
		}

		if (var2 == 1) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1194, Client.field68.field2426);
			var15.field1483.method330(class248.field2239);
			var15.field1483.method333(class158.field1477);
			var15.field1483.method308(class8.field347);
			var15.field1483.method303(var3);
			var15.field1483.method330(var1 + class164.field1606);
			var15.field1483.method330(class296.field2735 + var0);
			var15.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
			Client.field68.method1570(var15);
		}

		if (var2 == 13) {
			var10 = Client.field63[var3];
			if (var10 != null) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1221, Client.field68.field2426);
				var11.field1483.method314(Client.field151.method2118(82) ? 1 : 0);
				var11.field1483.method336(var3);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 14) {
			var13 = Client.field176[var3];
			if (var13 != null) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1187, Client.field68.field2426);
				var11.field1483.method287(class158.field1477);
				var11.field1483.method330(class248.field2239);
				var11.field1483.method330(class8.field347);
				var11.field1483.method330(var3);
				var11.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 1002) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			var15 = class85.method556(class129.field1240, Client.field68.field2426);
			var15.field1483.method303(var3);
			Client.field68.method1570(var15);
		}

		if (var2 == 10) {
			var10 = Client.field63[var3];
			if (null != var10) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1229, Client.field68.field2426);
				var11.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
				var11.field1483.method336(var3);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 1001) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1212, Client.field68.field2426);
			var15.field1483.method303(class164.field1606 + var1);
			var15.field1483.method336(class296.field2735 + var0);
			var15.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method330(var3);
			Client.field68.method1570(var15);
		}

		if (var2 == 26) {
			class476.method2302();
		}

		if (var2 == 8) {
			var10 = Client.field63[var3];
			if (null != var10) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1254, Client.field68.field2426);
				var11.field1483.method314(Client.field151.method2118(82) ? 1 : 0);
				var11.field1483.method330(var3);
				var11.field1483.method336(Client.field137);
				var11.field1483.method316(class292.field2723);
				var11.field1483.method303(Client.field171);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 18) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1204, Client.field68.field2426);
			var15.field1483.method330(var3);
			var15.field1483.method303(class296.field2735 + var0);
			var15.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method308(var1 + class164.field1606);
			Client.field68.method1570(var15);
		}

		if (var2 == 23) {
			if (Client.field116) {
				class415.field3487.method1800();
			} else {
				class415.field3487.method1779(class358.field3038, var0, var1, true);
			}
		}

		class160 var12;
		if (var2 == 24) {
			var14 = class366.method1967(var1);
			if (var14 != null) {
				boolean var17 = true;
				if (var14.field670 > 0) {
					var17 = class169.method938(var14);
				}

				if (var17) {
					var12 = class85.method556(class129.field1191, Client.field68.field2426);
					var12.field1483.method333(var1);
					Client.field68.method1570(var12);
				}
			}
		}

		if (var2 == 11) {
			var10 = Client.field63[var3];
			if (null != var10) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1257, Client.field68.field2426);
				var11.field1483.method303(var3);
				var11.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 49) {
			var13 = Client.field176[var3];
			if (null != var13) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1224, Client.field68.field2426);
				var11.field1483.method330(var3);
				var11.field1483.method314(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 16) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1230, Client.field68.field2426);
			var15.field1483.method303(class248.field2239);
			var15.field1483.method336(var3);
			var15.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method330(class8.field347);
			var15.field1483.method336(class296.field2735 + var0);
			var15.field1483.method330(class164.field1606 + var1);
			var15.field1483.method315(class158.field1477);
			Client.field68.method1570(var15);
		}

		if (var2 == 2) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1238, Client.field68.field2426);
			var15.field1483.method303(var3);
			var15.field1483.method330(var0 + class296.field2735);
			var15.field1483.method308(class164.field1606 + var1);
			var15.field1483.method303(Client.field171);
			var15.field1483.method314(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method303(Client.field137);
			var15.field1483.method287(class292.field2723);
			Client.field68.method1570(var15);
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			class306.field2771.method1137(var2, var3, new class29(var0), new class29(var1));
		}

		if (var2 == 6) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1249, Client.field68.field2426);
			var15.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method330(var1 + class164.field1606);
			var15.field1483.method308(var3);
			var15.field1483.method336(class296.field2735 + var0);
			Client.field68.method1570(var15);
		}

		if (var2 == 21) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1220, Client.field68.field2426);
			var15.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method336(class296.field2735 + var0);
			var15.field1483.method330(class164.field1606 + var1);
			var15.field1483.method336(var3);
			Client.field68.method1570(var15);
		}

		if (var2 == 30 && Client.field180 == null) {
			class255.method1502(var1, var0);
			Client.field180 = class203.method1149(var1, var0);
			class185.method1024(Client.field180);
		}

		if (var2 == 15) {
			var13 = Client.field176[var3];
			if (var13 != null) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1234, Client.field68.field2426);
				var11.field1483.method303(Client.field171);
				var11.field1483.method336(Client.field137);
				var11.field1483.method316(class292.field2723);
				var11.field1483.method336(var3);
				var11.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		int var16;
		class60 var18;
		if (var2 == 28) {
			var15 = class85.method556(class129.field1191, Client.field68.field2426);
			var15.field1483.method333(var1);
			Client.field68.method1570(var15);
			var18 = class366.method1967(var1);
			if (null != var18 && null != var18.field708 && var18.field708[0][0] == 5) {
				var16 = var18.field708[0][1];
				class23.field443[var16] = 1 - class23.field443[var16];
				class359.method1944(var16);
			}
		}

		if (var2 == 48) {
			var13 = Client.field176[var3];
			if (null != var13) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1189, Client.field68.field2426);
				var11.field1483.method330(var3);
				var11.field1483.method314(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 4) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1179, Client.field68.field2426);
			var15.field1483.method308(class296.field2735 + var0);
			var15.field1483.method308(class164.field1606 + var1);
			var15.field1483.method336(var3);
			var15.field1483.method340(Client.field151.method2118(82) ? 1 : 0);
			Client.field68.method1570(var15);
		}

		if (var2 == 29) {
			var15 = class85.method556(class129.field1191, Client.field68.field2426);
			var15.field1483.method333(var1);
			Client.field68.method1570(var15);
			var18 = class366.method1967(var1);
			if (null != var18 && var18.field708 != null && var18.field708[0][0] == 5) {
				var16 = var18.field708[0][1];
				if (var18.field767[0] != class23.field443[var16]) {
					class23.field443[var16] = var18.field767[0];
					class359.method1944(var16);
				}
			}
		}

		if (var2 == 1003) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			var10 = Client.field63[var3];
			if (null != var10) {
				class375 var19 = var10.field1018;
				if (null != var19.field3177) {
					var19 = var19.method2001();
				}

				if (null != var19) {
					var12 = class85.method556(class129.field1241, Client.field68.field2426);
					var12.field1483.method330(var19.field3148);
					Client.field68.method1570(var12);
				}
			}
		}

		if (var2 == 44) {
			var13 = Client.field176[var3];
			if (null != var13) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1186, Client.field68.field2426);
				var11.field1483.method303(var3);
				var11.field1483.method314(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 1004) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			var15 = class85.method556(class129.field1219, Client.field68.field2426);
			var15.field1483.method308(class296.field2735 + var0);
			var15.field1483.method303(var3);
			var15.field1483.method336(class164.field1606 + var1);
			Client.field68.method1570(var15);
		}

		if (var2 == 46) {
			var13 = Client.field176[var3];
			if (var13 != null) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1239, Client.field68.field2426);
				var11.field1483.method336(var3);
				var11.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 22) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1247, Client.field68.field2426);
			var15.field1483.method303(var0 + class296.field2735);
			var15.field1483.method308(var1 + class164.field1606);
			var15.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method308(var3);
			Client.field68.method1570(var15);
		}

		if (var2 == 58) {
			var14 = class203.method1149(var1, var0);
			if (var14 != null) {
				if (null != var14.field748) {
					class309 var20 = new class309();
					var20.field2791 = var14;
					var20.field2796 = var3;
					var20.field2800 = var6;
					var20.field2794 = var14.field748;
					class186.method1031(var20);
				}

				var11 = class85.method556(class129.field1190, Client.field68.field2426);
				var11.field1483.method330(Client.field137);
				var11.field1483.method308(var0);
				var11.field1483.method303(Client.field171);
				var11.field1483.method308(var4);
				var11.field1483.method316(class292.field2723);
				var11.field1483.method315(var1);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 5) {
			Client.field123 = var7;
			Client.field124 = var8;
			Client.field240 = 2;
			Client.field182 = 0;
			Client.field254 = var0;
			Client.field177 = var1;
			var15 = class85.method556(class129.field1215, Client.field68.field2426);
			var15.field1483.method308(var3);
			var15.field1483.method303(class296.field2735 + var0);
			var15.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
			var15.field1483.method308(class164.field1606 + var1);
			Client.field68.method1570(var15);
		}

		if (var2 == 50) {
			var13 = Client.field176[var3];
			if (var13 != null) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var11 = class85.method556(class129.field1275, Client.field68.field2426);
				var11.field1483.method336(var3);
				var11.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
				Client.field68.method1570(var11);
			}
		}

		if (var2 == 25) {
			var14 = class203.method1149(var1, var0);
			if (null != var14) {
				class67.method494();
				class53.method391(var1, var0, class190.method1044(class447.method2235(var14)), var4);
				Client.field168 = 0;
				Client.field186 = class58.method426(var14);
				if (null == Client.field186) {
					Client.field186 = class433.field3850;
				}

				if (var14.field724) {
					Client.field197 = var14.field648 + class394.method2064(16777215);
				} else {
					Client.field197 = class394.method2064(65280) + var14.field752 + class394.method2064(16777215);
				}
			}

		} else {
			if (var2 == 17) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var15 = class85.method556(class129.field1268, Client.field68.field2426);
				var15.field1483.method336(var0 + class296.field2735);
				var15.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
				var15.field1483.method330(Client.field137);
				var15.field1483.method303(Client.field171);
				var15.field1483.method316(class292.field2723);
				var15.field1483.method330(var1 + class164.field1606);
				var15.field1483.method330(var3);
				Client.field68.method1570(var15);
			}

			if (var2 == 20) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var15 = class85.method556(class129.field1210, Client.field68.field2426);
				var15.field1483.method336(var1 + class164.field1606);
				var15.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
				var15.field1483.method303(var3);
				var15.field1483.method336(var0 + class296.field2735);
				Client.field68.method1570(var15);
			}

			if (var2 == 3) {
				Client.field123 = var7;
				Client.field124 = var8;
				Client.field240 = 2;
				Client.field182 = 0;
				Client.field254 = var0;
				Client.field177 = var1;
				var15 = class85.method556(class129.field1255, Client.field68.field2426);
				var15.field1483.method308(class296.field2735 + var0);
				var15.field1483.method336(class164.field1606 + var1);
				var15.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
				var15.field1483.method303(var3);
				Client.field68.method1570(var15);
			}

			if (var2 == 51) {
				var13 = Client.field176[var3];
				if (var13 != null) {
					Client.field123 = var7;
					Client.field124 = var8;
					Client.field240 = 2;
					Client.field182 = 0;
					Client.field254 = var0;
					Client.field177 = var1;
					var11 = class85.method556(class129.field1271, Client.field68.field2426);
					var11.field1483.method267(Client.field151.method2118(82) ? 1 : 0);
					var11.field1483.method330(var3);
					Client.field68.method1570(var11);
				}
			}

			if (var2 == 7) {
				var10 = Client.field63[var3];
				if (null != var10) {
					Client.field123 = var7;
					Client.field124 = var8;
					Client.field240 = 2;
					Client.field182 = 0;
					Client.field254 = var0;
					Client.field177 = var1;
					var11 = class85.method556(class129.field1245, Client.field68.field2426);
					var11.field1483.method336(class8.field347);
					var11.field1483.method336(class248.field2239);
					var11.field1483.method287(class158.field1477);
					var11.field1483.method336(var3);
					var11.field1483.method298(Client.field151.method2118(82) ? 1 : 0);
					Client.field68.method1570(var11);
				}
			}

			if (Client.field168 != 0) {
				Client.field168 = 0;
				class185.method1024(class366.method1967(class158.field1477));
			}

			if (Client.field95) {
				class67.method494();
			}

		}
	}

	static class448 method1259(int var0) {
		class448 var2 = (class448)Client.field89.method1890((long)var0);
		if (null == var2) {
			var2 = new class448(class138.field1330, var0);
		}

		return var2;
	}
}
