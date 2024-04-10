#Aim : Write a shell program to find largest and smallest number using function

#Algorithm
Step 1: Start
Step 2: Define function find_largest and find_smallest to find, the largest and the smallest number among given inputs.
Step 3: Read three numbers from the user.
Step 4: Call find_largest and find_smallest function with the three numbers as arguments and store the result.
Step 5: Print the largest number and smallest number
Step 6: Stop

#Program
#!/bin/bash
# Function to find the largest number
find_largest() {
	largest=$1
	for num in "$@"; do
		if ((num > largest)); then
		largest=$num
		fi
	done	
	echo "$largest"
}
# Function to find the smallest number
find_smallest() {
	smallest=$1
	for num in "$@"; do
		if ((num < smallest)); then
		smallest=$num
		fi
	done
	echo "$smallest"
}

read -p "Enter the first number: " num1
read -p "Enter the second number: " num2
read -p "Enter the third number: " num3
largest=$(find_largest $num1 $num2 $num3)
smallest=$(find_smallest $num1 $num2 $num3)
echo "Largest number is: $largest"
echo "Smallest number is: $smallest"

#Output
Enter the first number: 3
Enter the second number: 9
Enter the third number: 1
Largest number is: 9
Smallest number is: 1
