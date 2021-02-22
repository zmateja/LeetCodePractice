package Medium;

public class costToConnectSticks {
    public static void main(String[] args) {
        costToConnectSticks test = new costToConnectSticks();
        int[] input = {5};
        System.out.println(test.connectSticks(input));
    }

    public int connectSticks(int[] sticks){
        int workDone = 0;
        for(int j = 1; j < sticks.length; j++){
            int minimum = Integer.MAX_VALUE, oldMin = Integer.MAX_VALUE;
            int minIndex = 0, oldMinIndex = 0;
            for(int i = 0; i < sticks.length; i++){
                if(sticks[i] < minimum){
                    oldMin = minimum;
                    oldMinIndex = minIndex;
                    minimum = sticks[i];
                    minIndex = i;
                }
                else if(sticks[i] < oldMin){
                    oldMin = sticks[i];
                    oldMinIndex = i;
                }
            }
            workDone = workDone + minimum + oldMin;
            sticks[minIndex] = Integer.MAX_VALUE;
            sticks[oldMinIndex] = minimum + oldMin;
        }
        return workDone;
    }
}
