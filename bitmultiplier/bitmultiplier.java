import java.util.ArrayList;


class bitmultiplier{
public static void main(String str[]){
   // System.out.println("hello world");

    ArrayList<Integer> multiplier = new ArrayList<>();
    ArrayList<Integer> multiplicand = new ArrayList<>();
    ArrayList<Integer> output = new ArrayList<>();

    multiplier.add(0);
    multiplier.add(0);
    multiplier.add(0);
    multiplier.add(1);

    multiplier.add(0);
    multiplier.add(0);
    multiplier.add(1);
    multiplier.add(0);

    System.out.print("Multiplier: "); printArray(multiplier);

}


public static void printArray(ArrayList<Integer> someArray){

    for(int i = 0; i < someArray.size(); i++){
        System.out.print(someArray.get(i));
    }
    System.out.println();

}

}