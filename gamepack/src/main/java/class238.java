public class class238 extends class337 {
    static class31 field1834;

    public class238(class337 var1) {
        super(var1);
        super.field2442 = "SwapSongTask";
    }

    @Override
    public boolean method1595() {
        if (class141.field1240.size() > 1 && class141.field1240.get(0) != null && class141.field1240.get(0).field4273.method2162() && class141.field1240.get(1) != null && class141.field1240.get(1).field4273.method2162()) {
            class537 var2 = class141.field1240.get(0);
            class141.field1240.set(0, class141.field1240.get(1));
            class141.field1240.set(1, var2);
        }

        return true;
    }
}
