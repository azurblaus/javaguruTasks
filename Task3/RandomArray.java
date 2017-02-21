package lv.javaguru;

import java.util.Random;

public class RandomArray {

    private int[] array;

    public int[] createArray() {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomArrayFill();
        } return array;
    }


    public int randomArrayFill() {
        Random random = new Random();
        int randomNum = random.nextInt();
        return randomNum;
    }

    public  void printTheArray(){
        for(int cell: array) {
            System.out.println(cell);
        }
    }
}
