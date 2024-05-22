public class Question_6 {
//    Given an array which is formated by rotating a distinct sorted array by k times,
//    search for a give a element in a sorted array.
    public static void main(String[] args) {
//        int[] array = {-20, -14, -8, -4, 1, 2, 4, 7, 11, 14, 19, 23, 27};
        int[] array = {11, 14, 19, 23, 27, -20, -14, -8, -4, 1, 2, 4, 7};
        int f = 7;
        int k = 5;
        System.out.println("Index of f : "+findRotatedEle(array,f,k));
    }
    static int findRotatedEle(int[] array,int f,int k){
        if(f>array[0]){
            return findEle(array,f,0,k-1);
        }else{
            return findEle(array,f,k, array.length-1);
        }
    }
    static int findEle(int[] array,int f,int l,int h){
        while(l<=h){
            int mid = (l+h)/2;
            if(array[mid]==f){
                return mid;
            }else if(array[mid]>f){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}
