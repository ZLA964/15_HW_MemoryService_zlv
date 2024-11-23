package telran.memory.utils;

public class MemoryService {

    public static int getMaxAvailableMemory() {
        // TODO HW
        int count = 1;
        int maxIndex1 = 0;
        int maxIndex2 = Integer.MAX_VALUE;
        int testMaxIndex;
        System.out.println("-- start --");
        while (true) {
            System.out.println("count= " + count++);
            testMaxIndex = (maxIndex2 / 2) + (maxIndex1 / 2);
            System.out.println("m1= " + maxIndex1 + ", tI= " + testMaxIndex + ", m2= " + maxIndex2);
            if(((maxIndex2 == testMaxIndex && testMaxIndex == maxIndex1) || (maxIndex2-maxIndex1)==1)) break;
            try {

                System.out.println("testIndex= " + testMaxIndex);
                int[] arr = new int[testMaxIndex];

 //             if ((maxIndex2 - maxIndex1) == 1) break;
            } catch (Error e) {
                System.out.println(e.getMessage());
                maxIndex2 =  testMaxIndex;
                System.out.println("maxIndex2= " + maxIndex2);
                System.out.println("=== end catch =====");
     //           continue;
            }
            System.out.println("ttIndex= " + testMaxIndex);
            maxIndex1 = (maxIndex2 / 2) + (maxIndex1 / 2);
  //          maxIndex1 = testMaxIndex;
            System.out.println("maxIndex1= " + maxIndex1);
            System.out.println("=== end No catch ===");
        }
        System.out.println("step: " + count + "find MaxAvailableMemory: " + testMaxIndex);
        return testMaxIndex;
    }
}
