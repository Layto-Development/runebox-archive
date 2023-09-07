public class class474 {

	static int field3728;

	static int field3730;

	int field3729;

	int field3731;

	class474(int var1, int var2) {
		this.field3731 = var1;
		this.field3729 = var2;
	}

	boolean method2302(class188 var1) {
		if (null == var1) {
			return false;
		} else {
			switch(this.field3731) {
				case 1:
					return var1.method1162(this.field3729);
				case 2:
					return var1.method1160(this.field3729);
				case 3:
					return var1.method1161((char) this.field3729);
				case 4:
					return var1.method1163(this.field3729 == 1);
				default:
					return false;
			}
		}
	}
}
