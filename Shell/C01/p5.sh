#Aim : write a shell program to check whether two strings are equal.

#Algorithm
Step 1: Start
Step 2: Assign the values to the variable str1 and str2
Step 3: Check if str1 is equal to str2
Step 4: If they are equal, echo "both the strings are equal."
Step 5: If they are not equal, echo "strings are not equal."
Step 6: Stop

#Program
#!/bin/bash
str1="nice"
str2="nice"
if [ $str1 = $str2 ];
then
echo "both the strings are equal."
else
echo "strings are not equal."
fi

#Output
both the strings are equal.
