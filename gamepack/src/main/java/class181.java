import java.util.ArrayList;

public class class181 extends class232 {
	ArrayList field1713;

	public class181(class232 var1, ArrayList var2) {
		super(var1);
		this.field1713 = var2;
		super.field2101 = "ConcurrentMidiTask";
	}

	public boolean method1330() {
		for (int var2 = 0; var2 < this.field1713.size(); ++var2) {
			class232 var3 = (class232)this.field1713.get(var2);
			if (var3 == null) {
				this.field1713.remove(var2);
				--var2;
			} else if (var3.method1330()) {
				if (var3.method1331()) {
					this.method1333(var3.method1329());
					this.field1713.clear();
					return true;
				}

				if (var3.method1332() != null) {
					this.field1713.add(var3.method1332());
				}

				super.field2103 = var3.field2103;
				this.field1713.remove(var2);
				--var2;
			}
		}

		if (this.field1713.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
