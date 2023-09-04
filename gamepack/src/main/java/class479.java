import java.util.zip.Inflater;

public class class479 {
   Inflater field3661;

   public class479() {
      this(-1, 1000000, 1000000);
   }

   class479(int var1, int var2, int var3) {
   }

   public void method2313(class184 var1, byte[] var2) {
      if (var1.field1816[var1.field1818] == 31 && var1.field1816[1 + var1.field1818] == -117) {
         if (null == this.field3661) {
            this.field3661 = new Inflater(true);
         }

         try {
            this.field3661.setInput(var1.field1816, var1.field1818 + 10, var1.field1816.length - (8 + var1.field1818 + 10));
            this.field3661.inflate(var2);
         } catch (Exception var5) {
            this.field3661.reset();
            throw new RuntimeException("");
         }

         this.field3661.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
