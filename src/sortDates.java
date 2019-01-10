//class Result {
//
//    public static List<String> sortDates(List<String> dates) {
//        HashMap<String, Integer> hm = new HashMap<>();
//        hm.put("Jan",0);
//        hm.put("Feb",1);
//        hm.put("Mar",2);
//        hm.put("Apr",3);
//        hm.put("May",4);
//        hm.put("Jun",5);
//        hm.put("Jul",6);
//        hm.put("Aug",7);
//        hm.put("Sep",8);
//        hm.put("Oct",9);
//        hm.put("Nov",10);
//        hm.put("Dec",11);
//
//
//        String temp, year, month, date;
//        int yy;
//        List<String> result = new ArrayList<>();
//        List<Date> input = new ArrayList<>();
//
//        for(int i=0;i< dates.size(); i++) {
//            temp = dates.get(i);
//            yy = Integer.valueOf(temp.substring(temp.length()-4))-1900;
//            date = temp.substring(0,2);
//            month = temp.substring(3,6);
//            input.add(new Date(yy, hm.get(month), Integer.valueOf(date)));
//        }
//
//        input.sort(Comparator.naturalOrder());
//
//
//        for(int i=0;i< input.size(); i++) {
//            temp = input.get(i).toString();
//            year = temp.substring(temp.length()-4);
//            date = temp.substring(8,10);
//            month = temp.substring(4,7);
//            result.add(date+" "+month+" "+year);
//        }
//
//        return result;
//    }
//
//}
//
//
