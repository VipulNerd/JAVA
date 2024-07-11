public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        
        if ((bigCount < 0)||(smallCount < 0)||(goal < 0)){
            return false;
        }
        int maxBigBagsToUse = goal / 5;

        if (maxBigBagsToUse <= bigCount) {
            goal -= maxBigBagsToUse * 5;
        } else {
            goal -= bigCount * 5;
        }

        return smallCount >= goal;
       

    }
    public static void main(String[] args) {
        boolean a = canPack(1, 0, 4);
        boolean b = canPack(1, 0, 5);
        boolean c = canPack(0, 5, 4);
        boolean d = canPack(2, 2, 11);
        boolean e = canPack(-3, 2, 12);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
    }
}
