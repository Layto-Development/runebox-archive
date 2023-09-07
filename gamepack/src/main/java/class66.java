public class class66 {

	boolean field692;

	class338 field690;

	int field691;

	String field689;

	class66(class338 var1) {
		this.field691 = 0;
		this.field692 = false;
		this.field690 = var1;
	}

	void method292(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			if (this.field689 != var1) {
				this.field689 = var1;
				this.field691 = 0;
				this.field692 = false;
				this.method293();
			}
		}
	}

	int method293() {
		if (this.field689 == null) {
			this.field691 = 100;
			this.field692 = true;
		} else {
			if (this.field691 < 33) {
				if (!this.field690.method1782(class68.field718.field721, this.field689)) {
					return this.field691;
				}
				this.field691 = 33;
			}
			if (this.field691 == 33) {
				if (this.field690.method1784(class68.field717.field721, this.field689) && !this.field690.method1782(class68.field717.field721, this.field689)) {
					return this.field691;
				}
				this.field691 = 66;
			}
			if (this.field691 == 66) {
				if (!this.field690.method1782(this.field689, class68.field720.field721)) {
					return this.field691;
				}
				this.field691 = 100;
				this.field692 = true;
			}
		}
		return this.field691;
	}

	boolean method294() {
		return this.field692;
	}

	int method295() {
		return this.field691;
	}
}
