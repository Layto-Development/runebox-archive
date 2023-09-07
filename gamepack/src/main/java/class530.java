import java.util.Arrays;

public class class530 {

	static String field4194;

	int[] field4192;

	int[] field4193;

	public class530() {
		this.field4192 = new int[112];
		this.field4193 = new int[192];
		Arrays.fill(this.field4192, 3);
		Arrays.fill(this.field4193, 3);
	}

	public void method2570(int var1, int var2) {
		if (this.method2575(var1) && this.method2572(var2)) {
			this.field4192[var1] = var2;
		}
	}

	public void method2573(char var1, int var2) {
		if (this.method2568(var1) && this.method2572(var2)) {
			this.field4193[var1] = var2;
		}
	}

	public int method2567(int var1) {
		return this.method2575(var1) ? this.field4192[var1] : 0;
	}

	public int method2571(char var1) {
		return this.method2568(var1) ? this.field4193[var1] : 0;
	}

	public boolean method2565(int var1) {
		return this.method2575(var1) && (this.field4192[var1] == 1 || this.field4192[var1] == 3);
	}

	public boolean method2569(char var1) {
		return this.method2568(var1) && (this.field4193[var1] == 1 || this.field4193[var1] == 3);
	}

	public boolean method2574(int var1) {
		return this.method2575(var1) && (this.field4192[var1] == 2 || this.field4192[var1] == 3);
	}

	public boolean method2566(char var1) {
		return this.method2568(var1) && (this.field4193[var1] == 2 || this.field4193[var1] == 3);
	}

	boolean method2575(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	boolean method2568(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	boolean method2572(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}
}
