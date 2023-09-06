import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class339 implements class532 {
	Map field2956;
	final class390 field2955;

	public class339(class390 var1) {
		this.field2955 = var1;
	}

	public int method2566(int var1) {
		if (null != this.field2956) {
			class322 var3 = (class322)this.field2956.get(var1);
			if (var3 != null) {
				return (Integer)var3.field2897;
			}
		}

		return (Integer)this.field2955.method2048(var1);
	}

	public void method2565(int var1, Object var2) {
		if (null == this.field2956) {
			this.field2956 = new HashMap();
			this.field2956.put(var1, new class322(var1, var2));
		} else {
			class322 var4 = (class322)this.field2956.get(var1);
			if (null == var4) {
				this.field2956.put(var1, new class322(var1, var2));
			} else {
				var4.field2897 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field2956 == null ? Collections.emptyList().iterator() : this.field2956.values().iterator();
	}
}
