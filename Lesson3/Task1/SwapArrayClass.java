package Lesson3.Task1;

public class SwapArrayClass <M>{

    M intermediate;

    public M[] swapElements(M[] array, int indexA, int indexB){
        intermediate = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = intermediate;
        return array;
    }

}
