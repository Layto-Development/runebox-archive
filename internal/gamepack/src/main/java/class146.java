import java.util.Iterator;

public class class146 {
   int field937 = 0;
   final class516 field936;
   public final class176 field939;
   public final class273 field938;

   class146(class516 var1) {
      this.field936 = var1;
      this.field939 = new class176(var1);
      this.field938 = new class273(var1);
   }

   boolean method541() {
      return 2 == this.field937;
   }

   final void method542() {
      this.field937 = 1;
   }

   final void method553(class366 var1, int var2) {
      this.field939.method948(var1, var2, (byte)-1);
      this.field937 = 2;

      for(int var4 = 0; var4 < class470.field3728; ++var4) {
         class443 var5 = Client.field1289[class470.field3729[var4]];
         var5.method2051();
      }

      Iterator var7 = class431.field3368.iterator();

      while(var7.hasNext()) {
         class243 var6 = (class243)var7.next();
         var6.method1172();
      }

      if (class498.field3983 != null) {
         class498.field3983.method1146();
      }

   }

   final void method543() {
      for(class278 var2 = (class278)this.field939.field1429.method1314(); var2 != null; var2 = (class278)this.field939.field1429.method1313()) {
         if ((long)var2.field1948 < class123.method471() / 1000L - 5L) {
            if (var2.field1946 > 0) {
               class431.method2007(5, "", var2.field1945 + class424.field3162);
            }

            if (var2.field1946 == 0) {
               class431.method2007(5, "", var2.field1945 + class424.field3056);
            }

            var2.method987();
         }
      }

   }

   final void method544() {
      this.field937 = 0;
      this.field939.method1793();
      this.field938.method1793();
   }

   final boolean method545(class349 var1, boolean var2) {
      if (null == var1) {
         return false;
      } else if (var1.equals(class266.field1874.field3510)) {
         return true;
      } else {
         return this.field939.method947(var1, var2);
      }
   }

   final boolean method546(class349 var1) {
      if (null == var1) {
         return false;
      } else {
         return this.field938.method1809(var1);
      }
   }

   final void method547(String var1) {
      if (var1 != null) {
         class349 var3 = new class349(var1, this.field936);
         if (var3.method1599()) {
            if (this.method548()) {
               method557(class424.field3181);
            } else if (class266.field1874.field3510.equals(var3)) {
               method559();
            } else if (this.method545(var3, false)) {
               method560(var1);
            } else if (this.method546(var3)) {
               method557(class424.field3187 + var1 + class424.field3188);
            } else {
               method556(var1);
            }
         }
      }
   }

   final boolean method548() {
      return this.field939.method1794() || this.field939.method1814() >= 200 && 1 != Client.field1245;
   }

   final void method549(String var1) {
      if (null != var1) {
         class349 var3 = new class349(var1, this.field936);
         if (var3.method1599()) {
            if (this.method552()) {
               method557(class424.field3183);
            } else if (class266.field1874.field3510.equals(var3)) {
               method561();
            } else if (this.method546(var3)) {
               method555(var1);
            } else if (this.method545(var3, false)) {
               method557(class424.field3001 + var1 + class424.field3160);
            } else {
               class53 var4 = class53.method226(class10.field134, Client.field1181.field3781);
               var4.field435.method1643(class366.method1717(var1));
               var4.field435.method1646(var1);
               Client.field1181.method2254(var4);
            }
         }
      }
   }

   final boolean method552() {
      return this.field938.method1794() || this.field938.method1814() >= 100 && 1 != Client.field1245;
   }

   final void method550(String var1) {
      if (null != var1) {
         class349 var3 = new class349(var1, this.field936);
         if (var3.method1599()) {
            if (this.field939.method1812(var3)) {
               Client.method836();
               class53 var4 = class53.method226(class10.field114, Client.field1181.field3781);
               var4.field435.method1643(class366.method1717(var1));
               var4.field435.method1646(var1);
               Client.field1181.method2254(var4);
            }

            for(int var6 = 0; var6 < class470.field3728; ++var6) {
               class443 var5 = Client.field1289[class470.field3729[var6]];
               var5.method2051();
            }

            Iterator var7 = class431.field3368.iterator();

            while(var7.hasNext()) {
               class243 var8 = (class243)var7.next();
               var8.method1172();
            }

            if (null != class498.field3983) {
               class498.field3983.method1146();
            }

         }
      }
   }

   public final void method551(String var1, boolean var2) {
      if (null != var1) {
         class349 var4 = new class349(var1, this.field936);
         if (var4.method1599()) {
            if (this.field938.method1812(var4)) {
               Client.method836();
               if (var2) {
                  class53 var5 = class53.method226(class10.field136, Client.field1181.field3781);
                  var5.field435.method1643(class366.method1717(var1));
                  var5.field435.method1646(var1);
                  Client.field1181.method2254(var5);
               }
            }

            Client.method928();
         }
      }
   }

   final boolean method554(class349 var1) {
      class20 var3 = (class20)this.field939.method1795(var1);
      return null != var3 && var3.method2583();
   }

   static final void method557(String var0) {
      class431.method2007(30, "", var0);
   }

   static final void method560(String var0) {
      method557(var0 + class424.field3003);
   }

   static final void method559() {
      method557(class424.field3185);
   }

   static final void method556(String var0) {
      class53 var2 = class53.method226(class10.field86, Client.field1181.field3781);
      var2.field435.method1643(class366.method1717(var0));
      var2.field435.method1646(var0);
      Client.field1181.method2254(var2);
   }

   static final void method555(String var0) {
      method557(var0 + class424.field3184);
   }

   static final void method561() {
      method557(class424.field3186);
   }

   static final void method558(String var0, int var1) {
      class53 var3 = class53.method226(class10.field153, Client.field1181.field3781);
      var3.field435.method1643(class366.method1717(var0) + 1);
      var3.field435.method1643(var1);
      var3.field435.method1646(var0);
      Client.field1181.method2254(var3);
   }
}
