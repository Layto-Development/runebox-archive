import io.runebox.internal.deobfuscator.includes.ObfInfo;
import io.runebox.internal.deobfuscator.includes.Reflection;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfInfo(name = "bq")
public class class64 {
	@ObfInfo(name = "au", desc = "Loc;")
	public static class471 field755;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	static String field754;

	static {
		field755 = new class471();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class64() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(I)V")
	public static void method491() {
		field755 = new class471();
	}

	@ObfInfo(name = "ae", desc = "(Lto;I)V")
	public static void method490(class259 var0) {
		class54 var2 = (class54)field755.method2423();
		if (var2 != null) {
			int var3 = var0.field2254;
			var0.method1547(var2.field713);

			for (int var4 = 0; var4 < var2.field712; ++var4) {
				if (var2.field715[var4] != 0) {
					var0.method1481(var2.field715[var4]);
				} else {
					try {
						int var5 = var2.field720[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field719[var4];
							var7 = Reflection.getInt(var6, (Object)null);
							var0.method1481(0);
							var0.method1547(var7);
						} else if (var5 == 1) {
							var6 = var2.field719[var4];
							Reflection.setInt(var6, (Object)null, var2.field717[var4]);
							var0.method1481(0);
						} else if (var5 == 2) {
							var6 = var2.field719[var4];
							var7 = var6.getModifiers();
							var0.method1481(0);
							var0.method1547(var7);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.field718[var4];
								var7 = var23.getModifiers();
								var0.method1481(0);
								var0.method1547(var7);
							}
						} else {
							var23 = var2.field718[var4];
							byte[][] var24 = var2.field714[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = Reflection.invoke(var23, (Object)null, var8);
							if (null == var25) {
								var0.method1481(0);
							} else if (var25 instanceof Number) {
								var0.method1481(1);
								var0.method1518(((Number)var25).longValue());
							} else if (var25 instanceof String) {
								var0.method1481(2);
								var0.method1484((String)var25);
							} else {
								var0.method1481(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.method1481(-10);
					} catch (InvalidClassException var12) {
						var0.method1481(-11);
					} catch (StreamCorruptedException var13) {
						var0.method1481(-12);
					} catch (OptionalDataException var14) {
						var0.method1481(-13);
					} catch (IllegalAccessException var15) {
						var0.method1481(-14);
					} catch (IllegalArgumentException var16) {
						var0.method1481(-15);
					} catch (InvocationTargetException var17) {
						var0.method1481(-16);
					} catch (SecurityException var18) {
						var0.method1481(-17);
					} catch (IOException var19) {
						var0.method1481(-18);
					} catch (NullPointerException var20) {
						var0.method1481(-19);
					} catch (Exception var21) {
						var0.method1481(-20);
					} catch (Throwable var22) {
						var0.method1481(-21);
					}
				}
			}

			var0.method1510(var3);
			var2.method907();
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V")
	public static void method488(class280 var0, int var1) {
		class54 var3 = new class54();
		var3.field712 = var0.method1492();
		var3.field713 = var0.method1496();
		var3.field720 = new int[var3.field712];
		var3.field715 = new int[var3.field712];
		var3.field719 = new Field[var3.field712];
		var3.field717 = new int[var3.field712];
		var3.field718 = new Method[var3.field712];
		var3.field714 = new byte[var3.field712][][];

		for (int var4 = 0; var4 < var3.field712; ++var4) {
			try {
				int var5 = var0.method1492();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method1500();
						var7 = var0.method1500();
						var8 = var0.method1492();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method1500();
						}

						String var26 = var0.method1500();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method1496();
								var11[var12] = new byte[var13];
								var0.method1502(var11[var12], 0, var13);
							}
						}

						var3.field720[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = method489(var9[var13]);
						}

						Class var28 = method489(var26);
						if (method489(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = method489(var6).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (Reflection.getMethodName(var17).equals(var7)) {
								Class[] var18 = Reflection.getArgumentTypes(var17);
								if (var18.length == var27.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var27[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var28 == var17.getReturnType()) {
										var3.field718[var4] = var17;
									}
								}
							}
						}

						var3.field714[var4] = var11;
					}
				} else {
					var6 = var0.method1500();
					var7 = var0.method1500();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method1496();
					}

					var3.field720[var4] = var5;
					var3.field717[var4] = var8;
					if (method489(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field719[var4] = Reflection.getField(method489(var6), var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field715[var4] = -1;
			} catch (SecurityException var22) {
				var3.field715[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field715[var4] = -3;
			} catch (Exception var24) {
				var3.field715[var4] = -4;
			} catch (Throwable var25) {
				var3.field715[var4] = -5;
			}
		}

		field755.method2417(var3);
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;I)Ljava/lang/Class;")
	static Class method489(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.getClass(var0);
		}
	}
}
