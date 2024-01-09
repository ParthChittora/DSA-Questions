//public class FirstBadVersion {
//    // We dont have the api so its just the method
////    https://leetcode.com/problems/first-bad-version/description/
//
//    /* The isBadVersion API is defined in the parent class VersionControl.
//      boolean isBadVersion(int version); */
//
//        public int firstBadVersion(int n) {
//            int s =1;
//            int e =n;
//            while(s<e){
//                int mid = s+(e-s)/2;
//                if(isBadVersion(mid)){
//                    e=mid;
//                }
//                else
//                    s = mid+1;
//            }
//            return e;
//        }
//    }
//
