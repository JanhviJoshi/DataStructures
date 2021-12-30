'''
to find whether path exists between 2 nodes in graph
'''
from collections import defaultdict

class Graph:
    def __init__(self, num):
        self.num = num
        self.graph = defaultdict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v)

    def search(self, s, e):
        visited = [False] * self.num
        q = []

        q.append(s)
        visited[s] = True

        while q:

            curr = q.pop(0)

            if curr == e:
                return True

            for i in self.graph[curr]:
                if visited[i] == False:
                    q.append(i)
                    visited[i] = True
        return False

g = Graph(7)
g.addEdge(0,2)
g.addEdge(0,3)
g.addEdge(2,6)
g.addEdge(6,5)
g.addEdge(5,3)
g.addEdge(7,5)

print(g.search(0, 5))




                    