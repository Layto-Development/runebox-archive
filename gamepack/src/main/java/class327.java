import java.awt.datatransfer.*;

public class class327 {
    boolean field2372;
    boolean field2374;
    boolean field2383;
    class1 field2382;
    class1 field2387;
    class353 field2368;
    class353 field2371;
    int field2369;
    int field2370;
    int field2373;
    int field2375;
    int field2376;
    int field2377;
    int field2378;
    int field2379;
    int field2380;
    int field2381;
    int field2384;
    int field2385;
    int field2386;
    int field2388;

    class327() {
        this.field2371 = new class353();
        this.field2368 = new class353();
        this.field2383 = false;
        this.field2372 = true;
        this.field2369 = 0;
        this.field2374 = false;
        this.field2375 = 0;
        this.field2388 = 0;
        this.field2377 = 0;
        this.field2379 = 0;
        this.field2378 = 0;
        this.field2380 = 0;
        this.field2381 = 0;
        this.field2370 = Integer.MAX_VALUE;
        this.field2386 = Integer.MAX_VALUE;
        this.field2376 = 0;
        this.field2384 = 0;
        this.field2385 = 0;
        this.field2373 = 0;
        this.field2371.method1684(1);
        this.field2368.method1684(1);
    }

    void method1442() {
        this.field2369 = (this.field2369 + 1) % 60;
        if (this.field2381 > 0) {
            --this.field2381;
        }

    }

    public boolean method1443(boolean var1) {
        var1 = var1 && this.field2372;
        boolean var3 = this.field2383 != var1;
        this.field2383 = var1;
        if (!this.field2383) {
            this.method1462(this.field2379, this.field2379);
        }

        return var3;
    }

    public void method1473(boolean var1) {
        this.field2372 = var1;
        this.field2383 = var1 && this.field2383;
    }

    boolean method1512(String var1) {
        String var3 = this.field2371.method1653();
        if (!var3.equals(var1)) {
            var1 = this.method1487(var1);
            this.field2371.method1685(var1);
            this.method1451(this.field2385, this.field2373);
            this.method1494();
            this.method1499();
            return true;
        } else {
            return false;
        }
    }

    boolean method1445(String var1) {
        this.field2368.method1685(var1);
        return true;
    }

    boolean method1446(class197 var1) {
        boolean var3 = !this.field2374;
        this.field2371.method1655(var1);
        this.field2368.method1655(var1);
        this.field2374 = true;
        var3 |= this.method1451(this.field2385, this.field2373);
        var3 |= this.method1462(this.field2378, this.field2379);
        if (this.method1494()) {
            this.method1499();
            var3 = true;
        }

        return var3;
    }

    public boolean method1447(int var1, int var2) {
        boolean var4 = this.field2376 != var1 || this.field2384 != var2;
        this.field2376 = var1;
        this.field2384 = var2;
        var4 |= this.method1451(this.field2385, this.field2373);
        return var4;
    }

    public boolean method1448(int var1) {
        if (var1 < 0) {
            var1 = Integer.MAX_VALUE;
        }

        boolean var3 = var1 == this.field2371.method1689();
        this.field2371.method1680(var1);
        this.field2368.method1680(var1);
        if (this.method1494()) {
            this.method1499();
            var3 = true;
        }

        return var3;
    }

    public boolean method1449(int var1) {
        this.field2371.method1651(var1);
        if (this.method1494()) {
            this.method1499();
            return true;
        } else {
            return false;
        }
    }

    public boolean method1516(int var1) {
        this.field2386 = var1;
        if (this.method1494()) {
            this.method1499();
            return true;
        } else {
            return false;
        }
    }

    public boolean method1451(int var1, int var2) {
        if (!this.method1485()) {
            this.field2385 = var1;
            this.field2373 = var2;
            return false;
        } else {
            int var4 = this.field2385;
            int var5 = this.field2373;
            int var6 = Math.max(0, this.field2371.method1664() - this.field2376 + 2);
            int var7 = Math.max(0, this.field2371.method1665() - this.field2384 + 1);
            this.field2385 = Math.max(0, Math.min(var6, var1));
            this.field2373 = Math.max(0, Math.min(var7, var2));
            return var4 != this.field2385 || this.field2373 != var5;
        }
    }

