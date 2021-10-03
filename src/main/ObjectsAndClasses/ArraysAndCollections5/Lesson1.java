package ArraysAndCollections5;

import java.net.InetAddress;
import java.util.*;

public class Lesson1 {
    public static ArrayList<String> arrayListNum = new ArrayList<>();
    public static HashSet<String> hashSetNum = new HashSet<>();
    public static TreeSet<String> treeSetNum = new TreeSet<>();
    public static Random random = new Random();
    public static char[] alphabetAutoNum  = {'А','В','Е','К','М','Н','О','Р','С','Т','У','Х'};

    public static void main(String[] args) {
        for(int i=0;i<3000;i++){
            String numberCar =String.format("%s%d%s%s%s",oneSym(),generationSeries(),oneSym(),oneSym(),generationRegion());
            arrayListNum.add(numberCar);
            hashSetNum.add(numberCar);
            treeSetNum.add(numberCar);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String str = scanner.nextLine();
        Collections.sort(arrayListNum);
        long start1Time = System.nanoTime();
        if(arrayListNum.contains(str)){
            System.out.println("Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - start1Time) + "нс");
        }else {
            System.out.println("Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - start1Time) + "нс");
        }
        long start2Time = System.nanoTime();
        if (Collections.binarySearch(arrayListNum, str) == 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - start2Time) + "нс");
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - start2Time) + "нс");
        }
        long start3Time = System.nanoTime();
        if (hashSetNum.contains(str)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - start3Time) + "нс");
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - start3Time) + "нс");
        }
        long start4Time = System.nanoTime();
        if (treeSetNum.contains(str)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - start4Time) + "нс");
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - start4Time) + "нс");
        }



       }
       //Генератор букв
       public static char oneSym(){
        return alphabetAutoNum[random.nextInt(alphabetAutoNum.length)];
       }
       //Генерация серии
       public static int generationSeries(){
        return (int)((Math.random() * ((999 - 100) + 1)) + 100);
       }
       //Генерация региона
        public static String generationRegion(){
        int a = (int) ((Math.random()*((199-1)+1))+1);
        if(a<10)
           return "0"+a;
        else return Integer.toString(a);
       }
    }



