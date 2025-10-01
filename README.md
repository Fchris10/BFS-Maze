# BFS-Maze
Solver Maze using the Breadth-First Search (BFS) algorithm.
--- 
# What is BFS?
Breadth-First Search (BFS) is an algorithm for traversing or searching tree and graph data structures.
It explores all neighbors of a node before moving to nodes at the next depth level.

It is particularly useful for:

1. Finding the shortest path in an unweighted graph
2. Systematically exploring all possible solutions to a problem

In this project, the maze is treated as a graph: every free cell is a node, and the allowed moves (up, down, left, right) are edges.

For more details --> https://en.wikipedia.org/wiki/Breadth-first_search
---
# 🛠️ Code Structure

- **maze** → represents the maze

- **startX, startY** → starting coordinates

- **endX, endY** → ending coordinates

- **solveMaze()** → main solver logic

- **recursiveSolve()** → pathfinding algorithm implementation

