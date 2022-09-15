package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        this.x = 0;
        this.y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(int n) {
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    private static int koordinataGeneralasa(int n) {
        return (int) (Math.random() * (2 * n) + 1) - n;
    }

    public double getOrigotolMertTavolsag() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double getTavolsag(Pont masikPont) {
        return Math.sqrt(Math.pow((masikPont.x - this.x), 2) + Math.pow((masikPont.y - this.y), 2));
    }

    public String getSikNegyed(Pont sikPont) {
        String hovaOldal = "";
        String valasz = "";
        if (sikPont.x > 0) {
            hovaOldal = "jobb";
        } else if (sikPont.x < 0) {
            hovaOldal = "bal";
        } else {
            hovaOldal = "Tengelyen";
        }
        String hovaFentLent = "";
        if (sikPont.y > 0) {
            hovaFentLent = "felső";
        } else if (sikPont.y < 0) {
            hovaFentLent = "alsó";
        }

        valasz = hovaOldal + hovaFentLent;

        if (sikPont.x == 0 && sikPont.y == 0) {
            valasz = "Origó";
        } else if (sikPont.x == 0) {
            valasz = ("Az X tengelyen a " + hovaFentLent + " felén");
        } else if (sikPont.y == 0) {
            valasz = (hovaOldal + " oldalon az Y tengelyen");
        }
        return valasz;
    }

    @Override
    public String toString() {
        //return "(" + x + ", " + y + ')';
        return String.format("(%d, %d)", this.x, this.y);
    }
}
