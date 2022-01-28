class Trie {
    
    private TrieNode root;
    
    class TrieNode{
    
       private TrieNode[] children;
       private boolean isWord = false;
        
        public TrieNode(){
            children = new TrieNode[26];
            isWord = false;
        }
    }
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        int index;
        TrieNode current = root;
        
        for(int i = 0; i < word.length(); i++){
            index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;
        int index;
        
        for(int i = 0; i < word.length(); i++){
            index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return current.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        int index;
        
        for(int i = 0; i < prefix.length(); i++){
            index = prefix.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
