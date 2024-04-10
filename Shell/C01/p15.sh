#Aim : Write a shell program to check whether a given string is palindrome

#Algorithm
Step 1: Start 
Step 2: create a function 'palindrome()' to check the given string is palindrome or not
Step 3: prompt user to enter a string and assign into variable original
Step 4: find the reverse of input string, if reverse equals to orginal then it is palindrome else not
Step 5: print proper result
Step 6: Stop 
#Program
#!/bin/bash
palindrome()
{
	original=$1
	reversed=$(echo $original | rev)
	if [ "$original" = "$reversed" ]; then
		echo "the string '$original' is a palindrome"
	else
		echo "the string '$original' is not a palindrome"
	fi
}
read -p "enter a string:" input_string
palindrome "$input_string"

#Output
enter a string:malayalam
the string 'malayalam' is a palindrome
