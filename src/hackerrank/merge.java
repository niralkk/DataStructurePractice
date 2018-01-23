package hackerrank;
public class merge{

/**
 * @param args
 */
public static void main(String[] args) {
    String a ="abc";
    String b ="def";
    StringBuilder sb = new StringBuilder();
    int alength = a.length();
    int belnth = b.length();
    if(alength==b.length()){
        for(int i=0;i<belnth;i++){
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }           
    }else if(alength>belnth){
        int j=0;
        for(j=0;j<belnth;j++){
            sb.append(a.charAt(j));
            sb.append(b.charAt(j));
        }   
        for(j=belnth;j<alength;j++){
            sb.append(a.charAt(j));
            //sb.append(b.charAt(j));
        }

    }else if(alength<belnth){
        int j=0;
        for(j=0;j<alength;j++){
            sb.append(a.charAt(j));
            sb.append(b.charAt(j));
        }   
        for(j=alength;j<belnth;j++){
            sb.append(b.charAt(j));
            //sb.append(b.charAt(j));
        }

    }
    System.out.println(sb.toString());
}
}
