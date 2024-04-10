#Aim : Wtite a shell program for demonstrating case

#Algorithm
Step 1: Start
Step 2: Assign the value "sathi" to the variable name
Step 3: Check the value of the variable name
Step 4: If name is "raj", echo "profession:software engineer"
Step 5: If name is "raju", echo "profession:web developer"
Step 6: If name is "sathi", echo "profession:technical content writer"
Step 7: Stop

#Program
#!/bin/bash
name="sathi"
case "$name" in
"raj") echo "profession:software engineer";;
"raju") echo "profession:web developer";;
"sathi") echo "profession:technical content writer";;
esac

#Output
profession:technical content writer
