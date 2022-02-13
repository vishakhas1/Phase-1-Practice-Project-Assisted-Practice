package com.companylocker;

import java.util.List;
import java.util.Scanner;

public class ControlOptions {
	public static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Options.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					OperationsWithFile.displayAllFiles("main");
					break;
				case 2:
					ControlOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above menu.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			}
		} while (running == true);
	}

	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Options.displayFileMenuOptions();
				OperationsWithFile.createMainFolderIfNotPresent("main");

				int input = sc.nextInt();
				switch (input) {
				case 1:
					System.out.println("Enter the file name that should be add to \"main\" folder");
					String fileToAdd = sc.next();

					OperationsWithFile.createFile(fileToAdd, sc);

					break;
				case 2:
					System.out.println("Enter the file name that should be deleted from \"main\" folder");
					String fileToDelete = sc.next();

					OperationsWithFile.createMainFolderIfNotPresent("main");
					List<String> filesToDelete = OperationsWithFile.displayFileLocations(fileToDelete, "main");

					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);

					int idx = sc.nextInt();

					if (idx != 0) {
						OperationsWithFile.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {

						for (String path : filesToDelete) {
							OperationsWithFile.deleteFileRecursively(path);
						}
					}

					break;
				case 3:
					System.out.println("Enter the file name to be search from \"main\" folder");
					String fileName = sc.next();

					OperationsWithFile.createMainFolderIfNotPresent("main");
					OperationsWithFile.displayFileLocations(fileName, "main");

					break;
				case 4:
					return;
				case 5:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (running == true);
	}
}
