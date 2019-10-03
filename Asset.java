public abstract class Asset{
    private String name;
    private int price;

    public Asset(String name,int price){
        this.name = name;
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
}