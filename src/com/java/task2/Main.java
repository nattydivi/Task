package com.java.task2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setName("Вас приветствует банкомат Prior");
        System.out.print(bank.getName());

        bank.setTm((char) '\u2764');
        System.out.println(bank.getTm());

        bank.setBill((short) 1560);
        System.out.println("Наличие купюр в банкомате: " + bank.getBill());

        bank.setCoins(1255250025541024520L);
        System.out.println("Наличие монет в банкомате: " + bank.getCoins());

        bank.setCashMoney(2014574152);
        System.out.println("Наличие денежных средств в банкомате: " + bank.getCashMoney() + " белорусских рублей");

        bank.setNominal((byte) 105);
        System.out.println("Наличие купюр номиналом 500 бел.руб. в банкомате: " + bank.getNominal());

        bank.setBid(30.5F);
        System.out.println("Процентная ставка по кредиту: " + bank.getBid());

        double resultNominal = bank.getNominal();
        double resultBill = bank.getBill();
        double resultKi = (resultNominal/resultBill);

        System.out.println("Коэффициент использования банкнот: " + resultKi);

//        при делении типов инт результат был 0.0, short c byte тот же результат, только с получилось
//        и нельзя делить гет и сет, поэтому ввела переменную для результатов и уже работала с ними

//        double resultKi = (bank.getNominal())/(bank.getBill());
//        System.out.println("Коэффициент использования банкнот: " + resultKi);

//        bank.setKi((bank.setNominal((byte) 250))/ (bank.setBill((short) 1560)));
//        bank.setKi((int) bank.getNominal()/ (int) bank.getBill()*100);
//        System.out.println("Коэффициент использования банкнот:" + bank.getKi());

        bank.setCash(resultNominal>resultBill);
        System.out.println("Наличие запрашиваемой суммы: " + bank.isCash());

        System.out.println(Integer.toString(bank.getCashMoney()));


        bank.setWrapNominal((byte) 126);
        System.out.println(bank.getWrapNominal());

        bank.setWrapBill((short) 1560);
        System.out.println(bank.getWrapBill());

        bank.setWrapCashMoney(2014574152);
        System.out.println(bank.getWrapCashMoney());

        bank.setWrapCoins(1255250025541024520L);
        System.out.println(bank.getWrapCoins());

        bank.setWrapBid(30.5F);
        System.out.println(bank.getWrapBid());

        bank.setWrapKi(0.67307);
        System.out.println(bank.getWrapKi());

        bank.setWrapTm('\u2764');
        System.out.println(bank.getWrapTm());

        bank.setWrapCash(true);
        System.out.println(bank.getWrapCash());

        System.out.println(String.join(bank.getName()));




    }
}
