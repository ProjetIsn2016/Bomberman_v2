/**
 * Created by Mfrizzy on 08/06/2017.
 */
public class Coordonnees {

    private int posX;
    private int posY;

    public static int xDefaut;
    public static int yDefaut;

    public Coordonnees() {
        posX=xDefaut;
        posY=yDefaut;
    }

    public Coordonnees(int x, int y) {
        posY=y;
        posX=x;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
