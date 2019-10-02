package main.java.継承サンプル;

public class Computer{
    private String name;
    private int price;
    private String color;
    private String makerName;

    //コンストラクタ
    public Computer
                (String name,int price,String color,String makerName){
                    this.name = name;
                    this.price =price;
                    this.color = color;
                    this.makerName = makerName;
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

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the makerName
     */
    public String getMakerName() {
        return makerName;
    }
}