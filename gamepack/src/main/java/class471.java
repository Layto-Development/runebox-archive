import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Collection;
import java.util.Iterator;

@ObfInfo(name = "oc")
public class class471 implements Iterable, Collection {
	@ObfInfo(name = "au", desc = "Lsj;")
	class155 field3805;
	@ObfInfo(name = "ae", desc = "Lsj;")
	class155 field3806;

	@ObfInfo(name = "<init>", desc = "()V")
	public class471() {
		this.field3805 = new class155();
		this.field3805.field1482 = this.field3805;
		this.field3805.field1484 = this.field3805;
	}

	@ObfInfo(name = "au", desc = "()V")
	public void method2416() {
		while (this.field3805.field1482 != this.field3805) {
			this.field3805.field1482.method907();
		}

	}

	@ObfInfo(name = "ae", desc = "(Lsj;)V")
	public void method2417(class155 var1) {
		if (var1.field1484 != null) {
			var1.method907();
		}

		var1.field1484 = this.field3805.field1484;
		var1.field1482 = this.field3805;
		var1.field1484.field1482 = var1;
		var1.field1482.field1484 = var1;
	}

	@ObfInfo(name = "ao", desc = "(Lsj;)V")
	public void method2426(class155 var1) {
		if (var1.field1484 != null) {
			var1.method907();
		}

		var1.field1484 = this.field3805;
		var1.field1482 = this.field3805.field1482;
		var1.field1484.field1482 = var1;
		var1.field1482.field1484 = var1;
	}

	@ObfInfo(name = "ac", desc = "()Lsj;")
	public class155 method2423() {
		return this.method2418((class155)null);
	}

	@ObfInfo(name = "ai", desc = "(Lsj;)Lsj;")
	class155 method2418(class155 var1) {
		class155 var2;
		if (var1 == null) {
			var2 = this.field3805.field1482;
		} else {
			var2 = var1;
		}

		if (var2 == this.field3805) {
			this.field3806 = null;
			return null;
		} else {
			this.field3806 = var2.field1482;
			return var2;
		}
	}

	@ObfInfo(name = "az", desc = "()Lsj;")
	public class155 method2419() {
		class155 var1 = this.field3806;
		if (var1 == this.field3805) {
			this.field3806 = null;
			return null;
		} else {
			this.field3806 = var1.field1482;
			return var1;
		}
	}

	@ObfInfo(name = "ap", desc = "()I")
	int method2425() {
		int var1 = 0;

		for (class155 var2 = this.field3805.field1482; var2 != this.field3805; var2 = var2.field1482) {
			++var1;
		}

		return var1;
	}

	@ObfInfo(name = "aa", desc = "()Z")
	public boolean method2421() {
		return this.field3805.field1482 == this.field3805;
	}

	@ObfInfo(name = "af", desc = "()[Lsj;")
	class155[] method2420() {
		class155[] var1 = new class155[this.method2425()];
		int var2 = 0;

		for (class155 var3 = this.field3805.field1482; var3 != this.field3805; var3 = var3.field1482) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return new class433(this);
	}

	@ObfInfo(name = "size", desc = "()I")
	public int size() {
		return this.method2425();
	}

	@ObfInfo(name = "isEmpty", desc = "()Z")
	public boolean isEmpty() {
		return this.method2421();
	}

	@ObfInfo(name = "contains", desc = "(Ljava/lang/Object;)Z")
	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "toArray", desc = "()[Ljava/lang/Object;")
	public Object[] toArray() {
		return this.method2420();
	}

	@ObfInfo(name = "toArray", desc = "([Ljava/lang/Object;)[Ljava/lang/Object;")
	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (class155 var3 = this.field3805.field1482; var3 != this.field3805; var3 = var3.field1482) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfInfo(name = "ad", desc = "(Lsj;)Z")
	boolean method2422(class155 var1) {
		this.method2417(var1);
		return true;
	}

	@ObfInfo(name = "remove", desc = "(Ljava/lang/Object;)Z")
	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "containsAll", desc = "(Ljava/util/Collection;)Z")
	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "addAll", desc = "(Ljava/util/Collection;)Z")
	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "removeAll", desc = "(Ljava/util/Collection;)Z")
	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "retainAll", desc = "(Ljava/util/Collection;)Z")
	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "clear", desc = "()V")
	public void clear() {
		this.method2416();
	}

	@ObfInfo(name = "add", desc = "(Ljava/lang/Object;)Z")
	public boolean add(Object var1) {
		return this.method2422((class155)var1);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return super.hashCode();
	}

	@ObfInfo(name = "at", desc = "(Lsj;Lsj;)V")
	public static void method2424(class155 var0, class155 var1) {
		if (var0.field1484 != null) {
			var0.method907();
		}

		var0.field1484 = var1;
		var0.field1482 = var1.field1482;
		var0.field1484.field1482 = var0;
		var0.field1482.field1484 = var0;
	}
}
