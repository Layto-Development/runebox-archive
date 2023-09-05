import java.awt.FontMetrics;

public class class52 {
   static class425 field1073;
   static FontMetrics field1072;

   class52() throws Throwable {
   }

   static final void method603(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class4.field36.method2404(!class4.field36.method2405());
         if (class4.field36.method2405()) {
            class194.method1209(99, "", "Roofs are now all hidden");
         } else {
            class194.method1209(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var2 = class330.method1736(var0.substring(5).trim()) == 1;
         class191.field1877.method1277(var2);
         class399.method1945(var2);
      }

      if (var0.equalsIgnoreCase("z")) {
         Client.field640 = !Client.field640;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         class4.field36.method2408();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.field814 = !Client.field814;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.field736 = !Client.field736;
      }

      if (Client.field664 >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class477.field3650.field40 = !class477.field3650.field40;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            class4.field36.method2407(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            class4.field36.method2407(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            Client.method486();
         }
      }

      class335 var3 = class335.createPacket(ClientPacket.field1014, Client.field641.field2758);
      var3.buffer.method1114(var0.length() + 1);
      var3.buffer.method1117(var0);
      Client.field641.method1797(var3);
   }
}
