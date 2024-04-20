#Aim : Write a shell program to find the gross salary

#Algorithm
Step 1: Start
Step 2: Define a function named gross_salary1 that takes the basic salary as input
Step 3: Check if the basic salary is less than 1500
Step 4: If the basic salary is less than 1500, calculate HRA as 10% of the basic salary and DA as 90% of the basic salary
Step 5: If the basic salary is not less than 1500, set HRA to 500 and calculate DA as 98% of the basic salary
Step 6: Calculate the gross salary as the sum of basic salary, HRA, and DA, then print it
Step 7: Stop

#Program
#!/bin/bash
gross_salary1()
{
	basic_salary=$1
	if (( $basic_salary < 1500 ));then
		HRA=$(echo "scale=2; $basic_salary*0.1"|bc)
		DA=$(echo "scale=2; $basic_salary*0.9"|bc)
	else
		HRA=500
		DA=$(echo "scale=2;$basic_salary*0.98"|bc)
	fi
	gross_salary=$(echo "scale=2;$basic_salary+$HRA+$DA"|bc)
	echo "gross salary :$gross_salary"
}
read -p "enter basic salary:" basic_salary
gross_salary1 $basic_salary

#Output
enter basic salary:1000
gross salary :2000.0
