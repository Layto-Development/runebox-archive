import java.util.Iterator;

public class class394 extends class337 {
    static boolean field2787;

    public class394(class337 var1) {
        super(var1);
        super.field2442 = "StartSongTask";
    }

    @Override
    public boolean method1595() {
        Iterator<class537> var2 = class141.field1240.iterator();

        while (var2.hasNext()) {
            class537 var3 = var2.next();
            if (null != var3 && !var3.field4274 && null != var3.field4273) {
                try {
                    var3.field4273.method2137();
                    var3.field4273.method2134(0);
                    if (var3.field4277 != null) {
                        var3.field4273.method2138(var3.field4277, var3.field4271);
                    }

                    var3.field4277 = null;
                    var3.field4276 = null;
                    var3.field4270 = null;
                    var3.field4274 = true;
                } catch (Exception var5) {
                    class157.method728(null, var5);
                    this.method1598(var5.getMessage());
                    return true;
                }
            }
        }

        super.field2444 = true;
        return true;
    }
}
