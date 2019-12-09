public abstract class Asset{
    private String name;
    private int prices;

    public Asset(String name,int price){
        this.name = name;
        this.price = prices;
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