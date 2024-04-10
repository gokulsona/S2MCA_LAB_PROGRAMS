#Aim : Write a shell script to find factorial of a number.
 
#Algorithm
Step 1 : Start
Step 2 : Define a function named factorial to calculate the factorial of a given number.
Step 3 : Check if the input number is 0; if so, output 1 as the factorial.
Step 4 : if not 0, Use a loop to iterate from i down to 1, updating result in each iteration.
Step 5 : Output the calculated factorial.
Step 6 : Stop

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
