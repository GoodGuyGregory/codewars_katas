#! /bin/bash
read -p "What's the Kata you're working on? " KATA
echo "Cleaning your project for remote push..."
cd ./$KATA
pwd
rm -vr obj
rm -vr bin
rm -vr $KATA.csproj

