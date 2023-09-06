import java.util.Iterator;

public class class216 extends class232 {
	static boolean field2024;

	public class216(class232 var1) {
		super(var1);
		super.field2101 = "StartSongTask";
	}

	public boolean method1330() {
		Iterator var2 = class92.field903.iterator();

		while (var2.hasNext()) {
			class104 var3 = (class104)var2.next();
			if (null != var3 && !var3.field1033 && null != var3.field1032) {
				try {
					var3.field1032.method133();
					var3.field1032.method130(0);
					if (var3.field1036 != null) {
						var3.field1032.method135(var3.field1036, var3.field1030);
					}

					var3.field1036 = null;
					var3.field1035 = null;
					var3.field1029 = null;
					var3.field1033 = true;
				} catch (Exception var5) {
					class41.method263((String)null, var5);
					this.method1333(var5.getMessage());
					return true;
				}
			}
		}

		super.field2103 = true;
		return true;
	}
}
