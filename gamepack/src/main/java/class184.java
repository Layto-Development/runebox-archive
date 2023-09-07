import java.util.ArrayList;
import java.util.Iterator;

public class class184 extends class337 {
    ArrayList<class537> field1533;

    public class184(class337 var1, ArrayList<class537> var2) {
        super(var1);
        super.field2442 = "ClearRequestTask";
        this.field1533 = var2;
    }

    @Override
    public boolean method1595() {
        if (this.field1533.isEmpty()) {
            return true;
        } else {
            Iterator<class537> var2 = this.field1533.iterator();

            while (var2.hasNext()) {
                class537 var3 = var2.next();

                try {
                    if (class141.field1240.contains(var3)) {
                        if (null == var3) {
                            class141.field1240.remove(var3);
                        } else {
                            if (var3.field4273.field3347 > 0) {
                                --var3.field4273.field3347;
                            }

                            if (var3.field4273.field3347 == 0) {
                                var3.field4273.method2166();
                                var3.field4273.method2164();
                                var3.field4273.method2134(0);
                            }

                            int var4 = var3.field4267;
                            int var5 = var3.field4268;
                            Iterator<Client> var6 = class141.field1243.iterator();

                            while (var6.hasNext()) {
                                class541 var7 = var6.next();
                                var7.method2591(var4, var5);
                            }

                            class141.field1240.remove(var3);
                        }
                    }
                } catch (Exception var8) {
                    class157.method728(null, var8);
                    this.method1598(var8.getMessage());
                    class141.field1240.clear();
                    return true;
                }
            }

            return true;
        }
    }
}
