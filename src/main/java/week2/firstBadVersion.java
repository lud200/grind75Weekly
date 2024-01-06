package week2;

/***
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * Example 1:
 *
 * Input: n = 5, bad = 4
 */
public class firstBadVersion {
    public static void main(String[] args){
        int n = 5;
    }

    public int firstBadVersion(int n) {
        int i = 0, j = n;

//        while(i<j){
//            int mid = i+(j-i)/2;
//            if(isBadVersion(mid)){
//                j = mid;
//            }else{
//                i = mid+1;
//            }
//        }
        return i;
    }

}
