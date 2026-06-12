# ISU-ICS3U readme file
 
Stefan

Variables used:


ArrayList<String> partAQuestions: Stores the Cyber Threat questions, ArrayList<String> partAAnswers: Stores the right answers for the Cyber Threat questions, ArrayList<String> partBQuestions: Stores the Online Safety questions , ArrayList<String> partBAnswers: Stores the Online Safety answers, String userChoice: Keeps the user’s menu selection, int[] pickedA: Stores the indexes of randomly selected 6 part A questions, int[] pickedB: Stores the indexes of randomly selected 6 part B questions, int partAScore: Stores the # of correct answers for Part A questions, int partBScore: Stores the # of correct answers for Part B questions, boolean stopTest: This controls if the test should stop earlier, int questionIndex: Has the position of the current question.


Logic Used: 

Question Banks 
The 1st section creates 4 ArrayList which stores all questions and answers to the quiz. I used separate ArrayLists so that they are all organized. The index # of a question matches the # of the index # of the correct answer. This basically makes it easier to check if an answer is correct. 

Main Menu
At the start, a menu is displayed that lets the person either take the test or the admin login. The user’s pick is stored in the userChoice variable. A menu makes the whole thing easier to access with only one process. 

Random Question choice:
The program randomly selects six questions from each section. This makes sure that the questions don’t repeat and that each test is different

Part A Test:
The program shows the 6 Cyber Threat Questions. 


=========================================================================================================================================================




Charles

Variables used:
String adminInput: Stores the password entered by the user to access the admin panel
String adminPassword: Stores the correct admin password that is required for access
int adminChoice: Stores the admins choice of adding or removing a question
String aOrB: Stores the choice of Part A or Part B or edit
String question: Stores the question entered by the user when adding a new question
String optionA, optionB, optionC, optionD: Stores the four answer choices for a new question through user input
String answer: Stores the correct answer choice for the question through user input
String fullQuestion: Combines the question and answer choices into one formatted question
int removeIndex: Stores the index number of the question that the admin wants to remove


Logic used:

Admin password
The admin panel starts with asking the user for the password and compares it with the stored password. If it’s correct, the admin menu is printed and if it’s incorrect, access is denied

Admin menu
After putting in the correct password two options are displayed, adding and removing a question. The admin’s choice is stored in the adminChoice variable to then be used in if statements to display the adding or removing menu

Adding questions
The admin can add a new question to either part A or B and if statements control where the question is stored through user input. The program asks the user to enter the question, 4 answer choices, and the correct one. The question is combined into one string using fullQuestion so that we don’t need a more arraylists to store the options. The answer and question are stored at the same index.

Removing questions
The program prints the available questions with their index numbers through a for loop, and then the admin can choose which question to remove. The program will then remove both the answer and question so that the answer key doesn’t get mismatched.
