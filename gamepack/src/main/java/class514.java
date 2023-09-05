import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.BitSet;

@ObfInfo(name = "mk")
public class class514 extends class155 {
	@ObfInfo(name = "fq", desc = "Lnk;")
	static class505 field4108;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -299416591)
	int field4110;
	@ObfInfo(name = "ae", desc = "Ljava/util/BitSet;")
	BitSet field4109;

	@ObfInfo(name = "<init>", desc = "(I)V")
	class514(int var1) {
		this.field4110 = var1;
		this.field4109 = new BitSet(128);
	}
}
