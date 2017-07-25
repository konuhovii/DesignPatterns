package state;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class TestCode {
    public static void main(String[] args) {
        int count = 0;
        args = new String[]{"Seattle", "112"};

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = null;
        try {
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
    }
}
