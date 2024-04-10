#Aim : Write a shell program to repeating elements.

#Algorithm
Step 1: Start
Step 2: Define a function named find_repeating_elements that takes an array as input
Step 3: Initialize an empty associative array named seen
Step 4: Iterate through each element in the input array and count occurrences of each element
Step 5: Print "Repeating elements:"
Step 6: Stop

#Program
#!/bin/bash
find_repeating_elements()
{
	declare -A seen
	for element in "$@";do
	((seen[$element]++))
	done
	echo "Repeating elements:"

	for key in "${!seen[@]}";do
		if ((seen[$key]>1));then
		echo "$key"
		fi
	done
}
array=(3 2 4 2 5 6 5 8 8 7)
find_repeating_elements "${array[@]}"


#Output
Repeating elements:
2
5
8
