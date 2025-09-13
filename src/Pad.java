public class Pad {
    String padName;
    private String paper;
    private String cover;
    private String binding;
    private int width;
    private int height;
    private int density;
    private int sheetsQuantity;
    private double padWeight;

    public String getInfo(){
        return String.format("%s\nPaper: %s\nCover: %s\nBlinding: %s\nSize: %dx%dmm\nPaper density: %dg/m2\n" +
                        "Sheets quantity: %d", padName, paper, cover, binding, width, height, density, sheetsQuantity);
    };
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
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setDensity(int density){
        this.density = density;
    }
    public void setSheetsQuantity(int sheetsQuantity){
        this.sheetsQuantity = sheetsQuantity;
    }

    public void setPadWeight(int width, int height, int density, int sheetsQuantity){
        this.width = width;
        this.height = height;
        this.density = density;
        this.sheetsQuantity = sheetsQuantity;
        this.padWeight = width * height * density * sheetsQuantity / 1000000;
    };

    public String getPadWeight (){
        return String.format("Weight: %fg", padWeight);
    };

}
