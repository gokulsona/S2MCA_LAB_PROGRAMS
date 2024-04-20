#Aim : Write a shell script to concatenate two strings

#Algorithm

Step 1: Start
Step 2: Define a function named concatenate_string that takes two parameters
Step 3: Inside the function, concatenate the two input strings and store the result in a variable
Step 4: Print the concatenated string
Step 5: Prompt the user to enter the first string and second string store it in a variable string1 and string2
Step 6: Call the concatenate_string function with the two input strings and print the result
Step 8: Stop

#Program
#!/bin/bash
concatenate_string()
{
	concatenated="$1$2"
	echo "$concatenated"
}
read -p "Enter the first string:" string1
read -p "Enter the second string:" string2
result=$(concatenate_string "$string1" "$string2")
echo "Concatenated string:" $result

#Output
Enter the first string:good
Enter the second string:morning
Concatenated string: goodmorning

