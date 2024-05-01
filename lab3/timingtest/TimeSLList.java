package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        int start = 1000; // 1000, 2000, 4000, 8000, 16000, ..., 128000
        int end = 64000;
        int m = 1000;
        int item_added = 1;

        for (int k = start; k <= end; k = k * 2) {
            /* init */
            Ns.addLast(k);
            opCounts.addLast(m);
            SLList<Integer> sll = new SLList<>();
            for(int i = 0; i < k; i++) {
                sll.addLast(item_added);
            }

            /* calc getlast time */
            Stopwatch sw = new Stopwatch();
            for(int i = 0; i < m; i++) {
                sll.getLast();
            }
            double timeInSeconds = sw.elapsedTime();
            times.addLast(timeInSeconds);
        }
        /* print */
        printTimingTable(Ns, times, opCounts);
    }

}
