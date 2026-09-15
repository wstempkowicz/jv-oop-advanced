package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] color = Color.values();
    private final Random randomColor = new Random();

    public String getRandomColor() {
        int value = randomColor.nextInt(color.length);
        return color[value].name().toLowerCase();
    }
}
