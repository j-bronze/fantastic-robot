package entity;

public class Sketchbook extends Pad {
    private String pageColor;

    public Sketchbook() {
    }

    public Sketchbook(String pageColor) {
        this.pageColor = pageColor;
    }

    public String getPageColor() {
        return pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }
}
