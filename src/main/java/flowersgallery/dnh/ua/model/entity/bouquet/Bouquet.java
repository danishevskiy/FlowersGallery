package flowersgallery.dnh.ua.model.entity.bouquet;

import flowersgallery.dnh.ua.model.entity.accessory.Basket;
import flowersgallery.dnh.ua.model.entity.accessory.Ribbon;
import flowersgallery.dnh.ua.model.entity.accessory.Wrap;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Price;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Size;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Type;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Weight;
import flowersgallery.dnh.ua.model.entity.plant.flower.Flower;

import java.util.List;

/**
 * Created by denystymoshkevych on 7/26/17.
 */
public class Bouquet {

    //enam
    private Price price;
    private Size size;
    private Type type;
    private Weight weight;
    //accessory
    private Basket basket;
    private Wrap wrap;
    private Ribbon ribbon;
    //flowers
    private List<Flower> flowersList;


    public Bouquet() {

    }

    public Bouquet(Price price, Size size, Type type, Weight weight, Basket basket, Wrap wrap, Ribbon ribbon, List<Flower> flowersList) {
        this.price = price;
        this.size = size;
        this.type = type;
        this.weight = weight;
        this.basket = basket;
        this.wrap = wrap;
        this.ribbon = ribbon;
        this.flowersList = flowersList;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public Ribbon getRibbon() {
        return ribbon;
    }

    public void setRibbon(Ribbon ribbon) {
        this.ribbon = ribbon;
    }

    public List<Flower> getFlowersList() {
        return flowersList;
    }

    public void setFlowersList(List<Flower> flowersList) {
        this.flowersList = flowersList;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "price=" + price +
                ", size=" + size +
                ", type=" + type +
                ", weight=" + weight +
                ", basket=" + basket +
                ", wrap=" + wrap +
                ", ribbon=" + ribbon +
                ", flowersList=" + flowersList +
                '}';
    }
}
