
package Pizza;

public class MeatLovers extends PizzaJFrame {
    private int perprice;
    private int regprice;
    private int famprice;
  
    public void setperPrice() {
        this.perprice = 300; } 
    public void setregPrice() {
        this.regprice = 500; }   
    public void setfamPrice() {
        this.famprice = 850; }
   
    public int getperPrice(){
        return perprice; }   
    public int getregPrice(){
        return regprice; }   
    public int getfamPrice(){
        return famprice;   
    }   
}
