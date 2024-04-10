#Aim : Write a shell script to find factorial of a number.
 
#Algorithm
Step 1 : Start
Step 2 : Define a function named factorial to calculate the factorial of a given number.
Step 3 : Check if the input number is 0; if so, output 1 as the factorial.
Step 4 : If the input number is not 0, initialize variables i and result.
Step 5 : Use a loop to iterate from i down to 1, updating result in each iteration.
Step 6 : Output the calculated factorial.
Step 7 : Prompt the user to enter a number to calculate its factorial and read the input number.
Step 8 : Call the factorial function with the input number as an argument and store the result.
Step 9 : Print the factorial of the input number.
Step 10: Stop

#Program
#!/bin/bash
factorial()
{
	if(($1==0));then
		echo 1
		else
		local i=$1
		local result=1
		while (( i>0 ));
		do
			result=$((result * i))
			i=$(( i-1 ))
		done
		echo $result
		fi
}
read -p "Enter a number to calculate factorial:" num
result=$(factorial $num)
echo "factorial of $num is :" $result

#Output
Enter a number to calculate factorial:4
factorial of 4 is : 24
