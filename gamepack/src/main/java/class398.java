import java.util.ArrayList;
import java.util.Iterator;

public class class398 extends class17 {

	ArrayList field3158;

	public class398(class17 var1, ArrayList var2) {
		super(var1);
		super.field89 = "ClearRequestTask";
		this.field3158 = var2;
	}

	@Override
	public boolean method51() {
		if (this.field3158.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field3158.iterator();
			while (var2.hasNext()) {
				class490 var3 = (class490) var2.next();
				try {
					if (class388.field3090.contains(var3)) {
						if (null == var3) {
							class388.field3090.remove(var3);
						} else {
							if (var3.field3956.field679 > 0) {
								--var3.field3956.field679;
							}
							if (var3.field3956.field679 == 0) {
								var3.field3956.method279();
								var3.field3956.method277();
								var3.field3956.method242(0);
							}
							int var4 = var3.field3950;
							int var5 = var3.field3951;
							Iterator var6 = class388.field3093.iterator();
							while (var6.hasNext()) {
								class273 var7 = (class273) var6.next();
								var7.method1519(var4, var5);
							}
							class388.field3090.remove(var3);
						}
					}
				} catch (Exception var8) {
					class156.method917((String) null, var8);
					this.method54(var8.getMessage());
					class388.field3090.clear();
					return true;
				}
			}
			return true;
		}
	}
}
