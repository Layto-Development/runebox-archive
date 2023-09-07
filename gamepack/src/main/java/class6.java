import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class6 {
    public static class267 field32;
    public static class267 field33;
    public static class267 field34;
    static int field31;
    static int field35;
    static File field30;
    static File field37;
    static String[] field36;

    static {
        field32 = null;
        field33 = null;
        field34 = null;
    }

    class6() throws Throwable {
    }

    public static void method8(String var0, String var1, String var2, int var3, int var4) throws IOException {
        if (null != var1 && !var1.isEmpty()) {
            var0 = var0 + "-" + var1;
        }

        field31 = 22;
        field35 = 0;

        try {
            class94.field770 = System.getProperty("os.name");
        } catch (Exception var24) {
            class94.field770 = "Unknown";
        }

        class157.field1342 = class94.field770.toLowerCase();
        class15.field59 = null;

        try {
            class15.field59 = System.getProperty("jagex.userhome");
        } catch (Exception var23) {
        }

        if (class15.field59 == null) {
            try {
                class15.field59 = System.getProperty("user.home");
            } catch (Exception var22) {
            }
        }

        if (null != class15.field59) {
            class15.field59 = class15.field59 + "/";
        }

        try {
            if (class157.field1342.startsWith("win")) {
                if (null == class15.field59) {
                    class15.field59 = System.getenv("USERPROFILE");
                }
            } else if (null == class15.field59) {
                class15.field59 = System.getenv("HOME");
            }

            if (null != class15.field59) {
                class15.field59 = class15.field59 + "/";
            }
        } catch (Exception var21) {
        }

        if (class15.field59 == null) {
            class15.field59 = "~/";
        }

        class416.field2912 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class15.field59, "/tmp/", ""};
        field36 = new String[]{".jagex_cache_" + field35, ".file_store_" + field35};
        int var6 = 0;

        label233:
        while (var6 < 4) {
            String var8 = var6 == 0 ? "" : String.valueOf(var6);
            field37 = new File(class15.field59, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            int var16;
            File var34;
            if (field37.exists()) {
                try {
                    class119 var12 = new class119(field37, "rw", 10000L);

                    class78 var13;
                    int var14;
                    for (var13 = new class78((int) var12.method532()); var13.field697 < var13.field695.length; var13.field697 += var14) {
                        var14 = var12.method533(var13.field695, var13.field697, var13.field695.length - var13.field697);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                    }

                    var13.field697 = 0;
                    var14 = var13.method260();
                    if (var14 < 1 || var14 > 3) {
                        throw new IOException(String.valueOf(var14));
                    }

                    int var15 = 0;
                    if (var14 > 1) {
                        var15 = var13.method260();
                    }

                    if (var14 <= 2) {
                        var9 = var13.method310();
                        if (var15 == 1) {
                            var10 = var13.method310();
                        }
                    } else {
                        var9 = var13.method302();
                        if (var15 == 1) {
                            var10 = var13.method302();
                        }
                    }

                    var12.method534();
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
                for (int var31 = 0; var31 < field36.length; ++var31) {
                    for (int var36 = 0; var36 < class416.field2912.length; ++var36) {
                        File var38 = new File(class416.field2912[var36] + field36[var31] + File.separatorChar + var0 + File.separatorChar);
                        if (var38.exists() && method6(new File(var38, "test.dat"), true)) {
                            var9 = var38.toString();
                            var11 = true;
                            break label208;
                        }
                    }
                }
            }

            if (var9 == null) {
                var9 = class15.field59 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
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
                method9(new File(var9), null);
            }

            File var7 = new File(var9);
            field30 = var7;
            if (!field30.exists()) {
                field30.mkdirs();
            }

            File[] var29 = field30.listFiles();
            if (var29 != null) {
                File[] var35 = var29;

                for (int var30 = 0; var30 < var35.length; ++var30) {
                    File var32 = var35[var30];
                    if (!method6(var32, false)) {
                        ++var6;
                        continue label233;
                    }
                }
            }
            break;
        }

        File var27 = field30;
        class66.field635 = var27;
        if (!class66.field635.exists()) {
            throw new RuntimeException("");
        } else {
            class66.field634 = true;
            class66.method186((byte) -1);
            field33 = new class267(new class119(class153.method720("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            field34 = new class267(new class119(class153.method720("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            class224.field1775 = new class267[field31];

            for (int var28 = 0; var28 < field31; ++var28) {
                class224.field1775[var28] = new class267(new class119(class153.method720("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
            }

        }
    }

    static void method9(File var0, File var1) {
        try {
            class119 var3 = new class119(field37, "rw", 10000L);
            class78 var4 = new class78(500);
            var4.method249(3);
            var4.method249(null != var1 ? 1 : 0);
            var4.method246(var0.getPath());
            if (null != var1) {
                var4.method246("");
            }

            var3.method531(var4.field695, 0, var4.field697);
            var3.method534();
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }

    static boolean method6(File var0, boolean var1) {
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

    public static class119 method7(String var0, String var1, boolean var2) {
        File var4 = new File(field30, "preferences" + var0 + ".dat");
        if (var4.exists()) {
            try {
                class119 var11 = new class119(var4, "rw", 10000L);
                return var11;
            } catch (IOException var10) {
            }
        }

        String var5 = "";
        if (field35 == 33) {
            var5 = "_rc";
        } else if (field35 == 34) {
            var5 = "_wip";
        }

        File var6 = new File(class15.field59, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
        class119 var7;
        if (!var2 && var6.exists()) {
            try {
                var7 = new class119(var6, "rw", 10000L);
                return var7;
            } catch (IOException var9) {
            }
        }

        try {
            var7 = new class119(var4, "rw", 10000L);
            return var7;
        } catch (IOException var8) {
            throw new RuntimeException();
        }
    }

    public static void method5(class78 var0, int var1) {
        if (null != field32) {
            try {
                field32.method1152(0L);
                field32.method1156(var0.field695, var1, 24);
            } catch (Exception var4) {
            }
        }

    }

    public static void method10() {
        try {
            field33.method1151();

            for (int var1 = 0; var1 < field31; ++var1) {
                class224.field1775[var1].method1151();
            }

            field34.method1151();
            field32.method1151();
        } catch (Exception var2) {
        }

    }
}
