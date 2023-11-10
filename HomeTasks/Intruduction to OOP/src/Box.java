public class Box {

    private double width;
    private double height;
    private double depth;
    private String color;
    private String material;
    private boolean isReusable;

    // Constructor
    public Box(double width, double height, double depth, String color, String material, boolean isReusable) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.material = material;
        this.isReusable = isReusable;
    }
    //Constructor with values
    public Box(){
        this.width = 0.0;
        this.height = 0.0;
        this.depth = 0.0;
        this.color = "none";
        this.material = "none";
        this.isReusable = false;
    }

    // Getter and setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isReusable() {
        return isReusable;
    }

    public void setReusable(boolean reusable) {
        isReusable = reusable;
    }

    @Override
    public String toString() {
        return "Box {" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", isReusable=" + isReusable +
                '}';
    }

    public double calculateVolume(){
        return width * height * depth;
    }

}
