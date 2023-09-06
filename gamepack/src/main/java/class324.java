import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class class324 implements Callable {
	static class253 field2900;
	static class25[] field2899;

	class324() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	public static void method1828(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (null != var1 && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class297.field2737 = var4;
		class297.field2741 = var3;

		try {
			class161.field1486 = System.getProperty("os.name");
		} catch (Exception var24) {
			class161.field1486 = "Unknown";
		}

		class41.field524 = class161.field1486.toLowerCase();
		class493.field4135 = null;

		try {
			class493.field4135 = System.getProperty("jagex.userhome");
		} catch (Exception var23) {
		}

		if (class493.field4135 == null) {
			try {
				class493.field4135 = System.getProperty("user.home");
			} catch (Exception var22) {
			}
		}

		if (null != class493.field4135) {
			class493.field4135 = class493.field4135 + "/";
		}

		try {
			if (class41.field524.startsWith("win")) {
				if (null == class493.field4135) {
					class493.field4135 = System.getenv("USERPROFILE");
				}
			} else if (null == class493.field4135) {
				class493.field4135 = System.getenv("HOME");
			}

			if (null != class493.field4135) {
				class493.field4135 = class493.field4135 + "/";
			}
		} catch (Exception var21) {
		}

		if (class493.field4135 == null) {
			class493.field4135 = "~/";
		}

		class495.field4139 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class493.field4135, "/tmp/", ""};
		class297.field2742 = new String[]{".jagex_cache_" + class297.field2741, ".file_store_" + class297.field2741};
		int var6 = 0;

		label233:
		while (var6 < 4) {
			String var8 = var6 == 0 ? "" : "" + var6;
			class297.field2743 = new File(class493.field4135, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
			String var9 = null;
			String var10 = null;
			boolean var11 = false;
			int var16;
			File var34;
			if (class297.field2743.exists()) {
				try {
					class307 var12 = new class307(class297.field2743, "rw", 10000L);

					class42 var13;
					int var14;
					for (var13 = new class42((int)var12.method1736()); var13.field527 < var13.field525.length; var13.field527 += var14) {
						var14 = var12.method1737(var13.field525, var13.field527, var13.field525.length - var13.field527);
						if (var14 == -1) {
							throw new IOException();
						}
					}

					var13.field527 = 0;
					var14 = var13.method278();
					if (var14 < 1 || var14 > 3) {
						throw new IOException("" + var14);
					}

					int var15 = 0;
					if (var14 > 1) {
						var15 = var13.method278();
					}

					if (var14 <= 2) {
						var9 = var13.method328();
						if (var15 == 1) {
							var10 = var13.method328();
						}
					} else {
						var9 = var13.method320();
						if (var15 == 1) {
							var10 = var13.method320();
						}
					}

					var12.method1738();
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
				for (int var31 = 0; var31 < class297.field2742.length; ++var31) {
					for (int var36 = 0; var36 < class495.field4139.length; ++var36) {
						File var38 = new File(class495.field4139[var36] + class297.field2742[var31] + File.separatorChar + var0 + File.separatorChar);
						if (var38.exists() && class445.method2223(new File(var38, "test.dat"), true)) {
							var9 = var38.toString();
							var11 = true;
							break label208;
						}
					}
				}
			}

			if (var9 == null) {
				var9 = class493.field4135 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
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
				class137.method831(new File(var9), (File)null);
			}

			File var7 = new File(var9);
			class297.field2736 = var7;
			if (!class297.field2736.exists()) {
				class297.field2736.mkdirs();
			}

			File[] var29 = class297.field2736.listFiles();
			if (var29 != null) {
				File[] var35 = var29;

				for (int var30 = 0; var30 < var35.length; ++var30) {
					File var32 = var35[var30];
					if (!class445.method2223(var32, false)) {
						++var6;
						continue label233;
					}
				}
			}
			break;
		}

		File var27 = class297.field2736;
		class209.field1928 = var27;
		if (!class209.field1928.exists()) {
			throw new RuntimeException("");
		} else {
			class209.field1927 = true;
			class209.method1177((byte)-1);
			class297.field2739 = new class413(new class307(class316.method1751("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			class297.field2740 = new class413(new class307(class316.method1751("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class436.field3865 = new class413[class297.field2737];

			for (int var28 = 0; var28 < class297.field2737; ++var28) {
				class436.field3865[var28] = new class413(new class307(class316.method1751("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
			}

		}
	}
}
