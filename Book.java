package main.java.継承サンプル;

public class Book {
    private String name;
    private int price;
    private String color;
    private String isbn;

    //コンストラクタ
    public Book(String name,int price,String color,String isbn){
        this.name = name;
        this.price = price;
        this.color = color;
        this.isbn = isbn;
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
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }
}