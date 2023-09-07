import java.util.Iterator;

public class class298 extends class337 {
    class68 field2151;
    class68 field2152;
    class68 field2153;

    public class298(class337 var1, class68 var2, class68 var3, class68 var4) {
        super(var1);
        this.field2151 = var2;
        this.field2152 = var3;
        this.field2153 = var4;
        super.field2442 = "LoadSongTask";
    }

    @Override
    public boolean method1595() {
        int var2 = 0;
        Iterator<class537> var3 = class141.field1240.iterator();

        while (true) {
            while (var3.hasNext()) {
                class537 var4 = var3.next();
                if (null != var4 && var4.field4273.field3347 > 1 && var4.field4273.method2139()) {
                    this.method1598("Attempted to load patches of already loading midiplayer!");
                    return true;
                }

                if (var4 != null && !var4.field4272) {
                    try {
                        if (null != var4.field4270 && var4.field4267 != -1 && var4.field4268 != -1) {
                            if (null == var4.field4277) {
                                var4.field4277 = class506.method2278(var4.field4270, var4.field4267, var4.field4268);
                                if (null == var4.field4277) {
                                    continue;
                                }
                            }

                            if (null == var4.field4276) {
                                var4.field4276 = new class56(this.field2153, this.field2152);
                            }

                            if (var4.field4273.method2135(var4.field4277, this.field2151, var4.field4276)) {
                                ++var2;
                                var4.field4272 = true;
                                var4.field4273.method2136();
                            }
                        } else {
                            ++var2;
                        }
                    } catch (Exception var6) {
                        class157.method728(null, var6);
                        this.method1598(var6.getMessage());
                        return true;
                    }
                } else {
                    ++var2;
                }
            }

			return var2 == class141.field1240.size();
		}
    }
}
