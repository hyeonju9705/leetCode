class Solution {
    public int balancedStringSplit(String s) {
        //9:51 시작
        String[] arr = s.split("");
        int rCount = 0;
        int lCount = 0;
        int answerCount = 0;

        for(String a : arr){
            if("R".equals(a)){
                rCount++;
            }else{
                lCount++;
            }

            if(rCount > 0 && lCount > 0 && rCount == lCount){
                answerCount++;
                rCount = 0;
                lCount = 0;
            }
        }

        return answerCount;
    }
}