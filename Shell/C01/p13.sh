#Aim : Write a shell program to create a simple command-line calculator program

#Algorithm

Step 1: Start
Step 2: Define functions for addition, subtraction, multiplication, and division
Step 3: Print a message indicating the start of the calculator
Step 4: Prompt the user to choose an operation and input two numbers
Step 5: Perform the selected operation on the input numbers and store the result
Step 6: Print the result 
Step 7: Stop

#Program
#!/bin/bash
add()
{
	echo "$1+$2" |bc
}
substract()
{
	echo "$1-$2" |bc
}
multiply()
{
	echo "$1*$2" |bc
}
quotient()
{
	echo "scale=2;$1/$2" |bc
}
echo "simple calculator"
echo "choose an operation:"
echo "1.Addition"
echo "2.substraction"
echo "3.Multiplication"
echo "4.quotient"
read -p "enter your choice(1-4):" choice
read -p "enter first number:" num1
read -p "enter second number:" num2
case $choice in
	1)result=$(add $num1 $num2);;
	2)result=$(subtract $num1 $num2);;
	3)result=$(multiply $num1 $num2);;
	4)result=$(quotient $num1 $num2);;
	*)echo "invalid choice"
	exit 1 ;;
esac
echo "result:$result"

#Output
simple calculator
choose an operation:
1.Addition
2.substraction
3.Multiplication
4.quotient
enter your choice(1-4):1
enter first number:2
enter second number:3
result:5
