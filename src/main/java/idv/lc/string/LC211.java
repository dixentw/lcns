package idv.lc.string;

import java.util.*;

public class LC211 {

    /** Initialize your data structure here. */
    class Trie {
        Trie[] children;
        boolean end;
        public Trie () {
            children = new Trie[26];
            end = false;
        }
    }

    Trie root;
    public LC211() {
        root = new Trie();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Trie node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c-'a']==null) {
                node.children[c-'a'] = new Trie();
            }
            node = node.children[c-'a'];
        }
        node.end = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return helper(word, 0, root);
    }
    public boolean helper(String word, int level, Trie node) {
        if (level==word.length()) return node.end;
        if (word.charAt(level) == '.') {
            for (Trie n : node.children) {
                if (n!=null && helper(word, level+1, n)) return true;
            }
            return false;
        } else {
            return node.children[word.charAt(level)-'a'] != null && helper(word, level+1, node.children[word.charAt(level)-'a']);
        }
    }
}
