### Task
> Create a method to check Boba drink payment if the payment is less than the price
then throw a custom exception. And make validation if the selected Boba menu does
not match the enum, then throw a custom exception with a message.

```txt
Input Boba menu : Boba Tea
Input Size      : REGULAR
Input payment   : 120000

Your amount is less than price!

then Create Exception

Input Boba menu     : EXTRA_SMALL
Input Size          : EXTRA_LARGE
Invalid pizza size!
Available size      : [SMALL, REGULAR, LARGE]
```