
public class Main {
    public static void main(String[] args) {

        Pad sketchBook = new Pad("SketchBook", "mat", "flexible", "spring",
                210, 297, 200, 80);

        System.out.println(sketchBook.getInfo());
        System.out.println(sketchBook.getPadWeight());

    }
}