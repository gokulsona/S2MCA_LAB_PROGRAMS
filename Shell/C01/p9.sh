#Aim : write a shell script to reverse a number.

#Algorithm
Step 1: Start
Step 2: Prompt the user to enter a number and store it in a variable
Step 3: Define a function to reverse the entered number
Step 4: Inside the function, initialize a variable to store the reversed number
Step 5: Use a while loop to iterate until the number becomes zero
Step 6: In each iteration, extract the last digit of the number and append it to the reversed number
Step 7: Print the reversed number
Step 8: Stop

#Program
#!/bin/bash
reverse_number()
{
	local num=$1
	local reversed_num=""
	while [ $num -gt 0 ];
	do
		remainder=$(( num%10 ))
		reversed_num="${reversed_num}${remainder}"
		num=$(( num/10 ))
	done

	echo "$reversed_num"
}
read -p "Enter a number to reverse:" num
reversed=$(reverse_number "$num")
echo "Reversed number:" $reversed

#Output
Enter a number to reverse:45
Reversed number: 54
