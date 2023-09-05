import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "cf")
public class class428 extends class155 {
	@ObfInfo(name = "au", desc = "Lbx;")
	class508 field3241;

	@ObfInfo(name = "<init>", desc = "()V")
	public class428() {
		this.field3241 = null;
	}

	@ObfInfo(name = "<init>", desc = "(Lcm;)V")
	class428(class130 var1) {
		if (var1 != null) {
			this.field3241 = new class508(var1, (class62)null);
		}
	}

	@ObfInfo(name = "<init>", desc = "(Lbu;)V")
	public class428(class62 var1) {
		this.field3241 = new class508((class130)null, var1);
	}

	@ObfInfo(name = "au", desc = "(B)Z")
	public boolean method2226(byte var1) {
		boolean var10000;
		if (null == this.field3241) {
			if (var1 == -1) {
				throw new IllegalStateException();
			}

			var10000 = true;
		} else {
			var10000 = false;
		}

		return var10000;
	}

	@ObfInfo(name = "ae", desc = "(I)Lbu;", opaqueValue = "421364720")
	public class62 method2228() {
		if (null != this.field3241 && this.field3241.field4089.tryLock()) {
			class62 var2;
			try {
				var2 = this.method2225();
			} finally {
				this.field3241.field4089.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "ao", desc = "(I)Lbu;", opaqueValue = "961494884")
	public class62 method2227() {
		if (this.field3241 != null) {
			this.field3241.field4089.lock();

			class62 var2;
			try {
				var2 = this.method2225();
			} finally {
				this.field3241.field4089.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "at", desc = "(I)Lbu;", opaqueValue = "-565305963")
	class62 method2225() {
		if (this.field3241.field4088 == null) {
			this.field3241.field4088 = this.field3241.field4093.method713((int[])null);
			this.field3241.field4093 = null;
		}

		return this.field3241.field4088;
	}
}
