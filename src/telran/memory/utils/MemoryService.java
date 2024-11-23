package telran.memory.utils;

public class MemoryService {

    public static int getMaxAvailableMemory() {
        int count = 1;
        int maxIndex1 = 1;
        int maxIndex2 = Integer.MAX_VALUE;
        int testMaxIndex = maxIndex2;

  while ( (maxIndex2 - maxIndex1) > 1)
 //   do
        {
            System.out.println(count);
            count++;

            testMaxIndex = (maxIndex2 / 2) + (maxIndex1 / 2);
 //           if ((maxIndex2 - maxIndex1) == 1) break;
//            if (((maxIndex2 == testMaxIndex && testMaxIndex == maxIndex1) || (maxIndex2 - maxIndex1) == 1)) break;
 //          if ((maxIndex2 - maxIndex1) == 1) break;
            try {
                int[] arr = new int[testMaxIndex];
            } catch (Error e) {
                maxIndex2 = testMaxIndex;
//           continue;
            }
            maxIndex1 = (maxIndex2 / 2) + (maxIndex1 / 2);
//          maxIndex1 = testMaxIndex;
        }
 //       while ((maxIndex2 - maxIndex1) != 1);
        System.out.println(testMaxIndex);
        testMaxIndex = testMaxIndex-1;
 //       testMaxIndex = (maxIndex2 / 2) + (maxIndex1 / 2);
        System.out.println("step: " + (count - 1) + ". Find MaxAvailableMemory: " + testMaxIndex);
        return testMaxIndex;
    }
}
