//// Complete the closest function below.
//static List<Integer> closest(String s, List<Integer> queries) {
//        int len = s.length();
//        int left[] = new int[len];
//        int right[] = new int[len];
//        for(int i =0 ; i< len; i++) {
//        left[i] = Integer.MAX_VALUE;
//        right[i] = Integer.MAX_VALUE;
//        }
//
//        HashMap<Character, Integer> leftHM = new HashMap<>();
//        HashMap<Character, Integer> rightHM = new HashMap<>();
//
//
//        for(int i=0, j= len-1; i<len || j > -1; i++, j--) {
//        char curLeft = s.charAt(i);
//        if(leftHM.containsKey(curLeft)) {
//        left[i]=leftHM.get(curLeft);
//        }
//        leftHM.put(curLeft,i);
//
//        char curRight = s.charAt(j);
//        if(rightHM.containsKey(curRight)) {
//        right[j]=rightHM.get(curRight);
//        }
//        rightHM.put(curRight,j);
//        }
//
//
//        List<Integer> result = new ArrayList<Integer>();
//        for(int i=0; i< queries.size(); i++) {
//        int res = -1;
//        int index = queries.get(i);
//        if(left[index] == Integer.MAX_VALUE) {
//        if(right[index] == Integer.MAX_VALUE) {
//        res = -1;
//        }
//        else {
//        res = right[index];
//        }
//        }
//        else {
//        if(right[index] != Integer.MAX_VALUE &&
//        Math.abs(left[index]-index) > Math.abs(right[index]-index))
//        {
//        res = right[queries.get(i)];
//        }
//        else {
//        res = left[queries.get(i)];
//        }
//        }
//        result.add(res);
//        }
//        return result;
//        }
//
//

