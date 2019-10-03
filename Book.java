package main.java.継承サンプル;

public class Book extends TangibleAsset{
    private String isbn;

    //コンストラクタ
    public Book(String name,int price,String color,String isbn){
        super(name,price,color);
        this.isbn = isbn;
    }
    
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }
}