public class Daire {

    double yaricap;


    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if (yaricap>0){
            this.yaricap = yaricap;
        }else {
            this.yaricap=0;
        }
    }

    public double getAlan(){
        return Math.round(Math.PI*yaricap*yaricap*100.0)/100.0;
    }

}
