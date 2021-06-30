package com.codegym;

public class Main {

    public static void main(String[] args) {
	LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization("Check1");
	lazyPrimeFactorization.start();
	OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization("check2");
	optimizedPrimeFactorization.start();
    }
}
