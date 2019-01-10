//class Result {
//
//    public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
//        List<String> result = new ArrayList<String>();
//        StringBuilder path = new StringBuilder();
//        findPatternDFS(workHours, dayHours, pattern, result, path, 0, 0);
//        return result;
//    }
//
//    public static void findPatternDFS(int w, int d, String s, List<String> res, StringBuilder path, int cur, int sum) {
//        if(cur == s.length()) {
//            if(w==sum) {
//                res.add(path.toString());
//            }
//            return;
//        }
//
//        char c = s.charAt(cur);
//        if(cur< s.length()) {
//            if(c!= '?') {
//                sum+=(c-'0');
//                path.append(c);
//                findPatternDFS(w,d,s, res, path, cur+1, sum);
//                path.deleteCharAt(path.length()-1);
//
//            }
//            else {
//                for(int i=0; i<=d; i++) {
//                    sum+=i;
//                    path.append(i + "");
//                    findPatternDFS(w,d,s, res, path, cur+1, sum);
//                    path.deleteCharAt(path.length()-1);
//                    sum-=i;
//
//                }
//            }
//        }
//    }
//
//}
//
//


//----
/*


class Result {

    public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
        int fixedHours = 0;
        int queCount = 0;
        HashMap<Integer, Character> hm = new HashMap<>();
        char days[] = new char[pattern.length()];

        for(int i=0; i<pattern.length(); i++) {
            if(pattern.charAt(i) == 63) {
                hm.put(i, pattern.charAt(i));
                queCount++;
            }
            else {
                days[i] = Character.getNumericValue(pattern.charAt(i));
                fixedHours+= Character.getNumericValue(pattern.charAt(i));
            }
        }
        System.out.println(queCount);
        System.out.println(fixedHours);


        List<String> result = new ArrayList<String>();
        return result;

    }

}


*/