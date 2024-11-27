class IntList {
    
    private class ListCell {
        int content;
        ListCell next;
        
        ListCell(int x, ListCell n) {
            this.content = x;
            this.next = n;
        }
    }
    
    public ListCell head;
    
    public IntList() {
        head = null;
    }
    
    public void addFirst(int x) {
        // ...
    }

    public Integer getFirst() {
        // ...
    }

    public boolean dropFirst() {
        // ...
    }

    public void addLast(int x) {
        // ...
    }

    public Integer getLast() {
        // ...
    }

    public boolean dropLast() {
        // ...
    }
    
    public void remove(int x) {
        // remove all list elements where content is equal to x
        // ... 
    }
    
    public boolean contains(int x) {
        // ...
    }
    
    public int size() {
        // ...
    }
    
    boolean isEmpty() {
        // ...
    }
}