#Aim : write a shell program to read 2 strings, by using less than operator.check whether the string1 is less than string2.

#Algorithm
Step 1: Start
Step 2: Prompt the user to enter the first and second string and store it in variable x and y
Step 3: Check if string x is less than string y
Step 4: If it is, echo "string1 is less than string2." else "not"
Step 5: Stop

#Program
Prgrm5
#!/bin/bash
echo "enter the first string:"
read x
echo "enter the second string:"
read y
if [ $x \< $y ];
then
echo "string1 is less than string2."
else
echo "string2 is less than string1."
fi

#Output
enter the first string:
good
enter the second string:
morning
string1 is less than string2.
