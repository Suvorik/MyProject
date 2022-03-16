package turlo.lesson4;

import java.util.Scanner;

public class Park {
    public static Scanner ob = new Scanner(System.in);
    public info info;
    public String attraction;


    public Park() {
        System.out.print("Название отракциона:");
        setPark(ob.next());
        info = new info();
    }

    public String getPark() {
        return attraction;
    }

    public void setPark(String attraction) {
        this.attraction = attraction;
    }

    public class info {
        int st, sq;

        public void inf() {
            System.out.print("время работы:");
            setSt(ob.nextInt());
            System.out.print("введите цена билета:");
            setSq(ob.nextInt());
        }

        public int getSt() {
            return st;
        }

        public void setSt(int st) {
            this.st = st;
        }

        public int getSq() {
            return sq;
        }

        public void setSq(int sq) {
            this.sq = sq;
        }

        public void print() {
            System.out.print("Атракцион" + " " + getPark() + "Время работы" + getSt() + "Цена билета" + getSq());
        }
    }

    static public void main(String[] args) {
        Park park = new Park();
        park.info.print();
    }
}

