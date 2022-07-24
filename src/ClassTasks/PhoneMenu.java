package ClassTasks;

public class PhoneMenu {
    private static int userInput;

    public static void main(String[] args) {
        PhoneMenuMethods phoneMenu = new PhoneMenuMethods();
        do {
            mainMenu(phoneMenu);

            switch (userInput) {
                case 1 -> phonebook(phoneMenu);
                case 2 -> messages(phoneMenu);
                case 3 -> chat(phoneMenu);
                case 4 -> callRegister(phoneMenu);
                case 5 -> tones(phoneMenu);
                case 6 -> settings(phoneMenu);
                case 7 -> callDivert(phoneMenu);
                case 8 -> games(phoneMenu);
                case 9 -> calculator(phoneMenu);
                case 10 -> reminders(phoneMenu);
                case 11 -> clock(phoneMenu);
                case 12 -> profiles(phoneMenu);
                case 13 -> simServices(phoneMenu);
            }
        } while (userInput != -1);
    }

    private static void simServices(PhoneMenuMethods phoneMenu) {
        phoneMenu.simServices();
        userInput = phoneMenu.getUserInput();
        mainMenuBack(phoneMenu);
    }

    private static void profiles(PhoneMenuMethods phoneMenu) {
        phoneMenu.profiles();
        userInput = phoneMenu.getUserInput();
        mainMenuBack(phoneMenu);
    }

