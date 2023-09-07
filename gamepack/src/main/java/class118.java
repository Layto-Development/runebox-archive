import java.io.IOException;
import java.util.concurrent.Callable;

public class class118 implements Callable {

	// $FF: synthetic field
	final class171 this$0;

	final class98 field1428;

	class118(class171 var1, class98 var2) {
		this.this$0 = var1;
		this.field1428 = var2;
	}

	@Override
	public Object call() throws Exception {
		try {
			while (this.field1428.method622()) {
				class39.method171(10L);
			}
		} catch (IOException var2) {
			return new class416("Error servicing REST query: " + var2.getMessage());
		}
		return this.field1428.method621();
	}
}
