# Ford-Fulkerson Algorithm Implementation
## Built using Java 1.8

This application was built as partial completion of my 
second year reading for the B.Eng. (Hons) Software Engineering degree, from the 
University of Westminster.

## Application Background 
The Ford–Fulkerson method or Ford–Fulkerson algorithm (FFA) is a greedy algorithm that computes the maximum flow in a flow network. 
It is sometimes called a "method" instead of an "algorithm" as the approach to finding augmenting paths in a residual graph is not fully specified
or it is specified in several implementations with different running times. It was published in 1956 by L. R. Ford Jr. and D. R. Fulkerson.
The name "Ford–Fulkerson" is often also used for the Edmonds–Karp algorithm, which is a fully defined implementation of the Ford–Fulkerson method.

This implementation uses the Breadth-first search (BFS) along with the FFA for node visiting.

### Ideology
As long as there is a path from the source (start node) to the sink (end node), 
with available capacity on all edges in the path, we send flow along one of the paths. 
Then we find another path, and so on. A path with available capacity is called an augmenting path.

## Indexed in Turn-It In Global Referencing Scheme

***This project should not be used for any coursework related activity and all codes have been submitted 
to `Turn-It In global referencing platform`, where usage of this code may be caught for Plagiarism.***
