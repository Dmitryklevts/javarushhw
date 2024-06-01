public class Project {

    public static void main(String[] args) {


        //TODO: Dino meal planner

        String name1 = "Dima";
        String name2 = "Raida";
        int weight1 = 500;
        int weight2 = 250;
        int eatPerDay1 = weight1 / 100 * 2;
        int eatPerDay2 = weight2 / 100 * 2;
        int numberOfFeedings = 4;
        int dino1PerFeeding = eatPerDay1 / numberOfFeedings;
        int dino2PerFeeding = eatPerDay2 / numberOfFeedings;
        System.out.println(STR."Our \{weight1} kg dinosaur \{name1} needs to eat \{eatPerDay1} kg daily, which means we need to serve \{dino1PerFeeding} kg per feeding");

    }
}
