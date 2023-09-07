import java.util.Iterator;

public class class392 extends class337 {
    static class398 field2785;

    public class392(class337 var1) {
        super(var1);
        super.field2442 = "AddRequestTask";
    }

    @Override
    public boolean method1595() {
        while (!class141.field1247.isEmpty()) {
            class537 var2 = class141.field1247.peek();
            if (var2 == null) {
                class141.field1247.pop();
            } else {
                var2.field4273 = this.method1816();
                class141.field1240.add(var2);
                class141.field1247.pop();
            }
        }

        return true;
    }

    class468 method1816() {
        class468 var2 = null;
        Iterator<class468> var3 = class141.field1238.iterator();

        while (true) {
            class468 var4;
            do {
                do {
                    if (!var3.hasNext()) {
                        if (null != var2) {
                            ++var2.field3347;
                            if (var2.method2157() == 0 && var2.method2162()) {
                                var2.method2166();
                                var2.method2164();
                                var2.method2134(0);
                            }
                        }

                        return var2;
                    }

                    var4 = var3.next();
                } while (var4 == null);
            } while (null != var2 && var2.field3347 <= var4.field3347 && (var4.method2157() != 0 || !var4.method2162()));

            var2 = var4;
        }
    }
}
