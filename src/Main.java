public class Main {
    public static void main(String[] args) {

        System.out.println("homeWorkCycle2");




        System.out.println("Task №1 ");
        {
            int deposit = 15000;
            int totalDeposit = 0;
            int i = 1;
            while (totalDeposit < 2_459_000  ) {
                totalDeposit = totalDeposit + deposit;
                i= i + 1;
                System.out.println("Месяц " + i + " сумма накоплений равна " + totalDeposit+" рублей");
            }

        }
        System.out.println("Task №2 ");
        {
            int i = 0;
            while ( i < 10 ) {

                i++;
                System.out.print(i+" ");
            }
            System.out.println(" ");
            System.out.print(i+" ");
            for ( ; i > 1 ;) {

                i--;
                System.out.print(i+" ");
            }

        }

        System.out.println("Task №3 ");
        {
            int humanPopulation = 12_000_000;
            int humanPopulationUp = humanPopulation/1000*17;
            int humanPopulationLoss = humanPopulation/1000*8;
            for (int i = 1; i < 11; i++) {
                humanPopulation = humanPopulation + humanPopulationUp - humanPopulationLoss;
                System.out.println("год " + i + " численность населения " + humanPopulation);
            }


        }

        System.out.println("Task №2.1 ");
        {
            int deposit = 15_000;
            for (int i = 1; deposit < 12_000_000; i++) {
                deposit = deposit + deposit/100 * 7;
                System.out.println("месяц " + i + " сумма накоплений " + deposit);
            }

        }

        System.out.println("Task №2.2 ");
        {
            int deposit = 15_000;
            for (int i = 1; deposit < 12_000_000; i++) {
                deposit = deposit + deposit/100 * 7;
                if (i % 6 == 0) {
                    System.out.println("месяц " + i + " сумма накоплений " + deposit);
                }
            }

        }

        System.out.println("Task №2.3 ");
        {
            int deposit = 15_000;
            for (int i = 1; i < 109; i++) {
                deposit = deposit + deposit/100 * 7;
                if (i % 6 == 0) {
                    System.out.println("месяц " + i + " сумма накоплений " + deposit);
                }
            }

        }

        System.out.println("Task №2.4 ");
        {
            int mounthDay = 31;
            for (int  day = 2;  day < mounthDay;  day++) {
                if ( day % 7 - 2 == 0) {
                    System.out.println(" Сегодня пятница, "+ day+"-е число. Необходимо подготовить отчет");
                }
            }


        }
        System.out.println("Task №3.1 ");
        {
            for (int cometArrivalDate = 0;  cometArrivalDate < 2060;  cometArrivalDate = cometArrivalDate + 79) {
                if ( cometArrivalDate >1850) {
                    System.out.println(cometArrivalDate);
                }
            }

        }

        System.out.println("Task №3.2 ");
        {
            for (int factor = 1; factor <= 10; factor++) {
                int result = 2*factor;
                System.out.println("2*"+factor+"="+result);



            }
        }

    }
}