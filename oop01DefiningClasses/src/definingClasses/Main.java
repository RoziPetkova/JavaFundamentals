package definingClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {

		HashMap<String, BankAccount> test = new HashMap<String, BankAccount>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int counter = 1;

		while ((line = reader.readLine()) != null && !line.equals("End")) {
			try {
				switch (line.split("\\s+")[0]) {
				case "Create":
					test.put(counter + "", new BankAccount());
					System.out.printf("Account ID%s created\n", counter);
					counter++;
					break;
				case "Deposit":
					if (Double.parseDouble(line.split("\\s+")[2]) > 0) {
						test.get(line.split("\\s+")[1]).deposit(Double.parseDouble(line.split("\\s+")[2]));
						System.out.printf("Deposited %s to %s\n", line.split("\\s+")[2], test.get( line.split("\\s+")[1]) );
					}
					break;
				case "Withdraw":
					if (Double.parseDouble(line.split("\\s+")[2]) <= test.get(line.split("\\s+")[1]).balance)
						test.get(line.split("\\s+")[1]).withdraw(Double.parseDouble(line.split("\\s+")[2]));
					else
						System.out.println("Insufficient balance");
					break;
				case "Print":
					System.out.printf("Account ID%d, balance %.2f\n", test.get(line.split("\\s+")[1]).id, test.get(line.split("\\s+")[1]).balance);
					break;
				case "SetInterest":
					BankAccount.setRate(Double.valueOf(line.split("\\s+")[1]));
					break;
				case "GetInterest":
					System.out.printf("%.2f\n", test.get(line.split("\\s+")[1]).getInterest(Integer.parseInt(line.split("\\s+")[2])));
				}
			} catch (NullPointerException e) {
				System.out.println("Account does not exist");
			}

		}
	}
}
