import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class class159 {
   static byte[][] field1013 = new byte[1000][];
   static byte[][] field1014 = new byte[250][];
   static byte[][] field1015 = new byte[100][];
   static byte[][] field1016 = new byte[50][];
   static int field1005 = 1000;
   static int field1006 = 100;
   static int field1007 = 0;
   static int field1008 = 0;
   static int field1009 = 0;
   static int field1010 = 250;
   static int field1012 = 50;
   static int field1017 = 0;
   static ArrayList field1011 = new ArrayList();

   static {
      method609();
      new HashMap();
   }

   class159() throws Throwable {
   }

   public static void method611(int[] var0, int[] var1) {
      if (null != var0 && var1 != null) {
         class170.field1081 = var0;
         class235.field1728 = new int[var0.length];
         class171.field1082 = new byte[var0.length][][];

         for(int var3 = 0; var3 < class170.field1081.length; ++var3) {
            class171.field1082[var3] = new byte[var1[var3]][];
            field1011.add(var0[var3]);
         }

         Collections.sort(field1011);
      } else {
         class170.field1081 = null;
         class235.field1728 = null;
         class171.field1082 = (byte[][][])null;
         method609();
      }
   }

   static void method609() {
      field1011.clear();
      field1011.add(100);
      field1011.add(5000);
      field1011.add(10000);
      field1011.add(30000);
   }

   public static synchronized byte[] method608(int var0, boolean var1) {
      byte[] var5;
      if ((var0 == 100 || var0 < 100 && var1) && field1017 > 0) {
         var5 = field1013[--field1017];
         field1013[field1017] = null;
         return var5;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && field1007 > 0) {
         var5 = field1014[--field1007];
         field1014[field1007] = null;
         return var5;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && field1008 > 0) {
         var5 = field1015[--field1008];
         field1015[field1008] = null;
         return var5;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field1009 > 0) {
         var5 = field1016[--field1009];
         field1016[field1009] = null;
         return var5;
      } else {
         int var3;
         if (null != class171.field1082) {
            for(var3 = 0; var3 < class170.field1081.length; ++var3) {
               if ((var0 == class170.field1081[var3] || var0 < class170.field1081[var3] && var1) && class235.field1728[var3] > 0) {
                  byte[] var4 = class171.field1082[var3][--class235.field1728[var3]];
                  class171.field1082[var3][class235.field1728[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != class170.field1081) {
            for(var3 = 0; var3 < class170.field1081.length; ++var3) {
               if (var0 <= class170.field1081[var3] && class235.field1728[var3] < class171.field1082[var3].length) {
                  return new byte[class170.field1081[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }

   public static synchronized byte[] method610(int var0) {
      return method608(var0, false);
   }

   public static synchronized void method612(byte[] var0) {
      if (100 == var0.length && field1017 < field1005) {
         field1013[++field1017 - 1] = var0;
      } else if (var0.length == 5000 && field1007 < field1010) {
         field1014[++field1007 - 1] = var0;
      } else if (10000 == var0.length && field1008 < field1006) {
         field1015[++field1008 - 1] = var0;
      } else if (30000 == var0.length && field1009 < field1012) {
         field1016[++field1009 - 1] = var0;
      } else {
         if (null != class171.field1082) {
            for(int var2 = 0; var2 < class170.field1081.length; ++var2) {
               if (class170.field1081[var2] == var0.length && class235.field1728[var2] < class171.field1082[var2].length) {
                  class171.field1082[var2][class235.field1728[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
