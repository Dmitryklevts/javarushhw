public class Exersise5 {
    public static void main(String[] args) {

        int dino1 = 55;
        int dino2 = 78;
        //int ageDifference = Math.abs(dino1 - dino2);
        int ageDifferenceRaw = (dino1 - dino2);
        int ageDifference = (ageDifferenceRaw < 0) ? - ageDifferenceRaw : ageDifferenceRaw;

        System.out.println("Age Difference: " + ageDifference + " years");

    }
}
