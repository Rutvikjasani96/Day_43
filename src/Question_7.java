public class Question_7 {
//    Given n, find sqrt of n.
    public static void main(String[] args) {
        int n = 16;
        System.out.println("sqrt : "+sqrt(n));
    }
    static int sqrt(int n){
        int l=1,h=n,ans=0;
        while (l<=h){
            int mid = (l+h)/2;
            if(mid*mid == n){
                return mid;
            }else if(mid * mid > n){
                h = mid-1;
            }else{
                ans = mid;
                l = mid+1;
            }
        }
        return ans;
    }
}
