from collections import defaultdict

class Graph:

    def __init__(self, num):
        self.num = num
        self.graph = defaultdict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v) # {u : [v]}

    def dfs(self, vertex):
        stack = []
        #print(len(self.graph))
        visited = [False] * self.num

        stack.append(vertex)
        #visited[vertex] = True

        while stack:
            s = stack.pop()
            #
            #print(s)

            if visited[s] == False:
                print(s)
                visited[s] = True

            for i in self.graph[s]:
                if visited[i] == False:
                    stack.append(i)
                    #visited[i] = True

g = Graph(5)
g.addEdge(1,0)
g.addEdge(0,2)
g.addEdge(2,1)
g.addEdge(0,3)
g.addEdge(1,4)

g.dfs(0)
