public class AreaCalculator {
    // write code here
    public static double area (double radius){
        if(radius < 0){
            return -1;
        }
        double areaCircle = radius * radius * Math.PI;
        return areaCircle;
    }
    public static double area(double x , double y){
        if((x < 0) || (y < 0)){
            return -1;
        }
        double areaRectangle =  x * y;
        return areaRectangle;
    }
    public static void main(String[] args) {
        double Area1 = area(40);
        System.out.println(Area1);
        double Area2 = area(10, 20);
        System.out.println(Area2);
    }
}