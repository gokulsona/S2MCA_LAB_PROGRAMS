#Aim : Write a shell program to find the second largest number

#Algorithm
Step 1: Start
Step 2: Check if the number of arguments is less than 2.
Step 3: If yes, print the script usage and exit with an error code.
Step 4: Initialize max1 and max2 with the first and second argument. Iterate over each argument.
Step 5: Compare each argument with max1 and max2 to find the largest and second-largest numbers.
Step 6: Print the second-largest number.
Step 7: Stop

#Program
#!/bin/bash
if [ $# -lt 2 ]; then
  echo "Usage:$0 <number1> <number2> .... <numberN>"
  exit 1
fi
max1=$1
max2=$2
for num in "$@"; do
  if [ "$num" -gt "$max1" ]; then
    max2=$max1
    max1=$num
  elif [ "$num" -gt "$max2" ] && [ "$num" -ne "$max1" ]; then
    max2=$num
  fi
done
echo "The second largest number is: $max2 "

#Output
@ubuntu:~./second_largest.sh 10 36 65 12
The second largest number is: 36 



