class Diff2d(object):

    def __init__(self, grid):
        self.m = len(grid)
        self.n = len(grid[0])
        self.diff = [[0] * (n + 1) for _ in range(m + 1)]
        self.f = [[0] * (n + 1) for _ in range(m + 1)]

    def set(self, x0, y0, x1, y1, val):
        self.diff[x0][y0]+=val
        self.diff[x0][y1+1]-=val
        self.diff[x1+1][y0]-=val
        self.diff[x1+1][y1+1]+=val

    def compute(self):
        self.f[0][0] = self.diff[0][0]
        for i in range(self.m):
            for j in range(self.n):
                a = 0 if i==0 else self.f[i-1][j]
                b = 0 if j==0 else self.f[i][j-1]
                c = 0 if (i==0 or j==0) else self.f[i-1][j-1]            
                self.f[i][j] = a + b - c + self.diff[i][j]
