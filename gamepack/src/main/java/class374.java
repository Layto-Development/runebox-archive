public class class374 extends class310 {

	static class13 field3035;

	static class84[] field3036;

	class428 field3026;

	class428 field3032;

	class78 field3030;

	int field3027;

	int field3028;

	int field3031;

	String field3029;

	String field3033;

	String field3034;

	class374(int var1, String var2, String var3, String var4) {
		this.field3026 = class428.field3353;
		this.field3032 = class428.field3353;
		this.method1990(var1, var2, var3, var4);
	}

	void method1990(int var1, String var2, String var3, String var4) {
		int var6 = ++class156.field1617 - 1;
		this.field3031 = var6;
		this.field3027 = Client.field1201;
		this.field3028 = var1;
		this.field3029 = var2;
		this.method1995();
		this.field3033 = var3;
		this.field3034 = var4;
		this.method1988();
		this.method1992();
	}

	void method1988() {
		this.field3026 = class428.field3353;
	}

	final boolean method1993() {
		if (this.field3026 == class428.field3353) {
			this.method1989();
		}
		return this.field3026 == class428.field3352;
	}

	void method1989() {
		this.field3026 = class147.field1555.field1644.method2280(this.field3030) ? class428.field3352 : class428.field3351;
	}

	void method1992() {
		this.field3032 = class428.field3353;
	}

	final boolean method1991() {
		if (class428.field3353 == this.field3032) {
			this.method1994();
		}
		return this.field3032 == class428.field3352;
	}

	void method1994() {
		this.field3032 = class147.field1555.field1643.method2280(this.field3030) ? class428.field3352 : class428.field3351;
	}

	final void method1995() {
		if (this.field3029 != null) {
			this.field3030 = new class78(Client.method527(this.field3029), class267.field2198);
		} else {
			this.field3030 = null;
		}
	}
}
