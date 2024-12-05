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
            return cursor.next != null;
        }

        public int next() {
            int currentContent = cursor.content;
            cursor = cursor.next;
            return currentContent;
        }
    }

    public ListCell head;

    public Iterator iterator() {
        return new Iterator(head);
    }

    public IntList() {
        head = null;
    }

    public void addFirst(int x) {}

    public Integer getFirst() {}

    public boolean dropFirst() {}

    public void addLast(int x) {}

    public Integer getLast() {}

    public boolean dropLast() {}

    //    public void remove(int x){
    //        ListCell c= this.head;
    //        while(c!=null && c.content == x){
    //            head = c = c.next;
    //        }
    //        if(c==null)return;
    //        while(c.next != null){
    //            if(c.next.content == x){
    //                c.next = c.next.next;
    //            }else{
    //                c = c.next;
    //            }
    //        }
    //    }
    public void remove(int x) {
        if (isEmpty()) return false;
        ListCell i = this.head;
    }

    public boolean contains(int x) {
        if (isEmpty()) return false;
        ListCell i = this.head;
        do {
            if (i.content == x) return true;
            i = i.next;
        } while (i != null);
    }

    public int size() {
        if (isEmpty()) return 0;
        ListCell i = this.head;
        int count;
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
            result += " ";
            result += String.valueOf(i.content);
            i = i.next;
        } while (i != null);
        result += " ]";
        return result;
    }
}
