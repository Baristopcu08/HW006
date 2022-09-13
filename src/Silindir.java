import java.math.RoundingMode;
import java.text.Format;

public class Silindir extends Daire{

    double yukseklik;


    public Silindir(double yaricap) {
        super(yaricap);
    }

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik>0) {
            this.yukseklik = yukseklik;
        }else {
            this.yukseklik=0;
        }

        }

    public double getHacim(){
        return Math.round(Math.PI*(yaricap*yaricap)*yukseklik*100.0)/100.0;
    }

    @Override
    public double getAlan() {
        return Math.round((2 * yaricap * yaricap * Math.PI + 2 * Math.PI * yaricap * yukseklik)*100.0)/100.0;
    }
}

