import java.net.URL;

public class class64 {

	public static short[] field686;

	static int field682;

	static int field683;

	final URL field681;

	volatile byte[] field685;

	volatile int field684;

	static {
		field682 = -1;
		field683 = -2;
	}

	class64(URL var1) {
		this.field684 = field682;
		this.field681 = var1;
	}

	public boolean method283() {
		return field682 != this.field684;
	}

	public byte[] method285() {
		return this.field685;
	}

	public String method284() {
		return this.field681.toString();
	}
}
