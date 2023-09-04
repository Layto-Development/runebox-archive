import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class269 {
   public static class493 field1883 = null;
   public static class493 field1884 = null;
   public static class493 field1885 = null;
   static int field1882;
   static int field1886;
   static File field1881;
   static File field1888;
   static String[] field1887;

   class269() throws Throwable {
   }

   public static void method1221(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      field1882 = var4;
      field1886 = var3;

      try {
         class198.field1539 = System.getProperty("os.name");
      } catch (Exception var24) {
         class198.field1539 = "Unknown";
      }

      class431.field3371 = class198.field1539.toLowerCase();
      class177.field1432 = null;

      try {
         class177.field1432 = System.getProperty("jagex.userhome");
      } catch (Exception var23) {
      }

      if (class177.field1432 == null) {
         try {
            class177.field1432 = System.getProperty("user.home");
         } catch (Exception var22) {
         }
      }

      if (null != class177.field1432) {
         class177.field1432 = class177.field1432 + "/";
      }

      try {
         if (class431.field3371.startsWith("win")) {
            if (null == class177.field1432) {
               class177.field1432 = System.getenv("USERPROFILE");
            }
         } else if (null == class177.field1432) {
            class177.field1432 = System.getenv("HOME");
         }

         if (null != class177.field1432) {
            class177.field1432 = class177.field1432 + "/";
         }
      } catch (Exception var21) {
      }

      if (class177.field1432 == null) {
         class177.field1432 = "~/";
      }

      class407.field2819 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class177.field1432, "/tmp/", ""};
      field1887 = new String[]{".jagex_cache_" + field1886, ".file_store_" + field1886};
      int var6 = 0;

      label233:
      while(var6 < 4) {
         String var8 = var6 == 0 ? "" : "" + var6;
         field1888 = new File(class177.field1432, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
         String var9 = null;
         String var10 = null;
         boolean var11 = false;
         int var16;
         File var34;
         if (field1888.exists()) {
            try {
               class390 var12 = new class390(field1888, "rw", 10000L);

               class366 var13;
               int var14;
               for(var13 = new class366((int)var12.method1781()); var13.field2652 < var13.field2650.length; var13.field2652 += var14) {
                  var14 = var12.method1782(var13.field2650, var13.field2652, var13.field2650.length - var13.field2652);
                  if (var14 == -1) {
                     throw new IOException();
                  }
               }

               var13.field2652 = 0;
               var14 = var13.method1654();
               if (var14 < 1 || var14 > 3) {
                  throw new IOException("" + var14);
               }

               int var15 = 0;
               if (var14 > 1) {
                  var15 = var13.method1654();
               }

               if (var14 <= 2) {
                  var9 = var13.method1704();
                  if (var15 == 1) {
                     var10 = var13.method1704();
                  }
               } else {
                  var9 = var13.method1696();
                  if (var15 == 1) {
                     var10 = var13.method1696();
                  }
               }

               var12.method1783();
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
            for(int var31 = 0; var31 < field1887.length; ++var31) {
               for(int var36 = 0; var36 < class407.field2819.length; ++var36) {
                  File var38 = new File(class407.field2819[var36] + field1887[var31] + File.separatorChar + var0 + File.separatorChar);
                  if (var38.exists() && method1219(new File(var38, "test.dat"), true)) {
                     var9 = var38.toString();
                     var11 = true;
                     break label208;
                  }
               }
            }
         }

         if (var9 == null) {
            var9 = class177.field1432 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var11 = true;
         }

         if (null != var10) {
            File var33 = new File(var10);
            var34 = new File(var9);

            try {
               File[] var39 = var33.listFiles();
               File[] var41 = var39;

               for(var16 = 0; var16 < var41.length; ++var16) {
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
            method1222(new File(var9), (File)null);
         }

         File var7 = new File(var9);
         field1881 = var7;
         if (!field1881.exists()) {
            field1881.mkdirs();
         }

         File[] var29 = field1881.listFiles();
         if (var29 != null) {
            File[] var35 = var29;

            for(int var30 = 0; var30 < var35.length; ++var30) {
               File var32 = var35[var30];
               if (!method1219(var32, false)) {
                  ++var6;
                  continue label233;
               }
            }
         }
         break;
      }

      File var27 = field1881;
      class348.field2566 = var27;
      if (!class348.field2566.exists()) {
         throw new RuntimeException("");
      } else {
         class348.field2565 = true;
         class348.method1595((byte)-1);
         field1884 = new class493(new class390(class290.method1315("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         field1885 = new class493(new class390(class290.method1315("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         class385.field2730 = new class493[field1882];

         for(int var28 = 0; var28 < field1882; ++var28) {
            class385.field2730[var28] = new class493(new class390(class290.method1315("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
         }

      }
   }

   static void method1222(File var0, File var1) {
      try {
         class390 var3 = new class390(field1888, "rw", 10000L);
         class366 var4 = new class366(500);
         var4.method1643(3);
         var4.method1643(null != var1 ? 1 : 0);
         var4.method1640(var0.getPath());
         if (null != var1) {
            var4.method1640("");
         }

         var3.method1780(var4.field2650, 0, var4.field2652);
         var3.method1783();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   static boolean method1219(File var0, boolean var1) {
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

   public static class390 method1220(String var0, String var1, boolean var2) {
      File var4 = new File(field1881, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class390 var11 = new class390(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
         }
      }

      String var5 = "";
      if (field1886 == 33) {
         var5 = "_rc";
      } else if (field1886 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class177.field1432, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class390 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class390(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
         }
      }

      try {
         var7 = new class390(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }

   public static void method1218(class366 var0, int var1) {
      if (null != field1883) {
         try {
            field1883.method2332(0L);
            field1883.method2336(var0.field2650, var1, 24);
         } catch (Exception var4) {
         }
      }

   }

   public static void method1223() {
      try {
         field1884.method2331();

         for(int var1 = 0; var1 < field1882; ++var1) {
            class385.field2730[var1].method2331();
         }

         field1885.method2331();
         field1883.method2331();
      } catch (Exception var2) {
      }

   }
}
