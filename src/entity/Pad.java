package entity;

public class Pad {
    private String padType;
    private String paper;
    private String cover;
    private String binding;
    private int width;
    private int height;
    private int density;
    private int sheetsQuantity;
    private double padWeight;

    public Pad() { }

    public Pad (String padType, String paper, String cover, String binding, int width, int height, int density,
                int sheetsQuantity){
        this.padType = padType;
        this.paper = paper;
        this.cover = cover;
        this.binding = binding;
        this.width = width;
        this.height = height;
        this.density = density;
        this.sheetsQuantity = sheetsQuantity;
        CalcPadWeight();
    }

    public String getInfo(){
        return String.format("%s\nPaper: %s\nCover: %s\nBlinding: %s\nSize: %dx%dmm\nPaper density: %dg/m2\n" +
                        "Sheets quantity: %d", padType, paper, cover, binding, width, height, density, sheetsQuantity);
    }
    public String getPadType(){
        return padType;
    }
    public String getPaper(){
        return paper;
    }
    public String getCover(){
        return cover;
    }
    public String getBinding(){
        return binding;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getDensity(){
        return density;
    }
    public int getSheetsQuantity(){
        return sheetsQuantity;
    }

    public void setPadType(String padType){
        this.padType = padType;
    }
    public void setPaper(String paper){
        this.paper = paper;
    }
    public void setCover(String cover){
        this.cover = cover;
    }
    public void setBinding(String binding){
        this.binding = binding;
    }
    public void setWidth(int width){
        this.width = width;
        CalcPadWeight();
    }
    public void setHeight(int height){
        this.height = height;
        CalcPadWeight();
    }
    public void setDensity(int density){
        this.density = density;
        CalcPadWeight();
    }
    public void setSheetsQuantity(int sheetsQuantity){
        this.sheetsQuantity = sheetsQuantity;
        CalcPadWeight();
    }

    private void CalcPadWeight(){
        padWeight = (double) (width * height * density * sheetsQuantity) / 1000000;
    };

    public String getPadWeight (){
        return String.format("Weight: %fg", padWeight);
    };

}
