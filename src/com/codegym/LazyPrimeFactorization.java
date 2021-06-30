package com.codegym;

public class LazyPrimeFactorization extends SoNguyenTo {
    public LazyPrimeFactorization(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            int number = 10;
            int count = 0;
            int n = 2;
            while (count < number) {
                boolean Check = true;
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        Check = false;
                        break;
                    }
                }
                if (Check) {
                    count++;
                    System.out.println("LazyPrimeFactorization: " + n);
                }
                n++;
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }


}

