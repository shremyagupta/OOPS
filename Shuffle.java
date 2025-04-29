import java.util.Random;

class Shuffle  {
    private int[] original;
    private int[] array;
    private Random rand;

    public Shuffle (int[] nums) {
        original = nums.clone();  
        array = nums.clone();     
        rand = new Random();
    }
    
    public int[] reset() {
        array = original.clone(); 
        return array;
    }
    
    public int[] shuffle() {
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); 
            swap(i, j);
        }
        return array;
    }
    
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
