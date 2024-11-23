package telran.memory.utils;

public class MemoryService {

    public static int getMaxAvailableMemory() {
        int count = 1;
        int maxIndex1 = 0;
        int maxIndex2 = Integer.MAX_VALUE;
        int testMaxIndex;

        while (true) {
            count++;
            testMaxIndex = (maxIndex2 / 2) + (maxIndex1 / 2);
//            if (((maxIndex2 == testMaxIndex && testMaxIndex == maxIndex1) || (maxIndex2 - maxIndex1) == 1)) break;
            if ((maxIndex2 - maxIndex1) == 1) break;
            try {
                int[] arr = new int[testMaxIndex];
            } catch (Error e) {
                maxIndex2 = testMaxIndex;
//           continue;
            }
            maxIndex1 = (maxIndex2 / 2) + (maxIndex1 / 2);
//          maxIndex1 = testMaxIndex;
        }
        System.out.println("step: " + (count - 1) + ". Find MaxAvailableMemory: " + testMaxIndex);
        return testMaxIndex;
    }
}
