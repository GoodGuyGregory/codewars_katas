def get_sum(a,b):
    sum=0
    if a==b: #if they are equal return one of them
        return a
    if a-b==1 or a-b==-1: #if they are consecutif, it returns their sum
        return a+b
    else:
        if a>b: #if a is bigger, we take a+1 the upper border and b the starting point
            for i in range(b,a+1):
                sum+=i
        else: #else b is upper border and a is starting point
            for i in range(a,b+1):
                sum+=i
        return sum