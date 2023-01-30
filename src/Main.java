import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres que tendrá su lista:");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Ingrese un nombre para su lista:");
            String name = sc.next();
            list.add(name);
            Collections.sort(list);
            for (String nombres : list) {
                System.out.println(nombres);

            }
        }

        System.out.println("el numero de nombres de la lista es:" + list.size());



            list.remove(3);
            list.remove(1);

        for (String dato : list) {
            System.out.println(dato);

            }
        }
    }


