#Aim : write a shell program using case to add/sub/mul/numbers according to the choice entered by the user. Repeat the process until the user choose to exit.

#Algorithm
Step 1 : Start
step 2 : read first and second number from the user and store it in x, y
Step 3 : Display the menu options "Add", "Sub", "Mul", and "Quit"
Step 4 : Read user selection and perform corresponding operation
step 5 : If user selects "Quit", exit the loop
Step 6 : Repeat steps 6 to 11 until the user chooses to Quit
Step 7 : Stop  
 
#Program
#!/bin/bash
echo "enter the first number:"
read x
echo "enter the second number:"
read y
select i in Add Sub Mul Quit
do
case $i in
Add)echo $((x+y));;
Sub)echo $((x-y));;
Mul)echo $((x*y));;
Quit)break;;
*)echo "invalid option"
esac
done

#Output
enter the first number:
20
enter the second number:
10
1) Add
2) Sub
3) Mul
4) Quit
#? 1
30
