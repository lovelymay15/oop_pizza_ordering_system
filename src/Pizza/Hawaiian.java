
package Pizza;

public class Hawaiian extends PizzaJFrame {
    private int perprice;
    private int regprice;
    private int famprice;
  
    public void setperPrice() {
        this.perprice = 275; } 
    public void setregPrice() {
        this.regprice = 400; }   
    public void setfamPrice() {
        this.famprice = 750; }
   
    public int getperPrice(){
        return perprice; }   
    public int getregPrice(){
        return regprice; }   
    public int getfamPrice(){
        return famprice;   
    }   
}
