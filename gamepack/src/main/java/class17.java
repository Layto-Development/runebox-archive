public abstract class class17 {

	boolean field90;

	boolean field91;

	class17 field87;

	String field88;

	String field89;

	class17(class17 var1) {
		this.field87 = var1;
	}

	public abstract boolean method51();

	public boolean method52() {
		return this.field90;
	}

	public boolean method55() {
		return this.field91;
	}

	public String method50() {
		return "Error in task: " + this.field89 + ", Error message: " + this.field88;
	}

	public class17 method53() {
		return this.field87;
	}

	void method54(String var1) {
		this.field90 = true;
		this.field88 = var1;
	}
}
