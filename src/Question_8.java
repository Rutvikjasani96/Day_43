public class Question_8 {
//    Given n array of the integers, find maximum k such that,
//    {max subarray sum of length k<=b}, b is given input
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 6, 3, 7, 2};
        int b = 20;
        System.out.println("Max Subarray sum length k <= b : "+maxSubarraySumLenK(array,b));
    }
    static int maxSubarraySumLenK(int[] array,int b){
        int l=0,h=array.length-1,ans=0;
        while(l<=h){
            int mid = (l+h)/2;
            if(isMaxSubarraySumLessThanB(array,mid,b)){
                ans = mid;
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }
    static boolean isMaxSubarraySumLessThanB(int[] array,int size,int b){
        int sum=0,max_sum=0;
        for(int i=0;i<size;i++){
            sum = sum + array[i];
        }
        max_sum = sum;
        int s = 1,e = size;
        while(e<array.length){
            sum = sum  - array[s-1] + array[e];
            s++;
            e++;
            max_sum = Math.max(sum,max_sum);
        }
        if(max_sum<=b){
            return true;
        }
        return false;
    }
}
