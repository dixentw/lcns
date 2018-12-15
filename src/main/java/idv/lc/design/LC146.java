package idv.lc.design;

import java.util.*;

class DListNode {
    int key, val;
    DListNode prev, next;
    public DListNode(int k, int v) {
        this.key = k;
        this.val = v;
    }
}

public class LC146 {
    Map<Integer, DListNode> store;
    DListNode head, tail;
    int capacity;

    public LC146(int capacity) {
        this.capacity = capacity;
        store = new HashMap<>();
        head = new DListNode(0, 0);
        tail = new DListNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!store.containsKey(key)) {
            return -1;
        }
        DListNode curr = store.get(key);
        //move it the head of list
        deleteFromList(curr);
        addToHead(curr);
        return curr.val;
    }

    public void put(int key, int value) {
        if (store.containsKey(key)) {
            DListNode n = store.get(key);
            n.val = value;
            deleteFromList(n);
            addToHead(n);
        } else {
            DListNode curr = new DListNode(key, value);
            if (store.size() == capacity) {
                store.remove(tail.prev.key);
                deleteFromList(tail.prev);
            }
            addToHead(curr);
            store.put(key, curr);
        }
    }
    private void deleteFromList(DListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void addToHead(DListNode node) {
        node.prev = head;
        node.next = head.next;
        head.next = node;
        node.next.prev = node;
    }
}
