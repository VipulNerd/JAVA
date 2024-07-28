// Floor.java
public final class Floor {
    private double width;
    private double length;
    public Floor(double width, double length){
        if (width < 0) {
            width = 0;
        }
 
        if (length < 0) {
            length = 0;
        }
 
        this.width = width;
        this.length = length;
    }
  
    public double getArea(){
        return width * length;
    }
}
// Carpet.java
class Carpet {
    
    private double cost;
    
    public Carpet(double cost){
         if (cost < 0){
            cost = 0;
        }
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }
   
}

// Calculator.java
class Calculator{
    private Floor floor;
    private Carpet carpet;
    public Calculator (Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost() ;

    }
}
class main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
