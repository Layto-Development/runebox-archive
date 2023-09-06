import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class class52 {
	static class60 field599;
	boolean field597;
	int field593;
	int field594;
	int field595;
	int field596;
	int field598;
	int field600;

	class52(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.field597 = true;
		this.field595 = var1;
		this.field593 = var2;
		this.field594 = var3;
		this.field596 = var4;
		this.field600 = var5;
		this.field598 = var6;
		this.field597 = var7;
	}

	static void method387(int var0, class124 var1, class342 var2) {
		class329 var4 = new class329();
		var4.field2908 = 1;
		var4.field3987 = (long)var0;
		var4.field2909 = var1;
		var4.field2910 = var2;
		synchronized(class146.field1385) {
			class146.field1385.method567(var4);
		}

		class69.method501();
	}

	public static void method385(class347 var0) {
		class141 var2 = (class141)class493.field4136.method409();
		if (var2 != null) {
			int var3 = var0.field527;
			var0.method333(var2.field1355);

			for (int var4 = 0; var4 < var2.field1354; ++var4) {
				if (var2.field1357[var4] != 0) {
					var0.method267(var2.field1357[var4]);
				} else {
					try {
						int var5 = var2.field1362[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field1361[var4];
							var7 = var6.getInt((Object)null);
							System.out.println(var6+" : getInt() = "+var7);
							var0.method267(0);
							var0.method333(var7);
						} else if (var5 == 1) {
							var6 = var2.field1361[var4];
							var6.setInt((Object)null, var2.field1359[var4]);
							System.out.println(var6+" : setInt("+var2.field1359[var4]+")");
							var0.method267(0);
						} else if (var5 == 2) {
							var6 = var2.field1361[var4];
							var7 = var6.getModifiers();
							var0.method267(0);
							var0.method333(var7);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.field1360[var4];
								var7 = var23.getModifiers();
								var0.method267(0);
								var0.method333(var7);
							}
						} else {
							var23 = var2.field1360[var4];
							byte[][] var24 = var2.field1356[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = var23.invoke((Object)null, var8);
							if (null == var25) {
								var0.method267(0);
							} else if (var25 instanceof Number) {
								var0.method267(1);
								var0.method304(((Number)var25).longValue());
							} else if (var25 instanceof String) {
								var0.method267(2);
								var0.method270((String)var25);
							} else {
								var0.method267(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.method267(-10);
					} catch (InvalidClassException var12) {
						var0.method267(-11);
					} catch (StreamCorruptedException var13) {
						var0.method267(-12);
					} catch (OptionalDataException var14) {
						var0.method267(-13);
					} catch (IllegalAccessException var15) {
						var0.method267(-14);
					} catch (IllegalArgumentException var16) {
						var0.method267(-15);
					} catch (InvocationTargetException var17) {
						var0.method267(-16);
					} catch (SecurityException var18) {
						var0.method267(-17);
					} catch (IOException var19) {
						var0.method267(-18);
					} catch (NullPointerException var20) {
						var0.method267(-19);
					} catch (Exception var21) {
						var0.method267(-20);
					} catch (Throwable var22) {
						var0.method267(-21);
					}
				}
			}

			var0.method296(var3);
			var2.method2269();
		}
	}

	static char method386(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
}
