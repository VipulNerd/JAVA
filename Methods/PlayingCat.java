public class PlayingCat {
    // write code here
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if((temperature <= 45) && (temperature >= 25)){
                return true;
            }else{
                return false;
            }
        }else if (!summer){
            if((temperature <= 35) && (temperature >= 25)){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean Cat1 = isCatPlaying(false, 45);
        System.out.println(Cat1);
        boolean Cat2 = isCatPlaying(false, 35);
        System.out.println(Cat2);
        boolean Cat3 = isCatPlaying(true, 45);
        System.out.println(Cat3);
        boolean Cat4 = isCatPlaying(true, 15);
        System.out.println(Cat4);
    }
}