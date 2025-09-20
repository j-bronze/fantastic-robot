

public class Main {
    public static void main(String[] args) {

        Pad sketchBook = new Pad();

        sketchBook.padName = "SketchBook";
        sketchBook.setPaper("mat");
        sketchBook.setCover("flexible");
        sketchBook.setBinding("spring");
        sketchBook.setDensity(200);
        sketchBook.setSheetsQuantity(80);
        sketchBook.setWidth(210);
        sketchBook.setHeight(297);
        sketchBook.setPadWeight(sketchBook.getWidth(), sketchBook.getHeight(), sketchBook.getDensity(),
                sketchBook.getSheetsQuantity());

        System.out.println(sketchBook.getInfo());
        System.out.println(sketchBook.getPadWeight());


    }
}
