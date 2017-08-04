package flowersgallery.dnh.ua.model.entity.accessory;

import java.awt.*;

/**
 * Created by denystymoshkevych on 7/26/17.
 */
public class Basket extends Accessory {

    private Color color;
    private int sizeX;
    private int sizeY;
    private int sizeZ;

    public Basket() {
    }

    public Basket(Color color, int sizeX, int sizeY, int sizeZ) {
        this.color = color;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(int sizeZ) {
        this.sizeZ = sizeZ;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "color=" + color +
                ", sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", sizeZ=" + sizeZ +
                '}';
    }
}
