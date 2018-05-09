package idv.lc.trie;


class Trie {
    
    public static final int N = 26;
    
    class TrieNode {
        TrieNode[] children = new TrieNode[N];
        boolean isLeaf = false;
    }
    
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    private int charToIdx(char c) {
        return c - 'a';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.children[charToIdx(c)]==null){
                curr.children[charToIdx(c)] = new TrieNode();
            }
            curr = curr.children[charToIdx(c)];
        }
        curr.isLeaf = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.children[charToIdx(c)]==null){
                return false;
            }
            curr = curr.children[charToIdx(c)];
        }
        if (curr.isLeaf) {
            return true;
        } else {
            return false;
        }
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char c : prefix.toCharArray()){
            if(curr.children[charToIdx(c)]==null){
                return false;
            }
            curr = curr.children[charToIdx(c)];
        }
        return true;
    }
}
