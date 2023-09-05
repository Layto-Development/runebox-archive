import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(name = "sx")
public class class8 implements class3 {
	@ObfInfo(name = "au", desc = "Ljava/util/Map;")
	Map field338;
	@ObfInfo(name = "ae", desc = "Luu;")
	final class456 field337;

	@ObfInfo(name = "<init>", desc = "(Luu;)V")
	public class8(class456 var1) {
		this.field337 = var1;
	}

	@ObfInfo(name = "au", desc = "(IS)I")
	public int method5(int var1) {
		if (null != this.field338) {
			class10 var3 = (class10)this.field338.get(var1);
			if (var3 != null) {
				return (Integer)var3.field340;
			}
		}

		return (Integer)this.field337.method2383(var1);
	}

	@ObfInfo(name = "ae", desc = "(ILjava/lang/Object;I)V", opaqueValue = "1797615972")
	public void method4(int var1, Object var2) {
		if (null == this.field338) {
			this.field338 = new HashMap();
			this.field338.put(var1, new class10(var1, var2));
		} else {
			class10 var4 = (class10)this.field338.get(var1);
			if (null == var4) {
				this.field338.put(var1, new class10(var1, var2));
			} else {
				var4.field340 = var2;
			}
		}

	}

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return this.field338 == null ? Collections.emptyList().iterator() : this.field338.values().iterator();
	}
}
