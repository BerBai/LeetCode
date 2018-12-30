class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) return null;
        int index = digits.length - 1;
        while (digits[index] == 9)
        {
            if (index == 0)
            {
                int[] res = new int[digits.length+1];
                res[0] = 1;
                for (int i = 0; i < digits.length; i++)
                {
                    res[i + 1] = 0;
                }
                return res;
            }
            digits[index] = 0;
            index--;
        }
        digits[index] += 1;
        return digits;
    }
} 