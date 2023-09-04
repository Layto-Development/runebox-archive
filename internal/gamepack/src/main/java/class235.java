public class class235 extends class306 {
   public static class245 field1731 = new class245(64);
   public static class509 field1730;
   static int[] field1728;
   class524 field1729;

   class235() {
   }

   void method1150() {
   }

   void method1151(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method1154(var1, var3);
      }
   }

   void method1154(class366 var1, int var2) {
      if (var2 == 249) {
         this.field1729 = class24.method121(var1, this.field1729);
      }

   }

   public int method1152(int var1, int var2) {
      return class24.method120(this.field1729, var1, var2);
   }

   public String method1153(int var1, String var2) {
      class524 var5 = this.field1729;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class88 var6 = (class88)var5.method2509((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field608;
         }
      }

      return var4;
   }

   public static class235 method1155(int var0) {
      class235 var2 = (class235)field1731.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field1730.method2422(34, var0);
         var2 = new class235();
         if (var3 != null) {
            var2.method1151(new class366(var3));
         }

         var2.method1150();
         field1731.method1182(var2, (long)var0);
         return var2;
      }
   }
}
