public class class368 extends class373 {
   class174 field2870;
   int field2867;
   int field2871;
   int field2872;
   final class227 field2869;
   final int field2868;

   class368(class89 var1, class89 var2, int var3, class227 var4) {
      super(var1, var2);
      this.field2868 = var3;
      this.field2869 = var4;
      this.method1859();
   }

   void method1859() {
      this.field2867 = class444.method2172(this.field2868, (byte)-56).method2215().field3469;
      this.field2870 = this.field2869.method1359(class444.method2173(this.field2867));
      class444 var2 = class444.method2173(this.method1871());
      class427 var3 = var2.method2169(false);
      if (null != var3) {
         this.field2871 = var3.field3237;
         this.field2872 = var3.field3233;
      } else {
         this.field2871 = 0;
         this.field2872 = 0;
      }

   }

   public int method1871() {
      return this.field2867;
   }

   class174 method1876() {
      return this.field2870;
   }

   int method1877() {
      return this.field2871;
   }

   int method1872() {
      return this.field2872;
   }
}
