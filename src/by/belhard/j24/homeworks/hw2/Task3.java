package by.belhard.j24.homeworks.hw2;

public class Task3 {
    public static void main(String[] args) {

        int temp = 18;
        String clothes;

        if (temp < 0)
            clothes = "Kurtka";
        else if (temp < 15)
            clothes = "Sweater";
        else if (temp < 25)
            clothes = "Maika";
        else
            clothes = "nothing";

        System.out.println("Better to put " + clothes);
    }
}
