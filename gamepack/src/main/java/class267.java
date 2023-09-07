import java.io.EOFException;
import java.io.IOException;

public class class267 {
    byte[] field1964;
    byte[] field1967;
    class119 field1971;
    int field1963;
    int field1966;
    long field1962;
    long field1965;
    long field1968;
    long field1969;
    long field1970;
    long field1972;

    public class267(class119 var1, int var2, int var3) throws IOException {
        this.field1962 = -1L;
        this.field1968 = -1L;
        this.field1963 = 0;
        this.field1971 = var1;
        this.field1965 = this.field1970 = var1.method532();
        this.field1964 = new byte[var2];
        this.field1967 = new byte[var3];
        this.field1969 = 0L;
    }

    public void method1151() throws IOException {
        this.method1157();
        this.field1971.method534();
    }

    public void method1152(long var1) throws IOException {
        if (var1 < 0L) {
            throw new IOException("");
        } else {
            this.field1969 = var1;
        }
    }

    public long method1158() {
        return this.field1965;
    }

    public void method1153(byte[] var1) throws IOException {
        this.method1154(var1, 0, var1.length);
    }

    public void method1154(byte[] var1, int var2, int var3) throws IOException {
        try {
            if (var3 > var1.length) {
                throw new ArrayIndexOutOfBoundsException(var3 - var1.length);
            }

            if (-1L != this.field1968 && this.field1969 >= this.field1968 && this.field1969 + (long) var3 <= this.field1968 + (long) this.field1963) {
                System.arraycopy(this.field1967, (int) (this.field1969 - this.field1968), var1, 0, var3);
                this.field1969 += var3;
                return;
            }

            long var5 = this.field1969;
            boolean var7 = false;
            int var8 = var3;
            int var9;
            if (this.field1969 >= this.field1962 && this.field1969 < this.field1962 + (long) this.field1966) {
                var9 = (int) ((long) this.field1966 - (this.field1969 - this.field1962));
                if (var9 > var3) {
                    var9 = var3;
                }

                System.arraycopy(this.field1964, (int) (this.field1969 - this.field1962), var1, 0, var9);
                this.field1969 += var9;
                var2 = var9;
                var3 -= var9;
            }

            if (var3 > this.field1964.length) {
                this.field1971.method530(this.field1969);

                for (this.field1972 = this.field1969; var3 > 0; var3 -= var9) {
                    var9 = this.field1971.method533(var1, var2, var3);
                    if (var9 == -1) {
                        break;
                    }

                    this.field1972 += var9;
                    this.field1969 += var9;
                    var2 += var9;
                }
            } else if (var3 > 0) {
                this.method1155();
                var9 = var3;
                if (var3 > this.field1966) {
                    var9 = this.field1966;
                }

                System.arraycopy(this.field1964, 0, var1, var2, var9);
                var2 += var9;
                var3 -= var9;
                this.field1969 += var9;
            }

            if (-1L != this.field1968) {
                if (this.field1968 > this.field1969 && var3 > 0) {
                    var9 = var2 + (int) (this.field1968 - this.field1969);
                    if (var9 > var2 + var3) {
                        var9 = var2 + var3;
                    }

                    while (var2 < var9) {
                        var1[var2++] = 0;
                        --var3;
                        ++this.field1969;
                    }
                }

                long var15 = -1L;
                long var11 = -1L;
                if (this.field1968 >= var5 && this.field1968 < (long) var8 + var5) {
                    var15 = this.field1968;
                } else if (var5 >= this.field1968 && var5 < this.field1968 + (long) this.field1963) {
                    var15 = var5;
                }

                if (this.field1968 + (long) this.field1963 > var5 && (long) this.field1963 + this.field1968 <= (long) var8 + var5) {
                    var11 = this.field1968 + (long) this.field1963;
                } else if (var5 + (long) var8 > this.field1968 && var5 + (long) var8 <= (long) this.field1963 + this.field1968) {
                    var11 = (long) var8 + var5;
                }

                if (var15 > -1L && var11 > var15) {
                    int var13 = (int) (var11 - var15);
                    System.arraycopy(this.field1967, (int) (var15 - this.field1968), var1, (int) (var15 - var5), var13);
                    if (var11 > this.field1969) {
                        var3 = (int) ((long) var3 - (var11 - this.field1969));
                        this.field1969 = var11;
                    }
                }
            }
        } catch (IOException var14) {
            this.field1972 = -1L;
            throw var14;
        }

        if (var3 > 0) {
            throw new EOFException();
        }
    }

