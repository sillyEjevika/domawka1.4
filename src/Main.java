public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Звдвние №1");
        int yearsOld = 13;
        if (yearsOld >=18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (yearsOld < 18){
            System.out.println("Возраст совершеннолетия не наступил, нужно еще подождать!");
        }
        //Задание №2
        System.out.println("Звдвние №2");
        if (yearsOld >=7 && yearsOld <18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (yearsOld >= 18 && yearsOld < 24){
            System.out.println("Человек ходит в университет!");
        }
        if (yearsOld >= 24){
            System.out.println("Человек ходит на работу!");
        }
        //Задание №3
        System.out.println("Звдвние №3");
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount;
        int seatsUsed = 59;
        int otherUsed = 41;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидящих мест");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест");
    }
}