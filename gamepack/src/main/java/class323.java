import java.util.Arrays;

public class class323 {
    static String field2347;
    int[] field2345;
    int[] field2346;

    public class323() {
        this.field2345 = new int[112];
        this.field2346 = new int[192];
        Arrays.fill(this.field2345, 3);
        Arrays.fill(this.field2346, 3);
    }

    public void method1428(int var1, int var2) {
        if (this.method1433(var1) && this.method1430(var2)) {
            this.field2345[var1] = var2;
        }

    }

    public void method1431(char var1, int var2) {
        if (this.method1426(var1) && this.method1430(var2)) {
            this.field2346[var1] = var2;
        }

    }

    public int method1425(int var1) {
        return this.method1433(var1) ? this.field2345[var1] : 0;
    }

    public int method1429(char var1) {
        return this.method1426(var1) ? this.field2346[var1] : 0;
    }

    public boolean method1423(int var1) {
        return this.method1433(var1) && (this.field2345[var1] == 1 || this.field2345[var1] == 3);
    }

    public boolean method1427(char var1) {
        return this.method1426(var1) && (this.field2346[var1] == 1 || this.field2346[var1] == 3);
    }

    public boolean method1432(int var1) {
        return this.method1433(var1) && (this.field2345[var1] == 2 || this.field2345[var1] == 3);
    }

    public boolean method1424(char var1) {
        return this.method1426(var1) && (this.field2346[var1] == 2 || this.field2346[var1] == 3);
    }

    boolean method1433(int var1) {
        if (var1 >= 0 && var1 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + var1);
            return false;
        }
    }

    boolean method1426(char var1) {
        if (var1 >= 0 && var1 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + var1);
            return false;
        }
    }

    boolean method1430(int var1) {
        if (var1 >= 0 && var1 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + var1);
            return false;
        }
    }
}
