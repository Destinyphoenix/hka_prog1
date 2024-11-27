class IntListApp {
    public static void main(String[] args) {

        // Build list with five elements.
        IntList list = new IntList();
        for (int i = 5; i > 0; i--) {
            list.addFirst(i);
        }
       
        // Print it.
        System.out.println("list: " + list);
        System.out.println("is list empty? " + (list.isEmpty() ? "yes" : "no"));
        System.out.println("list size: " + list.size());
        System.out.println("contains 4? " + (list.contains(4) ? "yes" : "no"));
        
        // Print the numbers in the list and their squares.
        System.out.println("squares:");
        IntList.Iterator it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            System.out.println(String.format("%4d %4d", x, x*x));
        }
        
        // Remove elements, then print again.
        list.remove(4);
        System.out.println("list after removing 4: " + list);
        list.remove(1);
        System.out.println("list after removing 1: " + list);
        list.remove(5);
        list.remove(2);
        list.remove(3);
        System.out.println("list after removing 5, 2 and 3: " + list);
        
        // Reverse the list and print it again.
        list.addLast(12);
        list.addFirst(13);
        list.addLast(11);
        list.addFirst(14);
        System.out.println("list after adding 11, 12, 13 and 14: " + list);
        list.reverse();
        System.out.println("reversed list: " + list);
        
        // Elements of the list should now be ascending
        it = list.iterator();
        boolean ascending = true;
        int last = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int current = it.next();
            if (current < last) {
                ascending = false;
                break;
            }
            last = current;
        }
        System.out.println("List is ascending: " + (ascending ? "ok" : "failed!"));
        
    }
}