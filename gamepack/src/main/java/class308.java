import java.lang.management.GarbageCollectorMXBean;

public class class308 {
	static GarbageCollectorMXBean field2781;
	public int field2779;
	public int field2780;
	public int field2782;
	public int field2783;
	public int field2784;
	public int field2785;
	public int field2786;
	public int field2787;
	public int field2788;
	public int field2789;
	public int field2790;

	public class308() {
		this.field2790 = -1;
		this.field2780 = -1;
		this.field2783 = -1;
		this.field2782 = -1;
		this.field2788 = -1;
		this.field2779 = -1;
		this.field2785 = -1;
		this.field2786 = -1;
		this.field2787 = -1;
		this.field2784 = -1;
		this.field2789 = -1;
	}

	public void method1740(class215 var1) {
		byte[] var3 = var1.method1219(class256.field2363.field2362);
		class42 var4 = new class42(var3);

		while (true) {
			int var5 = var4.method278();
			if (var5 == 0) {
				return;
			}

			switch(var5) {
			case 1:
				var4.method334();
				break;
			case 2:
				this.field2790 = var4.method326();
				this.field2780 = var4.method326();
				this.field2783 = var4.method326();
				this.field2782 = var4.method326();
				this.field2788 = var4.method326();
				this.field2779 = var4.method326();
				this.field2785 = var4.method326();
				this.field2786 = var4.method326();
				this.field2787 = var4.method326();
				this.field2784 = var4.method326();
				this.field2789 = var4.method326();
			}
		}
	}
}
