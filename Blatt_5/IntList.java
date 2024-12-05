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
        private Iterator (ListCell start) {
            cursor = start;
        }
        public boolean hasNext() {
            return cursor.next != null;
        }
        public int next(){
            int currentContent = cursor.content;
            cursor = cursor.next;
            return currentContent;
        }

    }

    
    public ListCell head;

    public Iterator iterator(){
        return new Iterator(head);
    }

    public IntList() {
        head = null;
    }
    
    public void addFirst(int x) {
        ListCell first = new ListCell(x,head);
        head = first;
    }


    public Integer getFirst() {
        if (head == null) return null;
        return this.head.content;
    }

    public boolean dropFirst() {
       if(this.head.next == null){
           return false;
       }
       head = head.next;
       return true;
    }

    public void addLast(int x) {
        ListCell i= this.head;
        if(head == null){
            head = new ListCell(x,null);
            return;
        }
        while(i.next != null){
            i = i.next;
        }
        i.next = new ListCell(x, null);
    }

    public Integer getLast() {
        ListCell i= this.head;
        if(head==null) return null;
        while(i.next != null){
            i = i.next;
        }
        return i.content;
    }


    public boolean dropLast() {
        ListCell i= this.head;
        if(head == null){
            return false;
        }
        if(i.next == null){
            head = null;
            return true;
        }
        while(i.next.next != null){
            i = i.next;
        }
        i.next = null;
        return true;
    }

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
        ListCell i= this.head;
        if(head == null){return;}
        if(i.content == x && i.next == null){
           head = null;
        }

       while(i.next != null){
           if(i.next.content == x){
               if(i.next.next == null){
                   i.next = null;
               }else{
                   i.next = i.next.next;
               }
           }else{
               i = i.next;
           }
        }
    }
    
    public boolean contains(int x) {
        ListCell i= this.head;
        while(i.next != null){
           if(i.content == x){
               return true;
           }
           i = i.next;
        }
        return false;
    }
    
    public int size() {
        ListCell i= this.head;
        int count = 0;
        if(head == null){return count;}
        while(i.next != null){
           i = i.next;
           count++;
        }
        return count;

    }
    
    boolean isEmpty() {
        return this.head == null;
    }
    @Override
    public String toString() {
        ListCell i= this.head;
        if(head == null){return "[]";}
        String result = "[";

        while(i.next != null){
            result+=" ";
           result+= String.valueOf(i.content);
           i = i.next;
        }
        result+=" ]";
        return result;
    }
}