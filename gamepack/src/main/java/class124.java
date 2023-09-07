public class class124 extends class77 {

	class211 field1452;

	public class124() {
		this.field1452 = null;
	}

	class124(class97 var1) {
		if (var1 != null) {
			this.field1452 = new class211(var1, (class529) null);
		}
	}

	public class124(class529 var1) {
		this.field1452 = new class211((class97) null, var1);
	}

	public boolean method847(byte var1) {
		return null == this.field1452;
	}

	public class529 method849() {
		if (null != this.field1452 && this.field1452.field1919.tryLock()) {
			class529 var2;
			try {
				var2 = this.method846();
			} finally {
				this.field1452.field1919.unlock();
			}
			return var2;
		} else {
			return null;
		}
	}

	public class529 method848() {
		if (this.field1452 != null) {
			this.field1452.field1919.lock();
			class529 var2;
			try {
				var2 = this.method846();
			} finally {
				this.field1452.field1919.unlock();
			}
			return var2;
		} else {
			return null;
		}
	}

	class529 method846() {
		if (this.field1452.field1918 == null) {
			this.field1452.field1918 = this.field1452.field1923.method617((int[]) null);
			this.field1452.field1923 = null;
		}
		return this.field1452.field1918;
	}
}
