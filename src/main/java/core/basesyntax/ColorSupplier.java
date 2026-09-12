package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] color = Color.values();
    private Random randomValueSupplier = new Random();

    public String getRandomColor() {
        int value = randomValueSupplier.nextInt(color.length);
        return color[value].name().toLowerCase();
    }
}
