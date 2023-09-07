import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class458 {

	public static Comparator field3490;

	public static Comparator field3492;

	public static Comparator field3493;

	public static Comparator field3494;

	public final List field3491;

	static {
		field3490 = new class473();
		new class386();
		field3494 = new class492();
		field3492 = new class510();
		field3493 = new class51();
	}

	public class458(class187 var1, boolean var2) {
		int var3 = var1.method1145();
		boolean var4 = var1.method1096() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}
		int var6 = var1.method1145();
		this.field3491 = new ArrayList(var6);
		for (int var7 = 0; var7 < var6; ++var7) {
			this.field3491.add(new class342(var1, var5, var3));
		}
	}

	public void method2238(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field3491, var1);
		} else {
			Collections.sort(this.field3491, Collections.reverseOrder(var1));
		}
	}
}
