//class Result {
//
//
//    public static int consecutive(long num) {
//        int count = 0;
//        for(int i = 1; i * (i+1) < 2*num; i++)
//        {
//            float a = (float) ((1.0 * num - (i*(i+1))/2)/(i+1));
//            if(a-(int)a == 0.0)
//                count++;
//        }
//        return count;
//    }
//
//}
//
//
//—
//
//
//class Result {
//
//
//    public static int consecutive(long num) {
//        while((num & 1) == 0)
//            num >>= 1;
//
//        int res = 1, d = 3;
//
//        while(d*d<=num) {
//            int e = 0;
//            while(num%d == 0) {
//                num /= d;
//                e++;
//            }
//            res *= e+1;
//            d +=2;
//        }
//        if(num>1)
//            res <<=1;
//
//        return res-1;
//    }
//
//}
//
//
