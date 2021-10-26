package model;

public class DebtBook {

    Debtor[] debtors = new Debtor[0];

    public void addDebtor(Debtor debtor) {

        Debtor[] temp = debtors;
        debtors = new Debtor[temp.length + 1];
        System.arraycopy(temp, 0, debtors, 0, temp.length);

        debtors[temp.length] = debtor;


    }

    public void getDebtor() {
        for (Debtor debtor : debtors) {
            System.out.println("+-----------------------------+");
            System.out.println("| " + debtor.getName() + " | " + debtor.getAmount() + " |");
            System.out.println("+-----------------------------+");
        }
    }

    public Debtor searchDebtor(String name) {
        for (Debtor debtor : debtors) {
            if (debtor.getName().equals(name)) {
                return debtor;
            }
        }

        return null;
    }


}
