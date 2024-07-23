

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if((width <= 0)||(height <= 0)||(areaPerBucket <= 0)||(extraBuckets < 0)){
            return -1;
        }
        double area = width * height;
        double areaToPaint =  area - (extraBuckets*areaPerBucket);
        int bucketNeeded = (int) Math.ceil(areaToPaint/areaPerBucket);
        return bucketNeeded > 0 ? bucketNeeded : 0;

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if((width <= 0)||(height <= 0)||(areaPerBucket <= 0)){
            return -1;
        }
        double area = width * height;
        int bucketNeeded = (int) Math.ceil(area/areaPerBucket);
        return bucketNeeded > 0 ? bucketNeeded : 0;

    }
    public static int getBucketCount(double area, double areaPerBucket){
        if((area <= 0)||(areaPerBucket <= 0)){
            return -1;
        }
        int bucketNeeded = (int) Math.ceil(area/areaPerBucket);
        return bucketNeeded > 0 ? bucketNeeded : 0;
    }
    public static void main(String[] args) {
        // Test cases for Method 1
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));  // should return 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));// should return 3
        
        // Test cases for Method 2
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));    // should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5));     // should return 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35));   // should return 14
        
        // Test cases for Method 3
        System.out.println(getBucketCount(3.4, 1.5));          // should return 3
        System.out.println(getBucketCount(6.26, 2.2));         // should return 3
        System.out.println(getBucketCount(3.26, 0.75));        // should return 5
    }
}
