import java.util.Locale;

@class428
@class50
public class class492 implements class330 {
    public static final class492 field3612;
    public static final class492 field3615;
    public static final class492 field3618;
    static final class492 field3611;
    static final class492 field3616;
    static final class492 field3621;
    static final class492 field3623;
    static final class492[] field3620;
    public static class68 field3613;
    static class194 field3622;

    static {
        field3618 = new class492("EN", "en", "English", class4.field11, 0, "GB");
        field3623 = new class492("DE", "de", "German", class4.field11, 1, "DE");
        field3612 = new class492("FR", "fr", "French", class4.field11, 2, "FR");
        field3621 = new class492("PT", "pt", "Portuguese", class4.field11, 3, "BR");
        field3611 = new class492("NL", "nl", "Dutch", class4.field23, 4, "NL");
        field3615 = new class492("ES", "es", "Spanish", class4.field23, 5, "ES");
        field3616 = new class492("ES_MX", "es-mx", "Spanish (Latin American)", class4.field11, 6, "MX");
        class492[] var0 = method2242();
        field3620 = new class492[var0.length];
        class492[] var1 = var0;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            class492 var3 = var1[var2];
            if (field3620[var3.field3619] != null) {
                throw new IllegalStateException();
            }

            field3620[var3.field3619] = var3;
        }

    }

    final int field3619;
    final String field3614;
    final String field3617;

    class492(String var1, String var2, String var3, class4 var4, int var5, String var6) {
        this.field3617 = var1;
        this.field3614 = var2;
        this.field3619 = var5;
        if (var6 != null) {
            new Locale(var2.substring(0, 2), var6);
        } else {
            new Locale(var2.substring(0, 2));
        }

    }

    static class492[] method2242() {
        return new class492[]{field3615, field3623, field3612, field3616, field3611, field3618, field3621};
    }

    public static class492 method2241(int var0) {
        return var0 >= 0 && var0 < field3620.length ? field3620[var0] : null;
    }

    String method2243() {
        return this.field3614;
    }

    @Override
    public int method1533() {
        return this.field3619;
    }

    @Override
    public String toString() {
        return this.method2243().toLowerCase(Locale.ENGLISH);
    }
}
