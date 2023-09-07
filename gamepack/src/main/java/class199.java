import java.util.Arrays;

public class class199 implements class200 {
    public char field1635;
    public int field1638;
    public int field1648;
    public int[] field1637;
    boolean[] field1636;
    boolean[] field1644;
    boolean[] field1645;
    char[] field1642;
    int field1640;
    int field1641;
    int field1643;
    int field1647;
    int[] field1639;
    int[] field1646;

    public class199() {
        this.field1642 = new char[128];
        this.field1646 = new int[128];
        this.field1637 = new int[128];
        this.field1638 = 0;
        this.field1639 = new int[128];
        this.field1640 = 0;
        this.field1647 = 0;
        this.field1641 = 0;
        this.field1643 = 0;
        this.field1644 = new boolean[112];
        this.field1645 = new boolean[112];
        this.field1636 = new boolean[112];
    }

    @Override
    public boolean method965(int var1) {
        this.method960(var1);
        this.field1644[var1] = true;
        this.field1645[var1] = true;
        this.field1636[var1] = false;
        this.field1637[++this.field1638 - 1] = var1;
        return true;
    }

    @Override
    public boolean method963(int var1) {
        this.field1644[var1] = false;
        this.field1645[var1] = false;
        this.field1636[var1] = true;
        this.field1639[++this.field1640 - 1] = var1;
        return true;
    }

    @Override
    public boolean method964(char var1) {
        int var3 = 1 + this.field1641 & 127;
        if (this.field1647 != var3) {
            this.field1646[this.field1641] = -1;
            this.field1642[this.field1641] = var1;
            this.field1641 = var3;
        }

        return false;
    }

    void method960(int var1) {
        int var3 = this.field1641 + 1 & 127;
        if (this.field1647 != var3) {
            this.field1646[this.field1641] = var1;
            this.field1642[this.field1641] = 0;
            this.field1641 = var3;
        }

    }

    @Override
    public boolean method966(boolean var1) {
        return false;
    }

    public void method953() {
        this.field1647 = this.field1643;
        this.field1643 = this.field1641;
        this.field1638 = 0;
        this.field1640 = 0;
        Arrays.fill(this.field1645, false);
        Arrays.fill(this.field1636, false);
    }

    public final boolean method959() {
        if (this.field1647 == this.field1643) {
            return false;
        } else {
            this.field1648 = this.field1646[this.field1647];
            this.field1635 = this.field1642[this.field1647];
            this.field1647 = 1 + this.field1647 & 127;
            return true;
        }
    }

    public boolean method954(int var1) {
        return var1 >= 0 && var1 < 112 && this.field1645[var1];
    }

    public boolean method958(int var1) {
        return var1 >= 0 && var1 < 112 && this.field1644[var1];
    }

    public boolean method951(int var1) {
        return var1 >= 0 && var1 < 112 && this.field1636[var1];
    }

    public int[] method955() {
        int[] var2 = new int[this.field1638];

        System.arraycopy(this.field1637, 0, var2, 0, this.field1638);

        return var2;
    }

    public int[] method956() {
        int[] var2 = new int[this.field1640];

        System.arraycopy(this.field1639, 0, var2, 0, this.field1640);

        return var2;
    }
}
