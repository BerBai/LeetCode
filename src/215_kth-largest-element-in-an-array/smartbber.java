class Solution {
    //太取巧了
    public int findKthLargest0(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    //快排
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length-1);
        return nums[nums.length-k];
    }
    public static void quickSort(int[] numbers, int start, int end) {   
    if (start < end) {   
        int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）   
        int temp; // 记录临时中间值   
        int i = start, j = end;   
        do {   
            while ((numbers[i] < base) && (i < end))   
                i++;   
            while ((numbers[j] > base) && (j > start))   
                j--;   
            if (i <= j) {   
                temp = numbers[i];   
                numbers[i] = numbers[j];   
                numbers[j] = temp;   
                i++;   
                j--;   
            }   
        } while (i <= j);   
        if (start < j)   
            quickSort(numbers, start, j);   
        if (end > i)   
            quickSort(numbers, i, end);   
    }   
}  
    
    public static void quickSort1(int[] a, int start, int end) {
        if(start >= end)
            return;
        int i = start;
        int j = end;
        int base = a[start];
        while(i != j) {
            while(a[j] >= base && j > i)
                j--;
            while(a[i] <= base && i < j)
                i++;
            if(i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[start] = a[i];
        a[i] = base;
        quickSort(a, start, i - 1);
        quickSort(a, i + 1, end);
    }
}