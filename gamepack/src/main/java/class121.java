import java.util.Locale;

@class231
@class466
public class class121 implements class188 {
   public static class298 field1492;
   public static final class121 field1491;
   public static final class121 field1494;
   public static final class121 field1497;
   static class246 field1501;
   static final class121 field1490;
   static final class121 field1495;
   static final class121 field1500;
   static final class121 field1502;
   static final class121[] field1499;
   final int field1498;
   final String field1493;
   final String field1496;

   static {
      field1497 = new class121("EN", "en", "English", class325.field2617, 0, "GB");
      field1502 = new class121("DE", "de", "German", class325.field2617, 1, "DE");
      field1491 = new class121("FR", "fr", "French", class325.field2617, 2, "FR");
      field1500 = new class121("PT", "pt", "Portuguese", class325.field2617, 3, "BR");
      field1490 = new class121("NL", "nl", "Dutch", class325.field2629, 4, "NL");
      field1494 = new class121("ES", "es", "Spanish", class325.field2629, 5, "ES");
      field1495 = new class121("ES_MX", "es-mx", "Spanish (Latin American)", class325.field2617, 6, "MX");
      class121[] var0 = method852();
      field1499 = new class121[var0.length];
      class121[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class121 var3 = var1[var2];
         if (field1499[var3.field1498] != null) {
            throw new IllegalStateException();
         }

         field1499[var3.field1498] = var3;
      }

   }

   class121(String var1, String var2, String var3, class325 var4, int var5, String var6) {
      this.field1496 = var1;
      this.field1493 = var2;
      this.field1498 = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   String method854() {
      return this.field1493;
   }

   public int method1195() {
      return this.field1498;
   }

   public String toString() {
      return this.method854().toLowerCase(Locale.ENGLISH);
   }

   static class121[] method852() {
      return new class121[]{field1494, field1502, field1491, field1495, field1490, field1497, field1500};
   }

   public static class121 method851(int var0) {
      return var0 >= 0 && var0 < field1499.length ? field1499[var0] : null;
   }
}
