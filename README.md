# CS61B
![Image1](https://github.com/ajwwja777/git_exercise/raw/master/61b-sp21-title.png)
[English version](README_en.md)  
[CS61B-extension](https://github.com/ajwwja777/CS61B-sp21-extension/tree/master)

### 前言与路线图
总结之前CS61A的经验，制定新的学习策略。
#### 1.输入
效率很重要。  
采用看视频和读文本交替的方式来学习，同时将提到的重要概念自己敲一敲。但也不要在此耗费太多时间。
#### 2.输出
在翻阅Calendar和Textbook之后，我发现T后面几乎没有习题建议了。  
因此，按照C的计划走，但在写lab/hw/proj的同时，要接着输入，不要死磕。
#### 3.效率
课程计划是15周，这太长了，我应该控制在8周左右。  
因此要详略得当，不要死磕，抓住核心思路。  
要有效率的学习，最好限时自己完成一件事情，不要陷入完美主义，把握主要思路即可，因为一些偏理论的细致末节的东西很快就会被忘掉，而应用的最多的才会被记住。

### Useful link
* [Course Website-sp21](https://sp21.datastructur.es/)
- [Textbook](https://joshhug.gitbooks.io/hug61b/content/)
* [Skeleton Code-sp21](https://github.com/Berkeley-CS61B/skeleton-sp21)
- [Lecture Code-sp21](https://github.com/Berkeley-CS61B/lectureCode-sp21/tree/master)
* [Study notes by Junhao Wang-sp18](https://junhaow.com/studynotes/#cs-61b-data-structures)
- [exercisesInGuide-sp21](https://github.com/githubdudu/cs61b-2021Spring/tree/17ccfcd1bd5b3b93872689f27bcd41fb14cd8b7f/exercisesInGuide)

### 简单记录与总结
#### 记录
`4.19`  
1. Complete the debug part and IntList part of lab2.  
2. Finish lec4, expect exercise part.  
3. Additionally, I find that the guide is very useful, including the lecture note and exercise, which is enough for me to study with lecture and hw/lab/proj.
4. At last, Efficiency! Lecture and exercise for understanding, hw/lab/proj for application, both are important.

`4.20`  
1. 今日计划  
   我在想是否只需要写hw/lab/proj。...做了exercise之后，想了一想，还是需要听课和写exercise，这对我帮助很大，不论在细节的思路上，还是在熟练度上。
2. 总结  
   完成了lec4 ex和lec5的全部。lec4 ex花了2h，lec5听得很快1h内，但是ex花了2h+，一开始连题目都看不太懂，最后还是勉强看完他人解答。最后很累...  
   总之，熟能生巧，慢慢来过，基础知识急不得，马虎不得。  
   保持每天的持续性，每天一个lec和ex，不超过3h，再写hw/lab/proj。

`4.21`  
1. Finished lec6 all.
2. Completed GSS of proj0 and the previous parts.  

`4.22`  
1. Finished lec7 all.  
   It takes about 2h, 1h for lec, 1h for ex.
2. Thought: Spend 1h to lab/hw/proj a day.  
   If lab/hw/proj cannot follow the speed of lec, stop lec and do these first.

`4.23`  
1. Finished lec8 all. By the way, there is no ex.

`4.24`  
1. Completed CAA(Creating an Animation) in proj0 and the previous parts. Spend about 2h.

`4.25`  
1. Finished proj0! Spend about 2h.
2. In fact, if I did it fast, it was not more than 1h, but i learn some other skills else.
3. For example, I know the diifference between the VSCode and IDEA when they run the file today.
4. If there is a class in somewhere, VSCode will use that.  
   It could make a trouble when you modify your code and there is no change. So delete it.  
   IDEA will make classes first, and then compile.  
   You can use javac file.java in terminal and then compile file.class, it could work for VSCod.  
   The simplilst way to run is that make sure there is no file.class, and run file.java in VSCode, it could work well with no class.  
   You can creat a test dir to do it.

`4.26`  
1. Finished lab3! Spend about 2.5h.

`4.27`  
1. Finished proj1a! but with bug unfixed.
2. Finished lec9.
3. I would like to write some notes, to recap these lec in the future.
4. Note  
   Lec title: Extends, Casting, Higher Order Functions.  
   That's enough. And that's all👀, I am too lazy to show examples, it's time wasted.
5. Finished proj1b!
6. Read proj1gold.

`4.28`  
1. Finished lec10! New level of abstrction! Interface is a brilliant idea!
2. I need to upload proj1b, with interface and comparable and comparator.
3. So think about the lab and proj during studying lec, after finishing lec, then do them.

`4.29`
1. IMPORTANT CHANGE: I find that sp21 is better, so I turn to it.
2. Finished lec11!
3. NOTES
   ###### Part 1 Lists and Sets in Java
   nothing

   ###### Part 2 Basic Arrayset
   nothing

   ###### Part 3 - exceptions
   throw new RuntimeException("For no reason.");

   ###### Part 4 Iterable
   Class A implements Iterable {  
   …  
   Class nestedAIterator implements Iterator{…}  
   nestedAIterator Iterator(){…}  
   }

   ###### Part 5 toString
   override  
   string+=… is a copy, waste time  
   stringbuilder sb = new stringbuilder("{")

   ###### Part 6  ==, this, equals
   == compares box  
   equals compares box in default, so override  
   notice to null

   ###### Part 7 Summary
   nothing

   ###### Part 8 EXTRA fancier to String and the of static
   new list --> list.add --> string.join  
   public static < B > of< B >(B... item) {...} (because of static, cannot use < T >,so use < B > instead.)

`4.30`
1. I plan to do the lab and proj today, but I feel more interst in lec now, so ..., lec.
2. Finished lec12.
3. Notes
   ###### Content
   Maps.  
   Hashing.  
   File I/O.  
   Graphs.

   ###### Approach Comparison
   1,2,3: Commit ID (that goes up by 1) that includes the file.  
   4: Date and time of file.  
   5: git-SHA1 hash of file.

   ###### Storing Commits using Serializable

   ###### Branching
   Merging

`5.1`
1. Today, I am going to FINISH proj1b & proj1gold in sp18 and lab3 & lab4 & lab5 & proj1 in sp21.
2. Spent 2h and more in lab3, I am too slow...
3. Notes
   ###### Part1 runtime
   // Ns: size of the list  
   // times: time of the process  
   // opCounts: number of the process  
   private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts){}  
   Stopwatch sw = new Stopwatch();  
   times.addLast(sw.elapsedTime());  

   ###### Part2 random test
   int operationNumber = StdRandom.uniform(0, 4);  
   int randVal = StdRandom.uniform(0, 100);

   ###### Part3 debug
   // Note: this expectation breakpoint should be used with condition to a breakpoint(Empirically).  
   this instanceof java.lang.ArrayIndexOutOfBoundsException

`5.2`
1. Today, I am going to finish proj1b and lab4. Going to spend 2h.
2. Notes
   ###### Part1 Merge Conflicts
   git pull  
   then, select an option in editor.

   ###### Part2 Detached HEAD States & Checking Out Code with Git
   git checkout < your cocmmit address >  
   then, all the file will be the past one. And you can do something based on that. At last, you should add a new branch to keep it.

   ###### Part3 a little difference between Integer and int
   public static boolean isSameNumber(Integer a, Integer b) {  
        return a == b;  
    }  
   int a = b = 128;  
   isSameNumber(a, b) --> False
3. proj1b  
   Just review the code, get a deep understand of Interface and HoF.

`5.3`
1. Finished lec13, Asymptotics I.
2. Notes
   ###### Part0 lec content
   Lecture 13: Introduction to Asymptotic Analysis  
   ● Intuitive Runtime  
   ● Detailed Analysis of Worst Case Order of Growth  
   ● Simplified Analysis  
   ● Big Theta Notation  
   ● Big O Notation

   ###### Part1 My logical thought
   physical time --> general --> worst --> Order of Growth(shape) --> represent --> theta & o.  
   0.1s, ... --> 1 to n^2+2n, ... --> n^2+2n, ... --> n^2, ... --> n^2 --> theta(n^2) & O(n^2 or bigger).

3. My thought about education: Chinese vs English  
   ● English way of learning is presented above.  
   ● Chinese way is like these:  
   the definition of theta & o --> calc the codes' theta & o.  
   ● Conlusion  
   English way is from 0 to 1, can make you thought more deep.  
   Chinese way is to teach you how to use tools, which is more efficient.  
   Both of them have their own good.

`5.4`
1. Going to finish lec14, Disjoint Sets.
2. Finished lec14.
3. Notes
   ###### Part1 Lec Content
   Lecture 14: Disjoint Sets  
   ● Dynamic Connectivity and the Disjoint Sets Problem  
   ● Quick Find  
   ● Quick Union  
   ● Weighted Quick Union  
   ● Path Compression (CS170 Preview)

   ###### Part2 Quick Thought
   boxes and lines --> ListOfSets --> QuickFind(no head array) --> Quick Union(array tree) --> Weighted Quick Union(record the size in array head)  --> WeightedQuickUnionDSWithPathCompression(do that while do this)

   ###### Part3 Extension
   ● Naive: Record each line, I think node or matrix form to record it would be nice.  
   ● Quick Union: Cool solution! But the worst situation is worse than the previus one.  
   ● Weighted Quick Union: Why not heighted-QU? Ans: Almost same perfomance but complicated codes.  
   ● Weighted Quick Union: Let’s consider the worst case where the tree height grows as fast as possible(nice thought) --> Find worst case tree height is Θ(log N).  
   ● WeightedQuickUnionDSWithPathCompression(nice thought): On calls to connect and isConnected, set parent id to the root for all items seen.  
   ● Implementation Runtime  
     ListOfSetsDS O(NM)  
     QuickFindDS Θ(NM)  
     QuickUnionDS O(NM)  
     WeightedQuickUnionDS O(N + M log N)  
     WeightedQuickUnionDSWithPathCompression O(N + M α(N))  
     (object of size N, perform M operations)
   
`5.5`
1. Going to finish lec15, Asymptotics II.
2. Finished lec15.
3. Notes
   ###### Part1 Lec Content
   Lecture 15: Asymptotics II: Analysis of Algorithms  
   ● Review of Asymptotic Notation  
   ● Examples 1-2: For Loops  
   ● Example 3: A Basic Recurrence  
   ● Example 4: Binary Search  
   ● Example 5: Mergesort

   ###### Part2 Quick Thought
   for for review(count and geomatric) --> for for(i=i*2)(A nice way: 0.5n < count < 2n) --> Recursion(3 ways) --> Binary Search(3 ways) --> Mergsort(theta(nlog2n))

   ###### Part3 Extension
   ● C(N): Cost model, Count, Use array writes as cost model.  
   ● Two tech: 1. Intuitive(Graph or easy way), 2. Use array writes as cost model.  
   ● Recursion: 1. Intuitive(double the graph of recursion Tree), 2. C(N)(Count calls of fn, and just use formula), 3.C(N) = 2*(C(N-1)) + 1.  
   ● Binary Search: 1. Intuitive 1 = N/2^C -> C = log(N), 2. Count exact C(N) = ⌊log(N)⌋+1 --> theta(logn) (= theta(log2n)), 3. C(N) = 1 + C((N-1)/2).  
   ● Arbitrary Units(AU): Given that runtime is quadratic, for N = 64, we might say the runtime for selection sort is 4,096 arbitrary units of time.  
   ● Sum: 1 + 2 + 3 … + N = theta(N^2) and 1 + 2 + 4 + … + N = theta(N).

