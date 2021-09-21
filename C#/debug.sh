#! /bin/bash

echo "Building your code for debugging...."
# inquire about the C# extension's installation
# https://marketplace.visualstudio.com/items?itemName=ms-dotnettools.csharp

read -p "Have you installed the C# extension for VS Code? Y/N " ANSWER

clear
case "$ANSWER" in 
    [yY] | [yY][eE][sS])
    read -p "What's the Kata you're working on? " KATA
    echo "Building project..."
    dotnet new console -lang "C#" -o $KATA
    clear
    #  Explain the process for 
    echo "Perfect..."
    echo "Now formatting JSON for your current C# project"
    #  Have the user enter the Kata Dir information
    # Searches the Configurations Array for the C # Debugging 
    cd ../.vscode
    # cat launch.json | jq '.configurations[2].program'
    # append the Kata name to the program path string
    DEBUGSPROGRMSTR="\${workspaceFolder}/C#/"$KATA"/bin/Debug/net5.0/"$KATA".dll"
    #  append kata to CWD
    DEBUGCWDSTR="\${workspaceFolder}/C#/"$KATA""

    cat launch.json | jq --arg DEBUGSPROGRMSTR "$DEBUGSPROGRMSTR" --arg DEBUGCWDSTR "$DEBUGCWDSTR" '.configurations[2].program = $DEBUGSPROGRMSTR | .configurations[2].cwd = $DEBUGCWDSTR' "./launch.json" > newLaunch.json && cp -v newLaunch.json launch.json && rm -v newLaunch.json
    # jq --arg DEBUGCWDSTR "$DEBUGCWDSTR" '.configurations[2].cwd = $DEBUGCWDSTR' "./launch.json"


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

    echo "Now with your current C# $KATA Solution files open.."
    echo "the next step is echo Build your debugging files..."
    echo "Type: CMD+Shift+P inside of Visual Studio Code"
    echo "The Command-Pallet will be displayed search/select '.NET: Generate Assets for Build and Debug.'"
    echo "Happy Coding! :)"  