    void method1155() throws IOException {
        this.field1966 = 0;
        if (this.field1969 != this.field1972) {
            this.field1971.method530(this.field1969);
            this.field1972 = this.field1969;
        }

        int var3;
        for (this.field1962 = this.field1969; this.field1966 < this.field1964.length; this.field1966 += var3) {
            int var2 = this.field1964.length - this.field1966;
            if (var2 > 200000000) {
                var2 = 200000000;
            }

            var3 = this.field1971.method533(this.field1964, this.field1966, var2);
            if (var3 == -1) {
                break;
            }

            this.field1972 += var3;
        }

    }

    public void method1156(byte[] var1, int var2, int var3) throws IOException {
        try {
            if ((long) var3 + this.field1969 > this.field1965) {
                this.field1965 = this.field1969 + (long) var3;
            }

            if (-1L != this.field1968 && (this.field1969 < this.field1968 || this.field1969 > (long) this.field1963 + this.field1968)) {
                this.method1157();
            }

            if (-1L != this.field1968 && (long) var3 + this.field1969 > (long) this.field1967.length + this.field1968) {
                int var5 = (int) ((long) this.field1967.length - (this.field1969 - this.field1968));
                System.arraycopy(var1, var2, this.field1967, (int) (this.field1969 - this.field1968), var5);
                this.field1969 += var5;
                var2 += var5;
                var3 -= var5;
                this.field1963 = this.field1967.length;
                this.method1157();
            }

            if (var3 <= this.field1967.length) {
                if (var3 > 0) {
                    if (-1L == this.field1968) {
                        this.field1968 = this.field1969;
                    }

                    System.arraycopy(var1, var2, this.field1967, (int) (this.field1969 - this.field1968), var3);
                    this.field1969 += var3;
                    if (this.field1969 - this.field1968 > (long) this.field1963) {
                        this.field1963 = (int) (this.field1969 - this.field1968);
                    }

                }
            } else {
                if (this.field1969 != this.field1972) {
                    this.field1971.method530(this.field1969);
                    this.field1972 = this.field1969;
                }

                this.field1971.method531(var1, var2, var3);
                this.field1972 += var3;
                if (this.field1972 > this.field1970) {
                    this.field1970 = this.field1972;
                }

                long var11 = -1L;
                long var7 = -1L;
                if (this.field1969 >= this.field1962 && this.field1969 < this.field1962 + (long) this.field1966) {
                    var11 = this.field1969;
                } else if (this.field1962 >= this.field1969 && this.field1962 < (long) var3 + this.field1969) {
                    var11 = this.field1962;
                }

                if ((long) var3 + this.field1969 > this.field1962 && (long) var3 + this.field1969 <= this.field1962 + (long) this.field1966) {
                    var7 = this.field1969 + (long) var3;
                } else if ((long) this.field1966 + this.field1962 > this.field1969 && this.field1962 + (long) this.field1966 <= (long) var3 + this.field1969) {
                    var7 = this.field1962 + (long) this.field1966;
                }

                if (var11 > -1L && var7 > var11) {
                    int var9 = (int) (var7 - var11);
                    System.arraycopy(var1, (int) (var11 + (long) var2 - this.field1969), this.field1964, (int) (var11 - this.field1962), var9);
                }

                this.field1969 += var3;
            }
        } catch (IOException var10) {
            this.field1972 = -1L;
            throw var10;
        }
    }

    void method1157() throws IOException {
        if (this.field1968 != -1L) {
            if (this.field1968 != this.field1972) {
                this.field1971.method530(this.field1968);
                this.field1972 = this.field1968;
            }

            this.field1971.method531(this.field1967, 0, this.field1963);
            this.field1972 += this.field1963;
            if (this.field1972 > this.field1970) {
                this.field1970 = this.field1972;
            }

            long var2 = -1L;
            long var4 = -1L;
            if (this.field1968 >= this.field1962 && this.field1968 < (long) this.field1966 + this.field1962) {
                var2 = this.field1968;
            } else if (this.field1962 >= this.field1968 && this.field1962 < this.field1968 + (long) this.field1963) {
                var2 = this.field1962;
            }

            if (this.field1968 + (long) this.field1963 > this.field1962 && this.field1968 + (long) this.field1963 <= this.field1962 + (long) this.field1966) {
                var4 = this.field1968 + (long) this.field1963;
            } else if (this.field1962 + (long) this.field1966 > this.field1968 && (long) this.field1966 + this.field1962 <= this.field1968 + (long) this.field1963) {
                var4 = this.field1962 + (long) this.field1966;
            }

            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                System.arraycopy(this.field1967, (int) (var2 - this.field1968), this.field1964, (int) (var2 - this.field1962), var6);
            }

            this.field1968 = -1L;
            this.field1963 = 0;
        }

    }
}
