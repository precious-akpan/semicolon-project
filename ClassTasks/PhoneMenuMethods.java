package ClassTasks;

import java.util.Scanner;

public class PhoneMenuMethods {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public int getUserInput() {
        Scanner input = new Scanner(System.in);
        displayMessage("Make a selection from the list above");
        return input.nextInt();
    }

    public void mainMenu() {
        displayMessage("""
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
                        
                Type -1 to exit""");
    }

    public void phoneBook() {
        displayMessage("""
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
                                        
                Type 0 to go back to main menu.""");
    }

    public void search() {
        displayMessage("""
                Search
                      
                Press 1 to go back.
                 """);

    }

    public void serviceNos() {
        displayMessage("""
                Service Nos.
                                                                 
                Type 1 to go back""");
    }

    public void addName() {
        displayMessage("""
                Add name
                    
                Type 1 to go back""");
    }

    public void erase() {
        displayMessage("""
                Erase
                            
                Type 1 to go back""");
    }

    public void edit() {
        displayMessage("""
                Edit
                        
                Type 1 to go back""");
    }

    public void assignTone() {
        displayMessage("""
                Assign Tone
                                              
                Type 1 to go back""");
    }

    public void sendBusinessCard() {
        displayMessage("""
                Send business card
                                            
                Type 1 to go back""");
    }

    public void options() {
        displayMessage("""
                Options
                                                
                1. Type of view
                2. Memory status
                Type 0 to go back""");
    }

    public void typeOfView() {
        displayMessage("""
                Type of view
                                        
                Type 1 to go back""");
    }

    public void memoryStatus() {
        displayMessage("""
                Memory Status
                                            
                Type 1 to go back""");
    }

    public void speedDials() {
        displayMessage("""
                Speed dials
                                        
                Type 1 to go back""");
    }

    public void voiceTags() {
        displayMessage("""
                Voice tags
                Type 1 to go back""");
    }

    public void messages() {
        displayMessage("""
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
                                
                Press 0 to go back.""");
    }

    public void writeMessages() {
        displayMessage("""
                Write messages
                        
                Press 1 to go back""");
    }

    public void inbox() {
        displayMessage("""
                Inbox
                        
                Press 1 to go back""");
    }

    public void outbox() {
        displayMessage("""
                Outbox
                        
                Press 1 to go back""");
    }

    public void pictureMessages() {
        displayMessage("""
                Picture messages
                        
                Press 1 to go back""");
    }

    public void templates() {
        displayMessage("""
                Templates
                        
                Press 1 to go back""");
    }

    public void smileys() {
        displayMessage("""
                Smileys
                        
                Press 1 to go back""");
    }

    public void messageSettings() {
        displayMessage("""
                Message settings
                1. Set
                2. Common
                        
                Press 0 to go back""");
    }

    public void setOne() {
        displayMessage("""
                Set
                1. Message centre number
                2. Message sent as
                3. Message validity
                                
                Press 0 to go back""");
    }

    public void messageCentreNumber() {
        displayMessage("""
                Message centre number
                        
                Press 1 to go back""");
    }

    public void messageSentAs() {
        displayMessage("""
                Message sent as
                                                        
                Press 1 to go back""");
    }

    public void messageValidity() {
        displayMessage("""
                Message validity
                        
                Press 1 to go back""");
    }

    public void common() {
        displayMessage("""
                Common
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                                
                Press 0 to go back""");
    }

    public void deliveryReports() {
        displayMessage("""
                Deliver report
                        
                Press 1 to go back""");
    }

    public void replyViaSameCentre() {
        displayMessage("""
                Reply via same centre
                        
                Press 1 to go back""");
    }

    public void characterSupport() {
        displayMessage("""
                Character support
                        
                Press 1 to go back""");
    }

    public void infoService() {
        displayMessage("""
                Info service
                        
                Press 1 to go back""");
    }

    public void voicemailNumber() {
        displayMessage("""
                Voice mailbox number
                        
                Press 1 to go back""");
    }

    public void serviceCommandEditor() {
        displayMessage("""
                Service command editor
                        
                Press 1 to go back""");
    }

