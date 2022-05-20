package traversal;

public class AreaTransition {
    public AreaTransition next;
    //AreaTransition next;
    AreaTransition prev;

    public AreaTransition(AreaTransition next, AreaTransition prev) {
        this.next = next;
        this.prev = prev;
    }

}
