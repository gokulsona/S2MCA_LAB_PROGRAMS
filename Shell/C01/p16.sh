#Aim : write a shell program to perform basic file operation
#Algorithm
    Step 1: Start
    Step 2: Display the menu with options to perform file operations & Read the user's choice of operation.
    Step 3: Perform the operation based on the user's choice:
        For each operation:
            Prompt the user for necessary inputs.
            Execute the operation accordingly.
            If the choice is to exit, end the program.
            If the choice is invalid, display an error message.
    Step 4: Repeat until the user chooses to exit.
    Step 5: Print Proper Result
    Step 6: End.

#Program

    echo "File Operation"
    echo "1. Create File"
    echo "2. Read File"
    echo "3. Write a File"
    echo "4. Delete a File"
    echo "5. Move a File"
    echo "6. Exit"
while true; do
    read -p "Select Operation : " ch
    case $ch in
    1)
        read -p "Enter the File Name to Create : " fn
        touch $fn
        echo "File Create:$fn"
        ;;
    2)
        read -p "Enter the File to be Read : " fn
        if [ -f $fn ]; then    
            cat $fn
        else    
            echo "File not Found!"
        fi
        ;;
    3)
        read -p "Enter the File to be Write : " fn
        echo "Enter text to write(Press Ctrl+D) to finish"	
        cat>> $fn
        echo "Text Written to $fn"
        ;;
    4)
        read -p "Enter the file Name to be Delete : " fn
        if [ -f $fn ]; then
            rm $fn
            echo "File Deleted :$fn"
        else    
            echo "File not Found"
        fi
        ;;
    5)
	read -p "Enter a File to be Moved : " fn1
	read -p "Where to be Moved : " fn2
	if [ -f $fn1 ]; then
		mv $fn1 $fn2
		echo "File Successfully Moved"
	else	
		echo "File not Found"
	fi
	;;

    6)
        echo "Exiting..."
        exit 0
        ;;

    *)
        echo "Invalid option please enter number Between 1 and 5"
        ;;
    esac
done

#output
File Operation
1. Create File
2. Read File
3. Write a File
4. Delete a File
5. Move a File
6. Exit
Select Operation : 1
Enter the File Name to Create : test.txt
File Created : test.txt
Select Operation : 3
Enter the File to be Write : test.txt
Enter text to write (Press Ctrl+D) to finish
Hello Shell Text Written to test.txt
Select Operation : 2
Enter the File to be Read : test.txt
Hello Shell
Select Operation : 4
Enter the file Name to be Delete : test.txt
File Deleted : test.txt
Select Operation : 6
Exiting...


