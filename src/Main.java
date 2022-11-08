public class Main {
    public static void main(String[] args) {

        System.out.println("homeWorkCycle2");




        System.out.println("Task №1 ");
        {
            int deposit = 15000;
            int totalDeposit = 0;
            int month = 1;
            int fullDeposit = 2_459_000;
            while (totalDeposit < fullDeposit  ) {
                totalDeposit = totalDeposit + deposit;
                month= month + 1;
                System.out.println("Месяц " + month + " сумма накоплений равна " + totalDeposit+" рублей");
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
            int limitYear = 10;
            for (int year = 1; year <= limitYear; year++) {
                humanPopulation = humanPopulation + humanPopulationUp - humanPopulationLoss;
                System.out.println("год " + year + " численность населения " + humanPopulation);
            }


        }

        System.out.println("Task №2.1 ");
        {
            int deposit = 15_000;
            int limitDeposit = 12_000_000;
            int percentForMonth = 7;
            for (int month = 1; deposit < limitDeposit; month++) {
                deposit = deposit + deposit/100 * percentForMonth;
                System.out.println("месяц " + month + " сумма накоплений " + deposit);
            }

        }

        System.out.println("Task №2.2 ");
        {
            int deposit = 15_000;
            int percentForMonth = 7;
            int limitDeposit = 12_000_000;
            for (int month = 1; deposit < limitDeposit; month++) {
                deposit = deposit + deposit/100 * percentForMonth;
                if (month % 6 == 0) {
                    System.out.println("месяц " + month + " сумма накоплений " + deposit);
                }
            }

        }

        System.out.println("Task №2.3 ");
        {
            int deposit = 15_000;
            int percentForMonth = 7;
            int monthAll = 12 * 9;
            for (int i = 1; i < monthAll; i++) {
                deposit = deposit + deposit/100 * percentForMonth;
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