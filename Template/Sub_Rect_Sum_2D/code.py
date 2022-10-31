class RegionSum:

    def __init__(self, grid):
        m = len(grid)
        n = len(grid[0])
        self.presum = [[0] * n for _ in range(m)]
        for i in range(m):
            for j in range(n):
                a = 0 if i==0 else self.presum[i-1][j]
                b = 0 if j==0 else self.presum[i][j-1]
                c = 0 if (i==0 or j==0) else self.presum[i-1][j-1]
                self.presum[i][j] = a + b - c + grid[i][j]

    def query(self, i, j, x, y):
        a = 0 if j==0 else self.presum[x][j-1]
        b = 0 if i==0 else self.presum[i-1][y]
        c = 0 if (i==0 or j==0) else self.presum[i-1][j-1]
        area = self.presum[x][y] - a - b + c
        return area
