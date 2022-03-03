class Solution(object):
    def fib(self, N):
        dp = [0, 1] + [0] * (N-1)
        for i in range(2, N+1):
            dp[i] = (dp[i-1] + dp[i-2])
        return dp[N]
