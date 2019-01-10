//class Result {
//
//    public static int budgetShopping(int n, List<Integer> bundleQuantities, List<Integer> bundleCosts) {
//
//        int[] bundleQt = bundleQuantities.stream().mapToInt(i->i).toArray();
//        int[] bundleCst = bundleCosts.stream().mapToInt(i->i).toArray();
//        int[] quantOpt = new int[n + 1];
//
//        for(int i = 0; i < bundleQt.length; i++) {
//            for(int j = bundleCst[i]; j <= n; j++) {
//                quantOpt[j] = Math.max(quantOpt[j], quantOpt[j - bundleCst[i]] + bundleQt[i]);
//            }
//        }
//        return quantOpt[n];
//    }
//}
//
//
