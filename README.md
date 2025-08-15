# About This Repository:
The following code provided was a collaboratory effort in the class "Introduction to Data Structures" (CSDS 233) at CWRU.

# wordCount
Method using hashTable with separate chaining

# Assumptions for Simplicity
- The method is not case-sensitive, meaning that “CSDS” and “csds” are the same.
- A word is defined to be a string between 2 non-alphabetical characters, which include but not limited to space, punctuations, ‘\t’, ‘\n’, hyphens, underscores, parentheses, etc.

# General procedures:
- Split the input string into a list of strings based on non-alphabetical characters. To do this, you
can use the method String.split(“\\P{Alpha}+”)
- For each word, search if it is already in the hash table or not. If it is not, add a new entry with
an initial frequency of 1. If it is, update the frequency.
- If a new entry is added, check if the table needs to be expanded.
- After scanning the entire list of words, loop through the hash table and print out the list of
words and their frequencies in any order.

# Feedback and Contributions
Any contributions or crticism to enhance functionality are welcome. Please open an issue or pull request.
