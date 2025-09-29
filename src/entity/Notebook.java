package entity;

public class Notebook extends Pad {
    private String pagePattern;
    private boolean isDatedPages;

    public Notebook() {
    }

    public Notebook(String padType, String cover, String binding, int width, int height, int density,
                    int sheetsQuantity, String pagePattern, boolean isDatedPages) {
        super();
        this.pagePattern = pagePattern;
        this.isDatedPages = false;
    }

    public String getPagePattern() {
        return pagePattern;
    }

    public boolean getIsDatedPages() {
        return isDatedPages;
    }

    public void setPagePattern(String pagePattern) {
        this.pagePattern = pagePattern;
    }

    public void setIsDatedPages(boolean isDatedPages) {
        this.isDatedPages = isDatedPages;
    }


    @Override
    public String getInfo() {
        return String.format("%s\nCover: %s\nBlinding: %s\nSize: %dx%dmm\nPaper density: %dg/m2\nSheets quantity: %d\n" +
                        "Page pattern: %s", getPadType(), super.getCover(), super.getBinding(),
                super.getWidth(), super.getHeight(), super.getDensity(), super.getSheetsQuantity(), this.pagePattern);
    }
}

