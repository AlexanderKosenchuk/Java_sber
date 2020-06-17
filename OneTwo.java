class OneTwo {
    private int[] arr;


    public OneTwo(int arr[]) {
        this.arr = arr;

    }

    public void add(int x) {
        int[] msv1 = new int[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = msv1[i];
        }
        msv1[arr.length - 1] = x;
    }

    public void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print(" ");
    }

    public int elements() {
        return arr.length;
    }


}


