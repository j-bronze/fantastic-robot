package entity;

public class Sketchbook extends Pad {
    private String pageColor;

    public Sketchbook() {
    }

    public Sketchbook(String padType, String cover, String binding, int width, int height, int density,
                      int sheetsQuantity, String pageColor) {
        super();
        this.pageColor = pageColor;
    }

    public String getPageColor() {
        return pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }

    @Override
    public String getInfo(){
        return String.format("%s\nCover: %s\nBlinding: %s\nSize: %dx%dmm\nPaper density: %dg/m2\n" +
                "Sheets quantity: %d\nPages color: %s", super.getPadType(), super.getCover(), super.getBinding(),
                super.getWidth(), super.getHeight(), super.getDensity(), super.getSheetsQuantity(),
                this.pageColor);
    }

}
