package ClassTasks;

import java.util.Scanner;

public class PhonebookMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        mainMenu();
        int userInput = input.nextInt();

        switch (userInput) {
            case 1: {
                System.out.println("Phone book");
                System.out.println("""
                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b’card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        
                        Type 0 to go back""");
                userInput = getUserInput(userInput, input);

                switch (userInput) {
                    case 1:
                        System.out.println("Search\n" +
                                "\nType \"0\" to go back");
                        break;
                    case 2:
                        System.out.println("Service Nos." +
                                "\nType \"0\" to go back");
                        break;
                    case 3:
                        System.out.println("Add name" +
                                "\nType \"0\" to go back");
                        break;
                    case 4:
                        System.out.println("Erase" +
                                "\nType \"0\" to go back");
                        break;
                    case 5:
                        System.out.println("Edit" +
                                "\nType \"0\" to go back");
                        break;
                    case 6:
                        System.out.println("Assign Tone" +
                                "\nType \"0\" to go back");
                        break;
                    case 7:
                        System.out.println("Send b'card" +
                                "\nType \"0\" to go back");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("1. Type of view" + "\n2. Memory status" +
                                "\nType \"0\" to go back");
                        userInput = getUserInput(userInput, input);
                        switch (userInput) {
                            case 1:
                                System.out.println("Type of view" +
                                        "\nType \"0\" to go back");
                                break;
                            case 2:
                                System.out.println("Memory Status" +
                                        "\nType \"0\" to go back");
                                break;
                            default:
                                System.out.println("Please enter a valid selection.");
                                //call the previous the menu again

                        }

                        break;
                    case 9:
                        System.out.println("Speed dials" +
                                "\nType \"0\" to go back");
                        break;
                    case 10:
                        System.out.println("Voice tags" +
                                "\nType \"0\" to go back");
                        break;

                }

            }
            break;
            case 2: {
                System.out.println("""
                        Messages
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10.Service command editor""");
                userInput = getUserInput(userInput, input);
                if (userInput == 7) {
                    System.out.println("1. Set\n" + "2. Common");
                    userInput = getUserInput(userInput, input);
                    switch (userInput) {
                        case 1:
                            System.out.println("""
                                    Set 1
                                    1. Message centre number
                                    2. Messages sent as
                                    3. Message validity""");
                            break;
                        case 2:
                            System.out.println("""
                                    Common
                                    1. Delivery reports
                                    2. Reply via same centre
                                    3. Character support""");
                            break;

                    }
                } else {
                    System.out.println("Please make a valid selection");
                }
            }
            break;
            case 3: {
                System.out.println("Chat");
            }
            break;
            case 4: {
                System.out.println("""
                        Call register
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit""");
                userInput = getUserInput(userInput, input);
                switch (userInput) {
                    case 5:
                        System.out.println("""
                                Show call duration
                                1. Last call duration
                                2. All calls’ duration
                                3. Received calls’ duration
                                4. Dialled calls’ duration
                                5. Clear timers""");
                        break;
                    case 6:
                        System.out.println("""
                                Show call costs
                                1. Last call cost
                                2. All calls’ cost
                                3. Clear counters""");
                        break;
                    case 7:
                        System.out.println("""
                                Call cost settings
                                1. Call cost limit
                                2. Show costs in""");
                        break;
                }
            }
            break;
            case 5: {
                System.out.println("""
                        Tones
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver""");
            }
            break;
            case 6: {
                System.out.println("""
                        Settings
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings""");
                userInput = getUserInput(userInput, input);
                switch (userInput) {
                    case 1:
                        System.out.println("""
                                Call settings
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer""");
                        break;
                    case 2:
                        System.out.println("""
                                Phone settings
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights2
                                6. Confirm SIM service actions""");
                        break;
                    case 3:
                        System.out.println("""
                                Security settings
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes""");
                        break;
                    default:
                        System.out.println("please make a valid selection");
                }
            }
            break;
            case 7: {
                System.out.println("Call divert");
            }
            break;
            case 8: {
                System.out.println("Games");
            }
            break;
            case 9: {
                System.out.println("Calculator");
            }
            break;
            case 10: {
                System.out.println("Reminder");
            }
            break;
            case 11: {
                System.out.println("""
                        Clock
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time""");
            }
            break;
            case 12: {
                System.out.println("Profiles");
            }
            break;
            case 13: {
                System.out.println("SIM Services");
            }
            break;
            case 0:
                break;
            default:
                System.out.println("Please make a valid selection");
                mainMenu();
        }
    }

    private static void mainMenu() {
        System.out.println("Enter a number that corresponds to a menu:");
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");
        System.out.println("\nType \"0\" to go exit");
    }

    private static int getUserInput(int userInput, Scanner input) {

        System.out.println("Make a selection from the list above");
        userInput = input.nextInt();
        if (userInput == 0) {
            return 0;
        }
        return userInput;
    }


}
