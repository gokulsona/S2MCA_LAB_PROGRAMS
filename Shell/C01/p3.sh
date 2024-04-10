#Aim : write a program to perform arithmetic operations(addition,substration,multiplication,division) read the arithmetic operator and perform the corresponding operation.

#Algorithm
Step 1: Start
Step 2: read first and second number from the user and assing it into variables x, y
Step 3: Print "read operator" and read user input assigning it to variable z
Step 4: Check the value of z and perform the corresponding arithmetic operation
Step 5: Print proper result
Step 6: Stop
	
#Program
#!/bin/bash
read -p "enter the first number   : " x
read -p "enter the second number : "  y
read -p "read operator : " z
case "$z" in
#case 1
'+') echo "x+y=$[x+y]" ;;
#case 2
'-') echo "x-y=$[x-y]" ;;
#case 3
'*') echo "x*y=$[x*y]" ;;
#case 4
'/') echo "x/y=$[x/y]" ;;
esac

#Output
enter the first number  : 40
enter the second number : 20
read operator  : *
x*y=800
