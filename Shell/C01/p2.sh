#Aim :shell program to read a number (it should be from 1 to 2) using the case statement. Print the output accordingly based on the number that read from the keyboard.

#Algorithm
Step 1: Start
Step 2: Print "Enter the number 1 or 2 or 3"
Step 3: Read user input and assign it to variable x
Step 4: Check the value of x
Step 5: If x is 1, echo "You have entered 1"
Step 6: If x is 2, echo "You have entered 2"
Step 7: If x is 3, echo "You have entered 3"
Step 8: Stop

#Program
#!/bin/bash
read -p "Enter the number 1 or 2 or 3 : " x
case "$x" in
1)echo "You have entered 1";;
2)echo "You have entered 2";;
3)echo "You have entered 3";;
esac

#Output
Enter the number 1 or 2 or 3 : 2
You have entered 2
