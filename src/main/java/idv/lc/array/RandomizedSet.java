package idv.lc.array;

import java.util.*;

public class RandomizedSet {
    private List<Integer> sets;
    private Map<Integer, Integer> table;
    private java.util.Random rand = new java.util.Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        table = new HashMap<Integer,Integer>();
        sets = new ArrayList<Integer>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (table.containsKey(val)) {
            return false;
        }
        sets.add(val);
        table.put(val, sets.size()-1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!table.containsKey(val)) {
            return false;
        }
        int loc = table.get(val);
        if (loc < sets.size() -1 ) {//if not the last, swap the last, for compact sets
            int last = sets.get(sets.size()-1);
            sets.set(loc, last);
            table.put(last ,loc);
        }
        table.remove(val);
        sets.remove(sets.size()-1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return sets.get(rand.nextInt(sets.size()));
    }
}
