import java.util.Locale;

@class466
@class293
public class class103 implements class42 {
   public static class509 field685;
   public static final class103 field684;
   public static final class103 field687;
   public static final class103 field690;
   static class516 field694;
   static final class103 field683;
   static final class103 field688;
   static final class103 field693;
   static final class103 field695;
   static final class103[] field692;
   final int field691;
   final String field686;
   final String field689;

   static {
      field690 = new class103("EN", "en", "English", class451.field3562, 0, "GB");
      field695 = new class103("DE", "de", "German", class451.field3562, 1, "DE");
      field684 = new class103("FR", "fr", "French", class451.field3562, 2, "FR");
      field693 = new class103("PT", "pt", "Portuguese", class451.field3562, 3, "BR");
      field683 = new class103("NL", "nl", "Dutch", class451.field3574, 4, "NL");
      field687 = new class103("ES", "es", "Spanish", class451.field3574, 5, "ES");
      field688 = new class103("ES_MX", "es-mx", "Spanish (Latin American)", class451.field3562, 6, "MX");
      class103[] var0 = method383();
      field692 = new class103[var0.length];
      class103[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class103 var3 = var1[var2];
         if (field692[var3.field691] != null) {
            throw new IllegalStateException();
         }

         field692[var3.field691] = var3;
      }

   }

   class103(String var1, String var2, String var3, class451 var4, int var5, String var6) {
      this.field689 = var1;
      this.field686 = var2;
      this.field691 = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   String method384() {
      return this.field686;
   }

   public int method180() {
      return this.field691;
   }

   public String toString() {
      return this.method384().toLowerCase(Locale.ENGLISH);
   }

   static class103[] method383() {
      return new class103[]{field687, field695, field684, field688, field683, field690, field693};
   }

   public static class103 method382(int var0) {
      return var0 >= 0 && var0 < field692.length ? field692[var0] : null;
   }
}
