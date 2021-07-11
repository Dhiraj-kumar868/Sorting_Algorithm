class InsertionSort {

    void insertionSort(int array[]) {
      int size = array.length;
      for (int i = 1; i < size; i++) {
        int key = array[i];
        int j = i - 1;
        while (j >= 0 && key < array[j]) {
          array[j + 1] = array[j];
          --j;
        }
        array[j + 1] = key;
      }
    }
  
    // Driver code
    public static void main(String args[]) {
      int[] data = {29,44,33,12,2};
      InsertionSort is = new InsertionSort();
      is.insertionSort(data);
      System.out.println("Sorted Array in Ascending Order: ");
      for(int i=0;i<data.length;i++)
      {
        System.out.print(data[i]+" ");
      }
    }
  }