import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {
    int value(String[] colors) {

        int color1 = colors().indexOf(colors[0]);
        int color2 = colors().indexOf(colors[1]);

        String bothColors = String.valueOf(color1)+color2;
        return Integer.parseInt(bothColors);
    }

    List<String> colors() {

        return Arrays.asList("black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white");
    }

}
