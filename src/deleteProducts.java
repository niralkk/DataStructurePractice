//class Result {
//
//    public static int deleteProducts(List<Integer> ids, int m) {
//
//        if(ids == null || ids.size() == 0) {
//            return 0;
//        }
//
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for(Integer id : ids) {
//            hm.put(id, hm.getOrDefault(id, 0) + 1);
//        }
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {
//            pq.add(entry.getValue());
//        }
//
//        int result = pq.size();
//        while(m > 0 && !pq.isEmpty()) {
//            int front = pq.remove();
//            if(m >= front) {
//                result-=1;
//            }
//            m-=front;
//        }
//        return result;
//    }
//}
//
//
