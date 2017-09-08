package medium;

import java.util.LinkedList;
import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
    	String[] wordsArray = sentence.split(" ");
        for(int i=dict.size()-1;i>=0;i--) {
        	for(int j=0;j<wordsArray.length;j++) {
        		if(wordsArray[j].contains(dict.get(i))) {
        			wordsArray[j]=dict.get(i);
        		}
        	}
        }
        
        TrieNode trieNode = buildTrie(dict);
        
        StringBuffer res = new StringBuffer();
        for(String s:wordsArray) {
        	res.append(s+" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
    
    public static void main(String[] args) {
		ReplaceWords replaceWords = new ReplaceWords();
		LinkedList<String> dict = new LinkedList<>();
		dict.add("cat");
		dict.add("bat");
		dict.add("rat");
		System.out.println(replaceWords.replaceWords(dict, "the cat was rat by the bat"));
	}
    
    private TrieNode buildTrie(List<String> dict) {
        TrieNode root = new TrieNode(' ');
        for (String word : dict) {
            TrieNode temp = root;
            for (char c : word.toCharArray()) {
                if (temp.children[c - 'a'] == null) {
                    temp.children[c - 'a'] = new TrieNode(c);
                }
                temp = temp.children[c - 'a'];
            }
            temp.isWord = true;
        }
        return root;
    }

    public class TrieNode {
        char val;
        TrieNode[] children;
        boolean isWord;

        public TrieNode(char val) {
            this.val = val;
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }    
}
