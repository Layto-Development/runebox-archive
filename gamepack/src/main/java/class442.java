import java.util.ArrayList;

public class class442 extends class17 {

	ArrayList field3442;

	public class442(class17 var1, ArrayList var2) {
		super(var1);
		this.field3442 = var2;
		super.field89 = "ConcurrentMidiTask";
	}

	@Override
	public boolean method51() {
		for (int var2 = 0; var2 < this.field3442.size(); ++var2) {
			class17 var3 = (class17) this.field3442.get(var2);
			if (var3 == null) {
				this.field3442.remove(var2);
				--var2;
			} else if (var3.method51()) {
				if (var3.method52()) {
					this.method54(var3.method50());
					this.field3442.clear();
					return true;
				}
				if (var3.method53() != null) {
					this.field3442.add(var3.method53());
				}
				super.field91 = var3.field91;
				this.field3442.remove(var2);
				--var2;
			}
		}
		if (this.field3442.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
