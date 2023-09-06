import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class227 {
	public static Comparator field2057;
	public static Comparator field2059;
	public static Comparator field2060;
	public static Comparator field2061;
	public final List field2058;

	static {
		field2057 = new class171();
		new class410();
		field2061 = new class33();
		field2059 = new class221();
		field2060 = new class355();
	}

	public class227(class42 var1, boolean var2) {
		int var3 = var1.method327();
		boolean var4 = var1.method278() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.method327();
		this.field2058 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field2058.add(new class478(var1, var5, var3));
		}

	}

	public void method1287(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field2058, var1);
		} else {
			Collections.sort(this.field2058, Collections.reverseOrder(var1));
		}

	}
}
