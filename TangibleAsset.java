
public abstract class TangibleAsset extends Asset implements Thing{
    private String color;
    public TangibleAsset(String name,int price,String color){
        super(name, price);
        this.color = color;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public double setWeight(double weight) {
        this.weight = weight;
    }
}