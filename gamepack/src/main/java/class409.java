public class class409 implements Runnable {
   static class425 field3154;
   volatile class331[] field3155 = new class331[2];

   class409() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class331 var2 = this.field3155[var1];
            if (var2 != null) {
               var2.method1759();
            }
         }
      } catch (Exception var3) {
         class194.method1208((String)null, var3);
      }

   }

   static final void method1982(int var0, int var1, boolean var2) {
      if (Client.field821[var0] != null) {
         if (var1 >= 0 && var1 < Client.field821[var0].method1604()) {
            class219 var4 = (class219)Client.field821[var0].field2457.get(var1);
            class335 var5 = class335.createPacket(ClientPacket.field1019, Client.field641.field2758);
            var5.buffer.method1114(4 + class184.method1188(var4.field2036.method1458()));
            var5.buffer.method1114(var0);
            var5.buffer.method1155(var1);
            var5.buffer.method1116(var2);
            var5.buffer.method1117(var4.field2036.method1458());
            Client.field641.method1797(var5);
         }
      }
   }
}
