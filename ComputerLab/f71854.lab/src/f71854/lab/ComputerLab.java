package f71854.lab;

public class ComputerLab {

    public static final int TOTAL_COMPS = 30;
    private static int numOfComps = 1;// помощна променлива за Лаб_ИД, за да е
    // неповтаряща се и номерът на Лабс ще е пореден
    private Computer[] computers;
    private final String LAB_ID;

    public ComputerLab() {
        this((Computer[]) null);
    }

    public ComputerLab(Computer[] comps) {
        this.LAB_ID = String.format("Lab00" + numOfComps);//
        numOfComps++;

        setComputers(comps);
    }

    public ComputerLab(ComputerLab other) {
        this(other.computers);
    }

    public Computer[] getComputers() {
        Computer[] temp = new Computer[TOTAL_COMPS];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = computers[i];
        }
        return temp;
    }

    public void setComputers(Computer[] comps) {

        if (comps != null) {
            this.computers = new Computer[comps.length];
            for (int i = 0; i < comps.length; i++) {
                this.computers[i] = comps[i];
            }
        } else {//ако !компс, то тогава просто създаваме празен масив с размер дадената константа
            this.computers = new Computer[TOTAL_COMPS];
        }
    }

    public final String getLabID() {
        return LAB_ID;
    }

    public int[] groupByMonth(int byYear) {
        int[] result = new int[12];//12 месеца => после ще взимаме месеца на всеки елемент

        if (byYear >= 1800) {
            for (Computer computer : computers) {
                if (computer.getRegistrationDate().getYear() == byYear) {
                    ++result[computer.getRegistrationDate().getMonthValue() - 1];
                    //номерът на месеца-1 отговаря на позицията му в новосъздадения масив
                    //така в новосъздадения масив, когато намерим елемент от желаната година,
                    //увеличаваме съответното място с 1
                }
            }
        } else {
            result = null;
        }

        return result;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(String.format("LabID: %s\n", LAB_ID));

        for (Computer computer : computers) {
            if (computer == null) {
                stringBuilder.append("No computers in this ComputerLab\n");
                return stringBuilder.toString();
            }
            stringBuilder.append(String.format("ComputerID: %s\t Brand: %s\t Price: %.2f\t RegistrationDate: %s\n",
                    computer.getID(), computer.getMake(), computer.getPrice(), computer.getRegistrationDate()));
        }

        return stringBuilder.toString();
    }
}
