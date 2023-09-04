import java.awt.FontMetrics;

public class class204 {
   static class501 field1574;
   static FontMetrics field1573;

   class204() throws Throwable {
   }

   static final void method1061(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class158.field1004.method508(!class158.field1004.method509());
         if (class158.field1004.method509()) {
            class431.method2007(99, "", "Roofs are now all hidden");
         } else {
            class431.method2007(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var2 = class447.method2083(var0.substring(5).trim()) == 1;
         class530.field4182.method2547(var2);
         class480.method2272(var2);
      }

      if (var0.equalsIgnoreCase("z")) {
         Client.field1180 = !Client.field1180;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         class158.field1004.method512();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.field1354 = !Client.field1354;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.field1276 = !Client.field1276;
      }

      if (Client.field1204 >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class512.field4083.field741 = !class512.field4083.field741;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            class158.field1004.method511(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            class158.field1004.method511(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            Client.method870();
         }
      }

      class53 var3 = class53.method226(class10.field162, Client.field1181.field3781);
      var3.field435.method1643(var0.length() + 1);
      var3.field435.method1646(var0);
      Client.field1181.method2254(var3);
   }
}
