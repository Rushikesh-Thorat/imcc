
n=space = 5
for i in range(1,n+1):
    for j in range(0,space):
        print(' ',end='')

    C=1
    for j in range(1 ,i+1):
        print(' ',C,sep='',end='')

        C = C *(i-j)//j
    space-=1
    print()