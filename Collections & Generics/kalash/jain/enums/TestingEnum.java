package kalash.jain.enums;

public class TestingEnum {
    public static void main(String[] args) {
        TraficLight color = TraficLight.GREEN;
        color = TraficLight.RED;

        Grade grade = Grade.valueOf("D");
        for (Grade values : Grade.values()) {
            System.out.println(values);
        }
    }
}