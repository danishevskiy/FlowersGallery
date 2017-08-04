package flowersgallery.dnh.ua.model.entity.accessory;

import flowersgallery.dnh.ua.model.entity.Productable;

import static java.lang.Boolean.FALSE;

/**
 * Created by denystymoshkevych on 7/26/17.
 */
public abstract class Accessory implements Productable {

    /** Enabled boolean */
    private static boolean FLAG_ENABLED = FALSE;

    void setEnable(final boolean enable) {

        FLAG_ENABLED = enable;
    }

    public boolean isEnable()
    {
        return FLAG_ENABLED;
    }
}
