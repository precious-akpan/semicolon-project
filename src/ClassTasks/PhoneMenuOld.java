package ClassTasks;

import java.util.Scanner;

public class PhoneMenuOld {
    private static int userInput;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        mainSwitch:
        do {
            int userInput = mainMenuInput(input);

            switch (userInput) {
                case 1:
                    caseOne(input);
                    break;
                case 2:
                    messages(input);
                    break;
                case 3: {
                    System.out.println("Chat");
                }
                break;
                case 4: {
                    userInput = getInput("""
                            Call register
                            1. Missed calls
                            2. Received calls
                            3. Dialled numbers
                            4. Erase recent call lists
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit""", input);
                    switch (userInput) {
                        case 5 -> System.out.println("""
                                Show call duration
                                1. Last call duration
                                2. All calls’ duration
                                3. Received calls’ duration
                                4. Dialled calls’ duration
                                5. Clear timers""");
                        case 6 -> System.out.println("""
                                Show call costs
                                1. Last call cost
                                2. All calls’ cost
                                3. Clear counters""");
                        case 7 -> System.out.println("""
                                Call cost settings
                                1. Call cost limit
                                2. Show costs in""");
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
                    userInput = getInput("""
                            Settings
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings""", input);
                    switch (userInput) {
                        case 1 -> System.out.println("""
                                Call settings
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer""");
                        case 2 -> System.out.println("""
                                Phone settings
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights2
                                6. Confirm SIM service actions""");
                        case 3 -> System.out.println("""
                                Security settings
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes""");
                        default -> System.out.println("please make a valid selection");
                    }
                }
                break;
                case 7: {
                    getInput("""
                            Call divert""", input);

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
                case 0: {
                    break mainSwitch;
                }
                case -1:
                    break;
                /*default:
                    System.out.println("Please make a valid selection");
                    mainMenuInput(input);*/
            }
        } while (userInput != -1);
    }

    private static void messages(Scanner input) {
        int userInput;
        userInput = getInput("""
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
                10.Service command editor
                                
                Press 0 to go back.""", input);
        switch (userInput) {
            case 1 -> {
                userInput = getInput("""
                        Write messages
                                                            
                        Press 1 to go back""", input);
                checkCaseTwoState(input, userInput);
            }
            case 2 -> {
                userInput = getInput("""
                        Inbox
                                                
                        Press 1 to go back""", input);
                checkCaseTwoState(input, userInput);
            }
            case 3 -> {
                userInput = getInput("""
                        Outbox
                                                
                        Press 1 to go back""", input);
                checkCaseTwoState(input, userInput);
            }
            case 4 -> {
                userInput = getInput("""
                        Picture messages
                                
                        Press 1 to go back""", input);
                checkCaseTwoState(input, userInput);
            }
            case 5 -> {
                userInput = getInput("""
                        Templates
                                                
                        Press 1 to go back""", input);
                checkCaseTwoState(input, userInput);
            }
            case 6 -> {
                userInput = getInput("""
                        Smileys
                                                
                        Press 1 to go back""", input);
                checkCaseTwoState(input, userInput);
            }
            case 7 -> caseSeven(input);
        }
        /*if (userInput == 7) {
            userInput = getInput("1. Set\n" + "2. Common", input);
            switch (userInput) {
                case 1 -> System.out.println("""
                        Set 1
                        1. Message centre number
                        2. Messages sent as
                        3. Message validity""");
                case 2 -> System.out.println("""
                        Common
                        1. Delivery reports
                        2. Reply via same centre
                        3. Character support""");
            }
        } else {
            System.out.println("Please make a valid selection");
        }*/
    }

    private static void caseSeven(Scanner input) {
        int userInput;
        userInput = getInput("""
                Message settings
                                        
                1. Set
                2. Common
                                        
                Press 0 to go back""", input);
        switch (userInput) {
            case 1 -> caseSeven_caseOneMain(input);
            case 2 -> {
                userInput = caseSeven_caseTwo(input);
                switch (userInput) {
                    case 1 -> {
                        userInput = getInput("""
                                Delivery reports
                                                                        
                                Press 1 to go back""", input);
                        caseSeven_caseTwoCheckState(input, userInput);
                    }
                    case 2 -> {
                        userInput = getInput("""
                                Reply via same centre
                                                                        
                                Press 1 to go back""", input);
                        caseSeven_caseTwoCheckState(input, userInput);
                    }
                    case 3 -> {
                        userInput = getInput("""
                                Character support
                                                                        
                                Press 1 to go back""", input);
                        caseSeven_caseTwoCheckState(input, userInput);
                    }
                }
            }
            case 0 -> {
                messages(input);
            }
        }
    }

    private static void caseSeven_caseOneMain(Scanner input) {
        int userInput;
        userInput = getInput("""
                1. Message centre number
                2. Message sent as
                3. Message validity
                        
                Press 0 to go back""", input);
        switch (userInput) {
            case 0 -> caseSeven(input);
            case 1 -> {
                userInput = getInput("""
                        Message centre
                                                        
                        Press 1 to go back""", input);
                if (userInput == 1) {
                    caseSeven_caseOneMain(input);
                }
            }
            case 2 -> {
                userInput = getInput("""
                        Message sent as
                                                                
                        Press 1 to go back""", input);
                if (userInput == 1) {
                    caseSeven_caseOneMain(input);
                }
            }
            case 3 -> {
                userInput = getInput("""
                        Message validity
                                                                
                        Press 1 to go back""", input);
                if (userInput == 1) {
                    caseSeven_caseOneMain(input);
                }
            }
        }
    }

    private static void caseSeven_caseTwoCheckState(Scanner input, int userInput) {
        if (userInput == 1) {
            caseSeven_caseTwo(input);
        } else {}
    }

    private static int caseSeven_caseTwo(Scanner input) {
        int userInput;
        userInput = getInput("""
                Common
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                                
                Press 0 to go back""", input);
        return userInput;
    }

    private static int messageSettings(Scanner input) {
        int userInput;
        userInput = getInput("""
                Message settings
                                        
                1. Set
                2. Common
                                        
                Press 0 to go back""", input);
        return userInput;

    }

    private static void checkCaseSeven_caseOneState(Scanner input, int userInput) {
        if (userInput == 1) {
            caseSeven_caseOne(input);
        }
    }

    private static int caseSeven_caseOne(Scanner input) {
        int userInput;
        userInput = getInput("""
                1. Message centre number
                2. Message sent as
                3. Message validity
                        
                Press 0 to go back""", input);
        return userInput;
    }

    private static void checkCaseTwoState(Scanner input, int userInput) {
        if (userInput == 0) {
            ;
        } else if (userInput == 1) {
            messages(input);
        }
    }

    private static void caseOne(Scanner input) {
        int userInput;
        userInput = getInput("""
                Phone Book
                                        
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
                                        
                Type 0 to go to main menu or -1 to exit""", input);

        switch (userInput) {
            case 1 -> {
                userInput = getInput("""
                        Search
                            
                        Type "0" to go to main menu
                                                
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            case 2 -> {
                userInput = getInput("""
                        Service Nos.
                                                                         
                        Type "0" to go to main menu
                                                
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            case 3 -> {
                userInput = getInput("""
                        Add name
                            
                        Type "0" to go to main menu
                                                
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }

            case 4 -> {
                userInput = getInput("""
                        Erase
                                    
                        Type "0" to go to main menu
                                                    
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            case 5 -> {
                userInput = getInput("""
                        Edit
                        Type "0" to go to main menu
                                
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            case 6 -> {
                userInput = getInput("""
                        Assign Tone
                                            
                        Type "0" to go to main menu
                                
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            case 7 -> {
                userInput = getInput("""
                        Send b'card
                                    
                        Type "0" to go to main menu
                                    
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            case 8 -> caseEight(input, userInput);
            case 9 -> {
                userInput = getInput("""
                        Speed dials
                                                
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            case 10 -> {
                userInput = getInput("""
                        Voice tags
                        Type 1 to go back""", input);
                checkCaseOneState(input, userInput);
            }
            default -> {
                System.out.println("Please make a selection from the list!");
            }
        }
    }

    private static void caseEight(Scanner input, int userInput) {
        userInput = caseOne_caseEight(userInput, """
                Options
                                        
                1. Type of view
                2. Memory status
                Type 0 to go back""", input);
        switch (userInput) {
            case 1 -> {
                userInput = getInput("""
                        Type of view
                                                
                        Type 0 to go to main menu
                        Type 1 to go back""", input);
                if (userInput == 1) {
                    caseEight(input, userInput);
                } else if (userInput == 0) {
                    mainMenuInput(input);
                }
            }
            case 2 -> {
                userInput = getInput("""
                        Memory Status
                                                    
                        Type 0 to go to main menu
                        Type 1 to go back""", input);
                if (userInput == 1) {
                    caseEight(input, userInput);
                } else if (userInput == 0) {
                    mainMenuInput(input);
                }
            }
            case 0 -> caseOne(input);

            default -> System.out.println("Please enter a valid selection.");


        }
    }


    private static int caseOne_caseEight(int userInput, String x, Scanner input) {
        userInput = getInput(x, input);
        return userInput;
    }

    private static void checkCaseOneState(Scanner input, int userInput) {
        if (userInput == 0) {
            ;
        } else if (userInput == 1) {
            caseOne(input);
        }
    }

    private static int mainMenuInput(Scanner input) {
//        mainMenu();
        userInput = getInput("""
                Enter a number that corresponds to a menu:
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                        
                Type -1 to exit""", input);
//        int userInput = input.nextInt();
        return userInput;
    }

    private static int getInput(String x, Scanner input) {
        System.out.println(x);
        return getUserInput(input);
    }


    private static int getUserInput(Scanner input) {

        System.out.println("Make a selection from the list above");
        return input.nextInt();
    }


}
