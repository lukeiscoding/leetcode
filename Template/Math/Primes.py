# find all primes < n
def eratosthenes(n):
    q = [0] * (n + 1)
    primes = []
    for i in range(2, int(sqrt(n))):
        if q[i] != 1:
            j = i * 2
            while j <= n:
                q[j] = 1
                j += i
    for i in range(2, n):
        if q[i] == 0:
            primes.append(i)
    return primes
