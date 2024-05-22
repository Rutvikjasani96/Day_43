public class Question_5 {
//    Every element occurs twice except for 1, Find Unique Element.
//    Note : Duplicate are adjacent to each other.
    public static void main(String[] args) {
        int[] array = {3, 3, 1, 1, 8, 8, 10, 10, 19, 6, 6, 2, 2, 4, 4};
        System.out.println("ans : "+findUnique(array));
    }
    static int findUnique(int[] array){
        int l=0;
        int h=array.length-1;
        if(array.length==1){
            return array[0];
        }
        if(array[0]!=array[1]){
            return array[0];
        }
        if(array[array.length-1]!=array[array.length-2]){
            return array[array.length-1];
        }
        while(l<=h){
            int mid = (l+h) /2;
            if(array[mid]!=array[mid+1] && array[mid]!=array[mid-1]){
                return array[mid];
            }
            if(array[mid]!=array[mid+1]){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;
    }
}
