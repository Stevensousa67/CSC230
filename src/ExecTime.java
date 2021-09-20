 class ExecTime
        {
            public static void main(String[] args) throws InterruptedException
            {
                long startTime = System.nanoTime();
                int n = 1000000000;
                for(int i= 1; i<n; i*=2) {
                    for(int j = 1; j < n; j++){

                    }
                }

                long endTime = System.nanoTime();
                long timeElapsed = endTime - startTime;

                System.out.println("Execution time in nanoseconds: " + timeElapsed);
                System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
            }
        }