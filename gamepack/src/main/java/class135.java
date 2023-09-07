public class class135 implements Runnable {

	static int field1486;

	boolean field1485;

	int field1481;

	int[] field1482;

	int[] field1483;

	Object field1480;

	long[] field1484;

	class135() {
		this.field1485 = true;
		this.field1480 = new Object();
		this.field1481 = 0;
		this.field1482 = new int[500];
		this.field1483 = new int[500];
		this.field1484 = new long[500];
	}

	@Override
	public void run() {
		for (; this.field1485; class39.method171(50L)) {
			synchronized (this.field1480) {
				if (this.field1481 < 500) {
					this.field1482[this.field1481] = class422.field3270;
					this.field1483[this.field1481] = class422.field3253;
					this.field1484[this.field1481] = class422.field3261;
					++this.field1481;
				}
			}
		}
	}
}
