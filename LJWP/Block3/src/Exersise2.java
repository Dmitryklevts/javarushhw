public class Exersise2 {
    public static void main(String[] args) {
        int dino1 = 500;
        int dino2 = 1000;
        int avgWeight = (dino1 + dino2) / 2;

        int countOfFood = dino1 > 500 ? 250 : 200;

        System.out.println("Average weight is: " + avgWeight + "If you are less than 500 kg you can take" + countOfFood);
     }
}
