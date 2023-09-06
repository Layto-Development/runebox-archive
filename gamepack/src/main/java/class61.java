import java.util.Arrays;

public class class61 {
	public static final class61 field792;
	static final class61 field790;
	static final class61 field791;
	static final class61 field793;
	static final class61 field795;
	static final class61 field796;
	static final class61 field797;
	static final class61[] field798;
	final int field800;
	public final int field794;
	public final int field799;

	static {
		field793 = new class61(6, 8, 8);
		field791 = new class61(3, 16, 16);
		field792 = new class61(0, 32, 32);
		field790 = new class61(2, 48, 48);
		field797 = new class61(4, 64, 64);
		field795 = new class61(5, 96, 96);
		field796 = new class61(1, 128, 128);
		field798 = class368.method1971();
		Arrays.sort(field798, new class466());
	}

	class61(int var1, int var2, int var3) {
		this.field800 = var1;
		this.field794 = var2;
		this.field799 = var3;
	}

	int method474() {
		return this.field799 * this.field794;
	}

	public static void method475() {
		synchronized(class146.field1386) {
			if (class146.field1384 != 0) {
				class146.field1384 = 1;
				class146.field1387 = true;

				try {
					class146.field1386.wait();
				} catch (InterruptedException var4) {
				}
			}

		}
	}
}
