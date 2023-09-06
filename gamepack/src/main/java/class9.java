public class class9 extends class304 {
	boolean field348;
	boolean field349;

	class9() {
	}

	int method89(class9 var1) {
		if (super.field2769 == Client.field3 && var1.field2769 != Client.field3) {
			return -1;
		} else if (var1.field2769 == Client.field3 && Client.field3 != super.field2769) {
			return 1;
		} else if (super.field2769 != 0 && var1.field2769 == 0) {
			return -1;
		} else if (var1.field2769 != 0 && super.field2769 == 0) {
			return 1;
		} else if (this.field348 && !var1.field348) {
			return -1;
		} else if (!this.field348 && var1.field348) {
			return 1;
		} else if (this.field349 && !var1.field349) {
			return -1;
		} else if (!this.field349 && var1.field349) {
			return 1;
		} else {
			return super.field2769 != 0 ? super.field2768 - var1.field2768 : var1.field2768 - super.field2768;
		}
	}

	public int method512(class71 var1) {
		return this.method89((class9)var1);
	}

	public int compareTo(Object var1) {
		return this.method89((class9)var1);
	}
}
