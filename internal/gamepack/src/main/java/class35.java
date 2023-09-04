public class class35 implements Runnable {
   static class501 field308;
   volatile class62[] field309 = new class62[2];

   class35() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class62 var2 = this.field309[var1];
            if (var2 != null) {
               var2.method276();
            }
         }
      } catch (Exception var3) {
         class431.method2006((String)null, var3);
      }

   }

   static final void method149(int var0, int var1, boolean var2) {
      if (Client.field1361[var0] != null) {
         if (var1 >= 0 && var1 < Client.field1361[var0].method1907()) {
            class367 var4 = (class367)Client.field1361[var0].field2933.get(var1);
            class53 var5 = class53.method226(class10.field167, Client.field1181.field3781);
            var5.field435.method1643(4 + class366.method1717(var4.field2656.method1598()));
            var5.field435.method1643(var0);
            var5.field435.method1684(var1);
            var5.field435.method1645(var2);
            var5.field435.method1646(var4.field2656.method1598());
            Client.field1181.method2254(var5);
         }
      }
   }
}
