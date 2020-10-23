def persistence(n):
    move = 0 #Move timer
    temp = 1 #Temp variable to transfer values
    while (n > 9): #if n is not a one-digit number
        if temp == 1: #and if that's your first try
          temp = n % 10 #9=39%10 etc.
        n -= n %10 #39-9=n
        n /= 10 #30/10 = n
        temp *= (n % 10) #multiply temp with the mod 10 of n --> temp=9 <-> temp=9*(3%10) == 27
        if (n <= 9) : #if n is a one-digit number
          n = temp #update n with temp
          temp = 1 #set temp to default
          move += 1 #and raise the value of move by 1
    return move #if n is a one-digit number, return move