    public void chat() {
        displayMessage("""
                Chat
                        
                Press 1 to go back""");
    }

    public void callRegister() {
        displayMessage("""
                Call register
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit
                                
                Press 0 to go back""");
    }

    public void missedCalls() {
        displayMessage("""
                Missed calls
                        
                Press 1 to go back""");
    }

    public void receivedCalls() {
        displayMessage("""
                Received calls
                        
                Press 1 to go back""");
    }

    public void dialledNumbers() {
        displayMessage("""
                Dialled numbers
                        
                Press 1 to go back""");
    }

    public void eraseRecentCallLists() {
        displayMessage("""
                Erase recent call lists
                        
                Press 1 to go back""");
    }

    public void showCallDuration() {
        displayMessage("""
                Show call duration
                1. Last call duration
                2. All calls’ duration
                3. Received calls’ duration
                4. Dialled calls’ duration
                5. Clear timers
                                
                Press 0 to go back""");
    }

    public void lastCallDuration() {
        displayMessage("""
                Last call duration
                                
                Press 1 to go back""");

    }

    public void allCallsDuration() {
        displayMessage("""
                All calls Duration
                        
                Press 1 to go back""");
    }

    public void receivedCallsDuration() {
        displayMessage("""
                Received calls duration
                        
                Press 1 to go back""");
    }

    public void dialledCallDuration() {
        displayMessage("""
                Dialled calls Duration
                        
                Press 1 to go back""");
    }

    public void clearTimers() {
        displayMessage("""
                Clear timers
                        
                Press 1 to go back""");
    }

    public void showCallCosts() {
        displayMessage("""
                Show call costs
                1. Last call cost
                2. All calls’ cost
                3. Clear counters
                                
                Press 0 to go back""");
    }

    public void lastCallCost() {
        displayMessage("""
                Last call cost
                        
                Press 1 to go back""");
    }

    public void allCallsCost() {
        displayMessage("""
                All calls cost
                        
                Press 1 to go back""");
    }

    public void clearCounters() {
        displayMessage("""
                Clear counters
                        
                Press 1 to go back""");
    }

    public void callCostSettings() {
        displayMessage("""
                Call cost settings
                1. Call cost limit
                2. Show costs in
                                
                Press 0 to go back""");
    }

    public void callCostLimit() {
        displayMessage("""
                Call cost limit
                        
                Press 1 to go back""");
    }

    public void showCostsIn() {
        displayMessage("""
                Show costs in
                        
                Press 1 to go back""");
    }

    public void prepaidCredit() {
        displayMessage("""
                Prepaid credit
                        
                Press 1 to go back""");
    }

    public void tones() {
        displayMessage("""
                Tones
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                                   
                Press 0 to go back""");
    }

    public void ringingTones() {
        displayMessage("""
                Ringing tone
                        
                Press 1 to go back""");
    }

    public void ringingVolume() {
        displayMessage("""
                Ringing volume
                        
                Press 1 to go back""");
    }

    public void incomingCallAlert() {
        displayMessage("""
                Message alert tone
                        
                Press 1 to goo""");
    }

    public void composer() {
        displayMessage("""
                Composer
                        
                Press 1 to go back""");
    }

    public void messageAlertTone() {
        displayMessage("""
                Message alert tone
                        
                Press 1 to go back""");
    }

    public void keypadTones() {
        displayMessage("""
                Keypad tones
                        
                Press 1 to go back""");
    }

    public void warningAndGamesTone() {
        displayMessage("""
                Warning and game tones
                        
                Press 1 to go back""");
    }

    public void vibratingAlert() {
        displayMessage("""
                Vibrating alert
                        
                Press 1 to go back""");
    }

    public void screenSaver() {
        displayMessage("""
                Screen saver
                        
                Press 1 to go back""");
    }

    public void settings() {
        displayMessage("""
                Settings
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factor settings
                                
                Press 0 to go back""");
    }

    public void callSettings() {
        displayMessage("""
                Call settings
                1. Automatic redial
                2. Speed dialling
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                                
                Press 0 to go back""");
    }

