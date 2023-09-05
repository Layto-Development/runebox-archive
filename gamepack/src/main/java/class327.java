import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class327 {
   static String field2639;
   boolean field2637 = false;
   boolean[] field2635;
   /** @deprecated */
   @Deprecated
   String[] field2634;
   Map field2638;
   long field2636;

   class327() {
      int var1 = class54.field1075.method1655(19);
      this.field2638 = new HashMap();
      this.field2635 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class395 var3 = class395.method1907(var2);
         this.field2635[var2] = var3.field3086;
      }

      var2 = 0;
      if (class54.field1075.method248(15)) {
         var2 = class54.field1075.method1655(15);
      }

      this.field2634 = new String[var2];
      this.method1724();
   }

   void method1726(int var1, int var2) {
      this.field2638.put(var1, var2);
      if (this.field2635[var1]) {
         this.field2637 = true;
      }

   }

   int method1715(int var1) {
      Object var3 = this.field2638.get(var1);
      return var3 instanceof Integer ? (Integer)var3 : -1;
   }

   void method1723(int var1, String var2) {
      this.field2638.put(var1, var2);
   }

   String method1716(int var1) {
      Object var3 = this.field2638.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   /** @deprecated */
   @Deprecated
   void method1722(int var1, String var2) {
      this.field2634[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   String method1717(int var1) {
      return this.field2634[var1];
   }

   void method1725() {
      int var2;
      for(var2 = 0; var2 < this.field2635.length; ++var2) {
         if (!this.field2635[var2]) {
            this.field2638.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.field2634.length; ++var2) {
         this.field2634[var2] = null;
      }

   }

   class472 method1718(boolean var1) {
      return class237.method1426("2", class521.field4093.field3356, var1);
   }

   void method1719() {
      class472 var2 = this.method1718(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field2638.entrySet().iterator();

         while(var5.hasNext()) {
            Map.Entry var6 = (Map.Entry)var5.next();
            int var7 = (Integer)var6.getKey();
            if (this.field2635[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += class184.method1188((String)var8);
               }

               ++var4;
            }
         }

         class184 var24 = new class184(var3);
         var24.method1114(2);
         var24.method1155(var4);
         Iterator var25 = this.field2638.entrySet().iterator();

         while(var25.hasNext()) {
            Map.Entry var26 = (Map.Entry)var25.next();
            int var27 = (Integer)var26.getKey();
            if (this.field2635[var27]) {
               var24.method1155(var27);
               Object var9 = var26.getValue();
               class247 var10 = class247.method1448(var9.getClass());
               var24.method1114(var10.field2221);
               Class var12 = var9.getClass();
               class247 var13 = class247.method1448(var12);
               if (var13 == null) {
                  throw new IllegalArgumentException();
               }

               class376 var11 = var13.field2223;
               var11.method1880(var9, var24);
            }
         }

         var2.method2281(var24.field1816, 0, var24.field1818);
      } catch (Exception var22) {
      } finally {
         try {
            var2.method2284();
         } catch (Exception var21) {
         }

      }

      this.field2637 = false;
      this.field2636 = class80.method713();
   }

   void method1724() {
      class472 var2 = this.method1718(false);

      label219: {
         try {
            byte[] var3 = new byte[(int)var2.method2282()];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var2.method2283(var3, var4, var3.length - var4);
               if (var5 == -1) {
                  throw new EOFException();
               }
            }

            class184 var25 = new class184(var3);
            if (var25.field1816.length - var25.field1818 >= 1) {
               int var6 = var25.readUnsignedByte();
               if (var6 < 0 || var6 > 2) {
                  return;
               }

               int var7;
               int var8;
               int var9;
               int var10;
               if (var6 >= 2) {
                  var7 = var25.method1174();
                  var8 = 0;

                  while(true) {
                     if (var8 >= var7) {
                        break label219;
                     }

                     var9 = var25.method1174();
                     var10 = var25.readUnsignedByte();
                     class247 var11 = (class247)class341.method1788(class247.method1450(), var10);
                     Object var12 = var11.method1449(var25);
                     if (var9 >= 0 && var9 < this.field2635.length && this.field2635[var9]) {
                        this.field2638.put(var9, var12);
                     }

                     ++var8;
                  }
               } else {
                  var7 = var25.method1174();

                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var25.method1174();
                     var10 = var25.readInt();
                     if (var9 >= 0 && var9 < this.field2635.length && this.field2635[var9]) {
                        this.field2638.put(var9, var10);
                     }
                  }

                  var8 = var25.method1174();
                  var9 = 0;

                  while(true) {
                     if (var9 >= var8) {
                        break label219;
                     }

                     var25.method1174();
                     var25.readString();
                     ++var9;
                  }
               }
            }
         } catch (Exception var23) {
            break label219;
         } finally {
            try {
               var2.method2284();
            } catch (Exception var22) {
            }

         }

         return;
      }

      this.field2637 = false;
   }

   void method1720() {
      if (this.field2637 && this.field2636 < class80.method713() - 60000L) {
         this.method1719();
      }

   }

   boolean method1721() {
      return this.field2637;
   }
}
