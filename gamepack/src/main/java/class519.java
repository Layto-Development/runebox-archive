import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfInfo(name = "gp")
public class class519 {
	@ObfInfo(name = "aq", desc = "Ltd;")
	public static class25 field4151;
	@ObfInfo(name = "al", desc = "Ltd;")
	public static class25 field4152;
	@ObfInfo(name = "an", desc = "Ltd;")
	public static class25 field4153;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 389454859)
	static int field4150;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -593090687)
	static int field4154;
	@ObfInfo(name = "ac", desc = "Ljava/io/File;")
	static File field4149;
	@ObfInfo(name = "at", desc = "Ljava/io/File;")
	static File field4156;
	@ObfInfo(name = "am", desc = "[Ljava/lang/String;")
	static String[] field4155;

	static {
		field4151 = null;
		field4152 = null;
		field4153 = null;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class519() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
	public static void method2545(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (null != var1 && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		field4150 = var4;
		field4154 = var3;

		try {
			class287.field2284 = System.getProperty("os.name");
		} catch (Exception var24) {
			class287.field2284 = "Unknown";
		}

		class159.field1507 = class287.field2284.toLowerCase();
		class64.field754 = null;

		try {
			class64.field754 = System.getProperty("jagex.userhome");
		} catch (Exception var23) {
		}

		if (class64.field754 == null) {
			try {
				class64.field754 = System.getProperty("user.home");
			} catch (Exception var22) {
			}
		}

		if (null != class64.field754) {
			class64.field754 = class64.field754 + "/";
		}

		try {
			if (class159.field1507.startsWith("win")) {
				if (null == class64.field754) {
					class64.field754 = System.getenv("USERPROFILE");
				}
			} else if (null == class64.field754) {
				class64.field754 = System.getenv("HOME");
			}

			if (null != class64.field754) {
				class64.field754 = class64.field754 + "/";
			}
		} catch (Exception var21) {
		}

		if (class64.field754 == null) {
			class64.field754 = "~/";
		}

		class156.field1487 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class64.field754, "/tmp/", ""};
		field4155 = new String[]{".jagex_cache_" + field4154, ".file_store_" + field4154};
		int var6 = 0;

		label233:
		while (var6 < 4) {
			String var8 = var6 == 0 ? "" : "" + var6;
			field4156 = new File(class64.field754, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
			String var9 = null;
			String var10 = null;
			boolean var11 = false;
			int var16;
			File var34;
			if (field4156.exists()) {
				try {
					class408 var12 = new class408(field4156, "rw", 10000L);

					class280 var13;
					int var14;
					for (var13 = new class280((int)var12.method2137()); var13.field2254 < var13.field2252.length; var13.field2254 += var14) {
						var14 = var12.method2138(var13.field2252, var13.field2254, var13.field2252.length - var13.field2254);
						if (var14 == -1) {
							throw new IOException();
						}
					}

					var13.field2254 = 0;
					var14 = var13.method1492();
					if (var14 < 1 || var14 > 3) {
						throw new IOException("" + var14);
					}

					int var15 = 0;
					if (var14 > 1) {
						var15 = var13.method1492();
					}

					if (var14 <= 2) {
						var9 = var13.method1542();
						if (var15 == 1) {
							var10 = var13.method1542();
						}
					} else {
						var9 = var13.method1534();
						if (var15 == 1) {
							var10 = var13.method1534();
						}
					}

					var12.method2139();
				} catch (IOException var26) {
					var26.printStackTrace();
				}

				if (var9 != null) {
					var34 = new File(var9);
					if (!var34.exists()) {
						var9 = null;
					}
				}

				if (var9 != null) {
					var34 = new File(var9, "test.dat");

					boolean var37;
					try {
						RandomAccessFile var40 = new RandomAccessFile(var34, "rw");
						var16 = var40.read();
						var40.seek(0L);
						var40.write(var16);
						var40.seek(0L);
						var40.close();
						var34.delete();
						var37 = true;
					} catch (Exception var20) {
						var37 = false;
					}

					if (!var37) {
						var9 = null;
					}
				}
			}

			if (null == var9 && var6 == 0) {
				label208:
				for (int var31 = 0; var31 < field4155.length; ++var31) {
					for (int var36 = 0; var36 < class156.field1487.length; ++var36) {
						File var38 = new File(class156.field1487[var36] + field4155[var31] + File.separatorChar + var0 + File.separatorChar);
						if (var38.exists() && method2543(new File(var38, "test.dat"), true)) {
							var9 = var38.toString();
							var11 = true;
							break label208;
						}
					}
				}
			}

			if (var9 == null) {
				var9 = class64.field754 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var11 = true;
			}

			if (null != var10) {
				File var33 = new File(var10);
				var34 = new File(var9);

				try {
					File[] var39 = var33.listFiles();
					File[] var41 = var39;

					for (var16 = 0; var16 < var41.length; ++var16) {
						File var17 = var41[var16];
						File var18 = new File(var34, var17.getName());
						boolean var19 = var17.renameTo(var18);
						if (!var19) {
							throw new IOException();
						}
					}
				} catch (Exception var25) {
					var25.printStackTrace();
				}

				var11 = true;
			}

			if (var11) {
				method2546(new File(var9), (File)null);
			}

			File var7 = new File(var9);
			field4149 = var7;
			if (!field4149.exists()) {
				field4149.mkdirs();
			}

			File[] var29 = field4149.listFiles();
			if (var29 != null) {
				File[] var35 = var29;

				for (int var30 = 0; var30 < var35.length; ++var30) {
					File var32 = var35[var30];
					if (!method2543(var32, false)) {
						++var6;
						continue label233;
					}
				}
			}
			break;
		}

		File var27 = field4149;
		class1.field2 = var27;
		if (!class1.field2.exists()) {
			throw new RuntimeException("");
		} else {
			class1.field1 = true;
			class1.method1((byte)-1);
			field4152 = new class25(new class408(class331.method1809("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			field4153 = new class25(new class408(class331.method1809("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class104.field1009 = new class25[field4150];

			for (int var28 = 0; var28 < field4150; ++var28) {
				class104.field1009[var28] = new class25(new class408(class331.method1809("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfInfo(name = "ae", desc = "(Ljava/io/File;Ljava/io/File;I)V")
	static void method2546(File var0, File var1) {
		try {
			class408 var3 = new class408(field4156, "rw", 10000L);
			class280 var4 = new class280(500);
			var4.method1481(3);
			var4.method1481(null != var1 ? 1 : 0);
			var4.method1478(var0.getPath());
			if (null != var1) {
				var4.method1478("");
			}

			var3.method2136(var4.field2252, 0, var4.field2254);
			var3.method2139();
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}

	@ObfInfo(name = "ao", desc = "(Ljava/io/File;ZI)Z")
	static boolean method2543(File var0, boolean var1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;Ljava/lang/String;ZI)Ltu;")
	public static class408 method2544(String var0, String var1, boolean var2) {
		File var4 = new File(field4149, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				class408 var11 = new class408(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (field4154 == 33) {
			var5 = "_rc";
		} else if (field4154 == 34) {
			var5 = "_wip";
		}

		File var6 = new File(class64.field754, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		class408 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new class408(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new class408(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "ai", desc = "(Ltm;II)V")
	public static void method2542(class280 var0, int var1) {
		if (null != field4151) {
			try {
				field4151.method346(0L);
				field4151.method350(var0.field2252, var1, 24);
			} catch (Exception var4) {
			}
		}

	}

	@ObfInfo(name = "az", desc = "(S)V")
	public static void method2547() {
		try {
			field4152.method345();

			for (int var1 = 0; var1 < field4150; ++var1) {
				class104.field1009[var1].method345();
			}

			field4153.method345();
			field4151.method345();
		} catch (Exception var2) {
		}

	}
}
