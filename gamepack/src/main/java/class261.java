import java.util.Iterator;

public class class261 extends class17 {

	static boolean field2167;

	public class261(class17 var1) {
		super(var1);
		super.field89 = "StartSongTask";
	}

	@Override
	public boolean method51() {
		Iterator var2 = class388.field3090.iterator();
		while (var2.hasNext()) {
			class490 var3 = (class490) var2.next();
			if (null != var3 && !var3.field3957 && null != var3.field3956) {
				try {
					var3.field3956.method245();
					var3.field3956.method242(0);
					if (var3.field3960 != null) {
						var3.field3956.method247(var3.field3960, var3.field3954);
					}
					var3.field3960 = null;
					var3.field3959 = null;
					var3.field3953 = null;
					var3.field3957 = true;
				} catch (Exception var5) {
					class156.method917((String) null, var5);
					this.method54(var5.getMessage());
					return true;
				}
			}
		}
		super.field91 = true;
		return true;
	}
}
