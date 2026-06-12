import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //ArrayList<String> partAQuestions = new ArrayList<String>();
        //ArrayList<String> partBQuestions = new ArrayList<String>();
        //ArrayList<String> partAAnswers = new ArrayList<String>();
        //ArrayList<String> partBAnswers = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);


// Stefan
        // Creating the variables under arrays list that are needed for the project.
        ArrayList<String> partAQuestions = new ArrayList<String>();

        partAQuestions.add("Phishing is best described as:\n" +
                "A) A type of computer virus that hides inside another program\n" +
                "B) A scam where an attacker tries to trick you into revealing sensitive information by\n" +
                "pretending to be a trusted source\n" +
                "C) A method of physically stealing computer hardware\n" +
                "D) A technique that improves the speed of your internet connection");
        partAQuestions.add("Which of the following is a common red flag in a phishing email?\n" +
                "A) The sender’s email address is from a well-known company you regularly do business with\n" +
                "B) The email is addressed to you by your full name\n" +
                "C) The email creates a sense of urgency and asks you to click a link to “verify” your\n" +
                "account immediately\n" +
                "D) The message contains no spelling or grammatical errors");
        partAQuestions.add("What is ransomware?\n" +
                "A) Software that displays advertisements on your screen\n" +
                "B) Malware that encrypts your files and demands payment in exchange for the\n" +
                "decryption key\n" +
                "C) A subscription fee charged by software companies\n" +
                "D) A type of firewall used by large businesses");
        partAQuestions.add("Which of the following is an example of social engineering?\n" +
                "A) Designing a new social media website\n" +
                "B) Writing code to break a password by brute force\n" +
                "C) Calling someone and pretending to be from IT support to get their login credentials\n" +
                "D) Sending a file over the network without encryption");
        partAQuestions.add("A Trojan is malware that:\n" +
                "A) Disguises itself as a legitimate or harmless program but performs malicious\n" +
                "actions once installed\n" +
                "B) Spreads automatically across networks without any user interaction\n" +
                "C) Only attacks devices that are not connected to the internet\n" +
                "D) Is a type of antivirus software");
        partAQuestions.add("You receive a text message that says “Your package could not be delivered. Click\n" +
                "here to reschedule: bit.ly/xyz123.” What should you do?\n" +
                "A) Click the link right away to make sure your package arrives on time\n" +
                "B) Reply to the message asking for more details\n" +
                "C) Do not click the link; verify the delivery directly through the courier’s official\n" +
                "website or app\n" +
                "D) Forward the message to all your contacts to warn them");
        partAQuestions.add("Which of the following best describes a man-in-the-middle attack?\n" +
                "A) An attack where a hacker physically stands between two people at an ATM\n" +
                "B) An attack where an attacker secretly intercepts and possibly alters the\n" +
                "communication between two parties\n" +
                "C) A type of denial-of-service attack\n" +
                "D) Hardware sabotage performed inside a server room");
        partAQuestions.add("Vishing is a form of phishing carried out:\n" +
                "A) Over voice calls\n" +
                "B) Through video games\n" +
                "C) Using printed letters in the mail\n" +
                "D) By installing software from a USB drive");
        partAQuestions.add("Which one of the following is most likely a sign of a spoofed website?\n" +
                "A) The URL is spelled exactly the same as the official site, including the correct top-level\n" +
                "domain\n" +
                "B) The URL contains small misspellings or extra characters (e.g., “amaz0n-login.com”\n" +
                "instead of “amazon.com”)\n" +
                "C) The site shows a padlock icon next to the URL\n" +
                "D) The site loads quickly with no errors");
        partAQuestions.add("Spyware is malware that primarily:\n" +
                "A) Encrypts your data and demands a ransom\n" +
                "B) Secretly collects information about your activity, such as keystrokes or browsing\n" +
                "history, and sends it to a third party\n" +
                "C) Floods a website with requests until it crashes\n" +
                "D) Improves your computer’s performance by removing junk files");


        ArrayList<String> partAAnswers = new ArrayList<String>();

        partAAnswers.add("B");
        partAAnswers.add("C");
        partAAnswers.add("B");
        partAAnswers.add("C");
        partAAnswers.add("A");
        partAAnswers.add("C");
        partAAnswers.add("B");
        partAAnswers.add("A");
        partAAnswers.add("B");
        partAAnswers.add("B");



        ArrayList<String> partBQuestions = new ArrayList<String>();
        partBQuestions.add("Which of the following is the strongest password?\n" +
                "A) password123\n" +
                "B) Farzin2009\n" +
                "C) Tr0ub4dor&amp;3-Spring!Tuesday\n" +
                "D) qwerty");
        partBQuestions.add("Two-factor authentication (2FA) protects an account by requiring:\n" +
                "A) Two different usernames\n" +
                "B) A password plus a second verification step, such as a code from an app or text\n" +
                "message\n" +
                "C) Two separate passwords\n" +
                "D) The user to log in from two different devices at the same time");
        partBQuestions.add("Why should you keep your operating system and apps up to date?\n" +
                "A) Updates make your device look more modern\n" +
                "B) Updates often include security patches that fix newly discovered vulnerabilities\n" +
                "C) Updates always add new social media features\n" +
                "D) Updates are only useful for gaming computers");
        partBQuestions.add("You see “https://” at the start of a website’s URL. This means:\n" +
                "A) The site is guaranteed to be safe and legitimate\n" +
                "B) The data sent between your browser and the site is encrypted in transit\n" +
                "C) The site has been certified by the government\n" +
                "D) The site cannot contain malware");
        partBQuestions.add("Which of the following is the safest way to manage many different account\n" +
                "passwords?\n" +
                "A) Use the same password on every account so you don’t forget it\n" +
                "B) Write all your passwords on a sticky note attached to your monitor\n" +
                "C) Use a reputable password manager to generate and store unique passwords\n" +
                "D) Use your birthday and last name on every account");
        partBQuestions.add("When using public Wi-Fi (e.g., at a coffee shop), the safest practice is to:\n" +
                "A) Log in to your online banking immediately to take advantage of the free network\n" +
                "B) Avoid sensitive activities, or use a reputable VPN to encrypt your traffic\n" +
                "C) Disable your firewall to improve speed\n" +
                "D) Share the network password with everyone nearby");
        partBQuestions.add("Why might it be risky to grant a free flashlight app access to your contacts and\n" +
                "microphone?\n" +
                "A) The app needs those permissions to turn the flashlight on\n" +
                "B) Apps can collect and share data they don’t actually need, creating a privacy risk\n" +
                "C) Permissions make the flashlight brighter\n" +
                "D) There is no risk; permissions are only requested by safe apps");
        partBQuestions.add("Which of the following is a good rule for sharing personal information online?\n" +
                "A) Post your full address and phone number on your social media profile\n" +
                "B) Share only the minimum information needed and review your privacy settings\n" +
                "regularly\n" +
                "C) Use the same profile picture and bio on every site so people can recognize you\n" +
                "D) Accept all friend or follower requests, including from strangers");
        partBQuestions.add("The “3-2-1” backup rule recommends keeping:\n" +
                "A) 3 copies of your data, on 2 different types of storage media, with 1 copy stored\n" +
                "offsite\n" +
                "B) 3 passwords, 2 usernames, and 1 email account\n" +
                "C) Backups for 3 days, 2 weeks, and 1 month\n" +
                "D) 3 antivirus programs running at the same time");
        partBQuestions.add("If you think your account has been hacked, the first thing you should do is:\n" +
                "A) Delete the account immediately\n" +
                "B) Tell no one and hope the attacker loses interest\n" +
                "C) Change the password, enable 2FA if available, and review recent activity for\n" +
                "unauthorized access\n" +
                "D) Post about it on social media to warn your friends");


        ArrayList<String> partBAnswers = new ArrayList<String>();
        partBAnswers.add("C");
        partBAnswers.add("B");
        partBAnswers.add("B");
        partBAnswers.add("B");
        partBAnswers.add("C");
        partBAnswers.add("B");
        partBAnswers.add("B");
        partBAnswers.add("B");
        partBAnswers.add("A");
        partBAnswers.add("C");


        // Option 1: If you take the test:

        // Pick 6 random questions from the arrays for part A with 0 repeats
        System.out.println("Cybersecurity Awareness Certification");
        String userChoice = "";

        // Main Menu
        while (true) {
            System.out.println("\n\n\n\n=========================================");
            System.out.println("Main Menu");
            System.out.println("1. Take the test");
            System.out.println("2. Admin menu \n");
            System.out.println("Pick your choice and type 1 or 2 ");
            System.out.println("=========================================");

            userChoice = sc.nextLine();

// Test
            if (userChoice.equals("1")) {
                System.out.println("Test");
                System.out.println("You need a 75% to pass or 9/12, and you need 4/6 in both parts of the test.");

                // Stores the indexes of 6 random questions
                int[] pickedA = new int[6];
                // Counts how many questions have been selected already
                int countPartA = 0;
                // Keep selecting questions until 6 are chosen
                while (countPartA < 6) {
                    // Generate a random # between 0-9
                    int randomQ = (int) (Math.random() * partAQuestions.size());
                    // Guess that the number hasn't been picked already
                    boolean alreadyPicked = false;
                    // Checks if this was already picked
                    for (int i = 0; i < countPartA; i++) {

                        if (pickedA[i] == randomQ) {
                            alreadyPicked = true;
                        }
                    }
                    if (alreadyPicked == false) {
                        //Add the question if it is not already picked before
                        pickedA[countPartA] = randomQ;
                        countPartA++;
                    }
                }


                // Do the exact same thing for part B
                int[] pickedB = new int[6];


                int countPartB = 0;
                while (countPartB < 6) {
                    int randomQB = (int) (Math.random() * partBQuestions.size());
                    boolean alreadyPickedB = false;
                    for (int i = 0; i < countPartB; i++) {
                        if (pickedB[i] == randomQB) {
                            alreadyPickedB = true;
                        }
                    }
                    if (alreadyPickedB == false) {
                        pickedB[countPartB] = randomQB;
                        countPartB++;
                    }
                }
                // Create variables for the scores of the people


                int partAScore = 0;
                int partBScore = 0;
                boolean stopTest = false;


                // Part A
                System.out.println("Part A: Cyber Threats");
                int counter = 0;
                while (counter < 6 && stopTest == false) {
                    int questionsLeft = 6 - counter;
                    if (partAScore + questionsLeft < 4) {
                        System.out.println("Can't get 4/6 for this section. The test is done");
                        stopTest = true;
                    } else {
                        int questionIndex = pickedA[counter];
                        System.out.println(partAQuestions.get(questionIndex));
                        String userAnswer = "";
                        while (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C") && !userAnswer.equals("D")) {
                            System.out.println("Select A, B, C, or D");
                            userAnswer = sc.nextLine().toUpperCase();
                        }


                        if (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C") && !userAnswer.equals("D")) {
                            System.out.println("Enter only A,B,C, or D.");
                        }
                        if (userAnswer.equals(partAAnswers.get(questionIndex))) {
                            System.out.println("Correct");
                            partAScore++;
                        } else {
                            System.out.println("Incorrect");
                        }
                        counter++;
                    }
                }


                // Part B


                System.out.println("Part B: Online Safety");
                int g = 0;
                while (g < 6 && stopTest == false) {
                    int questionsLeft = 6 - g;
                    if (partBScore + questionsLeft < 4) {
                        System.out.println("Can't get 4/6 for this section. The test is done");
                        stopTest = true;
                    } else {
                        int questionIndex = pickedB[g];
                        System.out.println(partBQuestions.get(questionIndex));
                        String userAnswer = "";
                        while (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C") && !userAnswer.equals("D")) {
                            System.out.println("Select A, B, C, or D");
                            userAnswer = sc.nextLine().toUpperCase();
                        }


                        if (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C") && !userAnswer.equals("D")) {
                            System.out.println("Enter only A,B,C, or D.");
                        }
                        if (userAnswer.equals(partBAnswers.get(questionIndex))) {
                            System.out.println("Correct");
                            partBScore++;
                        } else {
                            System.out.println("Incorrect");
                        }
                        g++;
                    }
                }
                // Results
                int totalScore = partAScore + partBScore;
                int totalPercent = (totalScore * 100) / 12;


                System.out.println("Results");
                System.out.println("Part A Score = " + partAScore + "/6");
                System.out.println("Part B Score = " + partBScore + "/6");
                System.out.println("Total Score = " + totalScore + "/12");
                System.out.println("Percentage: " + totalPercent + "%");
            }









            // Charles
// Admin Menu
            if (userChoice.equals("2"))  {
                System.out.println("Enter admin password:");
                String adminInput = sc.nextLine();
                String adminPassword = "Triple T";


                if (adminInput.equals(adminPassword)) {

                    // If password is correct

                    //user friendly menu
                    System.out.println("\n\n\n\n=========================================");
                    System.out.println("Admin Menu");
                    System.out.println("1. Add Question");
                    System.out.println("2. Remove Question");
                    System.out.println("=========================================");

                    int adminChoice = sc.nextInt();
                    sc.nextLine(); // to make sure the enter doesn't skip the next step


                    // Add a question
                    if (adminChoice == 1) {
                        System.out.println("Do you want to add to Part A or Part B? (A/B)");
                        String aOrB = sc.nextLine().toUpperCase();

                        // making sure the question adding is user friendly
                        System.out.println("Enter the question you want to add:");
                        String question = sc.nextLine();
                        System.out.println("Enter option A:");
                        String optionA = sc.nextLine();
                        System.out.println("Enter option B:");
                        String optionB = sc.nextLine();
                        System.out.println("Enter option C:");
                        String optionC = sc.nextLine();
                        System.out.println("Enter option D:");
                        String optionD = sc.nextLine();
                        System.out.println("Enter correct answer (A/B/C/D):");
                        String answer = sc.nextLine().toUpperCase();

                        // adds all the options into one variable so that we dont need more arraylists (keeps it compact)
                        String fullQuestion = question +
                                "\nA) " + optionA +
                                "\nB) " + optionB +
                                "\nC) " + optionC +
                                "\nD) " + optionD;

                        // Adding to part A
                        if (aOrB.equals("A")) {
                            partAQuestions.add(fullQuestion);
                            partAAnswers.add(answer);
                            System.out.println("Question added to Part A.");
                        }

                        // Adding to part B
                        else if (aOrB.equals("B")) {
                            partBQuestions.add(fullQuestion);
                            partBAnswers.add(answer);
                            System.out.println("Question added to Part B.");
                        }

                        // Invalid answer response
                        else {
                            System.out.println("Invalid input.");
                        }
                    }




                    // Remove a question
                    else if (adminChoice == 2) {
                        System.out.println("Do you want to remove a question from Part A or Part B? (A/B)");
                        String aOrB = sc.nextLine().toUpperCase();

                        //Removing from Part A
                        if (aOrB.equals("A")) {
                            // loop prints out all the questions with a number so it's easy to read and choose

                            for (int i = 0; i < partAQuestions.size(); i++) {
                                System.out.println((i + 1) + ". " + partAQuestions.get(i));
                            }

                            System.out.println("Enter question number to remove:");
                            int removeIndex = sc.nextInt() - 1; // to cancel out the +1
                            //make sure the input makes sense and will work
                            if (removeIndex >= 0 && removeIndex < partAQuestions.size()) {
                                partAQuestions.remove(removeIndex);
                                partAAnswers.remove(removeIndex);
                                System.out.println("Question removed.");
                            }
                            else {
                                System.out.println("Invalid question number.");
                            }

                        }

                        // Removing from part B
                        else if (aOrB.equals("B")) {
                            for (int i = 0; i < partBQuestions.size(); i++) {
                                System.out.println((i + 1) + ". " + partBQuestions.get(i));
                            }
                            // loop prints out all the questions with a number so it's easy to read and choose
                            System.out.println("Enter question number to remove (include the questions):");
                            int removeIndex = sc.nextInt() - 1;
                            if (removeIndex >= 0 && removeIndex < partBQuestions.size()) {
                                partBQuestions.remove(removeIndex);
                                partBAnswers.remove(removeIndex);
                                System.out.println("Question removed.");
                            }
                            else {
                                System.out.println("Invalid question number.");
                            }
                        }

                        else {
                            System.out.println("Invalid input.");
                        }
                    }


                }
                // If password is incorrect
                else {
                    System.out.println("Incorrect password");
                }

            }
        }
    }
}



