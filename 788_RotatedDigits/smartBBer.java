class Solution {
    public int rotatedDigits(int N) {
        
        int count = 0;
        for(int i=1;i<=N;i++){
            String str = String.valueOf(i);
            if((str.contains("2")||str.contains("5")||str.contains("6")||str.contains("9"))&&(!str.contains("3")&&!str.contains("4")&&!str.contains("7")))
               count++;
        }
        return count;
    }
}