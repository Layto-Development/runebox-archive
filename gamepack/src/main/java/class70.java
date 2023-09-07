public class class70 {
    public class70 field657;
    public class70 field659;
    public long field658;

    public void method221() {
        if (this.field659 != null) {
            this.field659.field657 = this.field657;
            this.field657.field659 = this.field659;
            this.field657 = null;
            this.field659 = null;
        }
    }

    public boolean method222() {
        return this.field659 != null;
    }
}
