package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();
    private Color[] colors = Color.values();

    public String getRandomColor() {
        int value = randomColor.nextInt(colors.length);
        return colors[value].name().toLowerCase();
    }
}
