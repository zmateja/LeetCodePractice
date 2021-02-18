package Hard;
//solution has memory limit exceeded on LeetCode. This works, but has bad space complexity (O(N) long numbers)
public class ConsecutiveNumberSum {
    public static void main(String[] args) {
        ConsecutiveNumberSum test = new ConsecutiveNumberSum();
        int N = 15;
        int output = test.consecutiveNumbersSum(N);
        System.out.println(output);
    }
    public int consecutiveNumbersSum(int N){
        if(N < 3)
            return 1;
        long[] dpSum = new long[N/2+2];
        int counter = 1;
        for(int i = 0; i < dpSum.length; i++){
            dpSum[i] = ((long)i * (i+1))/2;
        }
        for(int i = dpSum.length-1; dpSum[i] >= N; i--){
            for(int j = i-1; j >= 0; j--){
                if(dpSum[i] - dpSum[j] == N){
                    counter++;
                    break;
                }
                else if(dpSum[i] - dpSum[j] > N)
                    break;
            }
        }
        return counter;

    }
}
