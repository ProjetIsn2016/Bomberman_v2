/**
 * Created by Mfrizzy on 08/06/2017.
 */
public class Joueur {

    private Coordonnees coord = new Coordonnees();

    //TODO : private Image bg;

    private int pv = pvDefaut;
    private int range;
    private int nbBombesMax;

    public static int pvDefaut = 3;
    public static int rangeDefaut = 0;

    public Joueur(int x,int y) {
        coord=new Coordonnees(x,y);
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getNbBombesMax() {
        return nbBombesMax;
    }

    public void setNbBombesMax(int nbBombesMax) {
        this.nbBombesMax = nbBombesMax;
    }

    public void ajouterVie() {
        pv++;
    }

    public void enleverVie() {
        pv--;
    }
}
