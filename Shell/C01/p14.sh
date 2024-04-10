#Aim : Write a shell script to find the fibonacci series upto a limit

#Algorithm
Step 1: Start
Step 2: Define a function named print_fibonacci that takes a limit as input
Step 3: Initialize variables a and b with values 0 and 1 respectively
Step 4: Print "Fibonacci sequence up to" followed by the input limit
Step 5: Print the initial value of a
Step 6: While b is less than or equal to the input limit, do the following:
Step 7: Print the value of b
Step 8: Calculate the next Fibonacci number (next) by adding a and b
Step 9: Update the values of a and b to prepare for the next iteration
Step 10: Stop

#Program
#!/bin/bash
print_fibonacci() {
	a=0
	b=1
	echo "Fibonacci sequence up to $1:"
	echo -n "$a "
	while [ $b -le $1 ]; do
		echo -n "$b "
		next=$((a+b))
		a=$b
		b=$next
	done
	echo
}
read -p "Enter the limit for Fibonacci sequence: " limit
print_fibonacci $limit

#Output 	
Enter the limit for Fibonacci sequence: 5
Fibonacci sequence up to 5:
0 1 1 2 3 5