    public boolean method1508(int var1, int var2) {
        boolean var4 = var1 >= 0 && var1 <= 2;

		if (var2 < 0 || var2 > 2) {
            var4 = false;
        }

        return var4 && this.field2371.method1656(var1, var2);
    }

    public void method1452(int var1) {
        this.field2371.method1657(var1);
    }

    public void method1453(int var1) {
        this.field2375 = var1;
    }

    public void method1522(int var1) {
        this.field2371.method1684(var1);
    }

    public void method1521(int var1) {
        this.field2371.method1654(var1);
    }

    public boolean method1503(int var1) {
        this.field2377 = var1;
        String var3 = this.field2371.method1653();
        int var4 = var3.length();
        var3 = this.method1487(var3);
        if (var3.length() != var4) {
            this.field2371.method1685(var3);
            this.method1451(this.field2385, this.field2373);
            this.method1494();
            this.method1499();
            return true;
        } else {
            return false;
        }
    }

    public void method1455() {
        this.field2374 = false;
    }

    public boolean method1502(int var1) {
        if (this.method1489(var1)) {
            this.method1461();
            class98 var3 = this.field2371.method1683((char) var1, this.field2379, this.field2370);
            this.method1462(var3.method429(), var3.method429());
            this.method1494();
            this.method1499();
        }

        return true;
    }

    public void method1457() {
        if (!this.method1461() && this.field2379 > 0) {
            int var2 = this.field2371.method1661(this.field2379 - 1);
            this.method1499();
            this.method1462(var2, var2);
        }

    }

    public void method1458() {
        if (!this.method1461() && this.field2379 < this.field2371.method1652()) {
            int var2 = this.field2371.method1661(this.field2379);
            this.method1499();
            this.method1462(var2, var2);
        }

    }

    public void method1459() {
        if (!this.method1461() && this.field2379 > 0) {
            class260 var2 = this.method1492(this.field2379 - 1);
            int var3 = this.field2371.method1662((Integer) var2.field1940, this.field2379);
            this.method1499();
            this.method1462(var3, var3);
        }

    }

    public void method1480() {
        if (!this.method1461() && this.field2379 < this.field2371.method1652()) {
            class260 var2 = this.method1492(this.field2379);
            int var3 = this.field2371.method1662(this.field2379, (Integer) var2.field1939);
            this.method1499();
            this.method1462(var3, var3);
        }

    }

    boolean method1461() {
        if (!this.method1490()) {
            return false;
        } else {
            int var2 = this.field2371.method1662(this.field2378, this.field2379);
            this.method1499();
            this.method1462(var2, var2);
            return true;
        }
    }

    public void method1520() {
        this.method1462(0, this.field2371.method1652());
    }

    public boolean method1462(int var1, int var2) {
        if (!this.method1485()) {
            this.field2378 = var1;
            this.field2379 = var2;
            return false;
        } else {
            if (var1 > this.field2371.method1652()) {
                var1 = this.field2371.method1652();
            }

            if (var2 > this.field2371.method1652()) {
                var2 = this.field2371.method1652();
            }

            boolean var4 = this.field2378 != var1 || var2 != this.field2379;
            this.field2378 = var1;
            if (var2 != this.field2379) {
                this.field2379 = var2;
                this.field2369 = 0;
                this.method1497();
            }

            if (var4 && null != this.field2382) {
                this.field2382.method1();
            }

            return var4;
        }
    }

    public void method1463(boolean var1) {
        class260 var3 = this.method1493(this.field2379);
        this.method1495((Integer) var3.field1940, var1);
    }

    public void method1464(boolean var1) {
        class260 var3 = this.method1493(this.field2379);
        this.method1495((Integer) var3.field1939, var1);
    }

