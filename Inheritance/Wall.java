public final class Wall {
    // write code here
    private double width;
    private double height;
    public Wall (){
       
    }
    public Wall (double width, double height){
       setWidth(width);
       setHeight(height);
    }
    public double getWidth(){
      return width;
    }
     public void setWidth(double width){
       if (width < 0){
           width = 0;
       }
       this.width = width;
   
    }
    public double getHeight(){
       return height;
    }
   
    public void setHeight( double height){
       if (height < 0){
           height = 0;
       }
       this.height = height;
       
    }
    public double getArea(){
       return width * height; 
    }
   
}
class MainW {
    public static void main(String[] args) {
        
    
     Wall wall = new Wall(5,4);
     System.out.println("area= " + wall.getArea());

     wall.setHeight(-1.5);
     System.out.println("width= " + wall.getWidth());
     System.out.println("height= " + wall.getHeight());
     System.out.println("area= " + wall.getArea());
    }
}
