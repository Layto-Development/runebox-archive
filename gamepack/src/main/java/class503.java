import java.util.Iterator;

public class class503 extends class17 {

	class338 field4040;

	class338 field4041;

	class338 field4042;

	public class503(class17 var1, class338 var2, class338 var3, class338 var4) {
		super(var1);
		this.field4040 = var2;
		this.field4041 = var3;
		this.field4042 = var4;
		super.field89 = "LoadSongTask";
	}

	@Override
	public boolean method51() {
		int var2 = 0;
		Iterator var3 = class388.field3090.iterator();
		while (true) {
			while (var3.hasNext()) {
				class490 var4 = (class490) var3.next();
				if (null != var4 && var4.field3956.field679 > 1 && var4.field3956.method248()) {
					this.method54("Attempted to load patches of already loading midiplayer!");
					return true;
				}
				if (var4 != null && !var4.field3955) {
					try {
						if (null != var4.field3953 && var4.field3950 != -1 && var4.field3951 != -1) {
							if (null == var4.field3960) {
								var4.field3960 = class219.method1303(var4.field3953, var4.field3950, var4.field3951);
								if (null == var4.field3960) {
									continue;
								}
							}
							if (null == var4.field3959) {
								var4.field3959 = new class439(this.field4042, this.field4041);
							}
							if (var4.field3956.method243(var4.field3960, this.field4040, var4.field3959)) {
								++var2;
								var4.field3955 = true;
								var4.field3956.method244();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						class156.method917((String) null, var6);
						this.method54(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}
			if (var2 == class388.field3090.size()) {
				return true;
			}
			return false;
		}
	}
}
