public class class535 extends class358 {
   static class299 field4254;

   public class535(class358 var1) {
      super(var1);
      super.field2810 = "SwapSongTask";
   }

   public boolean method1831() {
      if (class228.field2105.size() > 1 && class228.field2105.get(0) != null && ((class131)class228.field2105.get(0)).field1551.method2203() && class228.field2105.get(1) != null && ((class131)class228.field2105.get(1)).field1551.method2203()) {
         class131 var2 = (class131)class228.field2105.get(0);
         class228.field2105.set(0, class228.field2105.get(1));
         class228.field2105.set(1, var2);
      }

      return true;
   }
}