    public void method1465(boolean var1) {
        this.method1495(0, var1);
    }

    public void method1466(boolean var1) {
        this.method1495(this.field2371.method1652(), var1);
    }

    public void method1514(boolean var1) {
        if (this.method1490() && !var1) {
            this.method1495(Math.min(this.field2378, this.field2379), var1);
        } else if (this.field2379 > 0) {
            this.method1495(this.field2379 - 1, var1);
        }

    }

    public void method1467(boolean var1) {
        if (this.method1490() && !var1) {
            this.method1495(Math.max(this.field2378, this.field2379), var1);
        } else if (this.field2379 < this.field2371.method1652()) {
            this.method1495(1 + this.field2379, var1);
        }

    }

    public void method1468(boolean var1) {
        if (this.field2379 > 0) {
            class260 var3 = this.method1492(this.field2379 - 1);
            this.method1495((Integer) var3.field1940, var1);
        }

    }

    public void method1469(boolean var1) {
        if (this.field2379 < this.field2371.method1652()) {
            class260 var3 = this.method1492(1 + this.field2379);
            this.method1495((Integer) var3.field1939, var1);
        }

    }

    public void method1470(boolean var1) {
        if (this.field2379 > 0) {
            this.method1495(this.field2371.method1663(this.field2379, -1), var1);
        }

    }

    public void method1471(boolean var1) {
        if (this.field2379 < this.field2371.method1652()) {
            this.method1495(this.field2371.method1663(this.field2379, 1), var1);
        }

    }

    public void method1472(boolean var1) {
        if (this.field2379 > 0) {
            int var3 = this.method1496();
            this.method1495(this.field2371.method1663(this.field2379, -var3), var1);
        }

    }

    public void method1460(boolean var1) {
        if (this.field2379 < this.field2371.method1652()) {
            int var3 = this.method1496();
            this.method1495(this.field2371.method1663(this.field2379, var3), var1);
        }

    }

    public void method1510(boolean var1) {
        class145 var3 = this.field2371.method1658(0, this.field2379);
        class260 var4 = var3.method670();
        this.method1495(this.field2371.method1679((Integer) var4.field1940, this.field2373), var1);
    }

    public void method1509(boolean var1) {
        class145 var3 = this.field2371.method1658(0, this.field2379);
        class260 var4 = var3.method670();
        this.method1495(this.field2371.method1679((Integer) var4.field1940, this.field2384 + this.field2373), var1);
    }

    public void method1518(int var1, int var2, boolean var3, boolean var4) {
        boolean var6 = false;
        class260 var7;
        int var9;
        if (!this.field2374) {
            var9 = 0;
        } else {
            var1 += this.field2385;
            var2 += this.field2373;
            var7 = this.method1500();
            var9 = this.field2371.method1679(var1 - (Integer) var7.field1940, var2 - (Integer) var7.field1939);
        }

        if (var3 && var4) {
            this.field2388 = 1;
            var7 = this.method1492(var9);
            class260 var8 = this.method1492(this.field2380);
            this.method1491(var8, var7);
        } else if (var3) {
            this.field2388 = 1;
            var7 = this.method1492(var9);
            this.method1462((Integer) var7.field1940, (Integer) var7.field1939);
            this.field2380 = (Integer) var7.field1940;
        } else if (var4) {
            this.method1462(this.field2380, var9);
        } else {
            if (this.field2381 > 0 && var9 == this.field2380) {
                if (this.field2379 == this.field2378) {
                    this.field2388 = 1;
                    var7 = this.method1492(var9);
                    this.method1462((Integer) var7.field1940, (Integer) var7.field1939);
                } else {
                    this.field2388 = 2;
                    var7 = this.method1493(var9);
                    this.method1462((Integer) var7.field1940, (Integer) var7.field1939);
                }
            } else {
                this.field2388 = 0;
                this.method1462(var9, var9);
                this.field2380 = var9;
            }

            this.field2381 = 25;
        }

    }

