public class class473 extends class337 {
    class537 field3391;
    int field3390;

    public class473(class337 var1, int var2, boolean var3, int var4) {
        super(var1);
        this.field3391 = null;
        this.field3390 = 0;
        super.field2442 = "FadeOutTask";
        if (var2 < class141.field1240.size()) {
            this.field3391 = class141.field1240.get(var2);
        }

        this.field3390 = var4;
    }

    @Override
    public boolean method1595() {
        if (this.field3391 != null && this.field3391.field4273 != null) {
            this.field3391.field4278 = true;

            try {
                if (this.field3391.field4266 > 0.0F && this.field3391.field4273.method2162()) {
                    float var2 = this.field3390 == 0 ? (float) this.field3390 : (float) this.field3391.field4269 / (float) this.field3390;
                    class537 var10000 = this.field3391;
                    var10000.field4266 -= var2 == 0.0F ? (float) this.field3391.field4269 : var2;
                    if (this.field3391.field4266 < 0.0F) {
                        this.field3391.field4266 = 0.0F;
                    }

                    this.field3391.field4273.method2134((int) this.field3391.field4266);
                    return false;
                }
            } catch (Exception var3) {
                this.method1598(var3.getMessage());
                return true;
            }

            this.field3391.field4278 = false;
            return true;
        } else {
            return true;
        }
    }
}
