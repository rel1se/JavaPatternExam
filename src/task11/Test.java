package task11;

public class Test {
    public static void main(String[] args) {
        // Напишите реализацию подсчета символов во всех строках переданных программе
        for (int i = 0; i < args.length; i++) {
            int cnt = i + 1;
            System.out.println("Количество символов в " + cnt + " строке: " + args[i].length());
        }
    }
}
