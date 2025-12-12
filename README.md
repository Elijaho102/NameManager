The Name Management System is a simple Java console application that allows users to store, view, sort, search, and compare names using different data structures. It demonstrates core programming concepts including:

Object-oriented design

User input handling

Searching and sorting

Data structure performance comparison

The system runs in a loop, allowing users to choose operations from a menu until they decide to exit.

Features
1. Add Name

Allows the user to input a new name.
Names are stored using the Namestore class.

2. View Names

Displays the current list of all stored names.

3. Sort Names

Uses the Sorter class to apply sorting algorithms to the name list.
(The specific sorting algorithms depend on your Sorter implementation.)

4. Search Name

Uses the Searcher class to find a name in the list.
(Search method depends on your Searcher implementation.)

5. Compare Data Structures

Compares performance or behavior of storing names in different data structures (e.g., ArrayList vs TreeList).
This feature is handled inside Namestore.compareStructures().

6. Exit

Ends the program.



Class Responsibilities
Namemanager:
Controls program flow
Displays menu
Interacts with user via Scanner
Calls methods from other classes (Namestore, Sorter, Searcher)

Namestore:
Stores the list of names
Adds names
Displays names
Provides the name list to other classes
Contains logic for comparing data structures

Sorter:
Sorts the list of names using various algorithms
Accepts user input for sorting choices

Searcher:
Searches for names in the list
Allows the user to choose a search method
