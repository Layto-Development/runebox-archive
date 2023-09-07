import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class class232 extends class398 {
    byte[] field1824;
    int field1823;
    AudioFormat field1821;
    SourceDataLine field1822;

    class232() {
    }

    @Override
    protected void method1834() {
        this.field1821 = new AudioFormat((float) class398.field2800, 16, class398.field2815 ? 2 : 1, true, false);
        this.field1824 = new byte[256 << (class398.field2815 ? 2 : 1)];
    }

    @Override
    protected void method1828(int var1) throws LineUnavailableException {
        try {
            Info var3 = new Info(SourceDataLine.class, this.field1821, var1 << (class398.field2815 ? 2 : 1));
            this.field1822 = (SourceDataLine) AudioSystem.getLine(var3);
            this.field1822.open();
            this.field1822.start();
            this.field1823 = var1;
        } catch (LineUnavailableException var4) {
            if (class46.method133(var1) != 1) {
                this.method1828(class82.method332(var1));
            } else {
                this.field1822 = null;
                throw var4;
            }
        }
    }

    @Override
    protected int method1829() {
        return this.field1823 - (this.field1822.available() >> (class398.field2815 ? 2 : 1));
    }

    @Override
    protected void method1822() {
        short var1 = 256;
        if (class398.field2815) {
            var1 = 512;
        }

        for (int var2 = 0; var2 < var1; ++var2) {
            int var3 = super.field2805[var2];
            if ((var3 + 8388608 & -16777216) != 0) {
                var3 = 8388607 ^ var3 >> 31;
            }

            this.field1824[var2 * 2] = (byte) (var3 >> 8);
            this.field1824[var2 * 2 + 1] = (byte) (var3 >> 16);
        }

        this.field1822.write(this.field1824, 0, var1 << 1);
    }

    @Override
    protected void method1830() {
        if (null != this.field1822) {
            this.field1822.close();
            this.field1822 = null;
        }

    }

    @Override
    protected void method1831() {
        this.field1822.flush();
    }
}
