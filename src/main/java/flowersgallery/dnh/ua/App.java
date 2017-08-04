package flowersgallery.dnh.ua;

import flowersgallery.dnh.ua.model.entity.accessory.Basket;
import flowersgallery.dnh.ua.model.entity.accessory.Ribbon;
import flowersgallery.dnh.ua.model.entity.accessory.Wrap;
import flowersgallery.dnh.ua.model.entity.bouquet.Bouquet;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Price;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Size;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Type;
import flowersgallery.dnh.ua.model.entity.bouquet.enam.Weight;
import flowersgallery.dnh.ua.model.entity.plant.flower.Flower;
import flowersgallery.dnh.ua.model.entity.plant.flower.Rose;
import flowersgallery.dnh.ua.view.Out;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denystymoshkevych on 7/26/17.
 */
public class App {

    public static void main(String[] args) {

        List<Flower> roses = new ArrayList<>();
        roses.add(new Rose());
        roses.add(new Rose());
        roses.add(new Rose());
        Bouquet bouquetRose = new Bouquet(Price.CHEAP, Size.BIG, Type.Wedding, Weight.BIG, new Basket(), new Wrap(), new Ribbon(), roses);

        new Out().printMessage(bouquetRose);
    }
}