    public void method1501(int var1, int var2) {
        if (this.field2374 && this.method1481()) {
            var1 += this.field2385;
            var2 += this.field2373;
            class260 var4 = this.method1500();
            int var5 = this.field2371.method1679(var1 - (Integer) var4.field1940, var2 - (Integer) var4.field1939);
            class260 var6;
            class260 var7;
            switch (this.field2388) {
                case 0:
                    this.method1462(this.field2378, var5);
                    break;
                case 1:
                    var6 = this.method1492(this.field2380);
                    var7 = this.method1492(var5);
                    this.method1491(var6, var7);
                    break;
                case 2:
                    var6 = this.method1493(this.field2380);
                    var7 = this.method1493(var5);
                    this.method1491(var6, var7);
            }
        }

    }

    public void method1474(Clipboard var1) {
        class145 var3 = this.field2371.method1658(this.field2378, this.field2379);
        if (!var3.method665()) {
            String var4 = var3.method664();
            if (!var4.isEmpty()) {
                var1.setContents(new StringSelection(var4), null);
            }
        }

    }

    public void method1444(Clipboard var1) {
        if (this.method1490()) {
            this.method1474(var1);
            this.method1461();
        }

    }

    public void method1475(Clipboard var1) {
        Transferable var3 = var1.getContents(null);
        if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String var4 = this.method1487((String) var3.getTransferData(DataFlavor.stringFlavor));
                this.method1461();
                class98 var5 = this.field2371.method1659(var4, this.field2379, this.field2370);
                this.method1462(var5.method429(), var5.method429());
                this.method1494();
                this.method1499();
            } catch (Exception var6) {
            }
        }

    }

    public void method1515() {
        this.field2373 = Math.max(0, this.field2373 - this.field2371.method1666());
    }

    public void method1476() {
        int var2 = Math.max(0, this.field2371.method1665() - this.field2384);
        this.field2373 = Math.min(var2, this.field2373 + this.field2371.method1666());
    }

    public void method1477(class1 var1) {
        this.field2387 = var1;
    }

    public void method1478(class1 var1) {
        this.field2382 = var1;
    }

    public class353 method1505() {
        return this.field2371;
    }

    public class353 method1479() {
        return this.field2368;
    }

    public class145 method1454() {
        return this.field2371.method1658(this.field2378, this.field2379);
    }

    public boolean method1481() {
        return this.field2383;
    }

    public boolean method1482() {
        return this.field2372;
    }

    public boolean method1504() {
        return this.method1481() && this.field2369 % 60 < 30;
    }

    public int method1483() {
        return this.field2379;
    }

    public int method1484() {
        return this.field2378;
    }

    public boolean method1485() {
        return this.field2374;
    }

    public int method1486() {
        return this.field2385;
    }

    public int method1511() {
        return this.field2373;
    }

    public int method1517() {
        return this.field2371.method1689();
    }

    public int method1513() {
        return this.field2371.method1669();
    }

    public int method1519() {
        return this.field2386;
    }

    public int method1488() {
        return this.field2375;
    }

    public int method1456() {
        return this.field2371.method1677();
    }

    public int method1507() {
        return this.field2377;
    }

    public int method1450() {
        return this.field2371.method1670();
    }

    public boolean method1506() {
        return this.method1513() > 1;
    }

    boolean method1490() {
        return this.field2379 != this.field2378;
    }

    String method1487(String var1) {
        StringBuilder var3 = new StringBuilder(var1.length());

        for (int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            if (this.method1489(var5)) {
                var3.append(var5);
            }
        }

        return var3.toString();
    }

    void method1491(class260 var1, class260 var2) {
        if ((Integer) var2.field1940 < (Integer) var1.field1940) {
            this.method1462((Integer) var1.field1939, (Integer) var2.field1940);
        } else {
            this.method1462((Integer) var1.field1940, (Integer) var2.field1939);
        }

    }

    class260 method1492(int var1) {
        int var3 = this.field2371.method1652();
        int var4 = 0;
        int var5 = var3;

        int var6;
        for (var6 = var1; var6 > 0; --var6) {
            if (this.method1498(this.field2371.method1667(var6 - 1).field2084)) {
                var4 = var6;
                break;
            }
        }

        for (var6 = var1; var6 < var3; ++var6) {
            if (this.method1498(this.field2371.method1667(var6).field2084)) {
                var5 = var6;
                break;
            }
        }

        return new class260(var4, var5);
    }

    class260 method1493(int var1) {
        int var3 = this.field2371.method1652();
        int var4 = 0;
        int var5 = var3;

        int var6;
        for (var6 = var1; var6 > 0; --var6) {
            if (this.field2371.method1667(var6 - 1).field2084 == '\n') {
                var4 = var6;
                break;
            }
        }

        for (var6 = var1; var6 < var3; ++var6) {
            if (this.field2371.method1667(var6).field2084 == '\n') {
                var5 = var6;
                break;
            }
        }

        return new class260(var4, var5);
    }

    boolean method1494() {
        if (!this.method1485()) {
            return false;
        } else {
            boolean var2 = false;
            if (this.field2371.method1652() > this.field2386) {
                this.field2371.method1662(this.field2386, this.field2371.method1652());
                var2 = true;
            }

            int var3 = this.method1513();
            int var4;
            if (this.field2371.method1682() > var3) {
                var4 = this.field2371.method1663(0, var3) - 1;
                this.field2371.method1662(var4, this.field2371.method1652());
                var2 = true;
            }

            if (var2) {
                var4 = this.field2379;
                int var5 = this.field2378;
                int var6 = this.field2371.method1652();
                if (this.field2379 > var6) {
                    var4 = var6;
                }

                if (this.field2378 > var6) {
                    var5 = var6;
                }

                this.method1462(var5, var4);
            }

            return var2;
        }
    }

    void method1495(int var1, boolean var2) {
        if (var2) {
            this.method1462(this.field2378, var1);
        } else {
            this.method1462(var1, var1);
        }

    }

    int method1496() {
        return this.field2384 / this.field2371.method1666();
    }

    void method1497() {
        class145 var2 = this.field2371.method1658(0, this.field2379);
        class260 var3 = var2.method670();
        int var4 = this.field2371.method1666();
        int var5 = (Integer) var3.field1940 - 10;
        int var6 = var5 + 20;
        int var7 = (Integer) var3.field1939 - 3;
        int var8 = var7 + 6 + var4;
        int var9 = this.field2385;
        int var10 = this.field2376 + var9;
        int var11 = this.field2373;
        int var12 = var11 + this.field2384;
        int var13 = this.field2385;
        int var14 = this.field2373;
        if (var5 < var9) {
            var13 = var5;
        } else if (var6 > var10) {
            var13 = var6 - this.field2376;
        }

        if (var7 < var11) {
            var14 = var7;
        } else if (var8 > var12) {
            var14 = var8 - this.field2384;
        }

        this.method1451(var13, var14);
    }

    boolean method1498(int var1) {
        return var1 == 32 || var1 == 10 || var1 == 9;
    }

    void method1499() {
        if (null != this.field2387) {
            this.field2387.method1();
        }

    }

    boolean method1489(int var1) {
        switch (this.field2377) {
            case 1:
                return class95.method378((char) var1);
            case 2:
                return class95.method372((char) var1);
            case 3:
                return class237.method1067((char) var1);
            case 4:
                char var3 = (char) var1;
                if (class237.method1067(var3)) {
                    return true;
                } else {
					return var3 == 'k' || var3 == 'K' || var3 == 'm' || var3 == 'M' || var3 == 'b' || var3 == 'B';
				}
            default:
                return true;
        }
    }

    class260 method1500() {
        int var2 = this.field2371.method1671(this.field2376);
        int var3 = this.field2371.method1672(this.field2384);
        return new class260(var2, var3);
    }
}
