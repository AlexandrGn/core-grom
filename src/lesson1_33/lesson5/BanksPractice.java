package lesson1_33.lesson5;

import java.util.Arrays;

public class BanksPractice {

    public static void main(String[] args) {
        String names[] = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));

        depositMoney(names, balances, "Ann", 2000);
        System.out.println(Arrays.toString(balances));

    }
    
    
    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {

        int count = 0;
        for (int el : balances) {
            if (el >= n) {
                count++;
            }
        }

        String[] results = new String[count];

        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex++] = clients[index];
            }
            index++;
        }

        return results;
    }

    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {

        int count = 0;
        for (int el : balances) {
            if (el < 0) {
                count++;
            }
        }

        String[] results = new String[count];

        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                results[resIndex++] = clients[index];
            }
            index++;
        }

        return results;
    }

    public static void depositMoney(String[] clients, int[] balances, String client, int money) {
        int nomer=findClientIndexByName(clients, client);
        if (nomer==-1) return;
        balances[nomer] += calculateDepositAmoutnAfterCommission(money);
    }

    public static int findClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        if (clientIndex==clients.length) return -1;
        return clientIndex;
    }

    public static int calculateDepositAmoutnAfterCommission(int money) {
        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
    }
    
    public static int withdraw(String[] clients, int[] balances, String client, int amount){
        int index=findClientIndexByName(clients,client);
        if (index==-1 || amount<=0) return -1;

        if (balances[index]>=amount)

            return balances[index]-amount;
        else
            return -1;
        
    }
    
}
