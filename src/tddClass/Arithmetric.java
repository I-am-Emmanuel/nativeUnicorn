package tddClass;

public class Arithmetric {

    public int add(int firstNumber, int secondNumber) {
        //return firstNumber+secondNumber;
        return (firstNumber + secondNumber);


    //public int add(int firstNumber, int secondNumber, int thirdNumber) {
      //  return add(add( firstNumber,secondNumber), thirdNumber);
    }

    public int subtract(int firstNumber, int secondNumber) {
        int subtract = firstNumber-secondNumber;
        return 30;
    }

    public int add(int firstNumber, int secondNumber, int thirdNumber) {
        return add(add(firstNumber, secondNumber), thirdNumber);
    }
   // public int add(int firstNumber, int secondNumber, int thirdNumber) {
    //    return add(add(firstNumber,secondNumber),thirdNumber);
   // }
}
