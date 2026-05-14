// Trie Data Structure
public class DS_37_Trie {
    class TrieNode {
        java.util.Map<Character, TrieNode> children = new java.util.HashMap<>();
        boolean isEndOfWord = false;
    }
    
    private TrieNode root = new TrieNode();
    
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node = node.children.computeIfAbsent(c, k -> new TrieNode());
        }
        node.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node = node.children.get(c);
            if (node == null) return false;
        }
        return node.isEndOfWord;
    }
    
    public static void main(String[] args) {
        DS_37_Trie trie = new DS_37_Trie();
        trie.insert("hello");
        trie.insert("world");
        trie.insert("help");
        
        System.out.println("Search 'hello': " + trie.search("hello"));
        System.out.println("Search 'hell': " + trie.search("hell"));
        System.out.println("Search 'world': " + trie.search("world"));
        System.out.println("Search 'wor': " + trie.search("wor"));
    }
}
