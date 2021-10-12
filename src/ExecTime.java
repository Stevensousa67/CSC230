 class ExecTime
        {
            public static void main(String[] args) throws InterruptedException
            {
                int n = 1000000000;
                long startTime = System.nanoTime();
                for(int i= 0; i<n; i++) {
                }
                long endTime = System.nanoTime();
                long timeElapsed = endTime - startTime;

                System.out.println("Execution time in nanoseconds: " + timeElapsed);
                System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
            }
        }