    public void automaticRedial() {
        displayMessage("""
                Automatic redial
                        
                Press 1 to go back""");
    }

    public void speedDialing() {
        displayMessage("""
                Speed dialing
                        
                Press 1 to go back""");
    }

    public void callWaitingOption() {
        displayMessage("""
                Call waiting options
                                
                Press 1 to go back""");
    }

    public void ownNumberSending() {
        displayMessage("""
                Own number sending
                        
                Press 1 to go back""");
    }

    public void phoneLineInUse() {
        displayMessage("""
                Phone line in use
                                
                Press 1 to go back""");
    }

    public void automaticAnswer() {
        displayMessage("""
                Automatic answer
                                
                Press 1 to go back""");
    }

    public void phoneSetting() {
        displayMessage("""
                Phone settings
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights2
                6. Confirm SIM service actions
                        
                Press 0 to go back""");
    }

    public void language() {
        displayMessage("""
                Language
                        
                Press 1 to go back""");
    }

    public void cellInfoDisplay() {
        displayMessage("""
                Cell info display
                        
                Press 1 to go back""");
    }

    public void welcomeNote() {
        displayMessage("""
                Welcome note
                        
                Press 1 to go back""");
    }

    public void networkSelection() {
        displayMessage("""
                Network selection
                        
                Press 1 to go back""");
    }

    public void lights() {
        displayMessage("""
                Lights
                        
                Press 1 to go back""");
    }

    public void confirmSimServiceActions() {
        displayMessage("""
                Confirm SIM service actions
                        
                Press 1 to go back""");
    }

    public void securitySettings() {
displayMessage("""
        Security settings
        1. PIN code request
        2. Call barring service
        3. Fixed dialling
        4. Closed user group
        5. Phone security
        6. Change access codes
        
        Press 0 to go back""");
    }

    public void pinCodeRequest() {
displayMessage("""
        PIN code request
        
        Press 1 to go back""");
    }

    public void callBarringService() {
displayMessage("""
        Call barring service
        
        Press 1 to go back""");
    }

    public void fixedDialling() {
displayMessage("""
        Fixed dialling
        
        Press 1 to go back""");
    }

    public void closedUserGroup() {
displayMessage("""
        Closed user group
        
        Press 1 to go back""");
    }

    public void phoneSecurity() {
displayMessage("""
        Phone security
        
        Press 1 to go back""");
    }

    public void changeAccessCodes() {
displayMessage("""
        Change access code
        
        Press 1 to go back""");
    }

    public void restoreFactorySettings() {
displayMessage("""
        Restore factory settings
        
        Press 1 to go back""");
    }

    public void callDivert() {
        displayMessage("""
                Call divert
                
                Press 1 to go back""");
    }

    public void games() {
        displayMessage("""
                Games
                
                Press 1 to go back""");
    }

    public void calculator() {
        displayMessage("""
                Calculator
                
                Press 1 to go back""");
    }

    public void reminders() {
        displayMessage("""
                Reminders
                
                Press 1 to go back""");
    }

    public void clock() {
        displayMessage("""
                Clock
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                
                Press 0 to go back""");
    }

    public void alarmClock() {
        displayMessage("""
                Alarm clock
                
                Press 1 to go back""");
    }

    public void clockSettings() {
displayMessage("""
        Clock settings
        
        Press 1 to go back""");
    }

    public void dateSettings() {
displayMessage("""
        Date settings
        
        Press 1 to go back""");
    }

    public void stopwatch() {
displayMessage("""
        Stopwatch
        
        Press 1 to go back""");
    }

    public void countdownTimer() {
displayMessage("""
        Countdown timer
        
        Press 1 to go back""");
    }

    public void autoUpdateOfDateTime() {
displayMessage("""
        Auto update of date and time
        
        Press 1 to go back""");
    }

    public void profiles() {
        displayMessage("""
                Profiles
                
                Press 1 to go back""");
    }

    public void simServices() {
        displayMessage("""
                SIM services
                
                Press 1 to go back""");
    }


}
