class TrieNode {
    boolean endOfTheWord;
    TrieNode[] childrens = new TrieNode[36];
    int lcp = 0;

    TrieNode() {
        endOfTheWord = true;

        for (int i = 0; i < 36; i++) {
            childrens[i] = null;
        }
    }

    int insert(String s, TrieNode root) {
        int length = s.length();
        int index;
        int tmp_lcp = 0;

        TrieNode pCrawl = root;

        for (int i = 0; i < length; i++) {
            index = s.charAt(i) - 'a';

            if (pCrawl.childrens[index] == null) {
                pCrawl.childrens[index] = new TrieNode();
            } else {
                tmp_lcp++;
            }

            pCrawl = pCrawl.childrens[index];
        }
        pCrawl.endOfTheWord = true;

        if (root.lcp > tmp_lcp) {
            root.lcp = tmp_lcp;
        }

        return lcp;
    }
}

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        TrieNode root = new TrieNode();

        for (int i = 0; i < length; i++) {
            root.insert(strs[i], root);

            if (i == 0) {
                root.lcp = strs[i].length();
            }
        }

        return (String) strs[0].subSequence(0, root.lcp);
    }
}

public class LCP {
    public static void main(String[] args) {
        String[] strs = new String[] { "ab", "a" };

        System.out.println(Solution.longestCommonPrefix(strs));
    }
}