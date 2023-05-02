public class CharactersFromTheKeyboard {

    public static void main (String [] args)
        throws java.io.IOException {

        char ch, num;
        num = (char) 32;
        int xyi = 0;
        int reg = 0;

        System.out.println("Введите любую строчную или прописную букву от A до Z");
        System.out.println("Для завершения нажмите точку");

        for ( ; ; ) {

            ch = (char) System.in.read();

            if (ch == ' ') {
                System.out.print(' ');
                xyi ++;
            }
            else if (ch == '\n') {
                System.out.println();
                System.out.println("Введите любую строчную или прописную букву от A до Z");
                System.out.println("Для завершения нажмите точку");
                continue;
            }
            else if (ch >= 65 & ch <= 90) {
                System.out.print(ch += (char) num);
                reg ++;
            }
            else if (ch >= 97 & ch <= 122) {
                System.out.print(ch -= (char) num);
                reg ++;
            }

            else if (ch == '.')
                break;

            else System.out.print(ch);
        }
        System.out.println();
        System.out.println("Количество пробелов " + xyi);
        System.out.println("Количество символов для которых был изменен регистр " + reg);
    }
}
