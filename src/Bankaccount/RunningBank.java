package Bankaccount;

public class RunningBank {
    public static void main (String[] args) {
        ING ing = new ING(1200);
        ing.withdrawnAmount(700);
        System.out.println("Your ING balance is " + ing.getBalance() + " $");

        BRD brd = new BRD(2000);
        brd.depositAmount(1200);
        System.out.println("Your BRD balance is " + brd.getBalance() + " $");

        BT bt = new BT(350);
        bt.depositAmount(200);
        System.out.println("Your BT balance is " + bt.getBalance() + " $");





    }

}
