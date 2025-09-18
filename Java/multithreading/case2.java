class Task {
    public synchronized void m1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("m1 method is executing" + Thread.currentThread().getName());
        }
    }
    
    public synchronized void m2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("m1 method is executing" + Thread.currentThread().getName());
        }
    }
}

class First extends Thread {
    private Task Task;

    public First(Task Task) {
        this.Task = Task;
    }

    public void run() {
        // System.out.println(Thread.currentThread().getName());
        Task.m1();
    }
}

class Second extends Thread {
    private Task Task;

    public Second(Task t) {
        this.Task = t;
    }

    public void run() {
        // System.out.println(Thread.currentThread().getName());
        Task.m2();
    }
}

class case2 {
    public static void main(String[] args) {
        Task Task1 = new Task();
        First t1 = new First(Task1);
        t1.setName("thread-1");
        Second t2 = new Second(Task1);
        t2.setName("thread-2");
        t1.start();
        t2.start();
    }
}