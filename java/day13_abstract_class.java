//Write MyBook Class
class MyBook extends Book{
    private int price;
    public MyBook(String t,String a,int p){
        super(t,a);
        price=p;
    }
    public void display(){
        System.out.println("Title: "+super.title);
        System.out.println("Author: "+super.author);
        System.out.println("Price: "+price);
    }
    
}
