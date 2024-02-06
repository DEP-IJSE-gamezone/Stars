import java.util.Scanner;

public class demo14 {
    void main() {
//        int y=0;
//        do{
//            int x=4;
//            do{
//                System.out.print(" * ");
//            }while(x-->0);
//            System.out.println();
//        }while(y++<4);

        System.out.println("---------1st method------------------");

        int y = 4;
        do {
            int x = y;
            do {
                System.out.print(" * ");
            } while (x-- > 0);
            System.out.println();
        } while (y-- > 0);

        System.out.println("---------2nd method------------------");

//        int z=0, col=5;
//        do{
//            System.out.print(z==col?"\n":" * ");
//            if(z==col){
//                col--;
//                z=-1;
//            }
//        }while (z++ <col);

        System.out.println("-------user input * pattern-------------");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int z = 0, col = num;
        do {
            System.out.print(z == col ? "\n" : " * ");
            if (z == col) {
                col--;
                z = -1;
            }
        } while (z++ < col);
    }
}
