//Write your code here
class Calculator extends Exception{
    public Calculator(){
       super("n and p should be non-negative");
    }
    public int power(int i,int j)throws Calculator{
        if(i<0 || j<0)
            throw new Calculator();
        else 
           return ((int)Math.pow(i,j));
    }
}
