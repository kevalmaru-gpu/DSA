public class Tries {
    int alphabateSize = 36;
    boolean isEndOfTheWord;
    Tries[] childrens = new Tries[alphabateSize];
    static Tries root = new Tries();

    Tries() {

        isEndOfTheWord = false;
        for (int i = 0; i < alphabateSize; i++) {
            childrens[i] = null;
        }
    }

    void insert(String word) {
        Tries pCrawl = root;
        int length = word.length();
        int index;

        for (int i = 0; i < length; i++) {
            // Character index
            index = word.charAt(i) - 'a';

            // If its present
            if (pCrawl.childrens[index] == null) {
                // If not then new node
                pCrawl.childrens[index] = new Tries();
            }

            pCrawl = pCrawl.childrens[index];
        }

        // End of the word
        pCrawl.isEndOfTheWord = true;
    }

    boolean search(String word) {
        int index;
        int length = word.length();
        Tries PCrawl = root;

        for (int i = 0; i < length; i++) {
            index = word.charAt(i) - 'a';

            if (PCrawl.childrens[index] == null) {
                return false;
            }

            PCrawl = PCrawl.childrens[index];
        }

        return PCrawl.isEndOfTheWord;
    }

    public static void main(String[] args) {
        root.insert("keval");
        System.out.println(root.search("keval"));
    }
}
