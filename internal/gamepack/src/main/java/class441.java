import java.util.Arrays;

public class class441 {
   public static final class441 field3482 = new class441(0, 32, 32);
   static final class441 field3480 = new class441(2, 48, 48);
   static final class441 field3481 = new class441(3, 16, 16);
   static final class441 field3483 = new class441(6, 8, 8);
   static final class441 field3485 = new class441(5, 96, 96);
   static final class441 field3486 = new class441(1, 128, 128);
   static final class441 field3487 = new class441(4, 64, 64);
   static final class441[] field3488 = method2045();
   final int field3490;
   public final int field3484;
   public final int field3489;

   static {
      Arrays.sort(field3488, new class530());
   }

   class441(int var1, int var2, int var3) {
      this.field3490 = var1;
      this.field3484 = var2;
      this.field3489 = var3;
   }

   int method2044() {
      return this.field3489 * this.field3484;
   }

   static class441[] method2045() {
      return new class441[]{field3482, field3486, field3480, field3481, field3487, field3485, field3483};
   }
}
