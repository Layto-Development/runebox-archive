public class class517 extends class337 {
    class537 field4173;
    int field4172;

    public class517(class337 var1, int var2, boolean var3, int var4) {
        super(var1);
        this.field4173 = null;
        this.field4172 = 0;
        super.field2442 = "FadeInTask";
        if (var3 && var2 < class141.field1247.size()) {
            this.field4173 = class141.field1247.get(var2);
        } else if (!var3 && var2 < class141.field1240.size()) {
            this.field4173 = class141.field1240.get(var2);
        }

        this.field4172 = var4;
    }

    @Override
    public boolean method1595() {
        if (this.field4173 != null && null != this.field4173.field4273) {
            this.field4173.field4278 = true;

            try {
                if (this.field4173.field4266 < (float) this.field4173.field4269 && this.field4173.field4273.method2162()) {
                    float var2 = this.field4172 == 0 ? (float) this.field4172 : (float) this.field4173.field4269 / (float) this.field4172;
                    class537 var10000 = this.field4173;
                    var10000.field4266 += 0.0F == var2 ? (float) this.field4173.field4269 : var2;
                    if (this.field4173.field4266 > (float) this.field4173.field4269) {
                        this.field4173.field4266 = (float) this.field4173.field4269;
                    }

                    this.field4173.field4273.method2134((int) this.field4173.field4266);
                    return false;
                }
            } catch (Exception var3) {
                this.method1598(var3.getMessage());
                return true;
            }

            this.field4173.field4278 = false;
            return true;
        } else {
            return true;
        }
    }
}
