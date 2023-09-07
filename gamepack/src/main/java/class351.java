public class class351 {
    static {
        new class351(0.0F, 0.0F, 0.0F);
        new class351(1.0F, 1.0F, 1.0F);
        new class351(1.0F, 0.0F, 0.0F);
        new class351(0.0F, 1.0F, 0.0F);
        new class351(0.0F, 0.0F, 1.0F);
        method1647(100);
    }

    float field2542;
    float field2543;
    float field2544;

    class351(float var1, float var2, float var3) {
        this.field2543 = var1;
        this.field2542 = var2;
        this.field2544 = var3;
    }

    static void method1647(int var0) {
    }

    static int method1646(int var0, class443 var1, boolean var2) {
        if (var0 == 6200) {
            class56.field597 -= 2;
            Client.field4048 = (short) class269.method1182(class269.field1988[class56.field597]);
            if (Client.field4048 <= 0) {
                Client.field4048 = 256;
            }

            Client.field3934 = (short) class269.method1182(class269.field1988[class56.field597 + 1]);
            if (Client.field3934 <= 0) {
                Client.field3934 = 256;
            }

            return 1;
        } else if (var0 == 6201) {
            class56.field597 -= 2;
            Client.field4050 = (short) class269.field1988[class56.field597];
            if (Client.field4050 <= 0) {
                Client.field4050 = 256;
            }

            Client.field4051 = (short) class269.field1988[1 + class56.field597];
            if (Client.field4051 <= 0) {
                Client.field4051 = 320;
            }

            return 1;
        } else if (var0 == 6202) {
            class56.field597 -= 4;
            Client.field4052 = (short) class269.field1988[class56.field597];
            if (Client.field4052 <= 0) {
                Client.field4052 = 1;
            }

            Client.field3884 = (short) class269.field1988[1 + class56.field597];
            if (Client.field3884 <= 0) {
                Client.field3884 = 32767;
            } else if (Client.field3884 < Client.field4052) {
                Client.field3884 = Client.field4052;
            }

            Client.field4054 = (short) class269.field1988[2 + class56.field597];
            if (Client.field4054 <= 0) {
                Client.field4054 = 1;
            }

            Client.field4055 = (short) class269.field1988[3 + class56.field597];
            if (Client.field4055 <= 0) {
                Client.field4055 = 32767;
            } else if (Client.field4055 < Client.field4054) {
                Client.field4055 = Client.field4054;
            }

            return 1;
        } else if (var0 == 6203) {
            if (Client.field4068 != null) {
                class29.method88(0, 0, Client.field4068.field806, Client.field4068.field783, false);
                class269.field1988[++class56.field597 - 1] = Client.field3991;
                class269.field1988[++class56.field597 - 1] = Client.field3866;
            } else {
                class269.field1988[++class56.field597 - 1] = -1;
                class269.field1988[++class56.field597 - 1] = -1;
            }

            return 1;
        } else if (var0 == 6204) {
            class269.field1988[++class56.field597 - 1] = Client.field4050;
            class269.field1988[++class56.field597 - 1] = Client.field4051;
            return 1;
        } else if (var0 == 6205) {
            class269.field1988[++class56.field597 - 1] = class269.method1201(Client.field4048);
            class269.field1988[++class56.field597 - 1] = class269.method1201(Client.field3934);
            return 1;
        } else if (var0 == 6220) {
            class269.field1988[++class56.field597 - 1] = 0;
            return 1;
        } else if (var0 == 6221) {
            class269.field1988[++class56.field597 - 1] = 0;
            return 1;
        } else if (var0 == 6222) {
            class269.field1988[++class56.field597 - 1] = class223.field1763;
            return 1;
        } else if (var0 == 6223) {
            class269.field1988[++class56.field597 - 1] = class519.field4188;
            return 1;
        } else {
            return 2;
        }
    }

    final float method1645() {
        return (float) Math.sqrt(this.field2543 * this.field2543 + this.field2542 * this.field2542 + this.field2544 * this.field2544);
    }

    @Override
    public String toString() {
        return this.field2543 + ", " + this.field2542 + ", " + this.field2544;
    }
}
