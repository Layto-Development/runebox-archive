import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfInfo(name = "no")
public class class414 {
	@ObfInfo(name = "ae", desc = "Ljava/util/Comparator;")
	public static Comparator field3186;
	@ObfInfo(name = "at", desc = "Ljava/util/Comparator;")
	public static Comparator field3188;
	@ObfInfo(name = "ac", desc = "Ljava/util/Comparator;")
	public static Comparator field3189;
	@ObfInfo(name = "ao", desc = "Ljava/util/Comparator;")
	public static Comparator field3190;
	@ObfInfo(name = "au", desc = "Ljava/util/List;")
	public final List field3187;

	static {
		field3186 = new class5();
		new class148();
		field3190 = new class233();
		field3188 = new class361();
		field3189 = new class434();
	}

	@ObfInfo(name = "<init>", desc = "(Ltm;Z)V")
	public class414(class280 var1, boolean var2) {
		int var3 = var1.method1541();
		boolean var4 = var1.method1492() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.method1541();
		this.field3187 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field3187.add(new class158(var1, var5, var3));
		}

	}

	@ObfInfo(name = "au", desc = "(Ljava/util/Comparator;ZI)V")
	public void method2187(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field3187, var1);
		} else {
			Collections.sort(this.field3187, Collections.reverseOrder(var1));
		}

	}
}
