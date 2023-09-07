import java.util.*;

public class class252 extends AbstractQueue {
    static class188 field1914;
    final Comparator field1912;
    class62[] field1911;
    int field1909;
    int field1913;
    Map<Object, class62> field1910;

    public class252(int var1) {
        this(var1, null);
    }

    public class252(int var1, Comparator var2) {
        this.field1909 = 0;
        this.field1911 = new class62[var1];
        this.field1910 = new HashMap<Object, class62>();
        this.field1912 = var2;
    }

    void method1125() {
        int var2 = (this.field1911.length << 1) + 1;
        this.field1911 = Arrays.copyOf(this.field1911, var2);
    }

    @Override
    public int size() {
        return this.field1913;
    }

    @Override
    public boolean offer(Object var1) {
        if (this.field1910.containsKey(var1)) {
            throw new IllegalArgumentException("");
        } else {
            ++this.field1909;
            int var2 = this.field1913;
            if (var2 >= this.field1911.length) {
                this.method1125();
            }

            ++this.field1913;
            if (var2 == 0) {
                this.field1911[0] = new class62(var1, 0);
                this.field1910.put(var1, this.field1911[0]);
            } else {
                this.field1911[var2] = new class62(var1, var2);
                this.field1910.put(var1, this.field1911[var2]);
                this.method1126(var2);
            }

            return true;
        }
    }

    @Override
    public Object peek() {
        return this.field1913 == 0 ? null : this.field1911[0].field616;
    }

    @Override
    public Object poll() {
        if (this.field1913 == 0) {
            return null;
        } else {
            ++this.field1909;
            Object var1 = this.field1911[0].field616;
            this.field1910.remove(var1);
            --this.field1913;
            if (this.field1913 == 0) {
                this.field1911[this.field1913] = null;
            } else {
                this.field1911[0] = this.field1911[this.field1913];
                this.field1911[0].field615 = 0;
                this.field1911[this.field1913] = null;
                this.method1127(0);
            }

            return var1;
        }
    }

    @Override
    public boolean remove(Object var1) {
        class62 var2 = this.field1910.remove(var1);
        if (var2 == null) {
            return false;
        } else {
            ++this.field1909;
            --this.field1913;
            if (this.field1913 == var2.field615) {
                this.field1911[this.field1913] = null;
                return true;
            } else {
                class62 var3 = this.field1911[this.field1913];
                this.field1911[this.field1913] = null;
                this.field1911[var2.field615] = var3;
                this.field1911[var2.field615].field615 = var2.field615;
                this.method1127(var2.field615);
                if (this.field1911[var2.field615] == var3) {
                    this.method1126(var2.field615);
                }

                return true;
            }
        }
    }

    void method1126(int var1) {
        class62 var3;
        int var4;
        for (var3 = this.field1911[var1]; var1 > 0; var1 = var4) {
            var4 = var1 - 1 >>> 1;
            class62 var5 = this.field1911[var4];
            if (null != this.field1912) {
                if (this.field1912.compare(var3.field616, var5.field616) >= 0) {
                    break;
                }
            } else if (((Comparable) var3.field616).compareTo(var5.field616) >= 0) {
                break;
            }

            this.field1911[var1] = var5;
            this.field1911[var1].field615 = var1;
        }

        this.field1911[var1] = var3;
        this.field1911[var1].field615 = var1;
    }

    void method1127(int var1) {
        class62 var3 = this.field1911[var1];

        int var9;
        for (int var4 = this.field1913 >>> 1; var1 < var4; var1 = var9) {
            int var5 = 1 + (var1 << 1);
            class62 var6 = this.field1911[var5];
            int var7 = (var1 << 1) + 2;
            class62 var8 = this.field1911[var7];
            if (this.field1912 != null) {
                if (var7 < this.field1913 && this.field1912.compare(var6.field616, var8.field616) > 0) {
                    var9 = var7;
                } else {
                    var9 = var5;
                }
            } else if (var7 < this.field1913 && ((Comparable) var6.field616).compareTo(var8.field616) > 0) {
                var9 = var7;
            } else {
                var9 = var5;
            }

            if (this.field1912 != null) {
                if (this.field1912.compare(var3.field616, this.field1911[var9].field616) <= 0) {
                    break;
                }
            } else if (((Comparable) var3.field616).compareTo(this.field1911[var9].field616) <= 0) {
                break;
            }

            this.field1911[var1] = this.field1911[var9];
            this.field1911[var1].field615 = var1;
        }

        this.field1911[var1] = var3;
        this.field1911[var1].field615 = var1;
    }

    @Override
    public boolean contains(Object var1) {
        return this.field1910.containsKey(var1);
    }

    @Override
    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (null != this.field1912) {
            Arrays.sort(var1, this.field1912);
        } else {
            Arrays.sort(var1);
        }

        return var1;
    }

    @Override
    public Iterator iterator() {
        return new class425(this);
    }
}
