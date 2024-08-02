

public class Bedroom {
    private String name;
    private Wa_ll wall1;
    private Wa_ll wall2;
    private Wa_ll wall3;
    private Wa_ll wall4 ;
    private Ceiling ceiling;
    public Bed bed;
    public Lamp lamp;
    
    public Bedroom (String name, Wa_ll wall1, Wa_ll wall2, Wa_ll wall3, Wa_ll wall4, Ceiling ceiling, Bed bed, Lamp lamp ){
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed  = bed;
        this.lamp = lamp;
    }
    public Lamp getLamp(){
        return this.lamp;
    }
    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.make();

    }
    
}

class Lamp{
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp (String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    public String getStyle(){
        return style;
    }
    public boolean isBattery(){
        return battery;
    }
    public int getGlobRating(){
        return globRating;
    }

}
class Bed{
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    public Bed (String style, int pillows, int height, int sheets, int quilt){
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.print("Bed -> Making | ");
    }
    
    public int getPillows(){
        return pillows;
    }
    public int getSheets(){
        return sheets;
    }
    public int getHeight(){
        return height;

    }
    public int getQuilt(){
        return quilt;
    }

}
class Ceiling{
    private int height;
    private int paintedColor;
    public Ceiling (int height, int paintedColor){
        this.height = height;
        this.paintedColor = paintedColor;
    }
    public int getPaintedColor(){
        return paintedColor;
    }
}
class Wa_ll{
    private String direction;
    public Wa_ll (String direction){
        this.direction = direction;
    }
    public String getDirection(){
        return direction;
    }
}

class Main{
    public static void main(String[] args) {
        Wa_ll wall1 = new Wa_ll("West");
        Wa_ll wall2 = new Wa_ll("East");
        Wa_ll wall3 = new Wa_ll("South");
        Wa_ll wall4 = new Wa_ll("North");
        
        Ceiling ceiling = new Ceiling(12, 55);
        
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        
        Lamp lamp = new Lamp("Classic", false, 75);
        
        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();
        
        bedRoom.getLamp().turnOn();

    }
}

