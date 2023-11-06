import java.util.*;
public class HomeWork {
    public static void main(String[] args) {
        //set up condor(floor and room) using array 2d
        Scanner sc = new Scanner(System.in);
        int floor, room;

        System.out.println("If you input negative number the program need you to input again");
        do {
            System.out.print("Enter Number of floor=");
            floor = sc.nextInt();
        }while(floor<=0);
        do{
            System.out.print("Enter Number of room in one floor=");
            room = sc.nextInt();
        } while ( room <= 0);
        System.out.println("=============Congrats===================");
        System.out.println("Your condor has " + floor + " floor");
        System.out.println("Your condor has " + room + " room");
        System.out.println("Your total room in the condo is " + floor * room + " room");
        System.out.println();
        String[][] condor = new String[floor][room];
        for (int i = floor - 1; i >= 0; i--) {
            System.out.print("Floor " + (i + 1) + ": ");
            for (int j = 0; j < room; j++) {
                System.out.print("Room " + (j + 1) + ":");
                System.out.print("  " + condor[i][j] + "||");
            }
            System.out.println();
        }
        System.out.println();
        int op;
        do {
            System.out.println("------------------------Menu-----------------------");
            System.out.println("[1].Buy the condor");
            System.out.println("[2].Sell The condor");
            System.out.println("[3].Search by name");
            System.out.println("[4].Cheek The condor");
            System.out.println("[5].Exit the program");
            System.out.print("Enter The option from(1-5)=");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    int f, r;
                    System.out.println("=======================Welcome to Condo=================");
                    do {
                        System.out.print("Enter  floor from(1-" + floor + ")=");
                        f = sc.nextInt();
                        if (f > room || f < 0) {//condition for floor if floor bigger than array index or negative
                            System.out.println("Floor in the condo is rang from(1-" + (floor) + ") And Positive number ");
                        }
                        System.out.print("Enter room from(1-" + (room) + ")=");
                        r = sc.nextInt();
                        if (r > room || r < 0) {
                            System.out.println("Room is range from (1-" + (room) + ") And Positive number");
                        }
                    } while (f > floor || r > room || f <= 0 || r <= 0);
                    if (condor[f - 1][r - 1] == null) {
                        System.out.print("Enter your name for own the condo=");
                        condor[f - 1][r - 1] = sc.next();//because array start from index 0
                        for (int i = floor - 1; i >= 0; i--) {
                            System.out.print("Floor " + (i + 1) + ": ");
                            for (int j = 0; j < room; j++) {
                                System.out.print("Room " + (j + 1) + ":");
                                System.out.print("  " + condor[i][j] + "||");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("-------------------------------------");
                        System.out.println("Room has ownership already");
                    }
                    break;
                case 2:
                    System.out.println("sell the condor");
                    do {
                        System.out.print("Enter  floor  from(1-" + floor + ")=");
                        f = sc.nextInt();
                        if (f > room || f < 0) {
                            System.out.println("floor in the condo is rang from(1-" + (floor) + ") And Positive number ");
                        }
                        System.out.print("Enter room from(1-" + (room) + ")=");
                        r = sc.nextInt();
                        if (r > room || r < 0) {
                            System.out.println("room is range from (1-" + (room) + ") And Positive number");
                        }
                    } while (f > floor || r > room || f <= 0 || r <= 0);
                    System.out.println("-------------------------------------------------");
                    System.out.println("Room " + (r) + " Belong to: " + condor[f - 1][r - 1]);
                    System.out.println("-------------------------------------------------");
                    if (condor[f - 1][r - 1] != null) {//condition if room is not have own
                        int num;
                        System.out.println("Enter Number 1 to continue");
                        System.out.println("Enter Number 0 to Cancel");
                        System.out.print("Please enter=");
                        num = sc.nextInt();
                        if (num == 1) {
                            condor[f - 1][r - 1] = null;
                            System.out.println("Your room is already sell");
                        } else if(num==0){
                            System.out.println("Cancel !!");
                        }else{
                            System.out.println("Invalid number");
                        }
                    } else {//room has own
                        System.out.println("This room is not have own");
                    }
                    break;
                case 3:
                    int oop;
                    do {
                        System.out.println("------------------------Menu-----------------------");
                        System.out.println("[1].Search by name");
                        System.out.println("[2].Search by floor");
                        System.out.println("[3].Exit");
                        System.out.print("pleas select one =");
                        oop = sc.nextInt();
                        switch (oop) {
                            case 1:
                                int a = 0;
                                String name;
                                System.out.print("enter your name=");
                                name = sc.next();
                                for (int i = floor - 1; i >= 0; i--) {
                                    for (int j = 0; j < room; j++) {
                                        if (name.equals(condor[i][j])) {
                                            a = 1;
                                            System.out.println(" name: " + condor[i][j] + " Stay at floor: " + (i + 1) + " room: " + (j + 1));
                                        }

                                    }
                                }
                                if (a == 0) {
                                    System.out.println("Name: " + name + " not found in the condo system");
                                }
                                System.out.println("Thanks You !");
                                break;
                            case 2:
                                int fl;
                                do {
                                    System.out.print("Enter floor for search=");
                                    fl = sc.nextInt();
                                    if(fl>floor||fl<=0)
                                    {
                                        System.out.println("floor in the condo is rang from(1-" + (floor) + ") And Positive number ");
                                    }
                                } while (fl <= 0||fl>floor);
                                int i = (fl-1);
                                System.out.print("Floor " + (i + 1) + ": ");
                                for (int j = 0; j < room; j++) {
                                    System.out.print("Room " + (j + 1) + ":");
                                    System.out.print("  " + condor[i][j] + "||");
                                }
                                System.out.println();
                        }
                    } while (oop <0 || oop <3);
                case 4:
                    System.out.println("---------------------Condo Information---------------");
                    for (int i = floor - 1; i >= 0; i--) {
                        System.out.print("Floor " + (i + 1) + ": ");
                        for (int j = 0; j < room; j++) {
                            System.out.print("Room " + (j + 1) + ":");
                            System.out.print("  " + condor[i][j] + "||");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("bye bye !!");
                    System.exit(0);
            }
        }while (op < 0 || op <7) ;
    }
}
