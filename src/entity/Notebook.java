package entity;

public class Notebook extends Pad{
    private String pagePattern;
    private boolean isDatedPages;

    public Notebook(String pagePattern, boolean isDatedPages){
        super(padType, paper, cover, binding, width, height, density, sheetsQuantity);
        this.pagePattern = pagePattern;
        this.isDatedPages = false;
    }
//    public Notebook(){
//    }

    public String getPagePattern(){
        return pagePattern;
    }
    public boolean getIsDatedPages(){
        return isDatedPages;
    }

    public void setPagePattern(String pagePattern){
        this.pagePattern = pagePattern;
    }
    public void setIsDatedPages(boolean isDatedPages){
        this.isDatedPages = isDatedPages;
    }
}
