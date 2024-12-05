package Blatt_5;

class IntList {

    private class ListCell {

        int content;
        ListCell next;

        ListCell(int x, ListCell n) {
            this.content = x;
            this.next = n;
        }
    }

    public class Iterator {

        private ListCell cursor;

        private Iterator(ListCell start) {
            cursor = start;
        }

        public boolean hasNext() {
            if (isEmpty()) return false;
            return cursor.next != null;
        }

        public int next() {
            int currentContent = cursor.content;
            cursor = cursor.next;
            return currentContent;
        }
    }

    private ListCell head;

    public Iterator iterator() {
        return new Iterator(head);
    }

    public IntList() {
        head = null;
    }

    public void addFirst(int x) {
        this.head = new ListCell(x, this.head);
    }

    public Integer getFirst() {
        if (isEmpty()) return null;
        return head.content;
    }

    public boolean dropFirst() {
        if (isEmpty()) return false;
        this.head = this.head.next;
        return true;
    }

    public void addLast(int x) {
        if (isEmpty()) {
            this.head = new ListCell(x, null);
            return;
        }
        ListCell i = this.head;
        while (i.next != null) {
            i = i.next;
        }
        i.next = new ListCell(x, null);
    }

    public Integer getLast() {
        if (isEmpty()) return null;
        ListCell i = this.head;
        while (i.next != null) {
            i = i.next;
        }
        return i.content;
    }

    public boolean dropLast() {
        if (isEmpty()) return false;
        ListCell i = this.head;
        //if its only one item on the List
        if (i.next == null) {
            this.head = null;
            if (isEmpty()) return true;
        }
        while (i.next.next != null) {
            i = i.next;
        }
        i.next = null;
        return true;
    }

    public void remove(int x) {
        if (isEmpty()) return;
        ListCell i = this.head;
        // if first item
        while (head.content == x) {
            // if only one item on List .next should be null
            this.head = head.next;
            if (isEmpty()) return;
        }
        do {
            if (i.next.content == x) {
                i.next = i.next.next;
            } else {
                i = i.next;
            }
        } while (i.next != null);
    }

    public boolean contains(int x) {
        if (isEmpty()) return false;
        ListCell i = this.head;
        do {
            if (i.content == x) return true;
            i = i.next;
        } while (i != null);
        return false;
    }

    public int size() {
        if (isEmpty()) return 0;
        ListCell i = this.head;
        int count = 0;
        do {
            count++;
            i = i.next;
        } while (i != null);
        return count;
    }

    boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        ListCell i = this.head;
        String result = "[";
        do {
            if(i.next != null) {
                result += String.valueOf(i.content);
                result += ", ";
            }else{

                result += String.valueOf(i.content);
            }

            i = i.next;
        } while (i != null);
        result += "]";
        return result;
    }
}
