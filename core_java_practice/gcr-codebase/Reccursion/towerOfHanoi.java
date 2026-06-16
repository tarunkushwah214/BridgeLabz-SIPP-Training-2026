class towerOfHanoi {

    static void towerOfHanoi(int n, char src, char helper, char dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }
    public static void main(String[] args) {
        int N = 3;
        towerOfHanoi(N, 'A', 'B', 'C');
    }
}