import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ex, massiv, yn;
        System.out.println("выберите задание");
        ex = sc.nextInt();
        if (ex == 1) {
            System.out.println(exesise1());
        }
        if (ex == 2) {
            System.out.println("введите количество ячеек в массиве");
            massiv = sc.nextInt();
            System.out.println("вы хотите самостоятельно заполнить массив? 1-да 2-нет");
            yn = sc.nextInt();
            exesise2(massiv,yn);
        }
        if (ex == 3) {
            System.out.println("введите количество ячеек в массиве");
            massiv = sc.nextInt();
            System.out.println("вы хотите самостоятельно заполнить массив? 1-да 2-нет");
            yn = sc.nextInt();
            exesise3(massiv,yn);
        }
        if (ex == 4) {
            System.out.println(exesise4());
        }
    }
    public static int exesise1 (){
        double [] a = new double[10];
        int b=0;
        for (int i = 0; i < a.length; i ++){
            a[i] = (Math.random()*200 - 99);
            System.out.println(i+1 + ". " + a[i]);
        }
        for (int i=1;i<a.length;i++){
            if (((a[i]>=0)&&(a[i-1]<0))||((a[i]<0)&&(a[i-1]>=0))){
                b=b+1;
            }
        }
        return b;
    }
    public static void exesise2 (int a,int ny) {
        Scanner scc = new Scanner(System.in);
        int [] b = new int[a];
        int c=0, d=0,e=0,f=0;
        if (ny==2) {
            for (int i = 0; i < b.length; i++) {
                b[i] = (int) (Math.random() * 100 - 50);
                if (b[i] >= 0) {
                    c = c + b[i];
                    e++;
                } else {
                    d = d + b[i];
                    f++;
                }
                System.out.println(i+". "+b[i]);
            }
            d=d-1000;
            c=c/e;
            d=d/f;
            System.out.println(c+" "+d);
        }
        else{
            System.out.println("введите значения ячеек массива");
            for (int i=0; i<b.length;i++){
                b[i] = scc.nextInt();
                if (b[i] >= 0) {
                    c = c + b[i];
                    e++;
                } else {
                    d = d + b[i];
                    f++;
                }
            }
            for (int i=0;i<b.length;i++){
                System.out.println(i+". "+b[i]);
            }
            d=d-1000;
            c=c/e;
            d=d/f;
            System.out.println(c+" "+d);
        }
    }
    public static void exesise3 (int a,int ny) {
        Scanner scc = new Scanner(System.in);
        int [] b = new int[a];
        int c=0;
        if (ny==2) {
            for (int i = 0; i < b.length; i++) {
                b[i] = (int) (Math.random() * 100);
            }
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < b.length - 1; i++) {
                    if (b[i] > b[i + 1]) {
                        isSorted = false;
                        buf = b[i];
                        b[i] = b[i + 1];
                        b[i + 1] = buf;
                    }
                }
            }
            for (int i = 0; i < b.length; i++) {
                System.out.println(i+". "+b[i]);
            }
            for (int i = 1; i < b.length; i++) {
                if (b[i]==b[i-1]) {
                    c++;
                }
            }
            if (c!=0) {
                System.out.println("есть повторяющиеся");
            }
            else{
                System.out.println("повторяющихся нет");
            }
        }
        else{
            System.out.println("введите значения ячеек массива");
            for (int i=0; i<b.length;i++){
                b[i] = scc.nextInt();
            }
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < b.length - 1; i++) {
                    if (b[i] > b[i + 1]) {
                        isSorted = false;
                        buf = b[i];
                        b[i] = b[i + 1];
                        b[i + 1] = buf;
                    }
                }
            }
            for (int i = 0; i < b.length; i++) {
                System.out.println(i+". "+b[i]);
            }
            for (int i = 1; i < b.length; i++) {
                if (b[i]==b[i-1]) {
                    c++;
                }
            }
            if (c!=0) {
                System.out.println("есть повторяющиеся");
            }
            else{
                System.out.println("повторяющихся нет");
            }
        }
    }
    public static String exesise4 () {
        String[] m = "Отец мой Андрей Петрович Гринев в молодости своей служил при графе Минихе и вышел в отставку премьер-майором в 17.. году. С тех пор жил он в своей Симбирской деревне, где и женился на девице Авдотье Васильевне Ю., дочери бедного тамошнего дворянина. Нас было девять человек детей. Все мои братья и сестры умерли во младенчестве. Матушка была еще мною брюхата, как уже я был записан в Семеновский полк сержантом, по милости майора гвардии князя В., близкого нашего родственника. Если бы паче всякого чаяния матушка родила дочь, то батюшка объявил бы куда следовало о смерти неявившегося сержанта, и дело тем бы и кончилось. Я считался в отпуску до окончания наук. В то время воспитывались мы не по-нонешнему. С пятилетнего возраста отдан я был на руки стремянному Савельичу, за трезвое поведение пожалованному мне в дядьки. Под его надзором на двенадцатом году выучился я русской грамоте и мог очень здраво судить о свойствах борзого кобеля. В это время батюшка нанял для меня француза, мосье Бопре, которого выписали из Москвы вместе с годовым запасом вина и прованского масла. Приезд его сильно не понравился Савельичу. «Слава богу, — ворчал он про себя, — кажется, дитя умыт, причесан, накормлен. Куда как нужно тратить лишние деньги и нанимать мусье, как будто и своих людей не стало!»".split(" ");
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < m.length; i++) {
            if (h.containsKey(m[i])) {
                h.replace(m[i], h.get(m[i]) + 1);
            } else {
                h.put(m[i], 1);
            }
        }
        String s = null;
        int p = 0;
        for (String w : h.keySet()) {
            if (p < h.get(w)) {
                p = h.get(w);
                s = w;
            }
        }
        return s;
    }
}