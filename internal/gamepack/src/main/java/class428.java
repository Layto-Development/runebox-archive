import java.util.zip.Inflater;

public class class428 {
   Inflater field3338;

   public class428() {
      this(-1, 1000000, 1000000);
   }

   class428(int var1, int var2, int var3) {
   }

   public void method1986(class366 var1, byte[] var2) {
      if (var1.field2650[var1.field2652] == 31 && var1.field2650[1 + var1.field2652] == -117) {
         if (null == this.field3338) {
            this.field3338 = new Inflater(true);
         }

         try {
            this.field3338.setInput(var1.field2650, var1.field2652 + 10, var1.field2650.length - (8 + var1.field2652 + 10));
            this.field3338.inflate(var2);
         } catch (Exception var5) {
            this.field3338.reset();
            throw new RuntimeException("");
         }

         this.field3338.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
