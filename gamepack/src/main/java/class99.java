import java.util.ArrayList;
import java.util.Iterator;

public class class99 extends class232 {
	ArrayList field996;

	public class99(class232 var1, ArrayList var2) {
		super(var1);
		super.field2101 = "ClearRequestTask";
		this.field996 = var2;
	}

	public boolean method1330() {
		if (this.field996.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field996.iterator();

			while (var2.hasNext()) {
				class104 var3 = (class104)var2.next();

				try {
					if (class92.field903.contains(var3)) {
						if (null == var3) {
							class92.field903.remove(var3);
						} else {
							if (var3.field1032.field431 > 0) {
								--var3.field1032.field431;
							}

							if (var3.field1032.field431 == 0) {
								var3.field1032.method168();
								var3.field1032.method166();
								var3.field1032.method130(0);
							}

							int var4 = var3.field1026;
							int var5 = var3.field1027;
							Iterator var6 = class92.field906.iterator();

							while (var6.hasNext()) {
								class382 var7 = (class382)var6.next();
								var7.method2038(var4, var5);
							}

							class92.field903.remove(var3);
						}
					}
				} catch (Exception var8) {
					class41.method263((String)null, var8);
					this.method1333(var8.getMessage());
					class92.field903.clear();
					return true;
				}
			}

			return true;
		}
	}
}
