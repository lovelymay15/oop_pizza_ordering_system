
package Pizza;

public class VeggieLovers extends Pizza.PizzaJFrame {
    private int perprice;
    private int regprice;
    private int famprice;
  
    public void setperPrice() {
        this.perprice = 250; } 
    public void setregPrice() {
        this.regprice = 450; }   
    public void setfamPrice() {
        this.famprice = 600; }
   
    public int getperPrice(){
        return perprice; }   
    public int getregPrice(){
        return regprice; }   
    public int getfamPrice(){
        return famprice;   
    }   
}

