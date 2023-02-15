class Print <T> {
    T toPrint;

    Print(T toPrint){
        this.toPrint = toPrint;
    }

    void print(){
        System.out.println(toPrint);
    }
}

public class temp {
    public static void main(String[] args) {
        Print<Integer> p = new Print<>(22);
        p.print();
    }
}