    private static void clock(PhoneMenuMethods phoneMenu) {
        phoneMenu.clock();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> mainMenu(phoneMenu);
            case 1 -> {
                phoneMenu.alarmClock();
                userInput = phoneMenu.getUserInput();
                backToClock(phoneMenu);
            }
            case 2 -> {
                phoneMenu.clockSettings();
                userInput = phoneMenu.getUserInput();
                backToClock(phoneMenu);
            }
            case 3 -> {
                phoneMenu.dateSettings();
                userInput = phoneMenu.getUserInput();
                backToClock(phoneMenu);
            }
            case 4 -> {
                phoneMenu.stopwatch();
                userInput = phoneMenu.getUserInput();
                backToClock(phoneMenu);
            }
            case 5 -> {
                phoneMenu.countdownTimer();
                userInput = phoneMenu.getUserInput();
                backToClock(phoneMenu);
            }
            case 6 -> {
                phoneMenu.autoUpdateOfDateTime();
                userInput = phoneMenu.getUserInput();
                backToClock(phoneMenu);
            }
        }
    }

    private static void backToClock(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            clock(phoneMenu);
        } else mainMenu(phoneMenu);
    }

    private static void reminders(PhoneMenuMethods phoneMenu) {
        phoneMenu.reminders();
        userInput = phoneMenu.getUserInput();
        mainMenuBack(phoneMenu);
    }

    private static void calculator(PhoneMenuMethods phoneMenu) {
        phoneMenu.calculator();
        userInput = phoneMenu.getUserInput();
        mainMenuBack(phoneMenu);
    }

    private static void games(PhoneMenuMethods phoneMenu) {
        phoneMenu.games();
        userInput = phoneMenu.getUserInput();
        mainMenuBack(phoneMenu);
    }

    private static void callDivert(PhoneMenuMethods phoneMenu) {
        phoneMenu.callDivert();
        userInput = phoneMenu.getUserInput();
        mainMenuBack(phoneMenu);
    }

    private static void settings(PhoneMenuMethods phoneMenu) {
        phoneMenu.settings();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> mainMenu(phoneMenu);
            case 1 -> callSettings(phoneMenu);
            case 2 -> phoneSettings(phoneMenu);
            case 3 -> securitySettings(phoneMenu);
            case 4 -> restoreFactorySettings(phoneMenu);
        }
    }

    private static void restoreFactorySettings(PhoneMenuMethods phoneMenu) {
        phoneMenu.restoreFactorySettings();
        userInput = phoneMenu.getUserInput();
        if (userInput == 1) {
            settings(phoneMenu);
        } else mainMenu(phoneMenu);
    }

    private static void securitySettings(PhoneMenuMethods phoneMenu) {
        phoneMenu.securitySettings();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> settings(phoneMenu);
            case 1 -> {
                phoneMenu.pinCodeRequest();
                userInput = phoneMenu.getUserInput();
                backToSecuritySettings(phoneMenu);
            }
            case 2 -> {
                phoneMenu.callBarringService();
                userInput = phoneMenu.getUserInput();
                backToSecuritySettings(phoneMenu);
            }
            case 3 -> {
                phoneMenu.fixedDialling();
                userInput = phoneMenu.getUserInput();
                backToSecuritySettings(phoneMenu);
            }
            case 4 -> {
                phoneMenu.closedUserGroup();
                userInput = phoneMenu.getUserInput();
                backToSecuritySettings(phoneMenu);
            }
            case 5 -> {
                phoneMenu.phoneSecurity();
                userInput = phoneMenu.getUserInput();
                backToSecuritySettings(phoneMenu);
            }
            case 6 -> {
                phoneMenu.changeAccessCodes();
                userInput = phoneMenu.getUserInput();
                backToSecuritySettings(phoneMenu);
            }
            default -> securitySettings(phoneMenu);
        }
    }

    private static void backToSecuritySettings(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            securitySettings(phoneMenu);
        } else settings(phoneMenu);
    }

    private static void phoneSettings(PhoneMenuMethods phoneMenu) {
        phoneMenu.phoneSetting();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> settings(phoneMenu);
            case 1 -> {
                phoneMenu.language();
                userInput = phoneMenu.getUserInput();
                backToPhoneSettings(phoneMenu);
            }
            case 2 -> {
                phoneMenu.cellInfoDisplay();
                userInput = phoneMenu.getUserInput();
                backToPhoneSettings(phoneMenu);
            }
            case 3 -> {
                phoneMenu.welcomeNote();
                userInput = phoneMenu.getUserInput();
                backToPhoneSettings(phoneMenu);
            }
            case 4 -> {
                phoneMenu.networkSelection();
                userInput = phoneMenu.getUserInput();
                backToPhoneSettings(phoneMenu);
            }
            case 5 -> {
                phoneMenu.lights();
                userInput = phoneMenu.getUserInput();
                backToPhoneSettings(phoneMenu);
            }
            case 6 -> {
                phoneMenu.confirmSimServiceActions();
                userInput = phoneMenu.getUserInput();
                backToPhoneSettings(phoneMenu);
            }
        }
    }

    private static void backToPhoneSettings(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            phoneSettings(phoneMenu);
        } else settings(phoneMenu);
    }

    private static void callSettings(PhoneMenuMethods phoneMenu) {
        phoneMenu.callSettings();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> settings(phoneMenu);
            case 1 -> {
                phoneMenu.automaticRedial();
                userInput = phoneMenu.getUserInput();
                backToCallSettings(phoneMenu);
            }
            case 2 -> {
                phoneMenu.speedDialing();
                userInput = phoneMenu.getUserInput();
                backToCallSettings(phoneMenu);
            }
            case 3 -> {
                phoneMenu.callWaitingOption();
                userInput = phoneMenu.getUserInput();
                backToCallSettings(phoneMenu);
            }
            case 4 -> {
                phoneMenu.ownNumberSending();
                userInput = phoneMenu.getUserInput();
                backToCallSettings(phoneMenu);
            }
            case 5 -> {
                phoneMenu.phoneLineInUse();
                userInput = phoneMenu.getUserInput();
                backToCallSettings(phoneMenu);
            }
            case 6 -> {
                phoneMenu.automaticAnswer();
                userInput = phoneMenu.getUserInput();
                backToCallSettings(phoneMenu);
            }
        }
    }

    private static void backToCallSettings(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            callSettings(phoneMenu);
        } else {
            settings(phoneMenu);
        }
    }

    private static void chat(PhoneMenuMethods phoneMenu) {
        phoneMenu.chat();
        userInput = phoneMenu.getUserInput();
        mainMenuBack(phoneMenu);
    }

    private static void mainMenu(PhoneMenuMethods phoneMenu) {
        phoneMenu.mainMenu();

        userInput = phoneMenu.getUserInput();
    }

    private static void tones(PhoneMenuMethods phoneMenu) {
        phoneMenu.tones();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> mainMenu(phoneMenu);
            case 1 -> {
                phoneMenu.ringingTones();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 2 -> {
                phoneMenu.ringingVolume();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 3 -> {
                phoneMenu.incomingCallAlert();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 4 -> {
                phoneMenu.composer();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 5 -> {
                phoneMenu.messageAlertTone();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 6 -> {
                phoneMenu.keypadTones();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 7 -> {
                phoneMenu.warningAndGamesTone();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 8 -> {
                phoneMenu.vibratingAlert();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
            case 9 -> {
                phoneMenu.screenSaver();
                userInput = phoneMenu.getUserInput();
                backToTones(phoneMenu);
            }
        }
    }

    private static void backToTones(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            tones(phoneMenu);
        } else {
            tones(phoneMenu);
        }
    }

    private static void callRegister(PhoneMenuMethods phoneMenu) {
        phoneMenu.callRegister();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> mainMenu(phoneMenu);
            case 1 -> {
                phoneMenu.missedCalls();
                userInput = phoneMenu.getUserInput();
                backToCallRegister(phoneMenu);
            }
            case 2 -> {
                phoneMenu.receivedCalls();
                userInput = phoneMenu.getUserInput();
                backToCallRegister(phoneMenu);
            }
            case 3 -> {
                phoneMenu.dialledNumbers();
                userInput = phoneMenu.getUserInput();
                backToCallRegister(phoneMenu);
            }
            case 4 -> {
                phoneMenu.eraseRecentCallLists();
                userInput = phoneMenu.getUserInput();
                backToCallRegister(phoneMenu);
            }
            case 5 -> showCallDuration(phoneMenu);
            case 6 -> showCallCost(phoneMenu);
            case 7 -> callCostSettings(phoneMenu);
            case 8 -> {
                phoneMenu.prepaidCredit();
                userInput = phoneMenu.getUserInput();
                if (userInput == 1) {
                    callRegister(phoneMenu);
                } else {
                    mainMenu(phoneMenu);
                }
            }
        }
    }

    private static void callCostSettings(PhoneMenuMethods phoneMenu) {
        phoneMenu.callCostSettings();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> backToCallRegister(phoneMenu);
            case 1 -> {
                phoneMenu.callCostLimit();
                userInput = phoneMenu.getUserInput();
                backToCallCostSettings(phoneMenu);

            }
            case 2 -> {
                phoneMenu.showCostsIn();
                userInput = phoneMenu.getUserInput();
                backToCallCostSettings(phoneMenu);
            }
        }
    }

    private static void backToCallCostSettings(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            callCostSettings(phoneMenu);
        }
    }

    private static void showCallCost(PhoneMenuMethods phoneMenu) {
        phoneMenu.showCallCosts();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> callRegister(phoneMenu);
            case 1 -> {
                phoneMenu.lastCallCost();
                userInput = phoneMenu.getUserInput();
                backToShowCallCost(phoneMenu);
            }
            case 2 -> {
                phoneMenu.allCallsCost();
                userInput = phoneMenu.getUserInput();
                backToShowCallCost(phoneMenu);
            }
            case 3 -> {
                phoneMenu.clearCounters();
                userInput = phoneMenu.getUserInput();
                backToShowCallCost(phoneMenu);
            }
        }
    }

    private static void backToShowCallCost(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            showCallCost(phoneMenu);
        }
    }

    private static void showCallDuration(PhoneMenuMethods phoneMenu) {
        phoneMenu.showCallDuration();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> callRegister(phoneMenu);
            case 1 -> {
                phoneMenu.lastCallDuration();
                userInput = phoneMenu.getUserInput();
                backToShowCallDuration(phoneMenu);

            }
            case 2 -> {
                phoneMenu.allCallsDuration();
                userInput = phoneMenu.getUserInput();
                backToShowCallDuration(phoneMenu);
            }
            case 3 -> {
                phoneMenu.receivedCallsDuration();
                userInput = phoneMenu.getUserInput();
                backToShowCallDuration(phoneMenu);
            }
            case 4 -> {
                phoneMenu.dialledCallDuration();
                userInput = phoneMenu.getUserInput();
                backToShowCallDuration(phoneMenu);
            }
            case 5 -> {
                phoneMenu.clearTimers();
                userInput = phoneMenu.getUserInput();
                backToShowCallDuration(phoneMenu);
            }
        }
    }

    private static void backToShowCallDuration(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            showCallDuration(phoneMenu);
        }
    }

    private static void backToCallRegister(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            callRegister(phoneMenu);
        } else {
            callRegister(phoneMenu);
        }
    }

    private static void mainMenuBack(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            mainMenu(phoneMenu);
        } else mainMenu(phoneMenu);
    }

    private static void messages(PhoneMenuMethods phoneMenu) {
        phoneMenu.messages();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> mainMenu(phoneMenu);
            case 1 -> {
                phoneMenu.writeMessages();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
            case 2 -> {
                phoneMenu.inbox();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);

            }
            case 3 -> {
                phoneMenu.outbox();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
            case 4 -> {
                phoneMenu.pictureMessages();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
            case 5 -> {
                phoneMenu.templates();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
            case 6 -> {
                phoneMenu.smileys();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
            case 7 -> common(phoneMenu);
            case 8 -> {
                phoneMenu.infoService();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
            case 9 -> {
                phoneMenu.voicemailNumber();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
            case 10 -> {
                phoneMenu.serviceCommandEditor();
                userInput = phoneMenu.getUserInput();
                messagesBackTo(phoneMenu);
            }
        }
    }

    private static void common(PhoneMenuMethods phoneMenu) {
        phoneMenu.messageSettings();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> messages(phoneMenu);
            case 1 -> setOneMenu(phoneMenu);
            case 2 -> commonMenu(phoneMenu);
        }
        messagesBackTo(phoneMenu);
    }

    private static void commonMenu(PhoneMenuMethods phoneMenu) {
        phoneMenu.common();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> common(phoneMenu);
            case 1 -> {
                phoneMenu.deliveryReports();
                userInput = phoneMenu.getUserInput();
                commonBack(phoneMenu);
            }
            case 2 -> {
                phoneMenu.replyViaSameCentre();
                userInput = phoneMenu.getUserInput();
                commonBack(phoneMenu);
            }
            case 3 -> {
                phoneMenu.characterSupport();
                userInput = phoneMenu.getUserInput();
                commonBack(phoneMenu);
            }
        }
    }

    private static void commonBack(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            commonMenu(phoneMenu);
        } else {
            messages(phoneMenu);
        }
    }

    private static void setOneMenu(PhoneMenuMethods phoneMenu) {
        phoneMenu.setOne();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> common(phoneMenu);
            case 1 -> {
                phoneMenu.messageCentreNumber();
                userInput = phoneMenu.getUserInput();
                setOneBack(phoneMenu);
            }
            case 2 -> {
                phoneMenu.messageSentAs();
                userInput = phoneMenu.getUserInput();
                setOneBack(phoneMenu);
            }
            case 3 -> {
                phoneMenu.messageValidity();
                userInput = phoneMenu.getUserInput();
                setOneBack(phoneMenu);
            }
        }
    }

    private static void setOneBack(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            setOneMenu(phoneMenu);
        } else {
            messages(phoneMenu);
        }
    }

    private static void messagesBackTo(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            messages(phoneMenu);
        }/* else {
//            phoneMenu.displayMessage("Please a selection from the list above.");
            mainMenu(phoneMenu);
        }*/
    }

    private static void phonebook(PhoneMenuMethods phoneMenu) {
        phoneMenu.phoneBook();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> mainMenu(phoneMenu);
            case 1 -> {
                phoneMenu.search();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 2 -> {
                phoneMenu.serviceNos();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 3 -> {
                phoneMenu.addName();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 4 -> {
                phoneMenu.erase();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 5 -> {
                phoneMenu.edit();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 6 -> {
                phoneMenu.assignTone();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 7 -> {
                phoneMenu.sendBusinessCard();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 8 -> options(phoneMenu);
            case 9 -> {
                phoneMenu.speedDials();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
            case 10 -> {
                phoneMenu.voiceTags();
                userInput = phoneMenu.getUserInput();
                phoneBookBackTo(phoneMenu);
            }
        }
    }

    private static void options(PhoneMenuMethods phoneMenu) {
        phoneMenu.options();
        userInput = phoneMenu.getUserInput();
        switch (userInput) {
            case 0 -> phonebook(phoneMenu);
            case 1 -> {
                phoneMenu.typeOfView();
                userInput = phoneMenu.getUserInput();
                backToOptions(phoneMenu);
            }
            case 2 -> {
                phoneMenu.memoryStatus();
                userInput = phoneMenu.getUserInput();
                backToOptions(phoneMenu);
            }
        }
    }

    private static void backToOptions(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            options(phoneMenu);
        }
    }


    private static void phoneBookBackTo(PhoneMenuMethods phoneMenu) {
        if (userInput == 1) {
            phonebook(phoneMenu);
        }
        if (userInput == 0) mainMenu(phoneMenu);
    }
}

