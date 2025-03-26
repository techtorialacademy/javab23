# Logical Operators Java

## **`&&`** AND Operator
- The `&&` operator evaluates to `true` only if **all** the conditions in the 
expression are `true`.
    - To be able to fly in US:
        * you need to have ID and a plane ticket which of the passengers below can fly? 
            1. Have an ID but no ticket
            2. Have an ID and have ticket
            3. Have no ID and have ticket
            * Since between the conditions `AND` is used, we need all the conditions:
                only number **2** has all the qualifications. 
    - To be able to pass the class
        * you need to have %85 attendance and %95 of the tasks completed; which of the 
       students below can pass the class? 
            1. %100 attendance and %90 of tasks completed
            2. %86 attendance and %94 of tasks completed
            3. %84 attendance and %99 of tasks completed
            4. %90 attendance and %99 of tasks completed
            * Only number **4** provides all the necessary qualification.
    ```java
        // In order to enter a club, the customer needs to be over 21 and must have ticket.
        int age = scanner.nextInt();
        boolean haveTicket = scanner.nextBoolean();
        // how should we create a condition so we can now if a person can enter a club
       // First cond: age > 21
       // second cond: haveTicket ( this must be true)
       // What logical operator should I use in between first and second cond.? 
       boolean canEnter = age > 21 && haveTicket;
       // canEnter boolean value will only be `true`,
      // when the age is bigger than 21 AND haveTicket variable is true.    
    ```  
  
## **`||`** OR Operator
- The `||` operator evaluates to `true` when **one** of the operand is `true`.
  - Useful when **only** one of the several conditions needs to be met.

      * To shop in store you need to have one of the following:
          1. Credit Card
          2. Debit Card
          3. Cash
          * If a person has Creditcard **||** DebitCard **||** Cash
              - then they can shop in the store.
          
      ```java
            // A person is resting, if it is a weekend OR national holiday:
            boolean isWeekend = scanner.nextBoolean();
            boolean isNationalHoliday = scanner.nextBoolean();
            
            // How could we create a variable that would reflect if a person is resting? 
            boolean isResting = isWeekend || isNationalHoliday;
            // To be able to rest:
  
      ```
  
      