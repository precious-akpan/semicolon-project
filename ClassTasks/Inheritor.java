package ClassTasks;//package C6_Java;

import java.util.Scanner;

public class Inheritor {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        mainMenu(type);
    }


    private static void mainMenu(Scanner type) {
        String prompt = """
                1--> Phone book
                2--> Messages
                3--> Chat
                4--> Call register
                5--> Tones
                6--> Settings
                7--> Call divert
                8--> Games
                9--> Calculator
                10--> Reminders
                11--> Clock
                12--> Profile
                13-->Sim services
                14--> Exit
                """;
        display(prompt);
        int input = type.nextInt();
        switch (input) {
            case 1 -> phoneBook(type);
            case 2 -> messages(type);
            case 3 -> {
                display("Chat\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Chat");
                    case 2 -> mainMenu(type);
                }
            }
            case 4 -> callRegister(type);
            case 5 -> tones(type);
            case 6 -> settings(type);
            case 7 -> {
                display("call divert\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("call divert");
                    case 2 -> mainMenu(type);
                }
            }
            case 8 -> {
                display("games\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("games");
                    case 2 -> mainMenu(type);
                }
            }
            case 9 -> {
                display("calculator\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("calculator");
                    case 2 -> mainMenu(type);
                }
            }
            case 10 -> {
                display("reminders\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("reminders");
                    case 2 -> mainMenu(type);
                }
            }
            case 11 -> clock(type);
            case 12 -> {
                display("profiles\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("profiles");
                    case 2 -> mainMenu(type);
                }
            }
            case 13 -> {
                display("Sim services\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Sim services");
                    case 2 -> mainMenu(type);
                }
            }
            case 14 -> display("Home");
        }
    }

    private static void callRegister(Scanner type) {
        String prompt;
        int input;
        prompt = """
                1--> Missed Calls
                2--> Received calls
                3--> Dialled Numbers
                4--> Erase recent call lists
                5--> Show call duration
                6--> Show Call costs
                7--> Call cost settings
                8--> Prepaid credit
                9--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("missed calls\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("missed calls");
                    case 2 -> callRegister(type);
                }
            }
            case 2 -> {
                display("Received calls\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Received calls");
                    case 2 -> callRegister(type);
                }
            }
            case 3 -> {
                display("Dialled Numbers\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Dialled Numbers");
                    case 2 -> callRegister(type);
                }
            }
            case 4 -> {
                display("Erase recent call lists\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Erase recent call lists");
                    case 2 -> callRegister(type);
                }
            }
            case 5 -> showCallDuration(type);
            case 6 -> showCallCosts(type);
            case 7 -> callCostsSettings(type);
            case 8 -> {
                display("prepaid credit\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("prepaid credit");

                    case 2 -> callRegister(type);
                }
            }
            case 9 -> mainMenu(type);

        }
    }

    private static void callCostsSettings(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> call cost limit
                2--> show costs in
                3--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("call cost limit\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("call cost limit");
                    case 2 -> callCostsSettings(type);
                }
            }
            case 2 -> {
                display("show costs in\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("show costs in");
                    case 2 -> callCostsSettings(type);
                }
            }
            case 3 -> callRegister(type);
        }
    }

    private static void showCallCosts(Scanner type) {
        String prompt;
        int input;
        prompt = """
                                        
                1--> last call cost
                2--> all calls cost
                3--> Clear counters
                4--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("last call cost\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("last call cost");
                    case 2 -> showCallCosts(type);
                }
            }
            case 2 -> {
                display("all calls cost\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("all call cost");
                    case 2 -> showCallCosts(type);
                }
            }
            case 3 -> {
                display("Clear counters\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Clear counters");
                    case 2 -> showCallCosts(type);
                }
            }
            case 4 -> callRegister(type);
        }
    }

    private static void showCallDuration(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> last call duration
                2--> all calls duration
                3--> received calls duration
                4--> dialled calls duration
                5--> clear timers
                6--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("last call duration\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("last call duration");
                    case 2 -> showCallDuration(type);
                }
            }
            case 2 -> {
                display("all calls duration\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("all calls duration");
                    case 2 -> showCallDuration(type);
                }
            }
            case 3 -> {
                display("received calls duration\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("received calls duration");
                    case 2 -> showCallDuration(type);
                }
            }
            case 4 -> {
                display("dialled calls duration\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("dialled calls duration");
                    case 2 -> showCallDuration(type);
                }
            }
            case 5 -> {
                display("Clear counters\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Clear counters");
                    case 2 -> showCallDuration(type);
                }
            }
            case 6 -> callRegister(type);
        }
    }

    private static void clock(Scanner type) {
        int input;
        String prompt;
        prompt = """
                  1--> alarm clock
                  2--> clock settings
                  3--> date settings
                  4--> stop watch
                  5--> countdown timer
                  6--> auto update of date and time
                  7--> Back
                  
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("alarm clock\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("alarm clock");
                    case 2 -> clock(type);
                }
            }
            case 2 -> {
                display("clock settings\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("clock settings");
                    case 2 -> clock(type);
                }
            }
            case 3 -> {
                display("date settings\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("date settings");
                    case 2 -> clock(type);
                }
            }
            case 4 -> {
                display("stop watch\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("stop watch");
                    case 2 -> clock(type);
                }
            }
            case 5 -> {
                display("countdown timer\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("countdown timer");
                    case 2 -> clock(type);
                }
            }
            case 6 -> {
                display("auto update of date and time\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("auto update of date and time");
                    case 2 -> clock(type);
                }
            }
            case 7 -> mainMenu(type);
        }
    }

    private static void settings(Scanner type) {
        int input;
        String prompt;
        prompt = """
                                
                1--> Call settings
                2--> phone settings
                3--> security settings
                4--> restore factory settings
                5--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> callSettings(type);
            case 2 -> phoneSettings(type);
            case 3 -> securitySettings(type);
            case 4 -> {
                display("Restore Factory Settings\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("restore factory settings");
                    case 2 -> settings(type);
                }
            }
            case 5 -> mainMenu(type);
        }


    }

    private static void callSettings(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> automatic redial
                2--> speed dialing
                3--> call waiting options
                4--> own number sending
                5--> phone line in use
                6--> automatic answer
                7--> Back
                """;
        System.out.println(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("automatic redial\2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("automatic redial");
                    case 2 -> callSettings(type);
                }
            }
            case 2 -> {
                display("speed dialing\2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("speed dialing");
                    case 2 -> callSettings(type);
                }
            }
            case 3 -> {
                display("call waiting options\2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("call waiting options");
                    case 2 -> callSettings(type);
                }
            }
            case 4 -> {
                display("own number sending\2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("own number sending");
                    case 2 -> callSettings(type);
                }
            }
            case 5 -> {
                display("phone line in use\2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("phone line in use");
                    case 2 -> callSettings(type);
                }
            }
            case 6 -> {
                display("automatic answer\2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("automatic answer");
                    case 2 -> callSettings(type);
                }
            }
            case 7 -> settings(type);
        }
    }

    private static void phoneSettings(Scanner type) {
        String prompt;
        int input;
        prompt = """
                1--> language
                2--> cell info display
                3--> welcome note
                4--> network selection
                5--> lights
                6--> confirm sim service actions
                6--> Back
                """;
        System.out.println(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("language\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("language");
                    case 2 -> phoneSettings(type);
                }
            }
            case 2 -> {
                display("cell info display\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("cell info display");
                    case 2 -> phoneSettings(type);
                }
            }
            case 3 -> {
                display("welcome note\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("welcome note");
                    case 2 -> phoneSettings(type);
                }
            }
            case 4 -> {
                display("network selection\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("network selection");
                    case 2 -> phoneSettings(type);
                }
            }
            case 5 -> {
                display("lights\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("lights");
                    case 2 -> phoneSettings(type);
                }
            }
            case 6 -> {
                display("confirm sim service actions\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("confirm sim service actions");
                    case 2 -> phoneSettings(type);
                }
            }
            case 7 -> settings(type);
        }
    }

    private static void securitySettings(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> pin code request
                2--> call barring service
                3--> fixed dialling
                4--> closed user group
                5--> phone security
                6--> change access codes
                7--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("pin code request\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("pin code request");
                    case 2 -> securitySettings(type);
                }
            }
            case 2 -> {
                display("call barring service\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("call barring service");
                    case 2 -> securitySettings(type);
                }
            }
            case 3 -> {
                display("fixed dialling\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("fixed dialling");
                    case 2 -> securitySettings(type);
                }
            }
            case 4 -> {
                display("closed user group\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("closed user group");
                    case 2 -> securitySettings(type);
                }
            }
            case 5 -> {
                display("phone security\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("phone security");
                    case 2 -> securitySettings(type);
                }
            }
            case 6 -> {
                display("change access codes\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("change access codes");
                    case 2 -> securitySettings(type);
                }
            }
            case 7 -> settings(type);
        }
    }

    private static void tones(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> ringing tone
                2--> ringing volume
                3--> incoming call alert
                4--> composer
                5--> message alert tone
                6--> keypad tones
                7--> warning and game tones
                8--> vibrating alert
                9--> Screen saver
                10--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("ringing tone\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("ringing tone");
                    case 2 -> tones(type);
                }
            }
            case 2 -> {
                display("ringing volume\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("ringing volume");
                    case 2 -> tones(type);
                }
            }
            case 3 -> {
                display("incoming call alert\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("incoming call alert");
                    case 2 -> tones(type);
                }
            }
            case 4 -> {
                display("composer\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("composer");
                    case 2 -> tones(type);
                }
            }
            case 5 -> {
                display("message alert tone\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("message alert tone");
                    case 2 -> tones(type);
                }
            }
            case 6 -> {
                display("keypad tones\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("keypad tones");
                    case 2 -> tones(type);
                }
            }
            case 7 -> {
                display("warning and game tones\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("warning and game tones");
                    case 2 -> tones(type);
                }
            }
            case 8 -> {
                display("vibrating alert\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("vibrating alert");
                    case 2 -> tones(type);
                }
            }
            case 9 -> {
                display("Screen saver\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Screen saver");
                    case 2 -> tones(type);
                }
            }
            case 10 -> mainMenu(type);

        }
    }

    private static void messages(Scanner type) {
        String prompt;
        int input;
        prompt = """
                1--> Write messages
                2--> inbox
                3--> outbox
                4--> Picture message
                5--> Templates
                6--> Smileys
                7--> Message Settings
                8--> Info service
                9--> voice mailbox number
                10--> Service command editor
                11--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("Write messages\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Write messages");
                    case 2 -> messages(type);
                }
            }
            case 2 -> {
                display("inbox\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("inbox");
                    case 2 -> messages(type);
                }
            }
            case 3 -> {
                display("outbox\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("outbox");
                    case 2 -> messages(type);
                }
            }
            case 4 -> {
                display("picture messages\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("picture messages");
                    case 2 -> messages(type);
                }
            }
            case 5 -> {
                display("Templates\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Templates");
                    case 2 -> messages(type);
                }
            }
            case 6 -> {
                display("Smileys\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("smileys");
                    case 2 -> messages(type);
                }
            }
            case 7 -> messageSettings(type);
            case 8 -> {
                display("info service\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("info service");
                    case 2 -> messages(type);
                }
            }
            case 9 -> {
                display("voice mailbox number\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("voice mailbox number");
                    case 2 -> messages(type);
                }
            }
            case 10 -> {
                display("Service command editor\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Service command editor");
                    case 2 -> messages(type);
                }
            }
            case 11 -> mainMenu(type);
        }
    }

    private static void messageSettings(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> Set
                2-->Common
                3-->Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> set(type);
            case 2 -> common(type);
            case 3 -> messages(type);
        }
    }


    private static void common(Scanner type) {
        String prompt;
        int input;
        prompt = """
                1--> Delivery reports
                1--> Report via same center
                3--> Character support
                4--> Back
                """;
        display(prompt);
        input = type.nextInt();

        switch (input) {
            case 1 -> {
                display("Delivery reports\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Delivery reports");
                    case 2 -> common(type);
                }
            }
            case 2 -> {
                display("Report via same center\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Report via same center");
                    case 2 -> common(type);
                }
            }
            case 3 -> {
                display("Character support\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Character support");
                    case 2 -> common(type);
                }
            }
            case 4 -> messageSettings(type);

        }
    }

    private static void set(Scanner type) {
        String prompt;
        int input;
        prompt = """
                1--> Message center number
                1--> Message sent as
                3--> Message validity
                4--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("Message center Number\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Message center Number");
                    case 2 -> set(type);
                }
            }
            case 2 -> {
                display("Message sent as\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Message sent as");
                    case 2 -> set(type);
                }
            }
            case 3 -> {
                display("Message validity\n 2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Message validity");
                    case 2 -> set(type);
                }
            }
            case 4 -> messageSettings(type);
        }
    }

    private static void phoneBook(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> Search
                2--> Service Nos
                3--> Add name
                4--> Erase
                5--> Edit
                6--> Assign tone
                7--> send b-card
                8--> Options
                9--> Speed Dials
                10--> Voice tags
                11--> Back
                        """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("Search\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Search");
                    case 2 -> phoneBook(type);
                }
            }
            case 2 -> {
                display("Service Nos\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Service nos");
                    case 2 -> phoneBook(type);
                }
            }
            case 3 -> {
                display("Add name\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Add name");
                    case 2 -> phoneBook(type);
                }
            }
            case 4 -> {
                display("Erase\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Erase");
                    case 2 -> phoneBook(type);
                }
            }
            case 5 -> {
                display("Edit\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Edit");
                    case 2 -> phoneBook(type);
                }
            }
            case 6 -> {
                display("Assign tone\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Assign tone");
                    case 2 -> phoneBook(type);
                }
            }
            case 7 -> {
                display("Send b-card\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Send b-card");
                    case 2 -> phoneBook(type);
                }
            }
            case 8 -> options(type);
            case 9 -> {
                display("Speed Dials\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Speed Dials");
                    case 2 -> phoneBook(type);
                }
            }
            case 10 -> {
                display("Voice Tags\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Voice tags");
                    case 2 -> phoneBook(type);
                }
            }
            case 11 -> mainMenu(type);
        }
    }


    private static void options(Scanner type) {
        int input;
        String prompt;
        prompt = """
                1--> Type of view
                2--> Memory Status
                3--> Back
                """;
        display(prompt);
        input = type.nextInt();
        switch (input) {
            case 1 -> {
                display("type of view\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("type of view");
                    case 2 -> options(type);
                }
            }
            case 2 -> {
                display("Memory Status\n2 for back");
                input = type.nextInt();
                switch (input) {
                    case 1 -> display("Memory Status");
                    case 2 -> options(type);
                }
            }
            case 3 -> phoneBook(type);
        }
    }

    public static void display(String message) {
        System.out.println(message);
    }
}