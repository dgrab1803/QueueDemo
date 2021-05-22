package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallq = new Queue(5);
        int ch,i;

        System.out.println("używam kolejki do zapełniania liczb od 1 do 26 :");
        for(i=0; i<26;i++)
            bigQ.put(1 + i );
        System.out.println(" Zawartość kolejki bigQ wynosi : " );
        for (i=0; i<26;i++){
            ch = bigQ.get();
            if(ch != 0) System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("uzywam kolejki smallq do generowania błedów ");

        for(i=0;i<6;i++){
            System.out.println("próbuje umieścić w kolejce znak " + (20 - i));
            smallq.put((int) (20 -i));
            System.out.println();
        }
        System.out.println();
        System.out.println("zawartość kolejki smallq :");
        for(i=0;i<6;i++){
            ch = smallq.get();
            if(ch != 0) System.out.println(ch);
        }
    }

}
