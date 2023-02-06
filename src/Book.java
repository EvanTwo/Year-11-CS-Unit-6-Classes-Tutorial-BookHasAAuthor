public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String n, Author a, double p, int q) {
        name = n;
        author = a;
        price = p;
        qty = q;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "'" + name + "' by " + author;
    }

}