import java.util.Arrays;

public class class459 {
   public static final class459 field3571 = new class459(0, 32, 32);
   static final class459 field3569 = new class459(2, 48, 48);
   static final class459 field3570 = new class459(3, 16, 16);
   static final class459 field3572 = new class459(6, 8, 8);
   static final class459 field3574 = new class459(5, 96, 96);
   static final class459 field3575 = new class459(1, 128, 128);
   static final class459 field3576 = new class459(4, 64, 64);
   static final class459[] field3577 = method2252();
   final int field3579;
   public final int field3573;
   public final int field3578;

   static {
      Arrays.sort(field3577, new class191());
   }

   class459(int var1, int var2, int var3) {
      this.field3579 = var1;
      this.field3573 = var2;
      this.field3578 = var3;
   }

   int method2251() {
      return this.field3578 * this.field3573;
   }

   static class459[] method2252() {
      return new class459[]{field3571, field3575, field3569, field3570, field3576, field3574, field3572};
   }
}
