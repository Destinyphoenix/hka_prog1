public class IntListTest {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    private static int nrFailed = 0;
    private static int nrPassed = 0;

    public static void main(String[] args) {

        final int LINE_WIDTH = 60;

        System.out.println("-".repeat(LINE_WIDTH) + "\nG1:  getFirst / getLast / dropFirst / dropLast");
        test_g1_t1();
        test_g1_t2();
        test_g1_t3();
        test_g1_t4();
        test_g1_t5();
        test_g1_t6();

        System.out.println("-".repeat(LINE_WIDTH) + "\nG2: addFirst / addLast");
        test_g2_t1();
        test_g2_t2();
        test_g2_t3();
        test_g2_t4();
        test_g2_t5();

        System.out.println("-".repeat(LINE_WIDTH) + "\nG3: remove");
        test_g3_t1();
        test_g3_t2();
        test_g3_t3();
        test_g3_t4();
        test_g3_t5();

        System.out.println("-".repeat(LINE_WIDTH) + "\nG4: toString");
        test_g4_t1();
        test_g4_t2();

        System.out.println("-".repeat(LINE_WIDTH) + "\nG5: isEmpty / size");
        test_g5_t1();
        test_g5_t2();

        System.out.println("-".repeat(LINE_WIDTH) + "\nG6: iterator");
        test_g6_t1();
        test_g6_t2();

        System.out.println("-".repeat(LINE_WIDTH) + "\nG7: contains");
        test_g7_t1();
        test_g7_t2();

        System.out.println("-".repeat(LINE_WIDTH));
        printSummary();
    }

    static void assertEquals(String testName, Object result, Object expected) {
        boolean ok = ((result == null && expected == null) ||
                (result != null && result.equals(expected)));
        if (ok) {
            System.out.println(testName + ": " + ANSI_GREEN + "ok" + ANSI_RESET);
            nrPassed++;
        } else {
            System.out.println(testName + ": " + ANSI_RED + "failed: expected " + expected + ", got: " + result + ANSI_RESET);
            nrFailed++;
        }
    }

    static void assertCond(String message, boolean condition) {
        System.out.print(message + ": ");
        if (condition) {
            System.out.println(ANSI_GREEN + "ok" + ANSI_RESET);
            nrPassed++;
        } else {
            System.out.println(ANSI_RED + "failed" + ANSI_RESET);
            nrFailed++;
        }
    }

    public static void printSummary() {
        String color = (nrFailed == 0 ? ANSI_GREEN : ANSI_RED);
        System.out.println("Summary: " + color + nrPassed + " test(s) passed, " + nrFailed + " test(s) failed." + ANSI_RESET);
    }

    /*****
     * Tests start here
     *****/

    /*** General methods ***/

    public static IntList generateEmptyList() {
        return new IntList();
    }

    public static IntList generateOneElementList(int x) {
        IntList l = new IntList();
        l.addFirst(x);
        return l;
    }

    public static IntList generateThreeElementList(int x, int y, int z) {
        IntList l = new IntList();
        l.addFirst(z);
        l.addFirst(y);
        l.addFirst(x);
        return l;
    }

    /*** Tests for getFirst / getLast / dropFirst / dropLast ***/

    public static void test_g1_t1() {
        IntList l = generateEmptyList();
        assertEquals("G1_T1 (getFirst of empty list)", l.getFirst(), null);
    }

    public static void test_g1_t2() {
        IntList l = generateOneElementList(34);
        assertEquals("G1_T2 (getFirst of one element list)", l.getFirst(), 34);
    }

    public static void test_g1_t3() {
        IntList l = generateOneElementList(45);
        assertEquals("G1_T3 (getLast of one element list)", l.getLast(), 45);
    }

    public static void test_g1_t4() {
        IntList l = generateOneElementList(99);
        assertEquals("G1_T4_1 (dropLast of one element list)", l.dropLast(), true);
        assertCond("G1_T4_2 (dropLast of one element list)", l.isEmpty());

    }

    public static void test_g1_t5() {
        IntList l = generateEmptyList();
        assertEquals("G1_T5_1 (dropLast of empty list)", l.dropLast(), false);
        assertCond("G1_T5_2 (dropLast of empty list)", l.isEmpty());
    }

    public static void test_g1_t6() {
        IntList l = generateEmptyList();
        assertEquals("G1_T7_1 (get last of empty list)", l.getLast(), null);
        l.addLast(44);
        l.addFirst(124);
        assertEquals("G1_T7_2 (get last of two elements list)", l.getLast(), 44);
    }

    /*** addFirst / addLast tests ***/

    public static void test_g2_t1() {
        IntList l = generateEmptyList();
        l.addFirst(123);
        assertEquals("G2_T1_1 (addFirst to empty list)", l.getFirst(), 123);
        l.dropLast();
        assertEquals("G2_T1_2 (addFirst, then drop last)", l.isEmpty(), true);
    }

    public static void test_g2_t2() {
        IntList l = generateEmptyList();
        l.addLast(123);
        assertEquals("G2_T2_1 (addLast to empty list)", l.getFirst(), 123);
        l.dropLast();
        assertEquals("G2_T2_2 (addLast, then drop last)", l.isEmpty(), true);
    }

    public static void test_g2_t3() {
        IntList l = generateEmptyList();
        for (int i = 1; i <= 4; i++)
            l.addFirst(i);
        int i;
        for (i = 1; i <= 4; i++) {
            assertEquals("G2_T3_" + i + " (repeated addFirst)", l.getFirst(), 5 - i);
            l.dropFirst();
        }
        assertEquals("G2_T3_" + i + " (repeated addFirst)", l.isEmpty(), true);
    }

    public static void test_g2_t4() {
        IntList l = generateEmptyList();
        for (int i = 1; i <= 4; i++)
            l.addLast(i);
        int i;
        for (i = 1; i <= 4; i++) {
            assertEquals("G2_T3_" + i + " (repeated addLast)", l.getFirst(), i);
            l.dropFirst();
        }
        assertEquals("G2_T3_" + i + " (repeated addLast)", l.isEmpty(), true);
    }

    public static void test_g2_t5() {
        IntList l = generateEmptyList();
        for (int i = 10; i > 0; i--) {
            if (i % 2 == 0)
                l.addLast(i);
            else
                l.addFirst(i);
        }
        int i;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                assertEquals("G2_T3_" + i + " (repeated addFirst and addLast)", l.getLast(), i);
                l.dropLast();
            } else {
                assertEquals("G2_T3_" + i + " (repeated addFirst and addLast)", l.getFirst(), i);
                l.dropFirst();
            }
        }
        assertEquals("G2_T3_" + i + " (repeated addFirst and addLast)", l.isEmpty(), true);
    }

    /*** remove tests ***/

    public static void test_g3_t1() {
        IntList l = generateEmptyList();
        l.remove(0);
        assertEquals("G3_T1 (remove from empty list)", l.isEmpty(), true);
    }

    public static void test_g3_t2() {
        IntList l = generateOneElementList(17);
        l.remove(17);
        assertEquals("G3_T2_1 (remove from one-element list)", l.isEmpty(), true);

        l = generateThreeElementList(17, 17, 17);
        l.remove(17);
        assertEquals("G3_T2_2 (remove from three element list)", l.isEmpty(), true);

        l = generateThreeElementList(17, 18, 19);
        l.remove(17);
        assertEquals("G3_T2_3 (remove from three element list)", l.size(), 2);

        l = generateThreeElementList(17, 17, 19);
        l.remove(17);
        assertEquals("G3_T2_4 (remove from three element list)", l.size(), 1);
    }

    public static void test_g3_t3() {
        IntList l = generateThreeElementList(17, 18, 19);
        l.remove(20);
        assertEquals("G3_T3_1 (remove from three element list)", l.size(), 3);

        l = generateThreeElementList(17, 18, 19);
        l.remove(18);
        assertEquals("G3_T3_2 (remove from three element list)", l.size(), 2);
        assertEquals("G3_T3_3 (remove from three element list)", l.getFirst(), 17);
        assertEquals("G3_T3_4 (remove from three element list)", l.getLast(), 19);
    }

    public static void test_g3_t4() {
        IntList l = generateThreeElementList(2,3,4);
        l.addLast(4); l.addLast(5); l.addLast(4); l.addLast(1);
        l.remove(4);
        assertEquals("G3_T4_1 (remove from long list)", l.size(), 4);
        assertEquals("G3_T4_2 (remove from long list)", l.getLast(), 1);
    }

    public static void test_g3_t5() {
        IntList l = generateThreeElementList(2,3,4);
        l.addLast(4); l.addLast(5); l.addLast(4); l.addLast(1);
        l.remove(7);
        assertEquals("G3_T5_1 (remove non-existing element from long list)", l.size(), 7);
        assertEquals("G3_T5_2 (remove non-existing element from long list)", l.getLast(), 1);
    }

    /*** toString tests ***/

    public static void test_g4_t1() {
        IntList l = generateEmptyList();
        assertEquals("G4_T1 (toString for empty list)", l.toString(), "[]");
    }

    public static void test_g4_t2() {
        IntList l = generateThreeElementList(1,-5,19);
        assertEquals("G4_T2 (toString for three element list)", l.toString(), "[1, -5, 19]");
    }

    /*** isEmpty / size tests ***/

    public static void test_g5_t1() {
        IntList l = generateEmptyList();
        assertEquals("G5_T1_1 (isEmpty for empty list)", l.isEmpty(), true);
        assertEquals("G5_T1_2 (size of empty list)", l.size(), 0);
    }

    public static void test_g5_t2() {
        IntList l = generateThreeElementList(100, 101, 102);
        assertEquals("G5_T2_1 (isEmpty for three element list)", l.isEmpty(), false);
        assertEquals("G5_T2_2 (size of three element list)", l.size(), 3);
    }

    /*** iterator tests ***/

    public static void test_g6_t1() {
        IntList l = generateEmptyList();
        IntList.Iterator it = l.iterator();
        assertEquals("G6_T1 (iterator for empty list)", it.hasNext(), false);
    }

    public static void test_g6_t2() {
        IntList l = generateThreeElementList(-3, -2, -1);
        IntList.Iterator it = l.iterator();
        int count = 1;
        int expected = -3;
        while (it.hasNext()) {
            int x = it.next();
            assertEquals("G6_T2_" + count + "(iterator for three element list)", x, expected);
            expected++;
            count++;
        }
        assertEquals("G6_T2_4 (iterator for three element list)", it.hasNext(), false);
    }

    /*** contains tests ***/

    public static void test_g7_t1() {
        IntList l = generateEmptyList();
        assertEquals("G7_T1 (contains for empty list)", l.contains(77), false);
    }

    public static void test_g7_t2() {
        IntList l = generateThreeElementList(7, 9, 100);
        assertEquals("G7_T2_1 (contains for three element list)", l.contains(0), false);
        assertEquals("G7_T2_2 (contains for three element list)", l.contains(100), true);
        l = generateThreeElementList(100,7,9);
        assertEquals("G7_T2_3 (contains for three element list)", l.contains(100), true);
        l = generateThreeElementList(7,100,9);
        assertEquals("G7_T2_4 (contains for three element list)", l.contains(100), true);
        l = generateThreeElementList(0,100,100);
        assertEquals("G7_T2_5 (contains for three element list)", l.contains(100), true);
    }
}
