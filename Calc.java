public class Calc {
    public static String sort(double [] num){
        String sortList = " ";


        for(int i=0; i<num.length; i++){
            double small = num[i];
            int smalldx = i;
            for(int j=i+1; j<num.length; j++){
                if(small > num[j]){
                    small = num[j];
                    smalldx = j;
                }
            }
            if (i!=smalldx)
                swap (i, smalldx, num);
        }
        for(double value:num){
            sortList += value + " ";
        }
        return sortList;
    }
    public static void swap(int orSmallIndex, int newSmallIndex, double [] num){
        double temp = num[newSmallIndex];
        num[newSmallIndex] = num[orSmallIndex];
        num[orSmallIndex] = temp;
    }
}
