public class class55 {
   public class55 field1077;
   public class55 field1079;
   public long field1078;

   public void method605() {
      if (this.field1079 != null) {
         this.field1079.field1077 = this.field1077;
         this.field1077.field1079 = this.field1079;
         this.field1077 = null;
         this.field1079 = null;
      }
   }

   public boolean method606() {
      return this.field1079 != null;
   }
}
