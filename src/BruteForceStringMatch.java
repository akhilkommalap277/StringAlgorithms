public class BruteForceStringMatch {

    public static void main(String[] args) {
        System.out.println(BruteForceStringMatchAlgorithm("ABCD","AB"));
    }

    public static int BruteForceStringMatchAlgorithm(String Text,String Pattern){
        int text_length = Text.length();
        int pattern_length = Pattern.length();

        //here we no need to check for last pattern_length-1 locations of text_length since pattern length is pattern_length
        // for loop for iterating through the text
        for(int i=0;i<=text_length-pattern_length;i++){
            int j=0;
            //j for iterating through the pattern
            while(j<pattern_length && Text.charAt(i)==Pattern.charAt(j)){
                j++;
            }
            if(j==pattern_length)return i;
        }
        return -1;
    }

    //Time Complexity is O((n-m+1) * m) = O(n * m)
    //Space Complexity = O(1)




}
