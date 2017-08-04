package flowersgallery.dnh.ua.model.entity.plant.flower;

import flowersgallery.dnh.ua.model.entity.Productable;
import flowersgallery.dnh.ua.model.entity.eukaryote.plant.seed.plant.SeedPlant;
import flowersgallery.dnh.ua.model.entity.plant.flower.enam.Freshness;

import java.math.BigDecimal;

/**
 * Created by denystymoshkevych on 7/26/17.
 */
public abstract class Flower extends SeedPlant implements Productable{

    private Freshness freshness;
    private int weight;
    private BigDecimal sellingPrice = new BigDecimal(0);

    public Flower() {
    }

    public Flower(Freshness freshness, int weight, BigDecimal sellingPrice) {
        this.freshness = freshness;
        this.weight = weight;
        this.sellingPrice = sellingPrice;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "freshness=" + freshness +
                ", weight=" + weight +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}
