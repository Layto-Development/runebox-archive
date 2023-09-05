import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class237 {
   public static class122 field2171 = null;
   public static class122 field2172 = null;
   public static class122 field2173 = null;
   static int field2170;
   static int field2174;
   static File field2169;
   static File field2176;
   static String[] field2175;

   class237() throws Throwable {
   }

   public static void method1427(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      field2170 = var4;
      field2174 = var3;

      try {
         class239.field2185 = System.getProperty("os.name");
      } catch (Exception var24) {
         class239.field2185 = "Unknown";
      }

      class194.field1891 = class239.field2185.toLowerCase();
      class138.field1581 = null;

      try {
         class138.field1581 = System.getProperty("jagex.userhome");
      } catch (Exception var23) {
      }

      if (class138.field1581 == null) {
         try {
            class138.field1581 = System.getProperty("user.home");
         } catch (Exception var22) {
         }
      }

      if (null != class138.field1581) {
         class138.field1581 = class138.field1581 + "/";
      }

      try {
         if (class194.field1891.startsWith("win")) {
            if (null == class138.field1581) {
               class138.field1581 = System.getenv("USERPROFILE");
            }
         } else if (null == class138.field1581) {
            class138.field1581 = System.getenv("HOME");
         }

         if (null != class138.field1581) {
            class138.field1581 = class138.field1581 + "/";
         }
      } catch (Exception var21) {
      }

      if (class138.field1581 == null) {
         class138.field1581 = "~/";
      }

      class524.field4129 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class138.field1581, "/tmp/", ""};
      field2175 = new String[]{".jagex_cache_" + field2174, ".file_store_" + field2174};
      int var6 = 0;

      label233:
      while(var6 < 4) {
         String var8 = var6 == 0 ? "" : "" + var6;
         field2176 = new File(class138.field1581, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
         String var9 = null;
         String var10 = null;
         boolean var11 = false;
         int var16;
         File var34;
         if (field2176.exists()) {
            try {
               class472 var12 = new class472(field2176, "rw", 10000L);

               class184 var13;
               int var14;
               for(var13 = new class184((int)var12.method2282()); var13.field1818 < var13.field1816.length; var13.field1818 += var14) {
                  var14 = var12.method2283(var13.field1816, var13.field1818, var13.field1816.length - var13.field1818);
                  if (var14 == -1) {
                     throw new IOException();
                  }
               }

               var13.field1818 = 0;
               var14 = var13.readUnsignedByte();
               if (var14 < 1 || var14 > 3) {
                  throw new IOException("" + var14);
               }

               int var15 = 0;
               if (var14 > 1) {
                  var15 = var13.readUnsignedByte();
               }

               if (var14 <= 2) {
                  var9 = var13.method1175();
                  if (var15 == 1) {
                     var10 = var13.method1175();
                  }
               } else {
                  var9 = var13.method1167();
                  if (var15 == 1) {
                     var10 = var13.method1167();
                  }
               }

               var12.method2284();
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
            for(int var31 = 0; var31 < field2175.length; ++var31) {
               for(int var36 = 0; var36 < class524.field4129.length; ++var36) {
                  File var38 = new File(class524.field4129[var36] + field2175[var31] + File.separatorChar + var0 + File.separatorChar);
                  if (var38.exists() && method1425(new File(var38, "test.dat"), true)) {
                     var9 = var38.toString();
                     var11 = true;
                     break label208;
                  }
               }
            }
         }

         if (var9 == null) {
            var9 = class138.field1581 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
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
            method1428(new File(var9), (File)null);
         }

         File var7 = new File(var9);
         field2169 = var7;
         if (!field2169.exists()) {
            field2169.mkdirs();
         }

         File[] var29 = field2169.listFiles();
         if (var29 != null) {
            File[] var35 = var29;

            for(int var30 = 0; var30 < var35.length; ++var30) {
               File var32 = var35[var30];
               if (!method1425(var32, false)) {
                  ++var6;
                  continue label233;
               }
            }
         }
         break;
      }

      File var27 = field2169;
      class293.field2471 = var27;
      if (!class293.field2471.exists()) {
         throw new RuntimeException("");
      } else {
         class293.field2470 = true;
         class293.method1615((byte)-1);
         field2172 = new class122(new class472(class314.method1684("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         field2173 = new class122(new class472(class314.method1684("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         class60.field1103 = new class122[field2170];

         for(int var28 = 0; var28 < field2170; ++var28) {
            class60.field1103[var28] = new class122(new class472(class314.method1684("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
         }

      }
   }

   static void method1428(File var0, File var1) {
      try {
         class472 var3 = new class472(field2176, "rw", 10000L);
         class184 var4 = new class184(500);
         var4.method1114(3);
         var4.method1114(null != var1 ? 1 : 0);
         var4.method1111(var0.getPath());
         if (null != var1) {
            var4.method1111("");
         }

         var3.method2281(var4.field1816, 0, var4.field1818);
         var3.method2284();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   static boolean method1425(File var0, boolean var1) {
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

   public static class472 method1426(String var0, String var1, boolean var2) {
      File var4 = new File(field2169, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class472 var11 = new class472(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
         }
      }

      String var5 = "";
      if (field2174 == 33) {
         var5 = "_rc";
      } else if (field2174 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class138.field1581, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class472 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class472(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
         }
      }

      try {
         var7 = new class472(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }

   public static void method1424(class184 var0, int var1) {
      if (null != field2171) {
         try {
            field2171.method856(0L);
            field2171.method860(var0.field1816, var1, 24);
         } catch (Exception var4) {
         }
      }

   }

   public static void method1429() {
      try {
         field2172.method855();

         for(int var1 = 0; var1 < field2170; ++var1) {
            class60.field1103[var1].method855();
         }

         field2173.method855();
         field2171.method855();
      } catch (Exception var2) {
      }

   }
}
