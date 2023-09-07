import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class145 implements class2 {

	Map field1553;

	final class14 field1552;

	public class145(class14 var1) {
		this.field1552 = var1;
	}

	@Override
	public int method6(int var1) {
		if (null != this.field1553) {
			class456 var3 = (class456) this.field1553.get(var1);
			if (var3 != null) {
				return (Integer) var3.field3480;
			}
		}
		return (Integer) this.field1552.method47(var1);
	}

	@Override
	public void method5(int var1, Object var2) {
		if (null == this.field1553) {
			this.field1553 = new HashMap();
			this.field1553.put(var1, new class456(var1, var2));
		} else {
			class456 var4 = (class456) this.field1553.get(var1);
			if (null == var4) {
				this.field1553.put(var1, new class456(var1, var2));
			} else {
				var4.field3480 = var2;
			}
		}
	}

	@Override
	public Iterator iterator() {
		return this.field1553 == null ? Collections.emptyList().iterator() : this.field1553.values().iterator();
	}
}
