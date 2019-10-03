package main.java.継承サンプル;

public class Computer extends Tangible{
    private String makerName;

    //コンストラクタ
    public Computer
                (String name,int price,String color,String makerName){
                    super(name,price,color);
                    this.makerName = makerName;
                }


    /**
     * @return the makerName
     */
    public String getMakerName() {
        return makerName;
    }
}