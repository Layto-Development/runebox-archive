import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class185 {

	final class499 field1815;

	final class505 field1812;

	final class505 field1813;

	final int field1816;

	final Comparator field1817;

	final Map field1811;

	final long field1814;

	public class185(int var1, class499 var2) {
		this(-1L, var1, var2);
	}

	class185(long var1, int var3, class499 var4) {
		this.field1817 = new class49(this);
		this.field1814 = var1;
		this.field1816 = var3;
		this.field1815 = var4;
		if (this.field1816 == -1) {
			this.field1811 = new HashMap(64);
			this.field1812 = new class505(64, this.field1817);
			this.field1813 = null;
		} else {
			if (this.field1815 == null) {
				throw new IllegalArgumentException("");
			}
			this.field1811 = new HashMap(this.field1816);
			this.field1812 = new class505(this.field1816, this.field1817);
			this.field1813 = new class505(this.field1816);
		}
	}

	boolean method1076() {
		return this.field1816 != -1;
	}

	public Object method1077(Object var1, byte var2) {
		synchronized (this) {
			if (this.field1814 != -1L) {
				this.method1079();
			}
			class231 var4 = (class231) this.field1811.get(var1);
			if (var4 == null) {
				return null;
			} else {
				this.method1080(var4, false);
				return var4.field2007;
			}
		}
	}

	public Object method1078(Object var1, Object var2) {
		synchronized (this) {
			if (this.field1814 != -1L) {
				this.method1079();
			}
			class231 var5 = (class231) this.field1811.get(var1);
			if (null != var5) {
				Object var9 = var5.field2007;
				var5.field2007 = var2;
				this.method1080(var5, false);
				return var9;
			} else {
				class231 var6;
				if (this.method1076() && this.field1811.size() == this.field1816) {
					var6 = (class231) this.field1813.remove();
					this.field1811.remove(var6.field2008);
					this.field1812.remove(var6);
				}
				var6 = new class231(var2, var1);
				this.field1811.put(var1, var6);
				this.method1080(var6, true);
				return null;
			}
		}
	}

	void method1080(class231 var1, boolean var2) {
		if (!var2) {
			this.field1812.remove(var1);
			if (this.method1076() && !this.field1813.remove(var1)) {
				throw new IllegalStateException("");
			}
		}
		var1.field2009 = System.currentTimeMillis();
		if (this.method1076()) {
			switch(this.field1815.field3999) {
				case 0:
					var1.field2010 = var1.field2009;
					break;
				case 1:
					++var1.field2010;
			}
			this.field1813.add(var1);
		}
		this.field1812.add(var1);
	}

	void method1079() {
		if (this.field1814 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field1814;
			while (!this.field1812.isEmpty()) {
				class231 var4 = (class231) this.field1812.peek();
				if (var4.field2009 >= var2) {
					return;
				}
				this.field1811.remove(var4.field2008);
				this.field1812.remove(var4);
				if (this.method1076()) {
					this.field1813.remove(var4);
				}
			}
		}
	}

	public void method1075() {
		synchronized (this) {
			this.field1811.clear();
			this.field1812.clear();
			if (this.method1076()) {
				this.field1813.clear();
			}
		}
	}
}
