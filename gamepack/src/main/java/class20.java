import java.util.ArrayList;

public class class20 extends class358 {
   ArrayList field210;

   public class20(class358 var1, ArrayList var2) {
      super(var1);
      this.field210 = var2;
      super.field2810 = "ConcurrentMidiTask";
   }

   public boolean method1831() {
      for(int var2 = 0; var2 < this.field210.size(); ++var2) {
         class358 var3 = (class358)this.field210.get(var2);
         if (var3 == null) {
            this.field210.remove(var2);
            --var2;
         } else if (var3.method1831()) {
            if (var3.method1832()) {
               this.method1834(var3.method1830());
               this.field210.clear();
               return true;
            }

            if (var3.method1833() != null) {
               this.field210.add(var3.method1833());
            }

            super.field2812 = var3.field2812;
            this.field210.remove(var2);
            --var2;
         }
      }

      if (this.field210.isEmpty()) {
         return true;
      } else {
         return false;
      }
   }
}
