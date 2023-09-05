import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;

@ObfInfo(name = "pe")
public class class57 extends class236 {
	@ObfInfo(name = "au", desc = "Ljava/util/ArrayList;")
	ArrayList field724;

	@ObfInfo(name = "<init>", desc = "(Lpm;Ljava/util/ArrayList;)V")
	public class57(class236 var1, ArrayList var2) {
		super(var1);
		this.field724 = var2;
		super.field1978 = "ConcurrentMidiTask";
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		for (int var2 = 0; var2 < this.field724.size(); ++var2) {
			class236 var3 = (class236)this.field724.get(var2);
			if (var3 == null) {
				this.field724.remove(var2);
				--var2;
			} else if (var3.method1242()) {
				if (var3.method1243()) {
					this.method1245(var3.method1241());
					this.field724.clear();
					return true;
				}

				if (var3.method1244() != null) {
					this.field724.add(var3.method1244());
				}

				super.field1980 = var3.field1980;
				this.field724.remove(var2);
				--var2;
			}
		}

		if (this.field724.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
