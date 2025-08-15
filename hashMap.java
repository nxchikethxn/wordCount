// this class attempts to take a string input and output the words within and the 
// number of times each word is repeated.
// @author Kethan Srinivasan
// collaborators: Annie Chen, Maisoon Rahman, Jessica Lim
// references: lecture notes, SI sheets
// geeks for geeks: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/


public class hashtable {
    
    private int size; // size of table
    private static hashNode[] table;
    private static int numBuckets; // entire capacity of hashtable size
    private int numItems;
    private double loadFactor = ((double)numItems / (double)size);

    private class hashNode {

        private String key; // empty entries
        private String item; // unhashed data
        private hashNode next; // pointer used when chaining
    
        hashNode(String key, String item) {
            this.key = key; 
            this.item = item;
        }
    
        // retrieves item
        public String getItem() {
            return item;
        }
    
        // retrieves key
        public String getKey() {
            return key;
        }
    
        // resets item if necessary
        public void setItem(String item) {
            this.item = item;
        }
    
        // retrieves the pointer
        public hashNode getNext() {
            return next;
        }
    
        // resets the pointer to new hashNode
        public void setNext(hashNode next) {
            this.next = next;
        }
        
    }

    public HashTable() {
        numBuckets = 0;
        table = new Entry[tableSize];
        size = 19;
        loadFactor = 0.0;
        numItems = 0;
        
        // initialize with empty chains
        for (int i= 0; i < numBuckets; i++);
        table[numBuckets] = null;
    }

    private int hash(String key) {
        return key.hashCode()%tableSize;
    }

    public void rehash () {
        int prevSize = tableSize;
        Entry[] prevTable = table;
        size = (2 * prevSize) + 3;
        table = new Entry [size];
        for (int i = 0; i <= prevSize; i++){
             if (prevTable[i] !=null) {
                Entry llnode = prevTable [i];
                while (llnode.next != null){
                    for (int j= 0; j < llnode.length; j++){
                        add(llnode);
                    }
                }
    
           
            }
        }
    }

    public void add(String s) {						
		Entry temp;
        //Splitting the String into a words
		String[] word = s.split("\\P{Alpha}+");
		for(String str: word) {
            //Creating new Entry object
			temp = new Entry(str.toLowerCase());
            //Using a helper method to add the new entry		
			addHelper(temp);
        }						
		
	}

    public static void main (String args[]){
        HashTable tester = new HashTable();
        tester.wordCount("Sometimes it becomes increasingly clear that I cannot do this.");
        tester.print();
    }
    

    
}
    
