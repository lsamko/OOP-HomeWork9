package Task4;

import java.util.ArrayDeque;

public class Human {

    private ArrayDeque<String> bigBang = new ArrayDeque<>();

    public Human() {
        bigBang.push("Penny");
        bigBang.push("Koothrappali");
        bigBang.push("Wolowitz");
        bigBang.push("Leonard");
        bigBang.push("Sheldon");
    }

    private Human(ArrayDeque<String> bigBang) {
        this.bigBang = bigBang;
    }

    private ArrayDeque<String> getBigBang() {
        return bigBang;
    }

    private void setBigBang(ArrayDeque<String> bigBang) {
        this.bigBang = bigBang;
    }

    public void getCola(int iteration) {
        for (int i = 0; i < iteration; i++) {
            cloneHuman();
        }
    }

    public void cloneHuman() {
        String lastName = bigBang.pollFirst();
        bigBang.addLast(lastName);
        bigBang.addLast(lastName);
    }

    @Override
    public String toString() {
        return "Human{" +
            "bigBang=" + bigBang +
            '}';
    }
}
