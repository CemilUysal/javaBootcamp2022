package sesliHarflerDemo;

public class Main {

    public static void main(String[] args) {

        char harf = 'E';

        switch(harf) {
            case'A':
                break;
            case'I':
                break;
            case'O':
                break;
            case'U':
                System.out.println("Kalın sesli harf");
            default:
                System.out.println("İnce sesli harf");
        }
    }
}
