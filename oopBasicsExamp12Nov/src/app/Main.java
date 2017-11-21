package app;

import java.util.Arrays;
import java.util.List;

import app.core.HealthManager;
import app.io.ConsoleInputReader;
import app.utilities.Constants;

public class Main {
	public static void main(String[] args) {
		ConsoleInputReader inputReader = new ConsoleInputReader();
		HealthManager manager = new HealthManager();

		String toPrint = null;
		String inputLine;
		
		while ((inputLine = inputReader.readLine()) != null) {
			toPrint = dispatchCommand(Arrays.asList(inputLine.split("\\s+")), manager);
			if (toPrint != null)
				System.out.println(toPrint);

			if (inputLine.equals(Constants.TERMINATING_COMMAND))
				break;
		}
	}

	private static String dispatchCommand(List<String> commandParams, HealthManager manager) { 

		switch (commandParams.get(0)) {
		case "checkCondition":
			return manager.checkCondition(commandParams.get(1));
		case "createOrganism":
			return manager.createOrganism(commandParams.get(1));
		case "addCluster":
			return manager.addCluster(commandParams.get(1), commandParams.get(2), Integer.parseInt(commandParams.get(3)),
					Integer.parseInt(commandParams.get(4)));
		case "addCell":
			return manager.addCell(commandParams.get(1), commandParams.get(2), commandParams.get(3), commandParams.get(4),
					Integer.parseInt(commandParams.get(5)), Integer.parseInt(commandParams.get(6)), Integer.parseInt(commandParams.get(7)),
					Integer.parseInt(commandParams.get(8)));
		case "activateCluster":
			return manager.checkCondition(commandParams.get(1));
		default:
			return null;
		}
	}
}
