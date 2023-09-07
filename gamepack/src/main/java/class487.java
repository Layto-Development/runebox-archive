import java.util.ArrayList;

public class class487 extends class337 {
    ArrayList<class337> field3496;

    public class487(class337 var1, ArrayList<class337> var2) {
        super(var1);
        this.field3496 = var2;
        super.field2442 = "ConcurrentMidiTask";
    }

    @Override
    public boolean method1595() {
        for (int var2 = 0; var2 < this.field3496.size(); ++var2) {
            class337 var3 = this.field3496.get(var2);
            if (var3 == null) {
                this.field3496.remove(var2);
                --var2;
            } else if (var3.method1595()) {
                if (var3.method1596()) {
                    this.method1598(var3.method1594());
                    this.field3496.clear();
                    return true;
                }

                if (var3.method1597() != null) {
                    this.field3496.add(var3.method1597());
                }

                super.field2444 = var3.field2444;
                this.field3496.remove(var2);
                --var2;
            }
        }

		return this.field3496.isEmpty();
    }
}
