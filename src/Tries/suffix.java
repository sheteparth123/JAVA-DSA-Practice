package Tries;

public class suffix {
    public static void main(String[] args) {
        String[] words = {"jumping", "running", "walking", "king", "ring"};
        ReverseTrie
    }
    static class TrieNode{
        TrieNode[] children=TrieNode[26];
        int count=0;
    }
    static class revereseTrie{
        TrieNode root=new TrieNode();
        void inserrt(String word){
            TrieNode node=root;
            for(int i=word.length()-1;i>=0;i--){
                int idx=word.charAt(i)-'a';
                if(node.children[idx]==null){
                    node.children=new TrieNode();
                    node.count++;
                }
            }
        }
        int query(String suffix){
            TrieNode node=root;
            for(int i=suffix.length()-1;i>=0;i--){
                int idx=suffix.charAt(i)-'a';
                if(node.children[idx]==null) return 0;
            }
        }

    }
}
