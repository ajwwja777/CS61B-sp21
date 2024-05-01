package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> alnr = new AListNoResizing<>();
        BuggyAList<Integer> bal = new BuggyAList<>();
        alnr.addLast(1);
        alnr.addLast(2);
        alnr.addLast(3);
        bal.addLast(1);
        bal.addLast(2);
        bal.addLast(3);
        assertEquals(alnr.size(), bal.size());

        assertEquals(alnr.getLast(), bal.getLast());
        alnr.removeLast();
        bal.removeLast();

        assertEquals(alnr.getLast(), bal.getLast());
        alnr.removeLast();
        bal.removeLast();

        assertEquals(alnr.getLast(), bal.getLast());
        alnr.removeLast();
        bal.removeLast();
      }

      /* @source https://sp21.datastructur.es/materials/lab/lab3/testThreeAddThreeRemove.txt */
      @Test
      public void testThreeAddThreeRemove2() {
          AListNoResizing<Integer> correct = new AListNoResizing<>();
          BuggyAList<Integer> broken = new BuggyAList<>();
  
          correct.addLast(5);
          correct.addLast(10);
          correct.addLast(15);
          
          broken.addLast(5);
          broken.addLast(10);
          broken.addLast(15);
  
          assertEquals(correct.size(), broken.size());
  
          assertEquals(correct.removeLast(), broken.removeLast());
          assertEquals(correct.removeLast(), broken.removeLast());
          assertEquals(correct.removeLast(), broken.removeLast());
      }

      /* @source lab3_content */
      @Test
      public void randomizedTest() {
          AListNoResizing<Integer> L = new AListNoResizing<>();
          BuggyAList<Integer> BL = new BuggyAList<>();

          int N = 5000;
          for (int i = 0; i < N; i += 1) {
              int operationNumber = StdRandom.uniform(0, 4);
              if (operationNumber == 0) {
                  // addLast
                  int randVal = StdRandom.uniform(0, 100);
                  L.addLast(randVal);
                  BL.addLast(randVal);
                  // System.out.println("addLast(" + randVal + ")");
              } else if (operationNumber == 1) {
                  // size
                  int size_L = L.size();
                  int size_BL = BL.size();
                  assertEquals(size_L, size_BL);
                  // System.out.println("size: " + size);
              } else if (operationNumber == 2 && L.size() != 0 && BL.size() != 0 ) {
                  //removeLast
                  int last_item_L = L.removeLast();
                  int last_item_BL = BL.removeLast();
                  assertEquals(last_item_L, last_item_BL);
                  // System.out.println("remove_last_item: " + last_item);
              } else if (operationNumber == 3 && L.size() != 0 && BL.size() != 0 ) {
                  //getLast
                  int last_item_L = L.getLast();
                  int last_item_BL = BL.getLast();
                  assertEquals(last_item_L, last_item_BL);
                  // System.out.println("get_last_item: " + last_item);
              }
          }
      }

      /* @sourse https://github.com/githubdudu/cs61b-2021Spring */
      @Test
      public void randomizedTest2() {
          AListNoResizing<Integer> L = new AListNoResizing<>();
          BuggyAList<Integer> L2 = new BuggyAList<>();
  
  
          int N = 5000;
          for (int i = 0; i < N; i += 1) {
              int operationNumber = StdRandom.uniform(0, 4);
              if (operationNumber == 0) {
                  // addLast
                  int randVal = StdRandom.uniform(0, 100);
                  L.addLast(randVal);
                  L2.addLast(randVal);
              } else if (operationNumber == 1) {
                  // size
                  int size = L.size();
                  int size2 = L2.size();
                  assertEquals(size, size2);
              } else if (operationNumber == 2) {
                  // getLast
                  if (L.size() > 0) {
                      int last = L.getLast();
                      int last2 = L2.getLast();
                      assertEquals(last, last2);
                  }
              } else if (operationNumber == 3) {
                  // removeLast
                  if (L.size() > 0) {
                      int last = L.removeLast();
                      int last2 = L2.removeLast();
                      assertEquals(last, last2);
                  }
              }
          }
        }

        @Test
        public void randomized_remove_last_Test() {
            AListNoResizing<Integer> L = new AListNoResizing<>();
            BuggyAList<Integer> BL = new BuggyAList<>();
  
            int N = 5000;
            for (int i = 0; i < N; i += 1) {
                int operationNumber = StdRandom.uniform(0, 4);
                if (operationNumber == 0) {
                    // addLast
                    int randVal = StdRandom.uniform(0, 100);
                    L.addLast(randVal);
                    BL.addLast(randVal);
                    // System.out.println("addLast(" + randVal + ")");
                } else if (operationNumber == 1) {
                    // size
                    int size_L = L.size();
                    int size_BL = BL.size();
                    assertEquals(size_L, size_BL);
                    // System.out.println("size: " + size);
                } else if (operationNumber == 2 && L.size() != 0 && BL.size() != 0 ) {
                    //removeLast
                    int last_item_L = L.removeLast();
                    int last_item_BL = BL.removeLast();
                    assertEquals(last_item_L, last_item_BL);
                    // System.out.println("remove_last_item: " + last_item);
                }
            }
        }
}
