import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class class218 {
   static byte[][] field2029 = new byte[1000][];
   static byte[][] field2030 = new byte[250][];
   static byte[][] field2031 = new byte[100][];
   static byte[][] field2032 = new byte[50][];
   static int field2021 = 1000;
   static int field2022 = 100;
   static int field2023 = 0;
   static int field2024 = 0;
   static int field2025 = 0;
   static int field2026 = 250;
   static int field2028 = 50;
   static int field2033 = 0;
   static ArrayList field2027 = new ArrayList();

   static {
      method1315();
      new HashMap();
   }

   class218() throws Throwable {
   }

   public static void method1317(int[] var0, int[] var1) {
      if (null != var0 && var1 != null) {
         class513.field3984 = var0;
         class135.field1567 = new int[var0.length];
         class323.field2608 = new byte[var0.length][][];

         for(int var3 = 0; var3 < class513.field3984.length; ++var3) {
            class323.field2608[var3] = new byte[var1[var3]][];
            field2027.add(var0[var3]);
         }

         Collections.sort(field2027);
      } else {
         class513.field3984 = null;
         class135.field1567 = null;
         class323.field2608 = (byte[][][])null;
         method1315();
      }
   }

   static void method1315() {
      field2027.clear();
      field2027.add(100);
      field2027.add(5000);
      field2027.add(10000);
      field2027.add(30000);
   }

   public static synchronized byte[] method1314(int var0, boolean var1) {
      byte[] var5;
      if ((var0 == 100 || var0 < 100 && var1) && field2033 > 0) {
         var5 = field2029[--field2033];
         field2029[field2033] = null;
         return var5;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && field2023 > 0) {
         var5 = field2030[--field2023];
         field2030[field2023] = null;
         return var5;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && field2024 > 0) {
         var5 = field2031[--field2024];
         field2031[field2024] = null;
         return var5;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field2025 > 0) {
         var5 = field2032[--field2025];
         field2032[field2025] = null;
         return var5;
      } else {
         int var3;
         if (null != class323.field2608) {
            for(var3 = 0; var3 < class513.field3984.length; ++var3) {
               if ((var0 == class513.field3984[var3] || var0 < class513.field3984[var3] && var1) && class135.field1567[var3] > 0) {
                  byte[] var4 = class323.field2608[var3][--class135.field1567[var3]];
                  class323.field2608[var3][class135.field1567[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != class513.field3984) {
            for(var3 = 0; var3 < class513.field3984.length; ++var3) {
               if (var0 <= class513.field3984[var3] && class135.field1567[var3] < class323.field2608[var3].length) {
                  return new byte[class513.field3984[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }

   public static synchronized byte[] method1316(int var0) {
      return method1314(var0, false);
   }

   public static synchronized void method1318(byte[] var0) {
      if (var0.length == 100 && field2033 < field2021) {
         field2029[++field2033 - 1] = var0;
      } else if (var0.length == 5000 && field2023 < field2026) {
         field2030[++field2023 - 1] = var0;
      } else if (var0.length == 10000 && field2024 < field2022) {
         field2031[++field2024 - 1] = var0;
      } else if (var0.length == 30000 && field2025 < field2028) {
         field2032[++field2025 - 1] = var0;
      } else {
         if (null != class323.field2608) {
            for(int var2 = 0; var2 < class513.field3984.length; ++var2) {
               if (class513.field3984[var2] == var0.length && class135.field1567[var2] < class323.field2608[var2].length) {
                  class323.field2608[var2][class135.field1567[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
