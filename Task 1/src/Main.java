import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите какое количества у вас элексиров");
        System.out.println("Кол-во жабьих глаз");
        int toadEyesCount = scanner.nextInt();
        System.out.println("Кол-во слез вурдалака");//Жабьи глаза
        int ghoulTearsCount = scanner.nextInt();
        System.out.println("Кол-во костей вороны");
        int ravenBonesCount = scanner.nextInt();
        System.out.println("Кол-во пельменей");//Кости ворона
        int dumplingsCount = scanner.nextInt();         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        boolean isCanMake = false;
        System.out.println("Вы можете сделать следующий элексиры");
        if(toadEyesCount >= 3 && ravenBonesCount >= 1){
            System.out.println("Эликсир зоркости");
            isCanMake = true;
        }
        if(ravenBonesCount >= 2 && dumplingsCount >= 4){
            System.out.println("Эликсир стойкости");
            isCanMake = true;
        }
        if(ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
            System.out.println("Эликсир скрытности");
            isCanMake = true;
        }
        if(ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3){
            System.out.println("Запретный эликсир");
            isCanMake = true;
        }
        if(!isCanMake){
            System.out.println(("Пока вы не можете сделать эликсир!"));
        }



    }
}
