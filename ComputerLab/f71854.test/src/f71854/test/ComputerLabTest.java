package f71854.test;

import f71854.lab.Brand;
import f71854.lab.Computer;
import f71854.lab.ComputerLab;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.IntStream;

public class ComputerLabTest {
    public static void main(String[] args) {
        Random rand = new Random();

        Computer[] hardware = new Computer[20];


        for (int i = 0; i < hardware.length; i++) {
            hardware[i] = new Computer(Brand.values()[new Random().nextInt(Brand.values().length)],
                    (double)rand.nextInt(1001) + 500, LocalDate.of(2020, rand.nextInt(12) + 1, 1));
//(произволно избран елемент от Brand), (произволно избрана стойност в интервала [500, 1500]), (ден 1, месец произволно избран в интервала [1,12] и година 2020)
        }


        ComputerLab lab = new ComputerLab(hardware);

        System.out.println(lab.toString());

        int[] numOfComps = lab.groupByMonth(2020);

        System.out.println((numOfComps[0] + numOfComps[1] + numOfComps[2]) / 3 > IntStream.of(numOfComps).sum() / 12 ?
                "Average of the number of computers for the first three months is bigger" :
                "Average of the number of computers for the first three months is not bigger");

        ComputerLab newLab = new ComputerLab();

        System.out.println(newLab.toString());

    }
}
