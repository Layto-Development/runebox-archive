import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;
import java.util.Map.Entry;

@ObfInfo(name = "qr")
class class118 implements Comparator {
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1761568657)
	static int field1123;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lqf;")
	final class59 this$0;

	@ObfInfo(name = "<init>", desc = "(Lqf;)V")
	class118(class59 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
	int method683(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method683((Entry)var1, (Entry)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
