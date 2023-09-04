public class class70 {
   public class70 field530;
   public class70 field532;
   public long field531;

   public void method295() {
      if (this.field532 != null) {
         this.field532.field530 = this.field530;
         this.field530.field532 = this.field532;
         this.field530 = null;
         this.field532 = null;
      }
   }

   public boolean method296() {
      return this.field532 != null;
   }
}
