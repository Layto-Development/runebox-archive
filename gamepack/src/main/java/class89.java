import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class89 {

	public static class358 field885;

	public static class358 field886;

	public static class358 field887;

	static int field884;

	static int field888;

	static File field883;

	static File field890;

	static String[] field889;

	static {
		field885 = null;
		field886 = null;
		field887 = null;
	}

	class89() throws Throwable {
	}

	public static void method403(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (null != var1 && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}
		field884 = 22;
		field888 = 0;
		try {
			class265.field2176 = System.getProperty("os.name");
		} catch (Exception var24) {
			class265.field2176 = "Unknown";
		}
		class156.field1618 = class265.field2176.toLowerCase();
		class523.field4166 = null;
		try {
			class523.field4166 = System.getProperty("jagex.userhome");
		} catch (Exception var23) {
		}
		if (class523.field4166 == null) {
			try {
				class523.field4166 = System.getProperty("user.home");
			} catch (Exception var22) {
			}
		}
		if (null != class523.field4166) {
			class523.field4166 = class523.field4166 + "/";
		}
		try {
			if (class156.field1618.startsWith("win")) {
				if (null == class523.field4166) {
					class523.field4166 = System.getenv("USERPROFILE");
				}
			} else if (null == class523.field4166) {
				class523.field4166 = System.getenv("HOME");
			}
			if (null != class523.field4166) {
				class523.field4166 = class523.field4166 + "/";
			}
		} catch (Exception var21) {
		}
		if (class523.field4166 == null) {
			class523.field4166 = "~/";
		}
		class293.field2339 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class523.field4166, "/tmp/", "" };
		field889 = new String[] { ".jagex_cache_" + field888, ".file_store_" + field888 };
		int var6 = 0;
		label233: while (var6 < 4) {
			String var8 = var6 == 0 ? "" : "" + var6;
			field890 = new File(class523.field4166, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
			String var9 = null;
			String var10 = null;
			boolean var11 = false;
			int var16;
			File var34;
			if (field890.exists()) {
				try {
					class6 var12 = new class6(field890, "rw", 10000L);
					class187 var13;
					int var14;
					for (var13 = new class187((int) var12.method14()); var13.field1832 < var13.field1830.length; var13.field1832 += var14) {
						var14 = var12.method15(var13.field1830, var13.field1832, var13.field1830.length - var13.field1832);
						if (var14 == -1) {
							throw new IOException();
						}
					}
					var13.field1832 = 0;
					var14 = var13.method1096();
					if (var14 < 1 || var14 > 3) {
						throw new IOException("" + var14);
					}
					int var15 = 0;
					if (var14 > 1) {
						var15 = var13.method1096();
					}
					if (var14 <= 2) {
						var9 = var13.method1146();
						if (var15 == 1) {
							var10 = var13.method1146();
						}
					} else {
						var9 = var13.method1138();
						if (var15 == 1) {
							var10 = var13.method1138();
						}
					}
					var12.method16();
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
				label208: for (int var31 = 0; var31 < field889.length; ++var31) {
					for (int var36 = 0; var36 < class293.field2339.length; ++var36) {
						File var38 = new File(class293.field2339[var36] + field889[var31] + File.separatorChar + var0 + File.separatorChar);
						if (var38.exists() && method401(new File(var38, "test.dat"), true)) {
							var9 = var38.toString();
							var11 = true;
							break label208;
						}
					}
				}
			}
			if (var9 == null) {
				var9 = class523.field4166 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
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
				method404(new File(var9), (File) null);
			}
			File var7 = new File(var9);
			field883 = var7;
			if (!field883.exists()) {
				field883.mkdirs();
			}
			File[] var29 = field883.listFiles();
			if (var29 != null) {
				File[] var35 = var29;
				for (int var30 = 0; var30 < var35.length; ++var30) {
					File var32 = var35[var30];
					if (!method401(var32, false)) {
						++var6;
						continue label233;
					}
				}
			}
			break;
		}
		File var27 = field883;
		class15.field84 = var27;
		if (!class15.field84.exists()) {
			throw new RuntimeException("");
		} else {
			class15.field83 = true;
			class15.method48((byte) -1);
			field886 = new class358(new class6(class147.method897("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			field887 = new class358(new class6(class147.method897("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class12.field68 = new class358[field884];
			for (int var28 = 0; var28 < field884; ++var28) {
				class12.field68[var28] = new class358(new class6(class147.method897("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
			}
		}
	}

	static void method404(File var0, File var1) {
		try {
			class6 var3 = new class6(field890, "rw", 10000L);
			class187 var4 = new class187(500);
			var4.method1085(3);
			var4.method1085(null != var1 ? 1 : 0);
			var4.method1082(var0.getPath());
			if (null != var1) {
				var4.method1082("");
			}
			var3.method13(var4.field1830, 0, var4.field1832);
			var3.method16();
		} catch (IOException var5) {
			var5.printStackTrace();
		}
	}

	static boolean method401(File var0, boolean var1) {
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

	public static class6 method402(String var0, String var1, boolean var2) {
		File var4 = new File(field883, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				class6 var11 = new class6(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}
		String var5 = "";
		if (field888 == 33) {
			var5 = "_rc";
		} else if (field888 == 34) {
			var5 = "_wip";
		}
		File var6 = new File(class523.field4166, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		class6 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new class6(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}
		try {
			var7 = new class6(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	public static void method400(class187 var0, int var1) {
		if (null != field885) {
			try {
				field885.method1878(0L);
				field885.method1882(var0.field1830, var1, 24);
			} catch (Exception var4) {
			}
		}
	}

	public static void method405() {
		try {
			field886.method1877();
			for (int var1 = 0; var1 < field884; ++var1) {
				class12.field68[var1].method1877();
			}
			field887.method1877();
			field885.method1877();
		} catch (Exception var2) {
		}
	}
}
