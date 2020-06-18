class OneTwo {
     int[] arr;


    public OneTwo(int [] arr) {
        this.arr = arr;

    }

    public void add(int x) {
        int[] msv1 = new int[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            msv1[i] = arr[i];
        }
        msv1[arr.length] = x;
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

    public void deleteElement(int index) {
        int [] msvDel = new int [arr.length - 1];
        for (int i = 0; i < index; i++) {
            msvDel[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            msvDel[i - 1] = arr[i];
        }



    }

    public int minimal(){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int maximal(){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}


