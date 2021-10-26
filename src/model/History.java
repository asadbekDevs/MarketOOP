package model;

public class History {

    private Action[] actions = new Action[0];


    public void addAction(double amount, String type) {

        Action[] temp = actions;

        actions = new Action[temp.length + 1];

        System.arraycopy(temp, 0, actions, 0, temp.length);

        Action action = new Action();
        action.setAmount(amount);
        action.setType(type);

        actions[temp.length] = action;

    }

    public void showActions() {
        for (Action action : actions) {
            System.out.println("+-----------------------------+");
            System.out.println("| " + action.getType() + " | " + action.getAmount() + " | " + action.getLocalDate() + " |");
            System.out.println("+-----------------------------+");
        }
    }


}
