#! /bin/bash

echo "Building your code for debugging...."
# inquire about the C# extension's installation
# https://marketplace.visualstudio.com/items?itemName=ms-dotnettools.csharp

read -p "Have you installed the C# extension for VS Code? Y/N " ANSWER

clear
case "$ANSWER" in 
    [yY] | [yY][eE][sS])
    echo "Awesome... with your current C# Kata file open the next step is to"
    echo "Build your debugging files..."
    echo "Type: CMD+Shift+P inside of Visual Studio Code"
    echo "The Command-Pallet will be displayed search/select '.NET: Generate Assets for Build and Debug.'"
    ;;
    [nN] | [nN][oO])
    echo "Please install the extension, then re-start the script"
    open https://marketplace.visualstudio.com/items?itemName=ms-dotnettools.csharp
    ;;
*)
# # if they dont put anything
    echo "Please enter y/yes or n/no"
    ;;
esac

read -p "Have you built your files for debugging? Y/N " ANSWER

case "$ANSWER" in 
    [yY] | [yY][eE][sS])
    #  Explain the process for 
    echo "Perfect..."
    echo "Now formatting JSON for your current C# project"
    #  Have the user enter the Kata Dir information
    ;;
    [nN] | [nN][oO])
    echo "Please build the debugging asset files from the Command-Pallet by typing CMD+SHIFT+P and searching/selecting '.NET: Generate Assets for Build and Debug.'
    Then re-start this script"
    ;;
*)
# # if they dont put anything
    echo "Please enter y/yes or n/no"
    ;;
esac

