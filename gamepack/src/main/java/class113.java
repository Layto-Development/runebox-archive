import java.util.ArrayList;
import java.util.Iterator;

public class class113 {
	public class29 field1065;
	public class29 field1066;
	public int field1067;

	public class113(int var1, class29 var2, class29 var3) {
		this.field1067 = var1;
		this.field1065 = var2;
		this.field1066 = var3;
	}

	static final void method698(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class176.field1701.method2488()) {
			label35: {
				if (class176.field1701.method2488() == 0) {
					boolean var2 = !class92.field904.isEmpty();
					if (var2) {
						class342 var3 = class465.field3998;
						if (!class92.field904.isEmpty()) {
							ArrayList var4 = new ArrayList();
							Iterator var5 = class92.field904.iterator();

							while (var5.hasNext()) {
								class104 var6 = (class104)var5.next();
								var6.field1033 = false;
								var6.field1031 = false;
								var6.field1037 = false;
								var6.field1034 = false;
								var6.field1029 = var3;
								var6.field1028 = var0;
								var6.field1025 = 0.0F;
								var4.add(var6);
							}

							class81.method545(var4, class92.field907, class92.field908, class92.field909, class92.field900, false);
						}

						Client.field275 = false;
						break label35;
					}
				}

				if (var0 == 0) {
					class167.method924(0, 0);
					Client.field275 = false;
				} else {
					class58.method427(var0, (byte)57);
				}
			}

			class176.field1701.method2494(var0);
		}

	}
}
