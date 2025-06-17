class Solution {
    static final int MOD = 1_000_000_007;
    long[] fact, invFact;

    // Precompute factorials and inverses up to n
    void init(int n) {
        fact = new long[n+1];
        invFact = new long[n+1];
        fact[0] = 1;
        for(int i = 1; i <= n; i++){
            fact[i] = fact[i-1] * i % MOD;
        }
        invFact[n] = modPow(fact[n], MOD - 2);
        for(int i = n; i > 0; i--){
            invFact[i-1] = invFact[i] * i % MOD;
        }
    }

    long modPow(long a, long e) {
        long res = 1;
        while(e > 0){
            if((e & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            e >>= 1;
        }
        return res;
    }

    long nCk(int n, int k){
        if(k < 0 || k > n) return 0;
        return fact[n] * invFact[k] % MOD * invFact[n - k] % MOD;
    }

    public int countGoodArrays(int n, int m, int k) {
        init(n);
        long ways = (long)m * modPow(m - 1, n - 1 - k) % MOD;
        ways = ways * nCk(n - 1, k) % MOD;
        return (int) ways;
    }
}
